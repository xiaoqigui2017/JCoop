package com.lanou.mapper;

import com.lanou.bean.Student;

import java.util.List;

/**
 * Created by lizhongren1 on 2017/8/15.
 */
public interface StudentMapper {

    List<Student> findAll();

    Integer insertNewStudent(Student student);

}
