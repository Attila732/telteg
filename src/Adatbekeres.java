import java.util.Scanner;
 
public class Adatbekeres
{
  public static void main( String[] args )
  {
    Scanner sc;
 
    sc = new Scanner(System.in);
 
    int aOldal;
    int bOldal;
    aOldal = sc.nextInt();
    bOldal = sc.nextInt();
 
    sc.close();
 
    System.out.println("A téglalap területe: "+aOldal*bOldal*2);
  }
}