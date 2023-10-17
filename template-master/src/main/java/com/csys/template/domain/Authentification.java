package com.csys.template.domain;

import jakarta.persistence.*;



import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Authentification")
//@Audited
//@AuditTable("Authentification_AUD")
public class Authentification {

    @Id
    @Column(name = "Id" , nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @Column(name = "Email", nullable = false)
    private String email;
    @Column(name = "Password", nullable = false)
    private String password;
    @Column(name = "Name", nullable = false)
    private String name;
    @Column(name = "date_create", nullable = false)
    private LocalDate datecreate;
    @Column(name = "role")
    private String role;
    @Column(name = "actif")
    private Boolean actif;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDatecreate() {
        return datecreate;
    }

    public void setDatecreate(LocalDate datecreate) {
        this.datecreate = datecreate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getActif() {
        return actif;
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
    }
}
