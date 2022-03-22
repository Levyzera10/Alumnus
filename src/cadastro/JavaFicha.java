package cadastro;

import java.io.IOException;
import java.util.Scanner;

public class JavaFicha {

    public static void main(String[] args) throws IOException {
        int opc , qtdNotas;
        float nota = 0;
        String nome = "";
        String cpf;
        Aluno novoAluno = new Aluno();
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("\n Digite sua opção");
            System.out.println("1 Cadastrar Usuário");
            System.out.println("2 Listar Usuário");
            System.out.println("3 Listar Dados do Usuário");
            System.out.println("4 Alterar  usuário");
            System.out.println("5 Deletar usuário");
            opc = teclado.nextInt();
            teclado.nextLine();
            switch (opc) {
                case 1:
                    System.out.println("\nNome:");
                    teclado.nextLine();
                    System.out.println("\nCPF");
                     cpf = teclado.nextLine();

                     novoAluno = new Aluno (nome , cpf);

                    System.out.println("\nQuantas notas?");
                    qtdNotas = teclado.nextInt();

                    for (int i = 0; i < qtdNotas;i++){
                        System.out.println("\nNota" + (i + 1) );
                        nota = teclado.nextFloat();

                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }


        } while (opc != 0);


    }
}
