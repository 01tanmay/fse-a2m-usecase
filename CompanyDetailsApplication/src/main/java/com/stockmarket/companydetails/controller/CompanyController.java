package com.stockmarket.companydetails.controller;

import com.stockmarket.companydetails.model.Company;
import com.stockmarket.companydetails.service.CompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(value = "Companies")
@RequestMapping("/api/v1.0/market/company")
@CrossOrigin(origins = "*", maxAge = 3600)
public class CompanyController {

    private static final Logger LOGGER = LogManager.getLogger(CompanyController.class);

    @Autowired
    private CompanyService service;

    @ApiOperation(value = "Registering a new Company")
    @PostMapping(value = "/register")
    //@PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<Company> register(@Valid @RequestBody Company company) {
        LOGGER.info("Registering Company with name: " + company.getName());
        return new ResponseEntity<>(service.createCompany(company), HttpStatus.CREATED);
    }

    @ApiOperation(value = "Update an Company")
    @PutMapping()
    public ResponseEntity<Company> updateCompany(@Valid @RequestBody Company company) {
        LOGGER.info("Updating Company: " + company.getName());
        return new ResponseEntity<>(service.updateCompany(company), HttpStatus.OK);
    }

    @ApiOperation(value = "Get company by code")
    @GetMapping(value = "info/{companyCode}")
    public ResponseEntity<Company> getCompanyDetails(@PathVariable("companyCode") String companyCode) {
        LOGGER.info("Getting Company by Company Code");
        Company company = service.getCompanyByCode(companyCode);
        return new ResponseEntity<>(company, HttpStatus.OK);
    }

    @ApiOperation(value = "Get all Companies")
    @GetMapping(value = "/getall")
    public ResponseEntity<List<Company>> getAllCompanies() {
        LOGGER.info("Getting all companies");
        return new ResponseEntity<>(service.getAllCompanies(), HttpStatus.OK);
    }

    @ApiOperation(value = "Delete a company by code")
    @DeleteMapping(value = "delete/{companyCode}")
    //@PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<Void> deleteCompany(@PathVariable("companyId") String companyCode) {
        LOGGER.info("Delete the company with code: " + companyCode);
        service.deleteCompanyByCode(companyCode);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
