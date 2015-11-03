import junit.framework.Test;
import junit.framework.TestSuite;

public class Seltestcases {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(seltestcases.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
