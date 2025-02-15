package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void openBracketReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void closeBracketReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }


}
