import Codingbat.Warmup1.SumDoudle;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

    public class SumDoubleTest {
        SumDoudle.SumDouble sumDouble = new SumDoudle.SumDouble();

        @DataProvider(name = "SumDoubleData")
        public Object[][] dpSumDouble(){
            return new Object[][]{
                    {1,2,3},
                    {3,2,5},
                    {2,2,8}
            };
        }
        @Test(description = "SumDoubleData",dataProvider = "SumDoubleData")
        public void setSumDoubleTest (int a,int b,int expected){
            Assert.assertEquals(sumDouble.sumDouble(1,2),3);
            Assert.assertEquals(sumDouble.sumDouble(3,2),5);
            Assert.assertEquals(sumDouble.sumDouble(2,2),8);
        }
    }

