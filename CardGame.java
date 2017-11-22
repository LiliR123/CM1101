import java.io.*;
import java.util.*;

public class CardGame extends Game{
	
  public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  private static RandomInterface r = new LinearCongruentialGenerator();
  public static ArrayList<String> cardList;
  private static HashSet<String> cardsChosen = new HashSet<String>();


  public static void initialiseCardGame() throws Exception {
      String cards[]={"AHrts", "2Hrts", "3Hrts", "4Hrts", "5Hrts", "6Hrts",
                      "7Hrts", "8Hrts", "9Hrts", "10Hrts", "JHrts",
                      "QHrts", "KHrts",
                      "ADmnds", "2Dmnds", "3Dmnds", "4Dmnds", "5Dmnds",
                      "6Dmnds", "7Dmnds", "8Dmnds", "9Dmnds", "10Dmnds",
                      "JDmnds", "QDmnds", "KDmnds",
                      "ASpds", "2Spds", "3Spds", "4Spds", "5Spds", "6Spds",
                      "7Spds", "8Spds", "9Spds", "10Spds", "JSpds",
                      "QSpds", "KSpds",
                      "AClbs", "2Clbs", "3Clbs", "4Clbs", "5Clbs", "6Clbs",
                      "7Clbs", "8Clbs", "9Clbs", "10Clbs", "JClbs",
                      "QClbs", "KClbs"};
                      
     cardList=new ArrayList<String> (Arrays.asList(cards));

     for (int i=0; i<100; i++) {
        // choose two random cards at random and swap them, 100 times
        int firstIndex=((int) (r.next() * 52));
        int secondIndex=((int) (r.next() * 52));
        String temp=(String) cardList.get(firstIndex);
        cardList.set(firstIndex, cardList.get(secondIndex));
        cardList.set(secondIndex, temp); 
      }

      System.out.println(cardList);
  }
  
  public static void mainCardGame() throws Exception {
    
      for (int i=0; i<2; i++) {
        System.out.println("Hit <RETURN> to choose a card");
        br.readLine();

        int cardChoice=(int) (r.next() * cardList.size());
        System.out.println("You chose " + cardList.get(cardChoice));
        cardsChosen.add(cardList.remove(cardChoice));
      }

      System.out.println("Cards chosen: " + cardsChosen);
      System.out.println("Remaining cards: " + cardList);

  }

  public static void declareCardGameWinner() throws Exception {
    
      System.out.println("Cards chosen: " + cardsChosen);
      if (cardsChosen.contains("AHrts") || cardsChosen.contains("ADmnds") ||
          cardsChosen.contains("ASpds") || cardsChosen.contains("AClbs")) {
        System.out.println("You won!");
      }
      else System.out.println("You lost!");
  }


}

