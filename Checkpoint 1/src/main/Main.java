package main;

import cursos.Curso;
import cursos.Disciplina;
import cursos.Turno;
import pessoas.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        /* Gera um aluno e seus dados */
        Aluno matheus = new Aluno();

        matheus.setDadosPessoais(new Pessoa());
        matheus.getDadosPessoais().setCpf("123.456.789-12");
        matheus.getDadosPessoais().setEmail("matheus@uol.com.br");
        matheus.getDadosPessoais().setGenero(Genero.MASCULINO);
        matheus.getDadosPessoais().setNome("Matheus");
        matheus.getDadosPessoais().setTelefone("51 9 7894 1236");

        matheus.getDadosPessoais().setEndereco(new Endereco());
        matheus.getDadosPessoais().getEndereco().setCidade("Porto Alegre");
        matheus.getDadosPessoais().getEndereco().setCep("90651-180");
        matheus.getDadosPessoais().getEndereco().setBairro("Partenon");
        matheus.getDadosPessoais().getEndereco().setLogradouro("Rua dos Bobos");
        matheus.getDadosPessoais().getEndereco().setNumero(100);
        matheus.getDadosPessoais().getEndereco().setEstado(Estado.RS);


        /* Cria uma lista de alunos e inclui o aluno gerado */
        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(matheus);


        /* Gera um professor com seus dados */
        Professor professor = new Professor();
        professor.setFormacao(Formacao.MESTRADO);
        professor.setValorHora(20000);

        professor.setDadosPessoais(new Pessoa());
        professor.getDadosPessoais().setTelefone("51 9 9514 6514");
        professor.getDadosPessoais().setNome("João Paulo Mendonça");
        professor.getDadosPessoais().setGenero(Genero.MASCULINO);
        professor.getDadosPessoais().setEmail("jpmendonca@gmail.com");
        professor.getDadosPessoais().setCpf("654.321.987-51");

        professor.getDadosPessoais().setEndereco(new Endereco());
        professor.getDadosPessoais().getEndereco().setEstado(Estado.RS);
        professor.getDadosPessoais().getEndereco().setCidade("Porto Alegre");
        professor.getDadosPessoais().getEndereco().setLogradouro("Rua das Araras");
        professor.getDadosPessoais().getEndereco().setNumero(625);
        professor.getDadosPessoais().getEndereco().setBairro("Araras");
        professor.getDadosPessoais().getEndereco().setCep("90680-110");


        /* Define os valores das propriedades do curso */
        curso.setAlunos(alunos);
        curso.setProfessor(professor);
        curso.setDisciplina(Disciplina.INGLES);
        curso.setTurno(Turno.NOITE);

        System.out.println(curso.toString());
    }
}
