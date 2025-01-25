import java.util.Scanner;


public class Project_daniel_bridges
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      Policy policy = new Policy();
      
      // Policy Number
      System.out.println("Please enter the Policy Number: ");
      policy.set_policy_number(input.nextInt());
      input.nextLine(); // Consume the newline character
      
      // Provider Name
      System.out.println("Please enter the Provider Name: ");
      policy.set_provider_name(input.nextLine());
      
      // First Name
      System.out.println("Please enter the Policy Holder's First Name: ");
      policy.set_policy_holder_first_name(input.nextLine());
      
      // Last Name
      System.out.println("Please enter the Policy Holder's Last Name: ");
      policy.set_policy_holder_last_name(input.nextLine());
      
      // Age
      System.out.println("Please enter the Policy Holder's Age: ");
      policy.set_policy_holder_age(input.nextInt());
      input.nextLine(); // Consume the newline character
      
      // Smoking Status
      System.out.println("Please enter the Policy Holder's Smoking Status (smoker/non-smoker): ");
      String smoking_status = (String) validate_string_input(input, "smoker", "non-smoker");
      policy.set_policy_holder_smoking_status(smoking_status);
      
      // Height
      System.out.println("Please enter the Policy Holder's Height (in inches): ");
      policy.set_policy_holder_height(input.nextDouble());
      input.nextLine(); // Consume the newline character
      
      // Height
      System.out.println("Please enter the Policy Holder's Weight (in pounds): ");
      policy.set_policy_holder_weight(input.nextDouble());
      input.nextLine(); // Consume the newline character
      
      // Display Everything
      System.out.println("Policy Number: " + policy.get_policy_number());
      System.out.println("Provider Name: " + policy.get_provider_name());
      System.out.println("Policy Holder's First Name: " + policy.get_policy_holder_first_name());
      System.out.println("Policy Holder's Last Name: " + policy.get_policy_holder_last_name());
      System.out.println("Policy Holder's Age: " + policy.get_policy_holder_age());
      System.out.println("Policy Holder's Smoking Status: " + policy.get_policy_holder_smoking_status());
      System.out.println("Policy Holder's Height: " + policy.get_policy_holder_height() + " inches");
      System.out.println("Policy Holder's Weight: " + policy.get_policy_holder_weight() + " pounds");
      System.out.printf("Policy Holder's BMI: %.2f\n", policy.calculate_body_mass_index());
      System.out.printf("Policy Price: $%.2f", policy.calculate_insurance_price());
      
   }
   
   private static String validate_string_input(Scanner input, String option1, String option2) {
      String value = input.nextLine().toLowerCase();
      while (!value.equals(option1) && !value.equals(option2)) {
         System.out.println("Invalid input. Please enter " + option1 + " or " + option2 + ": ");
         value = input.nextLine().toLowerCase();
      }
      return value;
   }
   
}