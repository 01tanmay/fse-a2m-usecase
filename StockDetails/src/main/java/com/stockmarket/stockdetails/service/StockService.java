package com.stockmarket.stockdetails.service;

import com.stockmarket.stockdetails.model.SearchCriteria;
import com.stockmarket.stockdetails.model.Stock;
import com.stockmarket.stockdetails.model.StockDetails;

public interface StockService {

    Stock register(Stock stock);

    StockDetails getDetails(SearchCriteria sc);

}
