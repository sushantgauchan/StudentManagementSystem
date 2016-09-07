/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentmanagementsystem;

import com.leapfrog.studentmanagementsystem.controller.StudentController;
import com.leapfrog.studentmanagementsystem.dao.StudentDAO;
import com.leapfrog.studentmanagementsystem.dao.impl.StudentDAOImpl;
import com.leapfrog.studentmanagementsystem.entity.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sushant
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        StudentController sc = new StudentController(new StudentDAOImpl(), new Scanner(System.in));
        while (true) {
            
            sc.process();
            
        }

    }

}
