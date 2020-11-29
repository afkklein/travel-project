package com.akklein.travel.service;

import com.akklein.travel.dto.PersonDto;
import com.akklein.travel.dto.TravelDto;
import com.akklein.travel.entity.Travel;
import com.akklein.travel.repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TravelService {

    @Autowired
    private TravelRepository travelRepository;

    public List<TravelDto> getList() {
        List<Travel> travels = travelRepository.findAll();
        List<TravelDto> travelsDto = new ArrayList<TravelDto>();

        for (Travel travel : travels) {
            TravelDto travelDto = new TravelDto();
            PersonDto personDto = new PersonDto();

            travelDto.setId(travel.getId());
            travelDto.setFlight(travel.getFlight());
            travelDto.setCompany(travel.getCompany());
            travelDto.setDepartureAirport(travel.getDepartureAirport());
            travelDto.setDestinationAirport(travel.getDestinationAirport());

            personDto.setId(travel.getPassenger().getId());
            personDto.setName(travel.getPassenger().getName());
            personDto.setBirthDate(travel.getPassenger().getBirthDate());

            travelDto.setPassenger(personDto);

            travelsDto.add(travelDto);
        }

        return travelsDto;
    }
}
