
/*
 * A class with 15 methods related by the fact that 210 students are learning
 * how to write our own Java methods, use Math methods and int doube, 
 * String and Boolean types through industrial strength unit testing with JUnit.
 * 
 * This is called ControlFun1 because it deals with the sequential control
 * structure, and the change in control when a message is sent, control
 * transfers to the method.
 * 
 * Some functions need Math arithmetic and trig functions, some need String
 * methods, some need Boolean operators, some are just silly.
 * 
 * If you can't find a function or formula you think you need, Google it.
 * 
 * Programmers: Rick Mercer and Omar R. Gebril
 */

public class ControlFun1 {

  /*
   * Given the base and height of a triangle, let triangleArea return the area of
   * the triangle. Assume positive input since negative lengths do not make sense.
   *
   * triangleArea (5.0, 5.0) returns 12.5
   */
  public double triangleArea(double base, double height) {
	return (0.5 * base * height);
  }

  /*
   * Complete the function that determines the range of a projectile. BTW:
   * velocity * velocity is usually written as velocity squared
   * 
   * range = sin(2 * angle) * velocity * velocity / gravity
   * 
   * where angle is the angle of the projectile’s path (in radians), velocity is
   * the initial velocity of the projectile (in meters per second), and gravity is
   * acceleration at 9.8 meters per second (a constant). You will need Math.PI and
   * Math.sin(double radians).
   * 
   * range(45.0, 100.0) returns 1020.4
   * 
   * An angle in degrees can be converted to radians by multiplying the number of
   * degrees by π / 180. For example:
   * 
   * 45° = 45.0 * Math.PI / 180.0 or 0.7853981633974483 radians.
   * 
   */
  public double range(double degrees, double velocity) {
	  double angle = degrees * (Math.PI/180);
	  double range = Math.sin(2*angle) * velocity * (velocity/9.8);
	  return range;
  }

  /*
   * Return a floating point number round to n decimal places. You will need
   * Math.round and Math.pow
   * 
   * round(3.4567, 0) returns 3 round(3.4567, 1) returns 3.5 round(3.4567, 2)
   * returns 3.46 round(3.4567, 3) returns 3.457
   * 
   */
  public double round(double number, int decimals) {
	  double decimalPoints = Math.pow(10.0, decimals);
	  double finalNum = Math.round(number*decimalPoints);
	  return finalNum/decimalPoints;
			  
  }

  /*
   * Given a non-negative number "num", return true if num is within 2 of a
   * multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5)
   * is 2.
   * 
   * closeToTen(12) returns true
   * 
   * closeToTen(17) returns false
   * 
   * nearTen(19) returns true
   * 
   * Precondition: num >=0;
   */
  public boolean closeToTen(int num) {
	  if (num >= 0) {
		  return ((num%10 >= 8) || (num%10 <= 2));
	  }
    return !true;
  }

  /*
   * The number 6 is a truly great number. Given two int values, a and b, return
   * true if either one is 6. Or if their sum or difference is 6. Note: the
   * function Math.abs(num) computes the absolute value of a number.
   * 
   * like6(6, 4) return true
   * 
   * like6(4, 5) return false
   * 
   * like6(1, 5) return true
   */
  public boolean like6(int a, int b) {
	  return (a == 6 || b == 6) || (a + b == 6) || (Math.abs(a - b) == 6);
  }

  /*
   * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
   * if each is smiling. We are in trouble if they are both smiling or if neither
   * of them is smiling. Return true if we are in trouble.
   * 
   * monkies(true, true) return true
   * 
   * monkies(false, false) returns true
   * 
   * monkies(true, false) returns false
   */
  public boolean monkies(boolean aSmile, boolean bSmile) {
	  if (aSmile == bSmile) {
		  return true;
	  }
    return !true;
  }

  /*
   * Everyone knows that interplanetary space travel systems are fueled by letting
   * matter and anti-matter mix. With this in mind, code a method that will take a
   * String with the name of some thing or idea. Return a String with "Anti-"
   * prepended to it. This method will tell us what to mix with that thing or idea
   * so we can create a reaction to fuel our ships! Don't forget the dash!
   * 
   * In short: Return the string matter references preceded by the string "Anti-".
   * This is case sensitive;
   * 
   * antiMatter("lol") returns Anti-lol
   */
  public String antiMatter(String matter) {
	  return ("Anti-" + matter);
  }

  /*
   * Given two strings, a and b, return the result of putting them together in the
   * order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
   * 
   * 
   * abba("Hi", "Bye") returns "HiByeByeHi"
   * 
   * abba("Yo", "Alice") returns "YoAliceAliceYo"
   */
  public String abba(String a, String b) {
	  return ( a + b + b + a);
  }

