package com.curso.services;

import com.curso.domains.Medico;
import com.curso.domains.Paciente;
import com.curso.repositories.MedicoRepository;
import com.curso.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private PacienteRepository pacienteRepo;

    @Autowired
    private MedicoRepository medicoRepo;

    public void initDB(){

        Paciente paciente01 = new Paciente(0,"Jonas Matos", LocalDate.now(),new BigDecimal("45.8"));
        Paciente paciente02 = new Paciente(0,"Trevor Almado", LocalDate.now(),new BigDecimal("544.1"));

        Medico medico01 = new Medico(0,"Martins Carvalho", LocalDate.now(), new BigDecimal("894.5"));
        Medico medico02 = new Medico(0,"Lyron Kaven", LocalDate.now(), new BigDecimal("1494.5"));

        pacienteRepo.save(paciente01);
        pacienteRepo.save(paciente02);

        medicoRepo.save(medico01);
        medicoRepo.save(medico02);
    }
}
