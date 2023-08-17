package com.example.sriyaapp.springbootapp.Repo;

import com.example.sriyaapp.springbootapp.Models.player_stats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PlayerstatsRepo extends JpaRepository<player_stats,Integer> {

    @Query(value = "SELECT * FROM player_stats p WHERE p.birth_year= :byear AND p.games= :game AND p.minutes= :min AND p.goals= :goal",nativeQuery = true)
    public List<player_stats> findbyfilter(@Param("byear") Integer birth_year,@Param("game") Integer games, @Param("min") Integer minutes, @Param("goal") Integer goals);


}
