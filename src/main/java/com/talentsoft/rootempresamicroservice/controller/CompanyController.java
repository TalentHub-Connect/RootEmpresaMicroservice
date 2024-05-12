package com.talentsoft.rootempresamicroservice.controller;

import com.talentsoft.rootempresamicroservice.model.Company;
import com.talentsoft.rootempresamicroservice.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    /**
     * @name getAllCompanies
     * @description Retrieves all existing Companys.
     *
     * @return An iterable list of Companys.
     */
    @CrossOrigin
    @GetMapping("/getCompanies")
    public Iterable<Company> getAllCompanys() {
        return companyService.getAll();
    }

    /**
     * @name getCompanyById
     * @description Retrieves a Company by its Id.
     *
     * @param id The Id of the Company to find.
     *
     * @return The Company with the specified Id, if existed.
     */
    @CrossOrigin
    @GetMapping("/{id}")
    public Optional<Company> getCompanyById(@PathVariable Long id) {
        return companyService.getById(id);
    }

    /**
     * @name createCompany
     * @description Creates a new Company.
     *
     * @param company The information of the Company before created.
     *
     * @return A newly created Company.
     */
    @CrossOrigin
    @PostMapping("/createCompany")
    public Company createCompany(@RequestBody Company company) {
        return companyService.create(company);
    }

    /**
     * @name updateCompany
     * @description Creates a new Company.
     *
     * @param id The Id of the Company to update.
     * @param companyDetails The details of the updated Company.
     *
     * @return The updated Company.
     */
    @CrossOrigin
    @PutMapping("/updateCompany/{id}")
    public Company updateCompany(@PathVariable Long id, @RequestBody Company companyDetails){
        Optional<Company> optionalCompany = companyService.getById(id);

        Company company = optionalCompany.get();

        company.setNamecompany(companyDetails.getNamecompany());
        company.setNit(companyDetails.getNit());
        company.setNamelegalrepresentative(companyDetails.getNamelegalrepresentative());
        company.setIdlegalrepresentative(companyDetails.getIdlegalrepresentative());
        company.setEmail(companyDetails.getEmail());
        company.setPhonecompany(companyDetails.getPhonecompany());
        company.setNumworkers(companyDetails.getNumworkers());
        company.setAddress(companyDetails.getAddress());
        company.setLinkdate(companyDetails.getLinkdate());
        company.setSubscriptionenddate(companyDetails.getSubscriptionenddate());
        company.setStatus(companyDetails.getStatus());

        return companyService.update(company);

    }

}
