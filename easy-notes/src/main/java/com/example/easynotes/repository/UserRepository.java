package com.example.easynotes.repository;


import com.example.easynotes.model.User;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    public User getUserByEmailAndPassword(String email,String password);

}
