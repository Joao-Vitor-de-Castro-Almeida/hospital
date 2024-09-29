package com.curso.domains;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_medico")
    private long id;

    @NotNull
    @NotBlank
    private String nome;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataContratacao;

    @NotNull
    @Digits(integer = 15, fraction = 3)
    private BigDecimal salario;

    public Medico() {
        this.salario = BigDecimal.ZERO;
    }

    public Medico(long id, String nome, LocalDate dataContratacao, BigDecimal salario) {
        this.id = id;
        this.nome = nome;
        this.dataContratacao = dataContratacao;
        this.salario = salario;

        this.salario = salario != null ?  salario : BigDecimal.ZERO;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotNull @NotBlank String getNome() {
        return nome;
    }

    public void setNome(@NotNull @NotBlank String nome) {
        this.nome = nome;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public @NotNull @Digits(integer = 15, fraction = 3) BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(@NotNull @Digits(integer = 15, fraction = 3) BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medico medico = (Medico) o;
        return id == medico.id && Objects.equals(nome, medico.nome) && Objects.equals(dataContratacao, medico.dataContratacao) && Objects.equals(salario, medico.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, dataContratacao, salario);
    }

}
