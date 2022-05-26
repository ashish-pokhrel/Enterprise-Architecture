package edu.mum.cs544;

import org.springframework.stereotype.Component;

public interface IProductService {
	public Product getProduct(int productNumber);
	public int getNumberInStock(int productNumber);
}
