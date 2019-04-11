package com.walmart.det.brewcoffeeservice.data;

import org.springframework.stereotype.Service;

import com.walmart.det.brewcoffeeservice.model.ProductType;

@Service
public class StockServiceImpl implements StockService {

	public final long stock = 1000L;

	public long queryStock(ProductType productType) {
		return this.stock;
	}
}
