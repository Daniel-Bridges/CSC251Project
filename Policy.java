class Policy {
   
   // Is it better to do variables as "policy_number" or "policyNumber"? Is it preference or does it matter?
   // Also should I be shortening some of these names? I am currently under the opinion that the more descriptive
   // the variable name the better. 
   
   private int policy_number;
   private String provider_name;
   private String policy_holder_first_name;
   private String policy_holder_last_name;
   private int policy_holder_age;
   private String policy_holder_smoking_status; // Either "smoker" or "non-smoker"
   private double policy_holder_height; // in inches
   private double policy_holder_weight; // in pounds
   
    // No args constructor - Default Values
   public Policy() 
   {
      this.policy_number = 0000;
      this.provider_name = "none";
      this.policy_holder_first_name = "John";
      this.policy_holder_last_name = "Doe";
      this.policy_holder_age = 00;
      this.policy_holder_smoking_status = "none";
      this.policy_holder_height = 00.00;
      this.policy_holder_weight = 00.00;
   }
   
   // Args constructor
   public Policy(int policy_number, String provider_name, String policy_holder_first_name, 
   String policy_holder_last_name, int policy_holder_age, String policy_holder_smoking_status, 
   double policy_holder_height, double policy_holder_weight) 
   { 
      this.policy_number = policy_number;
      this.provider_name = provider_name;
      this.policy_holder_first_name = policy_holder_first_name;
      this.policy_holder_last_name = policy_holder_last_name;
      this.policy_holder_age = policy_holder_age;
      this.policy_holder_smoking_status = policy_holder_smoking_status;
      this.policy_holder_height = 000;
      this.policy_holder_weight = 000;
   }
   
   // Setters
   
   public void set_policy_number(int policy_number)
   {
      this.policy_number = policy_number;
   }
   
   public void set_provider_name(String provider_name)
   {
      this.provider_name = provider_name;
   }
   
   public void set_policy_holder_first_name(String policy_holder_first_name)
   {
      this.policy_holder_first_name = policy_holder_first_name;
   }
   
   public void set_policy_holder_last_name(String policy_holder_last_name)
   {
      this.policy_holder_last_name = policy_holder_last_name;
   }
   
   public void set_policy_holder_age(int policy_holder_age)
   {
      this.policy_holder_age = policy_holder_age;
   }
   
   public void set_policy_holder_smoking_status(String policy_holder_smoking_status)
   {
      this.policy_holder_smoking_status = policy_holder_smoking_status;
   }
   
   public void set_policy_holder_height(double policy_holder_height)
   {
      this.policy_holder_height = policy_holder_height;
   }
   
   public void set_policy_holder_weight(double policy_holder_weight)
   {
      this.policy_holder_weight = policy_holder_weight;
   }
   
   // Getters
   
   public int get_policy_number()
   {
      return this.policy_number;
   }
   
   public String get_provider_name()
   {
      return this.provider_name;
   }
   
   public String get_policy_holder_first_name()
   {
      return this.policy_holder_first_name;
   }
   
   public String get_policy_holder_last_name()
   {
      return this.policy_holder_last_name;
   }
   
   public int get_policy_holder_age()
   {
      return this.policy_holder_age;
   }
   
   public String get_policy_holder_smoking_status()
   {
      return this.policy_holder_smoking_status;
   }
   
   public double get_policy_holder_height()
   {
      return this.policy_holder_height;
   }
   
   public double get_policy_holder_weight()
   {
      return this.policy_holder_weight;
   }
   
   // Other Functions
   
   public double calculate_body_mass_index()
   {
      return (policy_holder_weight * 703) / (policy_holder_height * policy_holder_height);
   }
   
   public double calculate_insurance_price()
   {
      double price = 600; // Base fee
      double bmi = calculate_body_mass_index();
      
      if (policy_holder_age > 50) // If policy holder is older than 50
      {
         price += 75;
      }
      
      if (policy_holder_smoking_status.equals("smoker")) // If policy holder is a smoker
      {
         price += 100;
      }
      
      if (bmi > 35) // If policy holder BMI is over 35
      {
         price += (bmi - 35) * 20;
      }
      
      return price;
   }
   
}
