package com.stockmarket.stockdetails.repostory;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.stockmarket.stockdetails.controller.StockController;
import com.stockmarket.stockdetails.model.SearchCriteria;
import com.stockmarket.stockdetails.model.Stock;
import com.stockmarket.stockdetails.model.StockDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StockRepository implements MongoRepository {

    @Autowired
    private DynamoDBMapper mapper;

    private static final Logger LOGGER = LogManager.getLogger(StockController.class);

    public void getStockDetails(SearchCriteria sc) {
        LOGGER.info("inside get in repo");
        StockDetails sd;
         //res = mapper.load(Stock.class, sc.getCompanyCode(), sc.getStartDate(), sc.getEndDate());
    }

    public Stock save(Stock stock) {
        mapper.save(stock);
        return stock;
    }


    @Override
    public List saveAll(Iterable iterable) {
        return null;
    }

    @Override
    public Object save(Object o) {
        return null;
    }

    @Override
    public Optional findById(Object o) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Object o) {
        return false;
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Iterable findAllById(Iterable iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Object o) {

    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public void deleteAll(Iterable iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List findAll(Sort sort) {
        return null;
    }

    @Override
    public Page findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List findAll(Example example, Sort sort) {
        return null;
    }

    @Override
    public List findAll(Example example) {
        return null;
    }

    @Override
    public List insert(Iterable iterable) {
        return null;
    }

    @Override
    public Object insert(Object o) {
        return null;
    }

    @Override
    public Optional findOne(Example example) {
        return Optional.empty();
    }

    @Override
    public Page findAll(Example example, Pageable pageable) {
        return null;
    }

    @Override
    public long count(Example example) {
        return 0;
    }

    @Override
    public boolean exists(Example example) {
        return false;
    }
}
