package com.example.sriyaapp.springbootapp.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "player_stats")
@NoArgsConstructor
@AllArgsConstructor
public class player_stats {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "player")
    private String player;

    @Column(name = "position")
    private String position;

    @Column(name = "team")
    private String team;

    @Column(name = "age")
    private String age;

    @Column(name = "club")
    private String club;

    @Column(name = "minutes_90s")
    private Double minutes_90s;

    @Column(name = "goals")
    private Integer goals;

    @Column(name = "assists")
    private Integer assists;

    @Column(name = "goals_pens")
    private Integer goals_pens;

    @Column(name = "pens_made")
    private Integer pens_made;

    @Column(name = "pens_att")
    private Integer pens_att;

    @Column(name = "cards_yellow")
    private Integer cards_yellow;

    @Column(name = "cards_red")
    private Integer cards_red;

    @Column(name = "goals_per90")
    private Double goals_per90;

    @Column(name = "assists_per90")
    private Double assists_per90;

    @Column(name = "goals_assists_per90")
    private Double goals_assists_per90;

    @Column(name = "goals_pens_per90")
    private Double goals_pens_per90;

    @Column(name = "goals_assists_pens_per90")
    private Double goals_assists_pens_per90;

    @Column(name = "xg")
    private Double xg;

    @Column(name = "npxg")
    private Double npxg;

    @Column(name = "xg_assist")
    private Double xg_assist;

    @Column(name = "npxg_xg_assist")
    private Double npxg_xg_assist;

    @Column(name = "xg_per90")
    private Double xg_per90;

    @Column(name = "xg_assist_per90")
    private Double xg_assist_per90;

    @Column(name = "xg_xg_assist_per90")
    private Double xg_xg_assist_per90;

    @Column(name = "npxg_per90")
    private Double npxg_per90;

    @Column(name = "npxg_xg_assist_per90")
    private Double npxg_xg_assist_per90;






}
