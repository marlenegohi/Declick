package com.example.declick.repository;

import com.example.declick.model.Event;
import com.example.declick.model.Planning;
import com.example.declick.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlanningRepository extends JpaRepository<Planning, Long> {
    List<Planning> findByEvent(Event event);
    List<Planning> findByTask(Task task);

}
