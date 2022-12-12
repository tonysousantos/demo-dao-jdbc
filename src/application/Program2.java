package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1: Depatment findById ====");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		/*
		System.out.println("\n==== TEST 2: Depatment insert ====");
		Department newDepartment = new Department(null, "Suporte");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		*/
		
		/*
		System.out.println("\n==== TEST 3: Depatment update ====");
		department = departmentDao.findById(1);
		department.setName("Comercial");
		departmentDao.update(department);
		System.out.println("Depatment - Update completed");
		*/
		
		/*
		System.out.println("\n==== TEST 4: Depatment delete ====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		sc.close();
		*/
		
		System.out.println("\n==== TEST 5: seller findAll ====");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}


	}

}
