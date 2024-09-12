package com.ajwalker.entities;

public class Team extends BaseEntity {
    private String teamName;
    private Long budget;

    public Team() {
    }

    public Team(String teamName, Long budget) {
        this.teamName = teamName;
        this.budget = budget;
    }

    public Team(int id, String teamName, Long budget) {
        super(id);
        this.teamName = teamName;
        this.budget = budget;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Long getBudget() {
        return budget;
    }

    public void setBudget(Long budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "teamName='" + teamName + '\'' +
                ", budget=" + budget +
                '}';
    }
}
