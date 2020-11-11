package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {
	
	private Set<Product> products;
	
	public WarehouseImpl() {
		this.products = new LinkedHashSet<Product>();
	}

	@Override
	public void addProduct(Product p) {
		this.products.add(p);
	}

	@Override
	public Set<String> allNames() {
		Set<String> returnSet = new HashSet<String>();
		for (Product element : this.products) {
			returnSet.add(element.getName());
		}
		return returnSet;
	}

	@Override
	public Set<Product> allProducts() {
		return new LinkedHashSet<Product>(this.products);
	}

	@Override
	public boolean containsProduct(Product p) {
		return this.products.contains(p);
	}

	@Override
	public double getQuantity(String name) {
		for (Product element : this.products) {
			if (element.getName().equals(name)) {
				return element.getQuantity();
			}
		}
		return 0;
	}

}
