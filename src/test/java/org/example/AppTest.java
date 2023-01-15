package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Tests have begun");
    }
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
