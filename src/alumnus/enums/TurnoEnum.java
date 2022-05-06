package alumnus.enums;

public enum TurnoEnum {
    MANHA("manhã"),
    TARDE("tarde"),
    NOITE("NOITE");

    private final String turno;

    TurnoEnum(String turno) {
        this.turno = turno;
    }
}
