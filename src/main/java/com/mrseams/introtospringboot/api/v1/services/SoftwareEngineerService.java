package com.mrseams.introtospringboot.api.v1.services;

import com.mrseams.introtospringboot.api.v1.domains.SoftwareEngineer;
import com.mrseams.introtospringboot.api.v1.dtos.SoftwareEngineerDTO;
import com.mrseams.introtospringboot.api.v1.repositories.SoftwareEngineerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository SER;

    public SoftwareEngineerService(SoftwareEngineerRepository SER) {
        this.SER = SER;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineer(){
        return SER.findAll();
    }
    

    public SoftwareEngineer getOneSoftwareEngineer(Integer id) {
        return SER.findById(id).orElse(null);
    }

    public void createSoftwareEngineer(SoftwareEngineer softwareEngineer){
        SER.save(softwareEngineer);
    }
    
    public void updateSoftwareEngineer(Integer id, SoftwareEngineerDTO SE){
        SoftwareEngineer softwareEngineer = SER.findById(id).orElse(null);

        if(softwareEngineer != null){
            softwareEngineer.setName(SE.getName());
            softwareEngineer.setStack(SE.getStack());
            SER.save(softwareEngineer);
        }else{
            throw new RuntimeException("Software Engineer not found");
        }
    }

    public void deleteSoftwareEngineer(Integer id){
        SER.deleteById(id);
    }
}
