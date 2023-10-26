package com.csys.template.domain;

import jakarta.persistence.*;


import java.io.Serializable;

@Entity
@Table(name = "Profil")
public class Profil implements Serializable {


    @Id
    @Column(name = "Id" , nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @Column(name = "first_Name", nullable = false)
    private String firstName;
    @Column(name = "last_Name", nullable = false)
    private String lastName;
    @Column(name = "Email", nullable = false)
    private String email;
    @Column(name = "Birthday", nullable = false)
    private String Birthday;
    @Column(name = "Chronic_Disease", nullable = false)
    private String ChronicDisease;
    @Column(name = "Medicine", nullable = false)
    private String Medicine;
    @Column(name = "Workout_Type", nullable = false)
    private String WorkoutType;
    @Column(name = "Days_PerWeek", nullable = false)
    private String DaysPerWeek;
    @Column(name = "Goal_Text", nullable = false)
    private String GoalText;
//    @Column(name = "Goal_Image", nullable = false)
//    private java.awt.Image GoalImage;
//    @Column(name = "Image", nullable = false)
//    private Image Image;


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
