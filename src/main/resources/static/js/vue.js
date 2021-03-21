
var brandId = Vue.resource("/cars/brand/1");
var brandList = Vue.resource("/cars/brandlist");

Vue.component('messages-list', {
	props: ['messages'],
  	template: '<div><div v-for="message in messages">{{message.name}}</div></div>',
  	created: function(){
  		brandId.get().then( result=>
			result.json().then( data =>
				//data.forEach(brand => this.messages.push(brand))	
				this.messages.push(data)
				//console.log(data)		
			)
  		)
  	}
});

Vue.component('brand-row',{
	props: ['brand'],
	template: '<div>{{brand.name}}</div>'
});

Vue.component('brands-list', {
	props: ['brands'],
  	template: '<div>'+
  		'<brand-row v-for="brand in brands" :brand="brand"/>'
  	+'</div>',
  	created: function(){
  		brandList.get().then( result =>
			result.json().then( data =>
				data.forEach(brand => this.brands.push(brand))			
			)
  		)
  	}
});

var app = new Vue({
  el: '#app',
  template: '<messages-list :messages="messages" />',
  data: {
    messages: []
  }
});

var brandel = new Vue({
  el: '#brandel',
  template: '<brands-list :brands="brands" />',
  data: {
    brands: []
  }
});