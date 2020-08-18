package com.bw.bean;

import java.util.Date;

public class Patient {
    private int id;
    private String name;
    private String gender;
    private Date birthday;
    private Disease disease;
    private Date diagnosed;
    private Date diedate;

    public Patient() {
    }

    public Patient(int id, String name, String gender, Date birthday, Disease disease, Date diagnosed, Date diedate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.disease = disease;
        this.diagnosed = diagnosed;
        this.diedate = diedate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public Date getDiagnosed() {
        return diagnosed;
    }

    public void setDiagnosed(Date diagnosed) {
        this.diagnosed = diagnosed;
    }

    public Date getDiedate() {
        return diedate;
    }

    public void setDiedate(Date diedate) {
        this.diedate = diedate;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday.toLocaleString() +
                ", disease=" + disease +
                ", diagnosed=" + diagnosed.toLocaleString() +
                ", diedate=" + diedate.toLocaleString() +
                '}';
    }
}
