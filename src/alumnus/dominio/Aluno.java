package alumnus.dominio;

public class Aluno {
    private String nome;
    private String cpf;
    private String dataDeNascimento;
    private String matricula;
    private String idioma;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if ((nome.length() < 6) || (nome.length() > 30))
            throw new IllegalArgumentException("Nome inválido . Mínimo 6 caracteres e máxido de 30 caracteres");
        else
            this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if ((cpf.length() < 11) || (cpf.length() > 11))
            throw new IllegalArgumentException("CPF inválido");
        else
            this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        if ((dataDeNascimento.length() < 8) || (cpf.length() > 8))
            throw new IllegalArgumentException("CPF inválido");
        else
            this.dataDeNascimento = dataDeNascimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if ((matricula.length() < 12) || (matricula.length() > 12))
            throw new IllegalArgumentException("Mátricula inválida");
        else
            this.matricula = matricula;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        if ((idioma != "Inglês") || (idioma != "Francês") || (idioma != "Latim"))
            throw new IllegalArgumentException("Idioma inválido");
        this.idioma = idioma;
    }

    public void listarDados(){
        System.out.println("Nome : " + nome);
        System.out.println("Cpf  : " + cpf);
        System.out.println("Data de Nascimento : " + dataDeNascimento);
        System.out.println("Idioma : " + idioma);
    }

}



