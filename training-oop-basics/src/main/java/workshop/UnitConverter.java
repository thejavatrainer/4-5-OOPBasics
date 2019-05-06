package workshop;

import java.util.Optional;

public enum UnitConverter {

    KILOMETERS_TO_METRES(Unit.KILOMETER, Unit.METRE, 1000);

    private final double ratio;
    private final Unit from;
    private final Unit to;

    UnitConverter(Unit from, Unit to, double ratio) {
        this.from = from;
        this.to = to;
        this.ratio = ratio;
    }

    public Optional<Double> convert(double value) {
        if(from.getType().equals(to.getType())){
            return Optional.of(value * ratio);
        }
        return Optional.empty();
    }
}
