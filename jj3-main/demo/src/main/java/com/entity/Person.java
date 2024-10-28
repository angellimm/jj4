package com.entity;
import java.io.Serializable;




public class Person implements Serializable {
    
    
    private Integer perosnId;
    private String name;
    private int age;      
    
   public Person(String name, int age) {
    this.name = name;
    this.age = age;
   }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // @Override
    // public String toString() {
    //     return "Person{" +
    //             "id=" + id +
    //             ", name='" + name + '\'' +
    //             ", age=' " + age + '\'' +
    //             '}';


}