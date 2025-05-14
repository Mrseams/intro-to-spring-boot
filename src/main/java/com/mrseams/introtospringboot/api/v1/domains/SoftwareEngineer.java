package com.mrseams.introtospringboot.domains;

import java.util.List;
import java.util.Objects;

public class SoftwareEngineer {
    private Integer id;
    private String name;
    private List<String> stack;

    public SoftwareEngineer(Integer id, String name, List<String> stack) {
        this.id = id;
        this.name = name;
        this.stack = stack;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getStack() {
        return stack;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStack(List<String> stack) {
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
