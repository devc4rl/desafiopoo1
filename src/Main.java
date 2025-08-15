import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import org.w3c.dom.CDATASection;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
      Curso curso1 = new Curso();

      curso1.setTitulo("Curso Java");
      curso1.setDescricao("Descrição do curso de Java");
      curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("----------------------");
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Camila: " + devCamila.getConteudosConcluidos());


        System.out.println("----------------------");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("----------------------");

        System.out.println("Conteúdos inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Joao: " + devJoao.getConteudosConcluidos());



    }
}