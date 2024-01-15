package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Company;

@SpringBootTest
public class CompanyServiceTest {

    private CompanyService service;

    @BeforeEach
    public void setup() {
        service = new CompanyService();
    }

    @Test
    public void testAddCompany() {
        Company c3 = new Company("Street 3", "5X", "66666", 0.0);
        service.addCompany(c3);
        assertEquals(3, service.getCompanies().size());
    }

    @Test
    public void testDeleteCompany() {
        service.deleteCompany("22222");
        assertEquals(1, service.getCompanies().size());
    }

    @Test
    public void testDeleteNonExistingCompany() {
        String cvr = "XXX";
        try {
            service.deleteCompany(cvr);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("There is no company associated with that CVR number", e.getMessage());
        }
    }
}
