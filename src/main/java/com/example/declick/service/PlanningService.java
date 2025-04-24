package com.example.declick.service;

import com.example.declick.model.Event;
import com.example.declick.model.Planning;
import com.example.declick.model.Task;
import com.example.declick.repository.PlanningRepository;

import java.util.List;

public class PlanningService {

    PlanningRepository planningRepository;

    public Planning createPlanning(Planning planning) {
        return planningRepository.save(planning);
    }

    public List<Planning> findPlanningsByTask(Task task) {
        return planningRepository.findByTask(task);
    }

    public List<Planning> findPlanningsByEvent(Event event) {
        return planningRepository.findByEvent(event);
    }

    public void deletePlanning(Planning planning) {
        planningRepository.delete(planning);
    }
}
