package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor shortVisitor;
    Visitor tallVisitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        shortVisitor = new Visitor(10, 1.00, 10.00);
        tallVisitor = new Visitor(16, 2.00, 10.00);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isVisitorAllowed__false(){
        assertEquals(false, rollerCoaster.isAllowedVisitor(shortVisitor));
    }

    @Test
    public void isVisitorAllowed__true(){
        assertEquals(true, rollerCoaster.isAllowedVisitor(tallVisitor));
    }

    @Test
    public void isOver2mHeightChargedDouble(){
        assertEquals(16.80, rollerCoaster.priceFor(tallVisitor), 0.01);
    }

    @Test
    public void isUnder2mHeightChargedStandardPrice(){
        assertEquals(8.40, rollerCoaster.priceFor(shortVisitor), 0.01);
    }
}
