
/*
 * This unit test has at least one @Test method for each of the 15 methods 
 * in Project2.java. However, they are incomplete, and do not represent 100% 
 * code coverage. This project is meant to encourage you to think of other
 * needed test cases as you add your own asserts. 
 * 
 * To grade, we will be running a unit test that is much larger than this 
 * starter unit test.
 * 
 * Programmers: Rick Mercer and Omar R. Gebril
*/
import static org.junit.Assert.*;
import org.junit.Test;

public class ControlFun1Test {

  // Send messages to the methods in Project2 to the 
  // instance variable myFun
  private ControlFun1 myFun = new ControlFun1();

  @Test
  // Recommended: Run one @Test method at a time as you work on only
  // one method at a time.
  // 1. Highlight the method name
  // 2. Right click on that method name
  // 3. From the menu, select: Run As > JUnit Test
  public void testMiddleTwo() {
    assertEquals("ab", myFun.middleTwo("abc"));
    assertEquals("bc", myFun.middleTwo("abcd"));
    assertEquals("oh", myFun.middleTwo("John"));
    assertEquals(null, myFun.middleTwo("a"));
    
  }

  @Test
  // Recommended: Run one @Test method at a time as you work on only
  // one method at a time.
  // 1. Highlight the method name
  // 2. Right click on that method name
  // 3. From the menu, select: Run As > JUnit Test
  public void testAntimatter() {
    assertEquals("Anti-Shoes", myFun.antiMatter("Shoes"));
    assertEquals("Anti-Crime", myFun.antiMatter("Crime"));
    assertEquals("Anti-Social", myFun.antiMatter("Social"));
    assertEquals("Anti-Food", myFun.antiMatter("Food"));
  }

  @Test
  public void testAbba() {
    // Recommended: Run one @Test method at a time as you work on only
    // one method at a time.
    // 1. Highlight the method name
    // 2. Right click on that method name
    // 3. From the menu, select: Run As > JUnit Test
    assertEquals("abba", myFun.abba("a", "b"));    
    assertEquals("HiByeByeHi", myFun.abba("Hi", "Bye"));
    assertEquals("YoAliceAliceYo", myFun.abba("Yo", "Alice"));
  }

  @Test
  public void testTriangleArea() {
    assertEquals(12.5, myFun.triangleArea(5.0, 5.0), 0.01);
    assertEquals(52.5, myFun.triangleArea(15.0, 7.0), 0.01);
    assertEquals(900.0, myFun.triangleArea(75.0, 24.0), 0.01);
    assertEquals(87.0, myFun.triangleArea(2.0, 87.0), 0.01);
  }

  @Test
  public void testRange() {
    assertEquals(0.0, myFun.range(90.0, 100.0), 0.01);
    assertEquals(883.69, myFun.range(30.0, 100.0), 0.01);
    assertEquals(643.14, myFun.range(40.0, 80.0), 0.01);
  }

  @Test
  public void testRound() {
    assertEquals(3.46, myFun.round(3.4567, 2), 0.01);
    assertEquals(4, myFun.round(4.12, 0), 0);
    assertEquals(15.435, myFun.round(15.435346, 3), 0.001);
  }

  @Test
  public void testCloseTen() {
	assertTrue(myFun.closeToTen(9));
    assertTrue(myFun.closeToTen(8));
    assertTrue(myFun.closeToTen(12));
    assertTrue(myFun.closeToTen(11));

    assertFalse(myFun.closeToTen(13));
    assertFalse(myFun.closeToTen(15));
    assertFalse(myFun.closeToTen(17));
    assertFalse(myFun.closeToTen(36));
  }

  @Test
  public void testLike6() {
    assertTrue(myFun.like6(6, 4));
    assertTrue(myFun.like6(1, 5));
    assertFalse(myFun.like6(4, 5));
  }

  @Test
  public void testEndUp() {
    assertEquals("TRE", myFun.endUp("tre"));
    assertEquals("HeLLO", myFun.endUp("Hello"));
    assertEquals("hi thERE", myFun.endUp("hi there"));
    assertEquals(null, myFun.endUp("hi"));
    
  }

  @Test
  public void testMakeTags() {
    assertEquals("<i>Yay</i>", myFun.makeTags("i", "Yay"));
    assertEquals("<body>MAIN</body>", myFun.makeTags("body", "MAIN"));
    assertEquals("<cite>Citation</cite>", myFun.makeTags("cite",  "Citation"));
  }

  @Test
  public void testSplitstring() {
    assertEquals("Wil dcat", myFun.splitString("Wildcat"));
    assertEquals("Wil dca", myFun.splitString("Wildca"));
    assertEquals("a b", myFun.splitString("ab"));
    assertEquals("wil dcat", myFun.splitString("wildcat"));
  }

  @Test
  public void testFailedLatinPig() {
    assertEquals("gares", myFun.igwayAtinway("gears"));
    assertEquals("aplpe", myFun.igwayAtinway("apple"));
    assertEquals("piorr", myFun.igwayAtinway("prior"));
    assertEquals("sonce", myFun.igwayAtinway("scone"));
    assertEquals(null, myFun.igwayAtinway("scon"));
  }

  @Test
  public void testMonkies() {
    assertTrue(myFun.monkies(true, true));
    assertTrue(myFun.monkies(false, false));

    assertFalse(myFun.monkies(false, true));
    assertFalse(myFun.monkies(true, false));
  }

  // Add more test cases with asserts to every @Test method

  @Test
  public void alone() {
    assertTrue(myFun.alone(13, 99));
    assertTrue(myFun.alone(14, 66));
    assertTrue(myFun.alone(18, 23));
    assertFalse(myFun.alone(16, 17));
    assertFalse(myFun.alone(24, 65));
    assertFalse(myFun.alone(87, 56));
  }

  @Test
  public void testFIsLeapYear() {
    assertTrue(myFun.isLeapYear(1600));
    assertTrue(myFun.isLeapYear(2008));
    assertTrue(myFun.isLeapYear(2016));
    assertFalse(myFun.isLeapYear(2100));
    assertFalse(myFun.isLeapYear(2009));
    assertFalse(myFun.isLeapYear(2100));

  }
}