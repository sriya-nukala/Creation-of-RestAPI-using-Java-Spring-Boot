package com.example.sriyaapp.springbootapp.Controller;
import com.example.sriyaapp.springbootapp.Models.player_defence;
import com.example.sriyaapp.springbootapp.Models.player_stats;
import com.example.sriyaapp.springbootapp.Repo.PlayerDefenceRepo;
import com.example.sriyaapp.springbootapp.Repo.PlayerstatsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
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

    @GetMapping(value = "fifa/api/v1/statistics/get-by-id")
    public List<player_stats> getplayerStatsbyId(@RequestParam(value = "id") Integer id){
        return playerstatsRepo.findAllById(Collections.singleton(id));
    }

    @GetMapping(value = "fifa/api/v1/statistics/apply-filter")
    public List<player_stats> getplayerstatsbyfilter(@RequestParam(value = "y") Integer birth_year,@RequestParam(value = "g") Integer games,@RequestParam(value = "m") Integer minutes,@RequestParam(value = "go") Integer goals){
        return playerstatsRepo.findbyfilter(birth_year,games,minutes,goals);
    }


    @GetMapping(value = "fifa/api/v1/defense/get-all-details")
    public List<player_defence> getplayerdefence(){
        return playerDefenceRepo.findAll();
    }

    @GetMapping(value = "fifa/api/v1/defense/get-by-id")
    public List<player_defence> getplayerdefencebyId(@RequestParam(value = "id") Integer id){
        return playerDefenceRepo.findAllById(Collections.singleton(id));
    }

    @GetMapping(value = "fifa/api/v1/defense/apply-filter")
    public List<player_defence> getplayerdefencebyfilter(@RequestParam("pos") String position, @RequestParam("t") String team, @RequestParam("ta") Integer tackles, @RequestParam("tw") Integer tackles_won){
        return playerDefenceRepo.findbyfilterdefence(position,team,tackles,tackles_won);
    }



}
