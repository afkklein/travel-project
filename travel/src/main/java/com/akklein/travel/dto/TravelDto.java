package com.akklein.travel.dto;

public class TravelDto {
    private Long id;

    private String flight;

    private String company;

    private String departureAirport;

    private String destinationAirport;

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
