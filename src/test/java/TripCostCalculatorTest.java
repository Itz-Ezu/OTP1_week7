import static org.junit.jupiter.api.Assertions.*;

class TripCostCalculatorTest {

    @org.junit.jupiter.api.Test
    void calculateTripCost() {
        assertEquals(10, TripCostCalculator.calculateTripCost(200, 20, 1));
        assertEquals(20, TripCostCalculator.calculateTripCost(200, 10, 1));
        assertEquals(5, TripCostCalculator.calculateTripCost(100, 20, 1));
    }
}