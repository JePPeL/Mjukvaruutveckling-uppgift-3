package main;

import java.util.HashMap;
import java.util.Map;

public class ProductRegister {
	private Map<String, Product> register;

	public ProductRegister() {
		register = new HashMap<String, Product>();
	}

	public void addProduct(Product product) {
		register.put(product.getName(), product);
		
	}

	public Product findProduct(String productName) {
		return register.get(productName);
	}

	public Product removeProduct(String productName) {
		return register.remove(productName);		
	}
}
