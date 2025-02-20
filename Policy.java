class Policy {
   
   private int policy_number;
   private String provider_name;
     
   /**
     * No args constructor
     */
   public Policy() 
   {
      this.policy_number = 0000;
      this.provider_name = "none";
   }
   
   /**
     * Args constructor
     *
     * @param policy_number   Unique number for each policy
     * @param provider_name   The policy provider's name
     */
   public Policy(int policy_number, String provider_name) 
   { 
      this.policy_number = policy_number;
      this.provider_name = provider_name;
   }
   
   // Setters
   
   /**
     * Sets the policy number.
     *
     * @param policy_number the new policy number
     */
   public void set_policy_number(int policy_number)
   {
      this.policy_number = policy_number;
   }
   
   /**
     * Sets the provider name.
     *
     * @param provider_name the new provider name
     */
   public void set_provider_name(String provider_name)
   {
      this.provider_name = provider_name;
   }
   
      
   // Getters
   
   
   /**
     * Gets the policy number.
     *
     * @return the policy number as an int
     */
   public int get_policy_number()
   {
      return this.policy_number;
   }
   
   /**
     * Gets the provider name.
     *
     * @return the provider name as a String
     */
   public String get_provider_name()
   {
      return this.provider_name;
   }
   
      
   // Other Functions
   
   /**
     * Calculates the insurance price
     * Based on BMI, the base cost, policy holders age, and smoking status
     *
     * @return the final insurance price
     */
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
