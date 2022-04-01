package com.nowcoder.community.entity;

public class Students {
    private int id;
    private String idcard;
    private String name;
    private int age;
    private String xueyuan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getXueyuan() {
        return xueyuan;
    }

    public void setXueyuan(String xueyuan) {
        this.xueyuan = xueyuan;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Override
    public String toString() {
        return "students{" +
                "id=" + id +
                ", idcard='" + idcard + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", xueyuan='" + xueyuan + '\'' +
                '}';
    }
}
