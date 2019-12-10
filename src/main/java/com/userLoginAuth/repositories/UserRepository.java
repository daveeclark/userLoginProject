package com.userLoginAuth.repositories;

import com.userLoginAuth.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long>{

}
