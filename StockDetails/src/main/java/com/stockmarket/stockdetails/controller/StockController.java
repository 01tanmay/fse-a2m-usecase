package com.stockmarket.stockdetails.controller;

import com.stockmarket.stockdetails.model.SearchCriteria;
import com.stockmarket.stockdetails.model.Stock;
import com.stockmarket.stockdetails.model.StockDetails;
import com.stockmarket.stockdetails.service.StockService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

@RestController
@Api(value = "Stocks")
@RequestMapping("/api/v1.0/market/stock")
@CrossOrigin(origins = "*", maxAge = 3600)
public class StockController {

    @Autowired
    private StockService service;

    private static final Logger LOGGER = LogManager.getLogger(StockController.class);

    //PreAuthorize("hasRole('ADMIN')")
    @PostMapping(value = "/add/{companyCode}")
    @ApiOperation(value = "Registering a new Stock")
    public ResponseEntity<Stock> register(@RequestBody @Valid Stock stock) {
        LOGGER.debug("Input: " + stock);
        //return ResponseEntity.ok(service.register(stock));
        return new ResponseEntity<>(service.register(stock), HttpStatus.CREATED);
    }

    /*@GetMapping(value = "/get/{companyCode}/{startDate}/{endDate}")
    public ResponseEntity<StockDetails> getDetails(@PathVariable("companyCode") String companyCode,
                                                   @PathVariable("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
                                                   @PathVariable("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
        LOGGER.info("company code: " + companyCode);
        SearchCriteria sc = new SearchCriteria(companyCode, startDate, endDate);
        return ResponseEntity.ok(service.getDetails(sc));

    }*/
}
