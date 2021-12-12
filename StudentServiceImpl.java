package jbr.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import jbr.springmvc.dao.StudentDao;

import jbr.springmvc.model.User;

public class StudentServiceImpl implements StudentService {

  @Autowired
  public StudentDao studentDao;

  public int register(Student student) {
    return studentDao.register(student);
  }

  

}
