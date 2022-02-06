package com.legatohealth.springbootapp.dao;


import org.springframework.data.jpa.repository.JpaRepository;


import com.legatohealth.springbootapp.beans.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
