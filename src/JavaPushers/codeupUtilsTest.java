package JavaPushers;

import java.util.ArrayList;

public class codeupUtilsTest {

    @Before
    public void setup() {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
    }

    @Test
    public void testFindAddends() {
        ArrayList<ArrayList<Integer>> resultList;
        resultList = codeupUtils.findAddends(intList, 5);

    }
}
