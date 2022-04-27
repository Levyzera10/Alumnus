package alumnus.enums;

public enum TurnoEnum {
    MANHA("manhã"),
    TARDE("tarde"),
    NOITE("NOITE");

    private final String turno;

    TurnoEnum(String turno) {
        this.turno = turno;
    }

    public static TurnoEnum forValue(String turno) {
        for (TurnoEnum value : TurnoEnum.values()) {
            if (value.turno.equals(turno)) {
                return value;
            }
        }
        return null;
    }
}
