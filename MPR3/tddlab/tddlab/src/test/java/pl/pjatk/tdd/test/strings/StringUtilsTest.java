package pl.pjatk.tdd.test.strings;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.tdd.strings.StringUtils;

public class StringUtilsTest {

    @Test
    public void sumShouldBeSeven(){
        Assert.assertEquals(7, StringUtils.sumDigits("52"));
    }

    @Test
    public void sumShouldBeSix(){
        Assert.assertEquals(6, StringUtils.sumDigits("123"));
    }

    @Test
    public void isPalindrome(){
        Assert.assertEquals(true, StringUtils.checkPalindrome("Aga"));
    }

    @Test
    public void isNotPalindrome(){
        Assert.assertEquals(false, StringUtils.checkPalindrome("Agra"));
    }
}
