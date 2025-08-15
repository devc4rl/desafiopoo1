package br.com.dio.desafio.dominio;
import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;


    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }


    public Mentoria() {
    }

//getters and setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
//    getters and setters

//    toString
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" +getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


//    toString
}
