 import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    System.out.println("Insira um valor para coordenada X:");
    int x = sc.nextInt();
    System.out.println("Insira um valor agora para coordenada Y:");
    int y = sc.nextInt();
    while ( x > 0 ) {
      if ( y > 0 );
      System.out.println("pertence ao terceiro quadrante ");
      if ( y < 0 );
      System.out.println("pertence ao segundo quadrante");
    }
    while ( x < 0) {
      if (y > 0);
      System.out.println("pertence ao segundo quadrante");
      if ( y < 0);
      System.out.println("pertence ao primeiro quadrante");
    }
   if ( x == 0) {
    System.out.println("Programa emcerrado");
   }

    sc.close();
  }
}