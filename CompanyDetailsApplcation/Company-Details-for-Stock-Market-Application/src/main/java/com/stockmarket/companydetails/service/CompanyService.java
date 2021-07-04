package com.stockmarket.companydetails.service;

import com.stockmarket.companydetails.model.Company;

import java.util.List;

public interface CompanyService {

    Company createCompany(Company company);

    List<Company> getAllCompanies();

    Company getCompanyByCode(String companyCode);

    Company updateCompany(Company company);

    String deleteCompanyByCode(String companyCode);

}
