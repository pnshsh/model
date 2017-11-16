package com.pnshsh.model;

public class Hero {
    private Integer id;

    private String name;

    private String gender;

    private Integer age;

    private String nationality;

    private String wepon;

    private String skil;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getWepon() {
        return wepon;
    }

    public void setWepon(String wepon) {
        this.wepon = wepon == null ? null : wepon.trim();
    }

    public String getSkil() {
        return skil;
    }

    public void setSkil(String skil) {
        this.skil = skil == null ? null : skil.trim();
    }
}