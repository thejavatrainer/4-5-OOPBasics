import dummy.Unit;
import exception.ConversionException;
import unit.converter.UnitConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitConverterTest {

    @Test
    public void testConversionBetweenMetersAndKilometers(){
        assertEquals(0.1, UnitConverter.convert("100 m to kilometer"), 0.001);
    }

    @Test(expected = ConversionException.class)
    public void testConversionOfDifferentUnitTypes() throws ConversionException {
        UnitConverter.convert(Unit.CENTIMETER, Unit.KILOMETER_PER_HOUR, 100);
    }

    @Test
    public void testConversionMeterToCm() throws ConversionException {
        assertEquals(100.00001, UnitConverter.convert(Unit.METER, Unit.CENTIMETER, 1), 0.01);
    }
}
