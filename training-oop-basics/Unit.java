package dummy;

public enum Unit {

    METER(UnitType.DISTANCE,  "m", "M"), CENTIMETER(UnitType.DISTANCE, "cm", "CM"), LITER(UnitType.VOLUME, "m", "M"), KILOMETER_PER_HOUR(UnitType.SPEED, "m", "M");

    private final UnitType unitType;

    Unit(UnitType unitType, String ... representations) {
        this.unitType = unitType;
    }


    public UnitType getUnitType() {
        return unitType;
    }
}
