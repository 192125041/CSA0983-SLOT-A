import java.util.Scanner;
publicv class Reversev{
  public static void main(String[] args){
    Scanner x =new Scanner(System.in);
    System.out.print("Enter the word: ");
    String y= x.nextLine();
    String Reverse=new StringBuilder(y).reverse().toString();
    System.out.println("reversed sting: "+reverse);
  }}
