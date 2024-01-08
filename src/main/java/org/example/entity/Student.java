package org.example.entity;

public class Student {
    private String name;

    private int score;

    private int id;

    private int cid;

    public Student(){}

    public Student(String name, int score, int id, int cid) {
        this.name = name;
        this.score = score;
        this.id = id;
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
