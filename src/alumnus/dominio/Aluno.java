package alumnus.dominio;

public class Aluno {
    private String nome;
    private String cpf;
    private String dataDeNascimento;
    private String matricula;
    private String idioma;
    private char sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if((nome.length() < 6 ) || (nome.length() > 30 )){
            throw new IllegalArgumentException("Nome inválido . Mínimo 6 caracteres e máxido de 30 caracteres");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}


