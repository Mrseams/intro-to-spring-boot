package com.mrseams.introtospringboot.api.v1.dtos;


import jakarta.validation.constraints.NotBlank;

public class SoftwareEngineerDTO {
    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "The tech stack is mandatory")
    private String stack;

    public String getName() {
        return name;
    }

    public String getStack() {
        return stack;
    }

}
