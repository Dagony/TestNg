package test.depends.regularexp;

import org.testng.annotations.Test;

public class RegularExpressionTest {

    @Test(dependsOnGroups={"starts-with.*"})
    public void regularExpMethod() {
        System.out.println("Dependent method");
    }

    @Test(groups={"starts-with-one"})
    public void startsWithOne() {
        System.out.println("Starts with method one");
    }

    @Test(groups={"starts-with-two"})
    public void startsWithTwo() {
        System.out.println("Starts with method two");
    }
}
