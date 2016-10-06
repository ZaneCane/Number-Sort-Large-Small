import java.util.Scanner;
import java.io.*;

public class LargestSmallest
{
   public static void main(String [] args) throws IOException
   {

      //String fileName;
      //list of variables
      double largeNum;
      double smallNum;
      double number;
      double number2;
      
      // Allows the user to input info.
      Scanner keyboard = new Scanner(System.in);
      
      //open the file for the do while loop
      File file = new File("Numbers.txt");
      Scanner inputFile = new Scanner(file);
      
      /**This do while loop gets the largest and smallest 
      numbers from the created file */
      do
      {
        
        number = inputFile.nextDouble();//gets the first number in the file to = number
         
        if(number != -99 )
        {
           largeNum = number;//sets the first number to automaticlly be the largest
           
           number = inputFile.nextDouble();//update the number variable to be the second number in the list
           
           if(number >= largeNum)//if the new number is bigger or equal to the current largeNum
           {                     //set largeNum equal to new number
              largeNum = number;
              
           }
           else if(number < largeNum)//if new num is smaller than largeNum then smallNum = new num
           {
              number2 = number;
              number = inputFile.nextDouble();
              
              if(number < number2)
              {
                 smallNum = number;
              }
              else if(number > number2)
              {
                 smallNum = number2;
              }
              
           }         
        }
        //get the large and smallest number and print it out
        else if(number == -99)
        {
           largeNum = inputFile.nextDouble();
           smallNum = inputFile.nextDouble();
           
           System.out.println("Largest Number" + largeNum +
                          "\n Smallest Number" + smallNum);
        }
        
      } while (inputFile.hasNext());
      
      inputFile.close();
      
   }
}
