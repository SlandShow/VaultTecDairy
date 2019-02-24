package com.slandshow.vtdairy.repository;

import com.slandshow.vtdairy.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByLogin(String username);
}
