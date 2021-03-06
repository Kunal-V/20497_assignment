package com.sonata.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PControl {

	@Autowired
	private PService ps;

	@RequestMapping("/show")
	public List<Product> getProducts() {
		return ps.getProducts();

	}

	@RequestMapping("/max")
	public Product getProduct() {
		return ps.getMaxPrice();
	}

	@RequestMapping("/min")
	public Product getProduct1() {
		return ps.getMinPrice();
	}
}
