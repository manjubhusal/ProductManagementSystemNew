package com.pms.admin.dao;
import java.util.List;
import com.pms.model.Product;

public interface ProductDAO {
 
	//Business Operations
	void addProduct();
	List<Product> viewProducts();
	Product viewProduct(int pid);
	void updateProduct(int pid);
	void deleteProduct(int pid);

}
