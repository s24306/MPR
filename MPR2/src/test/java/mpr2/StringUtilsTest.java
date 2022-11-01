package mpr2;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class StringUtilsTest {

    @Test
    public void AlAmAkOtAtOuPpErCaSe(){
        String expected = "ALA MA KOTA";
        String result = StringUtils.toUpperCase("ala ma kota");
        assertEquals(expected, result);
    }

    @Test
    public void AlAmAkOtArEvErSe(){
        String expected = "atok am ala";
        String result = StringUtils.reverseString("ala ma kota");
        assertEquals(expected, result);
    }

    @Test
    public void AlAmAkOtAmUlTiPlY(){
        String expected = "ala ma kota ala ma kota ";
        String result = StringUtils.multiplyString("ala ma kota ", 2);
        assertEquals(expected, result);
    }

    @Test
    public void AlAmAkOtArEmOvEsMaLl(){
        String expected = "A";
        String result = StringUtils.removeSmallChars("Ala ma kota");
        assertEquals(expected, result);
    }

    @Test
    public void AlAmAkOtArEmOvEbIg(){
        String expected = "la ma kota";
        String result = StringUtils.removeBigChars("Ala ma kota");
        assertEquals(expected, result);
    }

    @Test
    public void AlAmAkOtAsPeCiAl(){
        String expected = "l m kt";
        String result = StringUtils.removeAllButLetters("4l4 m4 K0t4!");
        assertEquals(expected, result);
    }
}
