import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

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


        System.out.println(curso1);
        System.out.println("============");
        System.out.println(mentoria);
        System.out.println("============");
        System.out.println(curso2);




    }
}