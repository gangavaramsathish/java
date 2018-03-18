package com.companyname.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.companyname.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Serializable>{

}
