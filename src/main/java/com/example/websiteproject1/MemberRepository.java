package com.example.websiteproject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @Autowired
  private final JdbcTemplate jdbcTemplate;

    public MemberRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean addIdNPassword(String id, String password) {
         jdbcTemplate.execute("INSERT INTO info(id,password) VALUES ('"+id+"','"+password+"')");
        return true;
    }

//    public boolean checkingIdnPassword(String id, String password) {
//
//    }
}
