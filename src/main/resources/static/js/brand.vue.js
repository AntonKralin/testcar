var brandAPI = Vue.resource("/cars/brand{/id}");

Vue.component('edit-form',{
	props: ['brand','brands'],
	data: function(){
		return {
				id: '', 
				name: ''
			}
	},
	watch:{
		brand: function(newVal){
			this.id = newVal.id;
			this.name = newVal.name;
		}
	},
	template: '<div>' +
		'<input type="text" placeholder="to edit" v-model="name"/>' +
		'<input type="button" value="Save" @click="save">' +
		'</div>',
	methods:{
		save: function(){
			if (this.id){
				var name = {id: this.brand.id, name: this.name};
				//console.log(name+"|"+this.brand.name+"id"+this.brand.id);
				
				brandAPI.save({}, name).then(data => {
	                        var index = getIndex(this.brands, this.brand.id);
                        	this.brands.splice(index, 1, data.data);
	                        this.id='';
	                        this.name='';
	                    });
            }else{
            	console.log(this.name);
            	var name = {id: '0', name: this.name};
            	brandAPI.save({}, name).then(data => {
	                        this.brands.push(data);
	                        this.id='';
	                        this.name='';
	                    });
            }
		}
	}
});

Vue.component('brand-row',{
	props: ['brand', 'editMethod', 'brands'],
	template: '<div>'+
		'{{brand.name}}' +
		'<span style="position: absolute; right: 0">'  +
		'<input type="button" value="Edit" @click="edit" />' +
		'<input type="button" value="X" @click="del" />' +
		'</span>' +
		'</div>',
	methods:{
		edit: function(){
			//console.log(this.brand.name);
			this.editMethod(this.brand);
		},
		
		del: function(){
			brandAPI.remove({id:this.brand.id}).then(result => {
				if (result.ok) {
					this.brands.splice(this.brands.indexOf(this.brand), 1);
				}
			})
		}
	}
});

Vue.component('brands-list', {
	props: ['brands'],
	data: function(){
		return{
			brand: null
		}
	},
  	template: '<div>' +
  		'<edit-form :brand="brand" :brands="brands"/>' +
  		'<brand-row v-for="brand in brands" :brand="brand" :editMethod="editMethod" :brands="brands" />'
  	+'</div>',
  	created: function(){
  		brandAPI.get().then( result =>
			result.json().then( data =>
				data.forEach(brand => this.brands.push(brand))			
			)
  		)
  	},
  	methods: {
  		editMethod: function(brand){
  			//console.log(brand.id);
  			this.brand = brand;
  		}
	}
});

var brandel = new Vue({
  el: '#brandel',
  template: '<brands-list :brands="brands" />',
  data: {
    brands: []
  }
});

function getIndex(list, id) {
    for (var i = 0; i < list.length; i++ ) {
        if (list[i].id === id) {
            return i;
        }
    }

    return -1;
}