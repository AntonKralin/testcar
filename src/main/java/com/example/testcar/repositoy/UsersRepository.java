package com.example.testcar.repositoy;

import org.springframework.data.repository.CrudRepository;
import com.example.testcar.entity.Users;

public interface UsersRepository extends CrudRepository<Users, Integer>{

}
