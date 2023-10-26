package com.csys.template.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.xml.crypto.Data;
import java.awt.*;

public class ProfilDTO {


    private  Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private String Birthday;

    private String ChronicDisease;

    private String Medicine;

    private String WorkoutType;

    private String DaysPerWeek;

    private String GoalText;

//    private java.awt.Image GoalImage;
//
//    private java.awt.Image Image;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getChronicDisease() {
        return ChronicDisease;
    }

    public void setChronicDisease(String chronicDisease) {
        ChronicDisease = chronicDisease;
    }

    public String getMedicine() {
        return Medicine;
    }

    public void setMedicine(String medicine) {
        Medicine = medicine;
    }

    public String getWorkoutType() {
        return WorkoutType;
    }

    public void setWorkoutType(String workoutType) {
        WorkoutType = workoutType;
    }

    public String getDaysPerWeek() {
        return DaysPerWeek;
    }

    public void setDaysPerWeek(String daysPerWeek) {
        DaysPerWeek = daysPerWeek;
    }

    public String getGoalText() {
        return GoalText;
    }

    public void setGoalText(String goalText) {
        GoalText = goalText;
    }

//    public java.awt.Image getGoalImage() {
//        return GoalImage;
//    }
//
//    public void setGoalImage(java.awt.Image goalImage) {
//        GoalImage = goalImage;
//    }
//
//    public java.awt.Image getImage() {
//        return Image;
//    }
//
//    public void setImage(java.awt.Image image) {
//        Image = image;
//    }
}
