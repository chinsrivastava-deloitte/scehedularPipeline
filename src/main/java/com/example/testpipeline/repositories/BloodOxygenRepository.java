package com.example.testpipeline.repositories;

import com.example.testpipeline.models.BloodOxygenData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BloodOxygenRepository extends JpaRepository<BloodOxygenData,Integer> {
}
