package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//Positive test cases:"[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
//Negative test cases:"[LaunchCode", "Launch]Code[", "[", "]["


class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));}

    @Test
    public void bracketsWithCharReturnsTrue() {
       assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));}

    @Test
    public void bracketsWithOneCharWrappedReturnsTrue() {
       assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));}

    @Test
    public void bracketsBeforeCharReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));}

    @Test
    public void bracketsInWrongOrderFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));}

    @Test
    public void onlyOpenBracketsWithCharFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));}

    @Test
    public void bracketsInWrongOrderWithCharFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));}






    }


}


