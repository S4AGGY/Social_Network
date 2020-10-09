package com.example.demo_nc.model;



public class Group {
    private Integer id;
    private String name;
    private Integer followers;

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
        this.name = name;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name +
                ", followers='" + followers +
                '\'' +
                '}';
    }
}
