package com.example.Backend_Liv2Train_Dhanushs.Center;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterRepository
        extends JpaRepository < Center , Long > {
}