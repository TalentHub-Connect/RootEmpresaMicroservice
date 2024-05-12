package com.talentsoft.rootempresamicroservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "namecompany", length = 45)
    private String namecompany;

    @Column(name = "nit")
    private Integer nit;

    @Column(name = "namelegalrepresentative", length = 45)
    private String namelegalrepresentative;

    @Column(name = "idlegalrepresentative")
    private Integer idlegalrepresentative;

    @Column(name = "email", length = 45)
    private String email;

    @Column(name = "phonecompany")
    private Integer phonecompany;

    @Column(name = "numworkers")
    private Integer numworkers;

    @Column(name = "address", length = 45)
    private String address;

    @Column(name = "linkdate", length = 15)
    private String linkdate;

    @Column(name = "subscriptionenddate", length = 15)
    private String subscriptionenddate;

    @Column(name = "status", length = 45)
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamecompany() {
        return namecompany;
    }

    public void setNamecompany(String namecompany) {
        this.namecompany = namecompany;
    }

    public Integer getNit() {
        return nit;
    }

    public void setNit(Integer nit) {
        this.nit = nit;
    }

    public String getNamelegalrepresentative() {
        return namelegalrepresentative;
    }

    public void setNamelegalrepresentative(String namelegalrepresentative) {
        this.namelegalrepresentative = namelegalrepresentative;
    }

    public Integer getIdlegalrepresentative() {
        return idlegalrepresentative;
    }

    public void setIdlegalrepresentative(Integer idlegalrepresentative) {
        this.idlegalrepresentative = idlegalrepresentative;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhonecompany() {
        return phonecompany;
    }

    public void setPhonecompany(Integer phonecompany) {
        this.phonecompany = phonecompany;
    }

    public Integer getNumworkers() {
        return numworkers;
    }

    public void setNumworkers(Integer numworkers) {
        this.numworkers = numworkers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinkdate() {
        return linkdate;
    }

    public void setLinkdate(String linkdate) {
        this.linkdate = linkdate;
    }

    public String getSubscriptionenddate() {
        return subscriptionenddate;
    }

    public void setSubscriptionenddate(String subscriptionenddate) {
        this.subscriptionenddate = subscriptionenddate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}