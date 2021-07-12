package com.stockmarket.stockdetails.service;

import com.stockmarket.stockdetails.model.SearchCriteria;
import com.stockmarket.stockdetails.model.Stock;
import com.stockmarket.stockdetails.model.StockDetails;

import java.util.List;

public interface StockService {

    Stock register(Stock stock);

    List<Stock> getDetails(SearchCriteria sc);

}
