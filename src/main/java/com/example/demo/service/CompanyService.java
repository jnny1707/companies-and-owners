package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Company;

@Service
public class CompanyService {

    private List<Company> companies;

    public CompanyService() {
        companies = new ArrayList<>();

        // Add some data to our list
        companies.add(new Company("Street 1", "1X", "22222", 0.0));
        companies.add(new Company("Street 2", "3X", "44444", 0.0));
    }

    // For the create/post request
    public void addCompany(Company company) {
        companies.add(company);
    }

    // For the read/get request
    public List<Company> getCompanies() {
        return companies;
    }

    // For the delete request
    public void deleteCompany(String cvr) {
        Iterator<Company> it = companies.iterator();
        while (it.hasNext()) {
            Company company = (Company) it.next();
            if (company.getCvr().equals(cvr)) {
                it.remove();
                return;
            }
        }
        throw new IllegalArgumentException("There is no company associated with that CVR number");
    }
}
