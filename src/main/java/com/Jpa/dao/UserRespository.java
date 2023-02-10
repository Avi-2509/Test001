package com.Jpa.dao;

import com.Jpa.entitities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Component
public interface UserRespository extends CrudRepository<User,Integer> {
    public List<User> findByNameAndCity(String name, String city);
    @Query("select u from User u where u.name = :n")
    public List<User> findUserByName(@Param("n") String name);
}
