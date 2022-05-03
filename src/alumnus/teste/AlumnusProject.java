package alumnus.teste;

import alumnus.dominio.Aluno;

import java.util.Scanner;

public class AlumnusProject {
    public static void main(String[] args) {
        Boolean execucao = true;
        while (execucao) {

            System.out.println("Portal Coordenador " + "\nDigite sua opção");
            System.out.println("1: Login ");
            System.out.println("2 Sair");

            Scanner teclado = new Scanner(System.in);

            Integer opcao = teclado.nextInt();

            switch (opcao){
                case 1:
            }
        }

        public static void login(){
            String usuarioAdmin = "portalcoordenador";
            String senhaAdmin = "Cordenador";

            System.out.println("Digite usuário:");

            Scanner scan = new Scanner(System.in);
            String usuario = scan.nextLine();

            System.out.println("Digite sua senha:");
            String senha = scan.nextLine();

            if(usuario.equals(usuarioAdmin)&& senha.equals(senhaAdmin)){
                System.out.println("Usuário logado");
                System.out.println("BEM VINDO");
            }else {
                System.out.println("Usuário não encontrado");
                System.out.println("Tente novamente");
            }

        }
    }
}


