package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor underAgeVisitor;
    Visitor overAgeVisitor;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        underAgeVisitor = new Visitor(14, 1.30, 10.00);
        overAgeVisitor = new Visitor(16, 1.45, 10.00);

    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void isVisitorAllowed__false(){
        assertEquals(false, playground.isAllowedVisitor(overAgeVisitor));
    }

    @Test
    public void isVisitorAllowed__true(){
        assertEquals(true, playground.isAllowedVisitor(underAgeVisitor));
    }
}
