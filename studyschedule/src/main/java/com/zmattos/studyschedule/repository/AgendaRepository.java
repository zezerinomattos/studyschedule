package com.zmattos.studyschedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zmattos.studyschedule.model.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long>{
	
}
