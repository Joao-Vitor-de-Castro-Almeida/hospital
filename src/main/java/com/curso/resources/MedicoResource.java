package com.curso.resources;


import com.curso.domains.dtos.MedicoDTO;
import com.curso.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/medico")
public class MedicoResource {

    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public ResponseEntity<List<MedicoDTO>> findAll(){
        return ResponseEntity.ok().body(medicoService.findAll());
    }
}
