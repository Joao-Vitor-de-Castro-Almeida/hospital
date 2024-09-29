package com.curso.domains.dtos;

import com.curso.domains.Paciente;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PacienteDTO {

    private long id;

    @NotNull(message = "O campo nome não pode ser nulo")
    @NotBlank(message = "O campo nome não pode estar vazio")
    private String nome;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    @NotNull(message = "O campo custoInternacao não pode ser nulo")
    @Digits(integer = 15, fraction = 3)
    private BigDecimal custoInternacao;

    public PacienteDTO() {
    }

    public PacienteDTO(Paciente paciente) {
        this.id = paciente.getId();
        this.nome = paciente.getNome();
        this.dataNascimento = paciente.getDataNascimento();
        this.custoInternacao =  paciente.getCustoInternacao();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotNull(message = "O campo nome não pode ser nulo") @NotBlank(message = "O campo nome não pode estar vazio") String getNome() {
        return nome;
    }

    public void setNome(@NotNull(message = "O campo nome não pode ser nulo") @NotBlank(message = "O campo nome não pode estar vazio") String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public @NotNull(message = "O campo custoInternacao não pode ser nulo") @Digits(integer = 15, fraction = 3) BigDecimal getCustoInternacao() {
        return custoInternacao;
    }

    public void setCustoInternacao(@NotNull(message = "O campo custoInternacao não pode ser nulo") @Digits(integer = 15, fraction = 3) BigDecimal custoInternacao) {
        this.custoInternacao = custoInternacao;
    }
}
