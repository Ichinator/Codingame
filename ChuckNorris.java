import java.util.*;
import java.io.*;
import java.math.*;
import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String message = in.nextLine();
    System.out.println(toUnary(message));
  }

  public static String toUnary(String message) {
    String chuckMessage;
    byte[] asBytes = message.getBytes();

    StringBuilder builder = new StringBuilder();
    for (byte aByte : asBytes) {
      String temp = Integer.toBinaryString(aByte);
      if(temp.length() < 7) {
        temp = "0" + temp;
      }
      builder.append(temp);
    }
    String binaryString = builder.toString();
    builder = new StringBuilder();
    System.err.println(String.format("binary string is %s", binaryString));
    builder.append("0");
    char previous = 2;
    for (int i = 0; i < binaryString.length(); i++) {
      char c = binaryString.charAt(i);
      if (c == '0') {
        if (previous == 1) {
          builder.append(' ').append(0).append(0).append(' ').append(0);
        } else if (previous == 2) {
          builder.append('0').append(' ').append('0');
        } else {
          builder.append('0');
        }
        previous = 0;
      } else {
        if (previous == 1) {
          builder.append('0');
        } else if (previous == 2) {
          builder.append(' ').append('0');
        } else {
          builder.append(' ').append('0').append(' ').append('0');
        }
        previous = 1;
      }
    }
    chuckMessage = builder.toString();
    return chuckMessage;
    }
}
