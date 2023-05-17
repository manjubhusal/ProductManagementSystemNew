package com.pms.admin.dao.impl;

import java.util.LinkedList;

import java.util.List;
import java.util.Scanner;

import com.pms.admin.dao.ProductDAO;
import com.pms.model.Product;

public class ProductDAOImpl implements ProductDAO {
//to read the data from console
	Scanner sc = new Scanner(System.in);
	// to add products

	List<Product> addProducts = new LinkedList<>();

	@Override
	public void addProduct() {
		// TODO Auto-generated method stub

		int k = 1;
		while (k == 1) {
			System.out.println("Enter Product ID");
			int pid = sc.nextInt();
			System.out.println("Enter Product Name");
			String pname = sc.next();
			System.out.println("Enter Product Qty");
			int qty = sc.nextInt();
			System.out.println("Enter Product Price");
			int price = sc.nextInt();

			// initializing value at object creation time

			Product product = new Product(pid, pname, qty, price);
			addProducts.add(product);
			System.out.println("Product Added Successfully");
			System.out.println("Do you want to add one more product 1)Yes 2) No");
			k = sc.nextInt();
		}
	}

	@Override
	public List<Product> viewProducts() {
		// TODO Auto-generated method stub
		return addProducts;
	}

	@Override
	public Product viewProduct(int pid) {
		// TODO Auto-generated method stub

		for (Product pro : addProducts) {
			if (pro.getPid() == pid) {
				return pro;
			}
		}
		return null;
	}

	@Override
	public void updateProduct(int pid) {
		// TODO Auto-generated method stub
		int k=0;
		for (Product pro : addProducts) {
			if (pro.getPid() == pid) 
			{
				++k;
				System.out.println("Do you want to change 1)Name 2)Quantity 3)Quantity 3)Price");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Product Name");
					String pname = sc.next();
					pro.setPname(pname);
					System.out.println("Product Name is Updated");
					break;
				case 2:
					System.out.println("Enter Product Quantity");
					int qty = sc.nextInt();
					pro.setQty(qty);
					System.out.println("Product Quantity is Updated");
					break;
				case 3:
					System.out.println("Enter Product Price");
					int price = sc.nextInt();
					pro.setPrice(price);
					System.out.println("Product Price is Updated");
					break;
				default:
					System.out.println("Choose 1 to 3 Between");
				}
			}
		}
		if (k == 0)
			System.out.println("Given Id doenot Exist");
	}
	

	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		int k = 0;
		for (Product pro : addProducts) {
			if (pro.getPid() == pid) {
				addProducts.remove(pro);
				System.out.println("Product Deleted Sucessfully");
				++k;// if id exist, product will get deleted and k is then increased
				break;
			}
		}
		if (k == 0)
			System.out.println("Given Id doenot Exist");
	}

}
