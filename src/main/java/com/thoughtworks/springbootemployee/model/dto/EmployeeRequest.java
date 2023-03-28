package com.thoughtworks.springbootemployee.model.dto;


import com.thoughtworks.springbootemployee.model.entity.Gender;

public class EmployeeRequest {
    private String name;

    private int age;

    private Gender gender;

    private int salary;

    private Long companyId;

    public EmployeeRequest() {
    }

    public EmployeeRequest(String name, int age, Gender gender, int salary, Long companyId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}
