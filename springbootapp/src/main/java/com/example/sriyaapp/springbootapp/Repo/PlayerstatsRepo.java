package com.example.sriyaapp.springbootapp.Repo;

import com.example.sriyaapp.springbootapp.Models.player_stats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerstatsRepo extends JpaRepository<player_stats,Integer> {
}
