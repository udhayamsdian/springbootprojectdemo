package com.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo2.entity.Sample;

public interface SampleRepository extends JpaRepository<Sample, Integer>{

}
