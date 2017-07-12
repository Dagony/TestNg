package test.depends.Test;

import org.testng.annotations.Test;
import test.depends.SimpleDependencyTest;

public class InheritedTest extends SimpleDependencyTest {

    @Test(dependsOnMethods={"testOne"})
    public void testThree() {
        System.out.println("Test three method in Inherited test");
    }

    @Test
    public void testFour() {
        System.out.println("Test four method in Inherited test");
    }

}
