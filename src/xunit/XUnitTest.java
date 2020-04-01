package xunit;

public class XUnitTest {
    public static void main(String[] args) {
        TestSuite suite = TestCaseTest.suite();
        TestResult result = new TestResult();
        suite.run(result);
        System.out.println(result.getSummary());

        TestSuite suite2 = new TestSuite();
        suite2.add(new TestCaseTest("ew vf"));
    }
}
