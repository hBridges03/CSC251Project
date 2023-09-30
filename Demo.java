import java.util.*; 
import java.io.*;

public class Demo
{
    public static void main(String[] args) throws IOException
    {
    

         //select the file for input
         File file = new File("PolicyInformation.txt");
         //create a scanner object for the input file
         Scanner inputFile = new Scanner(file);
         
         //declare the variables
         String input = "";
         String providerName = "", firstName = "", lastName = "", smokingStatus = "non-smoker";
         int policyNumber = 0, age = 0, height = 0, weight = 0;
         
         //create an array to hold each class object
         ArrayList<Policy> policies = new ArrayList<Policy>();
         
         //loop while the file has more information
         while(inputFile.hasNext())
         {
         //set variables to each line of input
            input = inputFile.nextLine();
            policyNumber = Integer.parseInt(input);
            
            providerName = inputFile.nextLine();  
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            
            input = inputFile.nextLine();
            age = Integer.parseInt(input);
            
            smokingStatus = inputFile.nextLine();
            
            input = inputFile.nextLine();         
            height = Integer.parseInt(input);
            
            input = inputFile.nextLine(); 
            weight = Integer.parseInt(input);
            
            //clears next line
             if(inputFile.hasNext())
            { 
               inputFile.nextLine();
               //another??
            }
            //create a class object and store it in the array.
            Policy p = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
            policies.add(p);
         }
         //close the input file
         inputFile.close();
         
      //print all classes from the array
      for(int i =0; i < policies.size(); i++)
      {
         policies.get(i).print();
         System.out.println("");
      }
    }
}
