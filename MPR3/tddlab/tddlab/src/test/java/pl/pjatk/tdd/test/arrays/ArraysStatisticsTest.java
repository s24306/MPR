package pl.pjatk.tdd.test.arrays;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.tdd.arrays.ArraysStatistics;

public class ArraysStatisticsTest {
    @Test
    public void maximumShouldBePositiveNumber(){
        Assert.assertEquals(1, ArraysStatistics.max(new int[]{-10,-5,1,-2,-13}));
    }

    @Test
    public void maximumShouldBeNegativeNumber(){
        Assert.assertEquals(-1, ArraysStatistics.max(new int[]{-10,-5,-1,-2,-13}));
    }

    @Test
    public void minimumShouldBePositiveNumber(){
        Assert.assertEquals(1, ArraysStatistics.min(new int[]{10,5,1,2,13}));
    }

    @Test
    public void minimumShouldBeNegativeNumber(){
        Assert.assertEquals(-1, ArraysStatistics.min(new int[]{10,55,-1,2,13}));
    }

    @Test
    public void averageShouldBeOne(){
        Assert.assertEquals(1, ArraysStatistics.avg(new int[]{1, 1, 1, 1, 1}), 0.1);
    }

    @Test
    public void averageShouldBeTen(){
        Assert.assertEquals(10, ArraysStatistics.avg(new int[]{10,1,5,20,14}),0.1);
    }

    @Test
    public void sumShouldBe15(){
        Assert.assertEquals(15, ArraysStatistics.sum(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void sumShouldBe100(){
        Assert.assertEquals(100, ArraysStatistics.sum(new int[]{10, 20, 30, 40, 0}));
    }
}
