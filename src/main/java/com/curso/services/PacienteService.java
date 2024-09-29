package com.curso.services;

import com.curso.domains.dtos.PacienteDTO;
import com.curso.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PacienteService {

  @Autowired
    private PacienteRepository pacienteRepo;

  public List<PacienteDTO> findAll(){
      return pacienteRepo.findAll().stream()
              .map(obj-> new PacienteDTO(obj)).collect(Collectors.toList());
  }

}
