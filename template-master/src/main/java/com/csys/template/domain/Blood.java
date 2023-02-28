package com.csys.template.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;


@Entity
@Table(name = "blood")
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
public class Blood {
    @Column(name = "blood_code", nullable = false)
    @JsonManagedReference
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer codeBlood;

    @Column(name = "blood_group", nullable = false)
    private String bloodGrp;
    @Column(name = "blood_type", nullable = false)
    private String bloodType;
    @Column(name = "given_to", nullable = false)
    private String givenTo;
    @Column(name = "receive_from", nullable = false)
    private String receivedFrom;

    public Integer getCodeBlood() {
        return codeBlood;
    }

    public void setCodeBlood(Integer codeBlood) {
        this.codeBlood = codeBlood;
    }

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getGivenTo() {
        return givenTo;
    }

    public void setGivenTo(String givenTo) {
        this.givenTo = givenTo;
    }

    public String getReceivedFrom() {
        return receivedFrom;
    }

    public void setReceivedFrom(String receivedFrom) {
        this.receivedFrom = receivedFrom;
    }


}
