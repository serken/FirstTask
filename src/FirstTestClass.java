import java.util.Random;
import java.util.Scanner;

public class FirstTestClass {

  public static void main(String[] args){
    FirstTestClass ftc = new FirstTestClass();
    ftc.task1(425);
    ftc.task2(15, 55);
    ftc.task3(1, 4, 1);
    ftc.task4(2,2,1);
    ftc.task5();
    ftc.task6(11);
  }

  public void task1(int n){
      int sum = 0;
    System.out.print("Task1 start \n\nOutput: Number n =" + n);
      for(char c: Integer.toString(n).toCharArray())
        sum+= Integer.parseInt(String.valueOf(c));
    System.out.print("\nSum = " + sum);
    System.out.print("\n\nTask1 end\n\n");
  }

  public void task2(int a, int b){
      Random rnd = new Random();
      int n = rnd.nextInt(b-a) + a;
      System.out.print("Task2 start\n\nOutput: number beetwen a=" + a + " and b=" + b + " is: " + n);
      System.out.print("\n\nTask2 end\n\n");
  }

  public void task3(float a, float b, float c){
      System.out.print("Task3 start \n\nOutput: "+ (int)a +"x^2+"+ (int)b +"x+" + (int)c );
      float d = b*b - 4*a*c;
      double x1 = 0,x2 = 0;
      if (d == 0){
        x1=-b/(2*a);
        System.out.println("\nD = 0 \n x1 = x2 ="+ x1);
      }
      else {
          if(d < 0)
              System.out.println("\nD < 0, no x1 and x2");
          else {
              x1 = (-b + Math.sqrt(d))/2*a;
              x2 = (-b - Math.sqrt(d))/2*a;
              System.out.println("\nD > 0 \n x1 = "+ x1 +"\n x2 = "+ x2 );
          }
      }
      System.out.print("\nTask3 end\n\n");

  }

  public void task4(int a, int b, int c){
      System.out.print("Task4 start \n\nOutput: Numbers before -> a = "+ a +", b = "+ b +", c = "+ c);
      int t = 0;
      while( a > b || b > c ){
      if( a > b) {
          t = a;
          a = b;
          b = t;
      }
      if( b > c) {
         t = b;
         b = c;
         c = t;
      }

      }
      System.out.print("\nNumbers after -> a = "+ a +", b = "+ b +", c = "+ c);

      System.out.print("\n\nTask4 end\n\n");

  }

  public void task5(){
      System.out.print("Task5 start \n\nType your word to check: ");
      Scanner sc = new Scanner(System.in);
      char[] word= new char[5];
      char[] c = sc.nextLine().toLowerCase().toCharArray();
      System.out.println(c);
      if(c.length!=5)
        System.out.println("Your word has more or less than 5 chars");
      else {
        for(int i=0;i<c.length;i++){
          word[i] = c[c.length-1-i];
          }
        if(String.valueOf(word).equals(String.valueOf(c)))
          System.out.println("Your word is a polindrome");
        else
          System.out.println("Your word is not a polindrome");
        }
      System.out.print("\n\nTask5 end\n\n");

  }

  public void task6(int n){
      System.out.print("Task6 start \n\nOutput: ");
      int a = 1, b = 1;
      int c = 0;
      System.out.print("Fibonacci numbers: \n"+a+"\n"+b+"\n");
      for(int i=0;i<n-2;i++){
          c = a + b;
          a = b;
          b = c;
          System.out.println(c);
      }

      System.out.print("\n\nTask6 end\n\n");

  }

}
