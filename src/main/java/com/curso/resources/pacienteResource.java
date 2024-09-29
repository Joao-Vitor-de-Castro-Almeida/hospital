package com.curso.resources;

import com.curso.domains.dtos.PacienteDTO;
import com.curso.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/paciente")
public class pacienteResource {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public ResponseEntity<List<PacienteDTO>>findAll(){
        return ResponseEntity.ok().body(pacienteService.findAll());
    }
}
