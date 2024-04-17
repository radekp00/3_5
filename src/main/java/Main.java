// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int n = 0;
    char symbol;
    System.out.println("Podaj n");

    n = myObj.nextInt();

    System.out.println("Podaj symbol");

    symbol = myObj.next().charAt(0);

    for (int i = 0; i < n - 1; i++) {

      for (int j = 0; j < n + 1; j++) {
        if (j == n || j == n - i) {
          System.out.print(symbol);
        } else {
          System.out.print(" ");
        }

      }
      System.out.println();
    }
    System.out.print(" ");
    for (int i = 0; i < n; i++) {
      System.out.print(symbol);
    }

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}