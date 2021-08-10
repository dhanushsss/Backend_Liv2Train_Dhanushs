package com.example.Backend_Liv2Train_Dhanushs.Center;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class CenterService {

    private final CenterRepository centerRepository ;
    @Autowired
    public CenterService(CenterRepository centerRepository) {
        this.centerRepository = centerRepository;
    }

    public List<Center> getCenters () {
        return centerRepository.findAll();
    }


    public void addNewCenter(Center center){
        System.out.println(center);
    }

}
