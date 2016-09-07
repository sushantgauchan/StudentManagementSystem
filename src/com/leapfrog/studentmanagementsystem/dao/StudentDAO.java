/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentmanagementsystem.dao;

import com.leapfrog.studentmanagementsystem.entity.Student;
import java.util.List;

/**
 *
 * @author Sushant
 */
public interface StudentDAO {
    boolean insert(Student s);
    List<Student> getAll();
            
     
    
}
