import java.io.*;
import java.util.*;

public class Game {
	
  public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  
  public static void playCardGame() throws Exception {
      
      CardGame.initialiseCardGame();
      CardGame.mainCardGame();
      CardGame.declareCardGameWinner();
  }

  public static void playDieGame() throws Exception {
    
      DieGame.mainDieGame();

      DieGame.declareDieGameWinner();
  }

  public static void main(String[] args) throws Exception {

    System.out.print("Card (c) or Die (d) game? ");
    String ans=br.readLine();

    if (ans.equals("c")) {
      playCardGame();
    }

    else if (ans.equals("d")) {
      playDieGame();
    }

    else System.out.println("Input not understood");
  }
}

