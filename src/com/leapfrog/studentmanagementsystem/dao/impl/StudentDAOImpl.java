/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentmanagementsystem.dao.impl;

import com.leapfrog.studentmanagementsystem.dao.StudentDAO;
import com.leapfrog.studentmanagementsystem.entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sushant
 */
public class StudentDAOImpl implements StudentDAO{
    
    List<Student> stdList = new ArrayList<>();
    @Override
    public boolean insert(Student s) {
        return stdList.add(s);
    }

    @Override
    public List<Student> getAll() {
        return stdList;
    }
    
}
