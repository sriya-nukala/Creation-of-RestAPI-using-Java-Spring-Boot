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
@Table(name = "player_defence")
@NoArgsConstructor
@AllArgsConstructor
public class player_defence {
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

    @Column(name = "birth_year")
    private Integer birth_year;

    @Column(name = "minutes_90s")
    private Double minutes_90s;

    @Column(name = "tackles")
    private Integer tackles;

    @Column(name = "tackles_won")
    private Integer tackles_won;

    @Column(name = "tackles_def_3rd")
    private Integer tackles_def_3rd;

    @Column(name = "tackles_mid_3rd")
    private Integer tackles_mid_3rd;

    @Column(name = "tackles_att_3rd")
    private Integer tackles_att_3rd;

    @Column(name = "dribble_tackles")
    private Integer dribble_tackles;

    @Column(name = "dribbles_vs")
    private Integer dribbles_vs;

    @Column(name = "dribble_tackles_pct")
    private Double dribble_tackles_pct;

    @Column(name = "dribbled_past")
    private Integer dribbled_past;

    @Column(name = "blocks")
    private Integer blocks;

    @Column(name = "blocked_shots")
    private Integer blocked_shots;

    @Column(name = "blocked_passes")
    private Integer blocked_passes;

    @Column(name = "interceptions")
    private Integer interceptions;

    @Column(name = "tackles_interceptions")
    private Integer tackles_interceptions;

    @Column(name = "clearances")
    private Integer clearances;

    @Column(name = "errors")
    private Integer errors;






}
