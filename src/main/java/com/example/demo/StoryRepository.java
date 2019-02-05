package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Repository
public class StoryRepository{

    private JdbcTemplate jdbc;


    @Autowired
    public StoryRepository(JdbcTemplate jdbc){
       this.jdbc = jdbc;
   }

   public List<Story> findAll(){
        String sql = "select * from story order by posted";
        return jdbc.query(sql, (rs, i) -> new Story(
                rs.getLong("id"),
                rs.getString("title"),
                rs.getString("content"),
                rs.getDate("posted"),
                rs.getLong("blogger_id")




        ));
   }

}
