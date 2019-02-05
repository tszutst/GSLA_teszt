package com.example.demo;

import java.util.List;
public class Blogger {


   private long id;
   private String name;
   private int age;

   private List<Story> stories;

    public List<Story> getStories() {
        return stories;
    }

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }

    public Blogger(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private Blogger() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Blogger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                //", stories=" + stories +
                '}';
    }
}

