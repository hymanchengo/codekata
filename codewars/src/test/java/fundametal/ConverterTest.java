package test.java.fundametal;

import fundametal.Converter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author hxchen
 * @Date 2020/7/25
 */
public class ConverterTest {
    @Test
    public void testNumberToString() {
        assertEquals("67", Converter.numberToString(67));
        assertEquals("123", Converter.numberToString2(123));
        assertEquals("234", Converter.numberToString3(234));
    }
}
