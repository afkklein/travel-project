package com.akklein.travel.controller;

import com.akklein.travel.dto.TravelDto;
import com.akklein.travel.service.TravelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api("TravelController")
@RequestMapping("/v1/travels")
public class TravelController {

    @Autowired
    private TravelService travelService;

    @ApiOperation(value = "Returns a list with all booked travels")
    @GetMapping
    public List<TravelDto> getList() {
        return travelService.getList();
    }
}
