import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Devs;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Lógica de Programação");
        curso1.setDescricao("Introdução a lógica de programação");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Pensamento computacional");
        curso2.setDescricao("Introdução a pensamento computacional");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("Introdução Java");
        curso3.setDescricao("Introcução a linguagem Java");
        curso3.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("O que é lógica de programação");
        mentoria.setDescricao("Mentoria para tirar duvidas sobre lógica de programação");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp desenvolvedor Java");
        bootcamp.setDescricao("Bootcamp de introdução Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

        Devs devRibamar = new Devs();
        devRibamar.setNome("Ribamar");
        devRibamar.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Ribamar: " + devRibamar.getConteudosInscritos());
        devRibamar.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Ribamar= " + devRibamar.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Ribamar= " + devRibamar.getConteudosConcluidos());
        System.out.println("XP = " + devRibamar.calcularTotalXp());

        System.out.println("----------");

        Devs devUlisses = new Devs();
        devUlisses.setNome("Ulisses");
        devUlisses.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Ulisses: " + devRibamar.getConteudosInscritos());
        devUlisses.progredir();
        devUlisses.progredir();
        devUlisses.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Ulisses= " + devRibamar.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Ulisses= " + devRibamar.getConteudosConcluidos());
        System.out.println("XP = " + devUlisses.calcularTotalXp());
    }
}
