package com.xoste.leon.pojo;

public class People {
    private int id;
    private String name;
    private String gender;
    private int age;
    private String image;

    public People() {
        super();
        System.out.println("执行空参构造方法");
    }

    public People(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("执行有参构造方法");
    }

    public People(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("执行有参构造方法11111111111");
    }

    public People(int id, String name, String gender, int age, String image) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.image = image;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", image='" + image + '\'' +
                '}';
    }
}
