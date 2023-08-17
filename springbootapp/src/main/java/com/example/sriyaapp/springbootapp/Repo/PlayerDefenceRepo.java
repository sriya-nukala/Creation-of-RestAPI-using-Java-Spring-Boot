package com.example.sriyaapp.springbootapp.Repo;

import com.example.sriyaapp.springbootapp.Models.player_defence;
import com.example.sriyaapp.springbootapp.Models.player_stats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerDefenceRepo extends JpaRepository<player_defence,Integer> {

    //Custom Query
    @Query(value = "SELECT * FROM player_defence d WHERE d.position= :pos AND d.team= :t AND d.tackles= :ta AND d.tackles_won= :tw",nativeQuery = true)
    public List<player_defence> findbyfilterdefence(@Param("pos") String position, @Param("t") String team, @Param("ta") Integer tackles, @Param("tw") Integer tackles_won);

}
