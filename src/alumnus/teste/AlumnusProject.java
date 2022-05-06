package alumnus.teste;

import java.util.Scanner;

public class AlumnusProject {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Boolean sistema = true;
        while (sistema) {

            System.out.println("Portal Coordenador " + "\nDigite sua opção");
            System.out.println("1: Login ");
            System.out.println("2 Sair");


            String opcao = scan.nextLine();

            switch (opcao) {
                case "1":
                    login();
                    break;
                case "2":
                    sistema = false;
                    break;
                default:
                    System.out.println("Número inválido");
            }
        }

    }

    public static void login() {
        Boolean login = true;
        while (login) {
            String usuarioAdmin = "portalcoordenador";
            String senhaAdmin = "Cordenador";

            System.out.println("Digite usuário:");


            String usuario = scan.nextLine();

            System.out.println("Digite sua senha:");
            String senha = scan.nextLine();

            if (usuario.equals(usuarioAdmin) && senha.equals(senhaAdmin)) {
                System.out.println("Usuário logado");
                System.out.println("BEM VINDO");
                //TODO criar menu
            } else {
                Boolean tentarNovamente = true;
                while (tentarNovamente) {

                    System.out.println("Usuário não encontrado");
                    System.out.println("deseja tentar novamente ?");
                    System.out.println("1: sim");
                    System.out.println("2: não");
                    String opcao = scan.nextLine();
                    switch (opcao) {
                        case "1":
                            tentarNovamente = false;
                            break;
                        case "2":
                            login = false;
                            tentarNovamente = false;
                            break;
                        default:
                            System.out.println("Número inválido");
                    }
                }
            }
        }
    }
}


