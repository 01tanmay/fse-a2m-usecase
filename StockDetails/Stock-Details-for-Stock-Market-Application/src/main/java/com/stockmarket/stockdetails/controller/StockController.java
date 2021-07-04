package com.stockmarket.stockdetails.controller;

import com.stockmarket.stockdetails.service.StockService;
import io.swagger.annotations.Api;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Stocks")
@RequestMapping("/api/v1.0/market/stocks")
@CrossOrigin(origins = "*", maxAge = 3600)
public class StockController {

    @Autowired
    private StockService service;

    private static final Logger LOGGER = LogManager.getLogger(StockController.class);



}
