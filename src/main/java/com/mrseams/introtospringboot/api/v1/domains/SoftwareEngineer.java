package com.mrseams.introtospringboot.api.v1.domains;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;
import java.util.Objects;

@Entity
public class SoftwareEngineer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String stack;

    public SoftwareEngineer(Integer id, String name, String stack) {
        this.id = id;
        this.name = name;
        this.stack = stack;
    }

    public SoftwareEngineer() {

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStack() {
        return stack;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(stack, that.stack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, stack);
    }
}
