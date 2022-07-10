package com.company.entities;

public class Person {
    public String name ;
    public int age;
    public String sex ;
    public String numberPhone ;



    public void setName(String personName){
        name=personName;
    }
    public String getName(){
        return name;
    }

    public void setAge(int personAge){
        age=personAge;
    }
    public int getAge(){
        return age;
    }
    public void setSex(String personSex){
        sex=personSex;
    }
    public String getSex(){
        return sex;
    }
    public void setNumberPhone(String personNumberPhone){
        name=personNumberPhone;
    }
    public String getNumberPhone(){
        return numberPhone;
    }

}

