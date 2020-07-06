package application;

import java.sql.*;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

    public static void main(String[] args) {
        
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: seller findById =====");
        Department department = departmentDao.findById(2);
        System.out.println(department);
        
        System.out.println("\n=== TEST 2: seller findByDepartment =====");
        
        System.out.println("\n=== TEST 3: seller findAll =====");
        
        System.out.println("\n=== TEST 4: seller insert =====");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! new department: " + newDepartment.getId());

    }
}
