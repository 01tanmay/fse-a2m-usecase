package com.stockmarket.stockdetails.service;

import com.stockmarket.stockdetails.model.SearchCriteria;
import com.stockmarket.stockdetails.model.Stock;
import com.stockmarket.stockdetails.model.StockDetails;
import com.stockmarket.stockdetails.repostory.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService{

    @Autowired
    private StockRepository repo;

    @Override
    public Stock register(Stock stock) {
        return repo.save(stock);
    }

    @Override
    public List<Stock> getDetails(SearchCriteria sc) {
        List<Stock> hi = repo.getStockDetails(sc);
        for(Stock s: hi){
            System.out.println("details: " + s);
        }
        return hi;
    }
}
