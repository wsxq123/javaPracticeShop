package dao;

import java.util.List;

import model.order_product;
import model.product;

public interface order_productDao {
	
//create
	void createOrder_prduct(order_product op);
	
//read
	//when search one order, return the list of relative order_product data 
	List<order_product> queryOorder_product(String order_Number);
		
//update
		
		
//delete
	//when delete one order, should delete all relative order_product data
	void deleteOrder_prduct(String order_Number);
		
		
}
