package random.out;
import java.util.*;                                                                 //for objects
import java.io.*;                                                                   //for files

public class RandomOut
{
   public static void RandomNums(int amount, int smallest, int largest, String filename) throws FileNotFoundException
   {
      Random rand = new Random();                                                   //random object
      PrintStream numbers = new PrintStream(new File(filename+".txt"));             //printstream to file indicated by user
      
      int i = 0;
      
      while (i != amount)                                                           //prints lines until the amount of integers is equal to the amount the user inputed
      {
         for(int ints = 0; (i < (amount-1)) && (ints < 5); ints++)                  //prints 5 random integers per line in file until the second to last integer
         {
            numbers.print((rand.nextInt(largest-smallest+1) + smallest)+", ");      //prints random integer with comma after
            i++;                                                                    //updates amount of random numbers printed
         }                                                                          //end of for loop
         
         if (i == amount-1)                                                         //if the second to last integer has been printed, this runs
         {
            numbers.print(rand.nextInt(largest-smallest+1) + smallest);             //prints the last integer
            i++;                                                                    //updates amount of random numbers printed to be able to exit the while loop
         }                                                                          //end of if
         
         numbers.println();                                                         //goes to next line
      }                                                                             //end of while
      
   }                                                                                //end of function
   
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner input = new Scanner(System.in);
      
      System.out.println("How many random numbers do you want?");                   //asks user the following
      int a = input.nextInt();
      
      System.out.println("What is the smallest random number?");
      int s = input.nextInt();
      
      System.out.println("What is the largest random number?");
      int l = input.nextInt();
      
      System.out.println("What is the name of the file that you would "+
      "like to store the numbers in?");                                             //asks for file that user wants to store random numbers in
      String f = input.next();
      
      RandomNums(a, s, l, f);                                                       //function called
   }                                                                                //end of main
}                                                                                   //end of program
