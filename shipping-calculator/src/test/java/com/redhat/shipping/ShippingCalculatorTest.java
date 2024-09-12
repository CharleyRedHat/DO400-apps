package com.redhat.shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {

    @Test
    public void canCalculateTheCostForARegion() throws RegionNotFoundException {
        ShippingCalculator calculator = new ShippingCalculator();
        assertEquals(0, calculator.costForRegion("A Region"));
    
    }

    @Test
    public void onNARegionTheCostIs100() throws RegionNotFoundException {

        ShippingCalculator calculator = new ShippingCalculator();
        int calculatedCost = calculator.costForRegion("NA");
        assertEquals(100,calculatedCost);
    }

    @Test
    public void onLATAMRegionTheCostIs200() throws RegionNotFoundException {

        ShippingCalculator calculator = new ShippingCalculator();
        int calculatedCost = calculator.costForRegion("LATAM");
        assertEquals(200,calculatedCost);

    }

    @Test
    public void onNonSupportedRegionARegionNotFoundExceptionIsRaised() {
        ShippingCalculator calculator = new ShippingCalculator();
        assertThrows(RegionNotFoundException.class,
        () -> calculator.costForRegion("Unknown Region")
        );
    }
    
}
