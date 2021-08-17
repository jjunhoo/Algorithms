package yanolja;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class yanolja2Test {

    // null
    @Test
    public void nullInvert() {
        String inverted = Inverter.invert(null);
        System.out.println("[inverted1] : " + inverted);
        Assert.assertEquals("", inverted);
    }

    // empty
    @Test
    public void emptyInvert() {
        String inverted = Inverter.invert("");
        System.out.println("[inverted2] : " + inverted);
        Assert.assertEquals("", inverted);
    }

    // 1 length string
    @Test
    public void oneLengthStringInvert() {
        String inverted = Inverter.invert("s");
        System.out.println("[inverted3] : " + inverted);
        Assert.assertEquals("s", inverted);
    }

    @Test
    public void Invert() {
        String inverted = Inverter.invert("str");
        System.out.println("[inverted4] : " + inverted);
        Assert.assertEquals("rts", inverted);
    }
}