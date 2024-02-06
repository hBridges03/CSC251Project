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
         int counter = 0;
         int smokerCount = 0, nonSmokerCount = 0;
         
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
            //create a policy holder object
            PolicyHolder pHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
            
            //track number of smokers and non-smokers
            if(pHolder.getSmokingStatus().equalsIgnoreCase("smoker")) {
               smokerCount += 1;
            }
            else nonSmokerCount += 1;
            
            //create a policy object with new policy holder object
            Policy p = new Policy(policyNumber, providerName, pHolder);
            //add new policy to array
            policies.add(p);
            

         }  
         //close the input file
         inputFile.close();
         
      //print all required classes and fields
      
      for(int i = 0; i < policies.size(); i++)
      {
      //print array
         System.out.println("\n");
         System.out.println(policies.get(i));

      }
      //print number of policies created
      counter = policies.size() - 1;
      System.out.print("\nThere were " + policies.get(counter).getInstanceCount() + " Policy objects created.\n");
      
      //print number of smokers
      System.out.println("\nThe number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);

    }
}
