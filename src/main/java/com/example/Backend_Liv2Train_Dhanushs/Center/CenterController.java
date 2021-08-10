package com.example.Backend_Liv2Train_Dhanushs.Center;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/list")
public class CenterController {

    private  final CenterService centerService;

    @Autowired
    public CenterController(CenterService centerService) {
        this.centerService = centerService;
    }

    @GetMapping
    public List<Center> getCenters () {
        return centerService.getCenters();
    }

    @PostMapping
    public void registerNewCenter (@RequestBody Center center){
        centerService.addNewCenter(center);
    }



}