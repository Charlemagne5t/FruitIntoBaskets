import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        int[] fruits = {1,2,1};
        int expected = 3;
        int actual = new Solution().totalFruit(fruits);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        int[] fruits = {0,1,2,2};
        int expected = 3;
        int actual = new Solution().totalFruit(fruits);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        int[] fruits = {1,2,3,2,2};
        int expected = 4;
        int actual = new Solution().totalFruit(fruits);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};
        int expected = 5;
        int actual = new Solution().totalFruit(fruits);

        Assert.assertEquals(expected, actual);
    }
}
