package com.example.sriyaapp.springbootapp.Controller;
import com.example.sriyaapp.springbootapp.Models.player_defence;
import com.example.sriyaapp.springbootapp.Models.player_stats;
import com.example.sriyaapp.springbootapp.Repo.PlayerDefenceRepo;
import com.example.sriyaapp.springbootapp.Repo.PlayerstatsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class ApiControllers {
    @Autowired
    private PlayerstatsRepo playerstatsRepo;
    @Autowired
    private PlayerDefenceRepo playerDefenceRepo;

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value = "fifa/api/v1/statistics/get-all-details")
    public List<player_stats> getplayerStats(){
        return playerstatsRepo.findAll();
    }

    @GetMapping(value = "fifa/api/v1/statistics/get-by-id/{id}")
    public List<player_stats> getplayerStatsbyId(@PathVariable Integer id){
        return playerstatsRepo.findAllById(Collections.singleton(id));
    }

//    @GetMapping(value = "fifa/api/v1/statistics/apply-filter")
//    public List<player_stats> getplayerStatsbyfilter(@PathVariable Integer id){
//        return playerstatsRepo.findBy()
//    }


    @GetMapping(value = "fifa/api/v1/defense/get-all-details")
    public List<player_defence> getplayerdefence(){
        return playerDefenceRepo.findAll();
    }

    @GetMapping(value = "fifa/api/v1/defense/get-by-id/{id}")
    public List<player_defence> getplayerdefencebyId(@PathVariable Integer id){
        return playerDefenceRepo.findAllById(Collections.singleton(id));
    }



}
