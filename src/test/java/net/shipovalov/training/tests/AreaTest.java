package net.shipovalov.training.tests;

import net.shipovalov.training.Square;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AreaTest {


    @Test
    public void testSquareAreaPositive() {
        Square s = new Square(5);
        Assert.assertEquals(25.0, s.sayAreaToo());

    }

    @Test
    private void testSquareAreaNegative() {
        Square s = new Square(5);
        Assert.assertEquals(25.0, s.sayAreaToo());

    }

}
