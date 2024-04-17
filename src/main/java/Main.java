import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("Podaj liczbe:");
    Scanner scanner = new Scanner(System.in);
    int liczba = scanner.nextInt();
    System.out.println("Podaj znak:");
    char znak = scanner.next().charAt(0);
    for(int i = 0; i < liczba; i++) {
      for(int j = liczba; j >= i; j--){
        System.out.print(" ");
      }
      for(int j = 0; j <= i; j++){
        System.out.print(znak);
      }
        System.out.println();
}
    
}
}