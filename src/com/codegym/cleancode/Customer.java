package com.codegym.cleancode;

public class Customer {
    private String nameCustomer;
    private int age;
    private String render;
    private String phone;
    private String citizenIdentification;
    private String email;

    public Customer(){}

    public Customer(String nameCustomer, int age, String render, String phone,
                    String citizenIdentification, String email) {
        this.nameCustomer = nameCustomer;
        this.age = age;
        this.render = render;
        this.phone = phone;
        this.citizenIdentification = citizenIdentification;
        this.email = email;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRender() {
        return render;
    }

    public void setRender(String render) {
        this.render = render;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCitizenIdentification() {
        return citizenIdentification;
    }

    public void setCitizenIdentification(String citizenIdentification) {
        this.citizenIdentification = citizenIdentification;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer {" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", age=" + age +
                ", render='" + render + '\'' +
                ", phone='" + phone + '\'' +
                ", citizenIdentification='" + citizenIdentification + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}



