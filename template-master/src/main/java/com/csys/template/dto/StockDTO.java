package com.csys.template.dto;

public class StockDTO {
    private Integer id;

    private String blood;

    private String code;
    private String codedonateur;

    private String userCreate;

    private String dateCreate;

    private String dateperime;
    private Integer quantite;
    private  Integer quantiteTotal;
    private Integer version;

    public Integer getQuantiteTotal() {
        return quantiteTotal;
    }

    public void setQuantiteTotal(Integer quantiteTotal) {
        this.quantiteTotal = quantiteTotal;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getDateperime() {
        return dateperime;
    }

    public void setDateperime(String dateperime) {
        this.dateperime = dateperime;
    }

//    public String getX() {
//        return dateperime;
//    }
//
//    public void setX(String x) {
//        this.dateperime = x;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String patientCode) {
        this.code = patientCode;
    }

    public String getCodedonateur() {
        return codedonateur;
    }

    public void setCodedonateur(String codedonateur) {
        this.codedonateur = codedonateur;
    }

    public String getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(String userCreate) {
        this.userCreate = userCreate;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }


}
