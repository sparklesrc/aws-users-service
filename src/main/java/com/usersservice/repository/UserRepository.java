package com.usersservice.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import com.usersservice.entity.User;

@EnableScan
public interface UserRepository extends CrudRepository<User, Long>{

}
