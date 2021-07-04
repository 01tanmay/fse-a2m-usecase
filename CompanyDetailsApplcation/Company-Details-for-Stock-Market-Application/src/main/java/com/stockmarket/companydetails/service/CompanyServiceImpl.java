package com.stockmarket.companydetails.service;

import com.stockmarket.companydetails.model.Company;
import com.stockmarket.companydetails.repostory.CompanyRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    private static final Logger LOGGER = LogManager.getLogger(CompanyServiceImpl.class);

    @Autowired
    private CompanyRepository repo;

    @Override
    public Company createCompany(Company company) {
        return repo.save(company);
    }

    @Override
    public List<Company> getAllCompanies() {
        return repo.findAll();
    }

    @Override
    public Company getCompanyByCode(String companyCode) {
        return repo.findByCompanyCode(companyCode);
                /*orElseThrow(() ->  {
            LOGGER.warn("Campaign id: " + companyCode + " not found!");
            return new Exception("Not Found", companyCode);
        });*/
    }

    @Override
    public Company updateCompany(Company company){
        String companyId = company.getCompanyId();

        if (repo.existsById(companyId)) {
            LOGGER.debug("Updating company with id: " + companyId);
            repo.update(company);
        } else {
            LOGGER.warn("Company id: " + companyId + " not found!");
        }
        return company;
    }

    @Override
    public String deleteCompanyByCode(String companyCode) {
        repo.deleteCompanyByCode(companyCode);
        return "Company with Code: " + companyCode + "deleted";
    }
}
