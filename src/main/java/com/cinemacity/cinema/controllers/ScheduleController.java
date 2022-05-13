package com.cinemacity.cinema.controllers;

import com.cinemacity.cinema.dto.ScheduleDto;
import com.cinemacity.cinema.entities.Schedule;
import com.cinemacity.cinema.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @DeleteMapping("/delete/{id}")
    public String deteleSchedule(@PathVariable int id){
        return scheduleService.deleteSchedule(id);
    }

    @GetMapping("/get")
    public List<Schedule> getScheduleList(){
        return scheduleService.getAllSchedules();
    }

    @PutMapping("/modify/{id}")
    public String modifySchedule(@RequestBody ScheduleDto schedule, int id){
        return scheduleService.modifySchedule(schedule,id);
    }
}
