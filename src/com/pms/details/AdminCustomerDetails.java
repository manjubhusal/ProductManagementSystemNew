package com.pms.details;

import java.util.Scanner;

import com.pms.admin.dao.impl.CustomerDAOImpl;
import com.pms.admin.dao.impl.ProductDAOImpl;

public class AdminCustomerDetails {
	ProductDAOImpl productImpl=new ProductDAOImpl();
	CustomerDAOImpl customerImpl=new CustomerDAOImpl();

	
	public void adminDetails() {
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("==================");
		System.out.println("    1)Product     ");
		System.out.println("    2)Customer    ");
		System.out.println("    3)Back        ");
		System.out.println("==================");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			productDetails();
			break;
		case 2:
			customerDetails();
			break;
		case 3:
			System.out.println("Thank you for using");
			System.exit(0);
			default:
				System.out.println("Choose 1 to 3 Between");
					
			
			
		}
		}
		}
	
	
	public void productDetails() {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("============================");
			System.out.println("         1)AddProduct       ");
			System.out.println("         2)ViewAllProducts  ");
			System.out.println("         3)ViewProduct      ");
			System.out.println("         4)UpdateProduct    ");
			System.out.println("         5)DeleteProduct    ");
			System.out.println("         6)Back             ");
			System.out.println("============================");
		
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				productImpl.addProduct();
				break;
			case 2:
				productImpl.viewProducts();
				break;
			case 3:
				System.out.println("Enter Product Id to View Product");
				int pid=sc.nextInt();
				productImpl.viewProduct(pid);
				break;
			case 4:
				System.out.println("Enter ProductID to Update Product");
				int mid=sc.nextInt();
				productImpl.updateProduct(mid);
				break;
			case 5:
			    System.out.println("Enter ProductID to delete");
			    int did=sc.nextInt();
			    productImpl.deleteProduct(did);
				break;
			case 6:
				System.out.println("Thank you for using");
				System.exit(0);
				default:
					System.out.println("Choose 1 to 6 Between");
						
			}
		}
			
		
		}
	
	
	public void customerDetails() 
		{
		
Scanner sc=new Scanner(System.in);
while(true)
{
	System.out.println("================================================");
	System.out.println("             1)AddCustomer                      ");
	System.out.println("             2)ViewAllCustomerrInfo             ");
	System.out.println("             3)ViewCustomerInfo                 ");
	System.out.println("             4)UpdateCustomer                   ");
	System.out.println("             5)DeleteCustomer                   ");
	System.out.println("             6)Back                             ");
	System.out.println("=============================================== ");
	
	System.out.println("Enter the Choice");
	int choice=sc.nextInt()
;
	switch(choice)
	{
	
	case 1:
		customerImpl.addCustomer();
		break;
	case 2:
		customerImpl.viewAllUserInfo();
		break;
	case 3:
		System.out.println("Enter Customer Id to View Customer");
		int cid=sc.nextInt();
		customerImpl.viewUserInfo(cid);
		break;
	case 4:
		System.out.println("Enter CustomerID to Update Customer");
		int uid=sc.nextInt();
		customerImpl.updateUser(uid);
	case 5:
	    System.out.println("Enter CustomerID to delete");
	    int did=sc.nextInt();
	    customerImpl.deleteUser(did);
		break;
	case 6:
		System.out.println("Thank you for using");
		System.exit(0);
		default:
			System.out.println("Choose 1 to 6 Between");
				
	
	}
	}
		
	}
	
	
	
	
	}

	


