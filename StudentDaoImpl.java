package jbr.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import jbr.springmvc.model.User;

public class UserDaoImpl implements UserDao {

  @Autowired
  DataSource datasource;

  @Autowired
  JdbcTemplate jdbcTemplate;

  public int register(User student) {
    String sql = "insert into tbl-student values(?,?,?,?,?,?,?)";

    return jdbcTemplate.update(sql, new Object[] { tbl-student.getStuUD(), tbl-student.getStuName(), tbl-student.getage(),
        tbl-student.dept(), tbl-student.getyear(), });
  }

  

}

class UserMapper implements RowMapper<User> {

  public User mapRow(ResultSet rs, int arg1) throws SQLException {
    Student stu = new Student();

    
    stu.setStuName(rs.getString("Name"));
    stu.setStuEmail(rs.getString("Email");
    stu.setStuAge(rs.getString("Age"));
    stu.setStudept(rs.getString("Dept"));
    stu.setStuYear(rs.getString("Year"));
    

    return student;
  }
}