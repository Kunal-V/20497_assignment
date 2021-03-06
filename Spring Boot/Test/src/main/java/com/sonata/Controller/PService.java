package com.sonata.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.stereotype.Service;


@Service
public class PService {

	private List<Product> products = new ArrayList<>(Arrays.asList(
			new Product(10, "laptop" ,50000.0),
			new Product(20, "bag", 300.0),
			new Product(30, "bottle" , 70.0),
			new Product(40, "mobile", 30000.0)));
	
	public List<Product> getProducts() {
		return products;
	}
		public Product getMaxPrice() {
			Product max = products.stream().max(Comparator.comparing(Product::getProPrice)).orElseThrow(NoSuchElementException::new);
			return max;
		}
	
		public Product getMinPrice() {
			Product min = products.stream().min(Comparator.comparing(Product::getProPrice)).orElseThrow(NoSuchElementException::new);
			return min;
	
	}
	
	
}
