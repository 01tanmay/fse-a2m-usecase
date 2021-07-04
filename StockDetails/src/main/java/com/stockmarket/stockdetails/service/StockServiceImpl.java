package com.stockmarket.stockdetails.service;

import com.stockmarket.stockdetails.repostory.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService{

    @Autowired
    private StockRepository repo;


}
