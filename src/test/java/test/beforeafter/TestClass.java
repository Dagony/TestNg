package test.beforeafter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestClass extends BaseClass{

    /**
     * Before Class method which gets executed before
     * any of the test-methods inside a class.
     */
    @BeforeClass
    public void beforeChildClass() {
        System.out.println("Before Class method");
    }

    /**
     * After Class method which gets executed after
     * all of the test-methods inside a class gets executed.
     */
    @AfterClass
    public void afterChildClass(){
        System.out.println("After Class method");
    }

    /**
     * Before method which gets executed before each test-method.
     */
    @BeforeMethod
    public void beforeChildMethod(){
        System.out.println("Before Method");
    }

    /**
     * After method which gets executed after each test-method.
     */
    @AfterMethod
    public void afterChildMethod() {
        System.out.println("After Method");
    }

}
