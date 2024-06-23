package br.com.dio.desafio.desafio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {

   private String nome;
   private  String decricao;
   private final LocalDate dataInicail = LocalDate.now();
   private final LocalDate dataFinal = dataInicail.plusDays(45);
   private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos  = new LinkedHashSet<>();

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public LocalDate getDataInicail() {
        return dataInicail;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(decricao, bootcamp.decricao) && Objects.equals(dataInicail, bootcamp.dataInicail) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, decricao, dataInicail, dataFinal, devsInscritos, conteudos);
    }


}
