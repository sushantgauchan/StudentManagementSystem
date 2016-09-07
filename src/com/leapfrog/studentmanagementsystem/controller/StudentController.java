/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentmanagementsystem.controller;

import com.leapfrog.studentmanagementsystem.dao.StudentDAO;
import com.leapfrog.studentmanagementsystem.dao.impl.StudentDAOImpl;
import com.leapfrog.studentmanagementsystem.entity.Student;
import java.util.Scanner;

/**
 *
 * @author Sushant
 */
public class StudentController {

    StudentDAO stdDao;
    Scanner input;

    public StudentController(StudentDAO stdDao, Scanner input) {
        this.stdDao = stdDao;
        this.input = input;
    }

    public void menu() {
        System.out.println("1. Add Student");
        System.out.println("2. Show all");
        System.out.println("3. Exit");
        System.out.print("Select choise [1-3] : ");
    }

    public void add() {
        while (true) {
            Student std = new Student();
            System.out.println("Add Student Information");
            System.out.print("Enter Id :");
            std.setId(input.nextInt());
            System.out.print("Enter First Name :");
            std.setFirstName(input.next());
            System.out.print("Enter Last Name :");
            std.setLastName(input.next());
            System.out.print("Enter Email :");
            std.setEmail(input.next());
            System.out.print("Enter Contact Number :");
            std.setContactNumber(input.next());
            System.out.print("Enter Status :");
            std.setStatus(input.nextBoolean());
            stdDao.insert(std);

            System.out.println("DO you want to add more [Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;

            }
        }
    }

    public void showall() {
        System.out.println("###### Listing Student ######");
        stdDao.getAll().forEach(s -> {
            System.out.println("Student Name :" + s.getFullName());
            System.out.println("Student Email :" + s.getEmail());
            System.out.println("Student Contact :" + s.getContactNumber());
            System.out.println("Student Status :" + s.isStatus());

        });
        System.out.println("##################################");

    }

    public void process() {
        menu();
        switch (input.nextInt()) {
            case 1:
                add();

                break;
            case 2:
                showall();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
}
