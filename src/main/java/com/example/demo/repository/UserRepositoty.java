package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface UserRepositoty extends JpaRepository<User,Long> , JpaSpecificationExecutor<User>, Serializable {
    @Query("select t from User t where t.name= :name")
    User findByUserName(@Param("name") String name);
}
