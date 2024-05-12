package com.talentsoft.rootempresamicroservice.service;

import com.talentsoft.rootempresamicroservice.model.Company;
import com.talentsoft.rootempresamicroservice.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {
    
    @Autowired
    private CompanyRepository companyRepository;

    /**
     * @name getAll
     * @description Retrieves all existing Companys.
     *
     * @return An iterable list of Companys.
     */
    public Iterable<Company> getAll(){
        return companyRepository.findAll();
    }

    /**
     * @name getById
     * @description Retrieves a Company by its ID.
     *
     * @param id the ID of the Company.
     * @return An optional containing the Company with the specified ID, if exists.
     */
    public Optional<Company> getById(Long id){
        return companyRepository.findById(id);
    }

    /**
     * @name create
     * @description Creates a new Company.
     *
     * @param company the details of the Company to create.
     * @return The newly created Company.
     */
    public Company create(Company company){
        return companyRepository.save(company);
    }

    /**
     * @name update
     * @description Updates an existing Company.
     *
     * @param company the Company to update.
     * @return The updated Company.
     */
    public Company update(Company company){
        return companyRepository.save(company);
    }


}
