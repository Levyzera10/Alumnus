package alumnus.teste;

import alumnus.dominio.Aluno;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        Scanner teclao = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n-------------");
            System.out.println("   Menu   ");
            System.out.println("Escolha uma opção :");
            System.out.println("1 - inserir aluno ");
            System.out.println("2 - listar Aluno ");
            System.out.println("3 - situações  ");
            System.out.println("0 - sair  ");

            opcao = teclao.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Nome");
                    System.out.println("CPF");
                    System.out.println("Data de Nascimento");
                    System.out.println("Matrícula");
                    System.out.println("Idioma");
                    break;
                case 2:
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


