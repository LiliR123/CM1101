import java.io.*;
import java.util.*;

public class DieGame {
	
  public  static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  private static RandomInterface r = new LinearCongruentialGenerator();
  private static HashSet<Integer> numbersRolled=new HashSet<Integer>();

  public static void mainDieGame() throws Exception {
  
      for (int i=0; i<2; i++) {
        System.out.println("Hit <RETURN> to roll the die");
        br.readLine();
        int dieRoll=(int)(r.next() * 6) + 1;

        System.out.println("You rolled " + dieRoll);
        numbersRolled.add(new Integer(dieRoll));
      }

      System.out.println("Numbers rolled: " + numbersRolled);
  }

  public static void declareDieGameWinner() throws Exception {
      
      if (numbersRolled.contains(new Integer(1))) {
        System.out.println("You won!");
      }
      else System.out.println("You lost!");
  }


}
