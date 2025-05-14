package com.mrseams.introtospringboot.api.v1.repositories;

import com.mrseams.introtospringboot.api.v1.domains.SoftwareEngineer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoftwareEngineerRepository extends JpaRepository<SoftwareEngineer, Integer> {}
