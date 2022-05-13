package com.cinemacity.cinema.services;

import com.cinemacity.cinema.dto.ScheduleDto;
import com.cinemacity.cinema.entities.Schedule;
import com.cinemacity.cinema.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    @Autowired
    public ScheduleService(ScheduleRepository scheduleRepository){
        this.scheduleRepository = scheduleRepository;
    }

    public String addSchedule(ScheduleDto schedule){
        Schedule scheduleEntity = new Schedule();
        scheduleEntity.setCodFilm(schedule.getCodFilm());
        scheduleEntity.setHour(schedule.getHour());
        scheduleEntity.setDay(schedule.getDay());
        scheduleEntity.setRoom(schedule.getRoom());
        scheduleEntity.setType(schedule.getType());
        scheduleRepository.save(scheduleEntity);
        return "Succes!";
    }
}
