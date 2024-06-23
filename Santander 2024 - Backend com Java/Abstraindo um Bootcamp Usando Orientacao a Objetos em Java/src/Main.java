import br.com.dio.desafio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso javaScript");
        curso2.setCargaHoraria(4);




        Mentoria mentoria =  new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("mentroria");
        mentoria.setDate(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp =  new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDecricao("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEstela = new Dev();
        devEstela.setNome("Estela");
        devEstela.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdo inscrito" + devEstela.getConteudosInscritos());
        devEstela.progredir();
        devEstela.progredir();
        devEstela.progredir();
        System.out.println("*--*");
        System.out.println("\nConteúdo inscrito" + devEstela.getConteudosInscritos());
        System.out.println("\nConteúdo concluídos" + devEstela.getConteudosConcluidos());
        System.out.println("XP:" + devEstela.calcularTotalXp());

        System.out.println("-------------");

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscrito" + devGuilherme.getConteudosInscritos());
        devGuilherme.progredir();
        devGuilherme.progredir();
        devGuilherme.progredir();

        System.out.println("---");
        System.out.println("Conteúdo inscrito" + devGuilherme.getConteudosInscritos());
        System.out.println("Conteúdo concluídos" + devGuilherme.getConteudosConcluidos());
        System.out.println("XP:" + devGuilherme.calcularTotalXp());

    }
}
