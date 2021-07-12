package com.stockmarket.companydetails.repostory;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.stockmarket.companydetails.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CompanyRepository {

    @Autowired
    private DynamoDBMapper mapper;

    public Company findByCompanyCode(String companyCode) {
        return mapper.load(Company.class, companyCode);
    }

    public String deleteCompanyByCode(String companyCode) {
        Company company = mapper.load(Company.class, companyCode);
        mapper.delete(company);
        return "Company Deleted!";
    }

    public Company update(Company company) {

        String companyId = company.getCompanyId();
        mapper.save(company,
                new DynamoDBSaveExpression()
                        .withExpectedEntry(companyId,
                                new ExpectedAttributeValue(
                                        new AttributeValue().withS(companyId)
                                )));
        return company;
    }

    public Company save(Company company) {
        mapper.save(company);
        return company;
    }

    public boolean existsById(String companyId) {
        Company company = mapper.load(Company.class, companyId);
        if (company == null) {
            return true;
        }
        return false;
    }

    public List<Company> findAll() {
        return mapper.scan(Company.class, new DynamoDBScanExpression());
    }

/*    public long count(Company company) {
        return mapper.count();
    }*/

}
