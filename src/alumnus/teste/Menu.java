package alumnus.teste;

import alumnus.dominio.Pessoa;

public class Menu {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Bob esponja");
        pessoa.setAltura(1.9);
        pessoa.setIdade(20);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());
    }
}
