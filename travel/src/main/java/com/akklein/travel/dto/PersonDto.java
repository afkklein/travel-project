package com.akklein.travel.dto;

import io.swagger.annotations.ApiModelProperty;

public class PersonDto {

    @ApiModelProperty(value = "Passenger Id")
    private Long id;

    @ApiModelProperty(value = "Passenger name")
    private String name;

    @ApiModelProperty(value = "Passenger birth date")
    private String birthDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
