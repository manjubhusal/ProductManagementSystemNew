package com.pms.admin.dao.impl;

import java.util.LinkedList;


import java.util.List;
import java.util.Scanner;

import com.pms.admin.dao.CustomerDAO;
import com.pms.model.User;

public class CustomerDAOImpl implements CustomerDAO {
	
	Scanner sc = new Scanner(System.in);
	//To add users
	
	List<User> addUsers = new LinkedList<>();
	
	
	@Override
	
	public void addCustomer() {
		// TODO Auto-generated method stub
		int k = 1;
		while (k == 1) {
			System.out.println("Enter Customer ID");
			int uid = sc.nextInt();
			System.out.println("Enter Customer FirstName");
			String firstName = sc.next();
			System.out.println("Enter Customer LastName");
			String lastName = sc.next();
			System.out.println("Enter Email");
			String email= sc.next();
			System.out.println("Enter Phone Number");
			long phoneNumber= sc.nextInt();
			System.out.println("Enter PassWord");
			String password= sc.next();

			// initializing value at object creation time

			User user= new User(uid, firstName, lastName, email, phoneNumber, password);
			addUsers.add(user);
			System.out.println("User Added Successfully");
			System.out.println("Do you want to add one more User 1)Yes 2) No");
			k = sc.nextInt();
		}
	}

	

	@Override
	public List<User> viewAllUserInfo() {
		// TODO Auto-generated method stub
		return addUsers;
	}

	@Override
	public User viewUserInfo(int uid) {
		// TODO Auto-generated method stub
		for(User usr: addUsers)
		{
			if(usr.getUid()== uid) {
				return usr;
			}
		}
		return null;
	}

	@Override
	public void deleteUser(int uid) {
		// TODO Auto-generated method stub
		int k = 0;
		for (User usr : addUsers) {
			if (usr.getUid()== uid) {
				addUsers.remove(usr);
				System.out.println("User Deleted Sucessfully");
				++k;// if id exist, product will get deleted and k is then increased
				break;
			}
		}
		if (k == 0)
			System.out.println("Given Id doenot Exist");
	}

	@Override
	public void updateUser(int uid) {
		// TODO Auto-generated method stub
		for(User usr: addUsers) {
			if(usr.getUid()==uid) {
				System.out.println("Do you want to change 1)FirstName 2)LastName 3)Email 4)PhoneNumber 5)Password");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Customer Firstname");
				String firstName=sc.next();
				usr.setFirstName(firstName);
				System.out.println("Firstname is Updated");
				break;
			case 2:
				System.out.println("Enter Customer Lastname");
				String lastName=sc.next();
				usr.setLastName(lastName);
				System.out.println("Lastname is Updated");
				break;
			case 3:
				System.out.println("Enter Customer Email");
				String email=sc.next();
				usr.setEmail(email);
				System.out.println("Email is Updated");
				break;
			case 4:
				System.out.println("Enter Customer PhoneNumber");
				long phoneNumber=sc.nextInt();
				usr.setPhoneNumber(phoneNumber);
				System.out.println("PhoneNumber is Updated");
				break;
			case 5:
				System.out.println("Enter Customer Password");
				String password=sc.next();
				usr.setPassword(password);
				System.out.println("Password is Updated");
				break;
				default:
					System.out.println("Choose 1 to 5 Between");
				
			}
			
			
			
			}
		}

	}

}