  /*
   * Determine and return the middle two chars of the String argument.
   * PreconditionL arg.length() >= 2. Return the middle two characters of the
   * argument. With an odd number of characters, favor the left.
   * 
   * middleTwo("ab") returns "ab" middleTwo("abc") returns "ab"
   */
  public String middleTwo(String arg) {
	  if (arg.length() >= 2) {
		  if (arg.length() % 2 == 0) {
			  return (arg.substring(arg.length() / 2 - 1, arg.length() / 2 + 1));
		  } else {
			  return (arg.substring(arg.length() / 2 - 1, arg.length() / 2+1));
			  
		  }
	  }
    return null;
  }

  /*
   * This method takes in a string of length 1 or greater, and returns a string
   * with a space added into the middle of the string. If the string's length is
   * an odd number, the second half of the string will be the longer half.
   * 
   * Precondition: str.length() >= 2
   * 
   * splitString ("Wildcat") returns "Wil dcat"
   * 
   * splitString ("ab") returns "a b"
   */
  public String splitString(String str) {
	if (str.length() >= 2) {
		int newLen = str.length()/2;
		return (str.substring(0,  newLen) + " " + str.substring(newLen, str.length()));
	}
    return null;
  }

  /*
   * Given a string, return a new string where the last 3 chars are now in upper
   * case. Note that str.toUpperCase() returns the uppercase version of a string.
   * You will also need Strings length and substring methods
   * 
   * endUp("Hello") returns "HeLLO"
   * 
   * endUp("hi there") returns "hi thERE"
   * 
   * endUp("hi") returns "HI"
   * 
   * Precondition: str.length >=3
   */
  public String endUp(String str) {
	  if (str.length() >= 3) {
	  return str.substring(0,  str.length()-3) + str.substring(str.length()-3, str.length()).toUpperCase();
	  }
	  return null;
	  
  }

  /*
   * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as
   * italic text. In this example, the "i" tag makes <i> and </i> which surround
   * the word "Yay". Given tag and word strings, create the HTML string with tags
   * around the word, e.g. "<i>Yay</i>".
   * 
   * makeTags("i", "Yay") returns "<i>Yay</i>"
   *
   * makeTags("cite", "Citation") returns "<cite>Yay</Citation>"
   */
  public String makeTags(String tag, String word) {
	  return ("<" + tag + ">" + word + "</" + tag + ">");
  }

  /*
   * Aoccdrnig to a rscheearch at an Elingsh uinervtisy, it deosn't mttaer in waht
   * oredr the ltteers in a wrod are, the olny iprmoetnt tihng is taht frist and
   * lsat ltteer is at the rghit pclae.
   * 
   * Create a method that will mix up the middle characters in a 5 letter word.
   * The precondition states the word must have exactly 5 letters. If the argument
   * is a different length, the ethod does not work.
   * 
   * Assuming the letters are indexed as 0-1-2-3-4, they should end up in the
   * order 0-2-3-1-4. Your method will accept a 5-character string as an argument
   * and return a 5-character string reordered as described.
   * 
   * Examples:
   * 
   * inLat ("apple") returns "aplpe"
   * 
   * inLat ("gears") returns "gares"
   * 
   * inLat ("prior") returns "piorr"
   * 
   * inLat ("scone") returns "sonce"
   * 
   * Precondition str.length() == 5
   */
  public String igwayAtinway(String str) {
	 if (str.length() == 5) {
	return str.substring(0, 1) + str.substring(2, 3) + str.substring(3,4) + 
			str.substring(1, 2) + str.substring(4, 5);
	 }
	return null;
  }

  /*
   * We'll say that a number is "alone" if it is in the range 13..19 inclusive.
   * Given 2 int values, return true if one or the other is teen, but not both.
   * 
   * alone(13, 99) returns true
   * 
   * alone(21, 19) returns true
   * 
   * alone(15, 15) returns false
   */
  public boolean alone(int a, int b) {
	return (a >= 13 && a <= 19) && (b <= 13 || b >= 19) || 
			(b >= 13 && b <= 19) && (a <= 13 || a >= 19);
  }

  /*
   * Complete method isLeapYear that returns true if the integer argument
   * represents a leap year. A leap year is a positive integer that is evenly
   * divisible by 4 except the last year of a century, which are those years
   * evenly divisible by 100. These must also be divisible by 400. 2000 was a leap
   * year and 2100 will not be even though 2100 is evenly divisible by 4.
   * 
   * isLeapYear(2008) returns true
   * 
   * isLeapYear(2009) returns false
   * 
   * isLeapYear(2100) returns false
   * 
   * Precondition: YEAR >= 1582
   */
  public boolean isLeapYear(int year) {
	if (year >= 1582) {
	return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
	}
  	return !true;
  }
}