package com.example.testpipeline.repositories;

import com.example.testpipeline.models.HeartData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeartMonitorRepository extends JpaRepository<HeartData, Integer> {
}
