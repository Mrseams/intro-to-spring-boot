package com.mrseams.introtospringboot.api.v1.controllers;


import com.mrseams.introtospringboot.api.v1.domains.SoftwareEngineer;
import com.mrseams.introtospringboot.api.v1.dtos.SoftwareEngineerDTO;
import com.mrseams.introtospringboot.api.v1.services.SoftwareEngineerService;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {
    
    

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> index() {
        return softwareEngineerService.getAllSoftwareEngineer();
    }

    @GetMapping(value = "{id}")
    public SoftwareEngineer show(@PathVariable Integer id) {
        return softwareEngineerService.getOneSoftwareEngineer(id);
    }

    @PostMapping
    public void create(@Valid @RequestBody SoftwareEngineer softwareEngineer) {
        softwareEngineerService.createSoftwareEngineer(softwareEngineer);
    }

    @PutMapping(value = "{id}")
    public void update(@PathVariable Integer id, @Valid @RequestBody SoftwareEngineerDTO softwareEngineer) {
        softwareEngineerService.updateSoftwareEngineer(id, softwareEngineer);
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable Integer id) {
        softwareEngineerService.deleteSoftwareEngineer(id);
    }
}
