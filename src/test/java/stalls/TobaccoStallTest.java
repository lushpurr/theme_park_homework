package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor overAgeVisitor;
    Visitor underAgeVisitor;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 10);
        underAgeVisitor = new Visitor(17, 1.30, 10.00);
        overAgeVisitor = new Visitor(19, 1.45, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void isVisitorAllowed__false(){
        assertEquals(true, tobaccoStall.isAllowedVisitor(overAgeVisitor));
    }

    @Test
    public void isVisitorAllowed__true(){
        assertEquals(false, tobaccoStall.isAllowedVisitor(underAgeVisitor));
    }

}
