package alumnus.teste;

import alumnus.dominio.Aluno;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        String nome;
        String cpf;
        String dataDeNascimento;
        String matricula;
        String idioma;
        Aluno aluno = new Aluno();

        Scanner teclado = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n-------------");
            System.out.println("   Menu   ");
            System.out.println("Escolha uma opção :");
            System.out.println("1 - Cadastrar Aluno ");
            System.out.println("2 - listar Aluno ");
            System.out.println("3 - situações  ");
            System.out.println("0 - sair  ");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Nome");
                    nome = teclado.nextLine();

                    System.out.println("CPF");
                    cpf = teclado.nextLine();

                    System.out.println("Data de Nascimento");
                    dataDeNascimento = teclado.nextLine();

                    System.out.println("Matrícula");
                    matricula = teclado.nextLine();

                    System.out.println("Idioma");
                    idioma = teclado.nextLine();
                    break;
                case 2:
                    aluno.listarDados();
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("Saindo ...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }
}


