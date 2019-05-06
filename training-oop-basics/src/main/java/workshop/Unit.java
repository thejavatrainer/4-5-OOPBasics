package workshop;

public enum Unit {

    METRE(UnitType.LENGTH),
    KILOMETER(UnitType.LENGTH),
    LIGHT_YEAR(UnitType.LENGTH),
    KILOGRAM(UnitType.MASS),
    LITRE(UnitType.VOLUME);

    private final UnitType type;

    private Unit(UnitType type) {
        this.type = type;
    }

    public UnitType getType(){
        return type;
    }
}
