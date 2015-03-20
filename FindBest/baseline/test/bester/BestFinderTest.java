package bester;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class BestFinderTest {
    @Test
    public void givenOnlyOneRectangleItShouldReturnBestRectangle() throws Exception {
        Rectangle[] rectangles = { new Rectangle(2,3) };
        assertEquals(new Rectangle(2,3),BestFinder.findBest(rectangles));
    }

    @Test
    public void givenManyRectangleItShouldReturnBestRectangle() {
        Rectangle[] rectangles = {new Rectangle(2, 3), new Rectangle(5, 7)};
        assertEquals(new Rectangle(5, 7),BestFinder.findBest(rectangles));
    }

    @Test
    public void givenEmptyArrayItShouldReturnNull() throws Exception {
        Rectangle[] rectangles = { };
        assertEquals(null,BestFinder.findBest(rectangles));
    }

    @Test
    public void givenCookiesItShouldReturnCookiesWithMostChocolateChips(){
        Cookie[] cookies = { new Cookie(5), new Cookie(7) };
        assertEquals(new Cookie(7),BestFinder.findBest(cookies));
    }

    @Test
    public void given10DollarsAnd10RMBAnd50RMBShouldReturn10Dollar(){
        Bestable[] money = { new Dollar(10), new RMB(10), new RMB(50) };
        assertEquals(new Dollar(10),BestFinder.findBest(money));
    }
}
