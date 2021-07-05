package com.stockmarket.stockdetails.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchCriteria {

    private String companyCode;

    private Date startDate;

    private Date endDate;

}
