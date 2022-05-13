package com.cinemacity.cinema.controllers;

import com.cinemacity.cinema.dto.ScheduleDto;
import com.cinemacity.cinema.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
    private final ScheduleService scheduleService;

    @Autowired
    public ScheduleController(ScheduleService scheduleService){
        this.scheduleService = scheduleService;
    }

    @PostMapping("/add")
    public String addSchedule(@RequestBody ScheduleDto schedule) {
        return scheduleService.addSchedule(schedule);
    }
}
