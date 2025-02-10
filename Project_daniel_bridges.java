import java.util.*; 
import java.io.*;


public class Project_daniel_bridges
{
   public static void main(String[] args)
   {
      
      try
      {
      
         File file = new File("PolicyInformation.txt");
         Scanner inputFile = new Scanner(file);
         
         int policy_number = 0, policy_holder_age = 0;
         String provider_name = "", policy_holder_first_name = "", policy_holder_last_name = "", policy_holder_smoking_status = "";
         double policy_holder_height = 0.0, policy_holder_weight = 0.0;
         
         ArrayList<Policy> policies = new ArrayList<Policy>();
         
         while(inputFile.hasNext())       
         { 
         
            policy_number = inputFile.nextInt();
            provider_name = inputFile.nextLine();
            policy_holder_first_name = inputFile.nextLine();
            policy_holder_last_name = inputFile.nextLine();
            policy_holder_age = inputFile.nextInt();
            policy_holder_smoking_status = inputFile.nextLine();
            policy_holder_height = inputFile.nextDouble();
            policy_holder_weight = inputFile.nextDouble();
         
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();
               inputFile.nextLine();
            }
         
            Policy p = new Policy(policy_number, provider_name, policy_holder_first_name, policy_holder_last_name, policy_holder_age, policy_holder_smoking_status, policy_holder_height,policy_holder_weight);
         
            policies.add(p); 
         
         }
         
         inputFile.close();
         
         /**
         *  Policy Number
         *  Provider Name
         *  Policyholder’s First Name
         *  Policyholder’s Last Name
         *  Policyholder’s Age
         *  Policyholder’s Smoking Status (will be “smoker” or “non-smoker”)
         *  Policyholder’s Height (in inches)
         *  Policyholder’s Weight (in pounds)
         */
         
         
      }
      
      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
      
   }
}