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
         
         int smoker_count = 0, non_smoker_count = 0, policy_count = 0;
         
         ArrayList<Policy> policies = new ArrayList<Policy>();
         while(inputFile.hasNext())       
         { 
            policy_number = inputFile.nextInt();
            inputFile.nextLine();
            provider_name = inputFile.nextLine();
            policy_holder_first_name = inputFile.nextLine();
            policy_holder_last_name = inputFile.nextLine();
            policy_holder_age = inputFile.nextInt();
            inputFile.nextLine();
            policy_holder_smoking_status = inputFile.nextLine();
            policy_holder_height = inputFile.nextDouble();
            inputFile.nextLine();
            policy_holder_weight = inputFile.nextDouble();
         
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();
               inputFile.nextLine();
            }
            
            PolicyHolder ph = new PolicyHolder(policy_holder_first_name, policy_holder_last_name, policy_holder_age, policy_holder_smoking_status, policy_holder_height, policy_holder_weight);
            Policy p = new Policy(policy_number, provider_name, ph);
            
            policies.add(p); 
            
         }
         
         inputFile.close();
         
         for(int i =0; i < policies.size(); i++)
         {  
            System.out.println(policies.get(i));
            System.out.println("");
            
            if(policies.get(i).get_policy_holder().get_smoking_status().equals("smoker"))
            {
               smoker_count++;
            }
            else
            {
               non_smoker_count++;
            }
            
            policy_count++;
            
         }
         
         System.out.println("Smoker count: " + smoker_count);
         System.out.println("Non-smoker count: " + non_smoker_count);
         System.out.println("Policy Count: " + policy_count);

      }
      
      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
      
   }
}