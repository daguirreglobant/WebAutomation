package com.globant;

// import static org.junit.Assert.assertTrue;

// import org.junit.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Assert.assertEquals("h", "h");
    }

    @Test
    public void other(){
        Assert.assertEquals("aa", "aa");
    }
}
