package com.ajwalker.entities;

public class Player extends BaseEntity {
    private Integer teamID;
    private String name;
    private int age;
    private int skillLevel;
    private int value;

    public Player() {
    }

    public Player(Integer teamID, String name, int age, int skillLevel, int value) {
        this.teamID = teamID;
        this.name = name;
        this.age = age;
        this.skillLevel = skillLevel;
        this.value = value;
    }

    public Player(int id, Integer teamID, String name, int age, int skillLevel, int value) {
        super(id);
        this.teamID = teamID;
        this.name = name;
        this.age = age;
        this.skillLevel = skillLevel;
        this.value = value;
    }

    public Integer getTeamID() {
        return teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
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

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Players{" +
                "teamID=" + teamID +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", skillLevel='" + skillLevel + '\'' +
                ", value=" + value +
                '}';
    }
}
