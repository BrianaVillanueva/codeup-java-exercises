package JavaPushers;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class TestJava {
  /*creating a test for compareNumbers*/
 @Test
    public void testCompareNumbers() {
     //Greater than
     assertEquals (compareNumbers.compareNumbers(50.0, 37.625), "50.0 > 37.625");
     //Less than
     assertEquals (compareNumbers.compareNumbers(30.0, 37.625), "30.0 < 37.625");
     //Equal
     assertEquals (compareNumbers.compareNumbers(30.0, 30.0), "30.0 == 30.0");
     //Exception
 }
}
