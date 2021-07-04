package com.stockmarket.stockdetails.repostory;

import com.stockmarket.stockdetails.model.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends MongoRepository<Stock, String> {

}
