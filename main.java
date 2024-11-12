package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setDescricao("Descricao do curso Java");
        curso1.setTitulo("Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setDescricao("Descricao do curso Python");
        curso2.setTitulo("Curso Python");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Curso();

        List<String> palavras = new ArrayList<>();


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição BootCamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Marcos"+ devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        devMarcos.progredir();
        devMarcos.progredir();
        System.out.println("Conteudos Inscritos Marcos"+ devMarcos.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Marcos"+ devMarcos.getConteudosConcluidos());
        System.out.println("XP"+ devMarcos.calcularTotalXp());

        System.out.println("------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao"+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos Inscritos Joao"+ devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao"+ devJoao.getConteudosConcluidos());
        System.out.println("XP"+ devJoao.calcularTotalXp());
    }
}
