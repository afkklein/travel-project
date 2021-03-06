package com.akklein.travel.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class TravelDto {

    @ApiModelProperty(value = "Travel Id")
    private Long id;

    @ApiModelProperty(value = "Flight identification")
    private String flight;

    @ApiModelProperty(value = "Company name")
    private String company;

    @ApiModelProperty(value = "Departure airport name")
    private String departureAirport;

    @ApiModelProperty(value = "Destination airport name")
    private String destinationAirport;

    @ApiModelProperty(value = "Departure date")
    private Date departureDate;

    @ApiModelProperty(value = "Landing date")
    private Date landingDate;

    @ApiModelProperty(value = "Passenger info")
    private PersonDto passenger;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public PersonDto getPassenger() {
        return passenger;
    }

    public void setPassenger(PersonDto passenger) {
        this.passenger = passenger;
    }
}
