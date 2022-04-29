package alumnus.dominio;

import alumnus.enums.TurnoEnum;

public class Professor extends Pessoa {

    private String matricula;
    private TurnoEnum turno;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TurnoEnum getTurno() {
        return turno;
    }

    public void setTurno(TurnoEnum turno){
        this.turno = turno;
    }
}
