package test.exception;

import org.testng.annotations.Test;

import java.io.IOException;

public class ExceptionTest {

    @Test(expectedExceptions={IOException.class})
    public void excpetionTestOne() throws Exception {
        throw new IOException();
    }

    @Test(expectedExceptions={IOException.class, NullPointerException.class})
    public void exceptionTestTwo() throws Exception {
        throw new NullPointerException();
    }

}
