class Policy {
   
   private int policy_number;
   private String provider_name;
   private PolicyHolder policy_holder;
   
   /**
     * Args constructor
     *
     * @param policy_number   Unique number for each policy
     * @param provider_name   The policy provider's name
     */
   public Policy(int policy_number, String provider_name, PolicyHolder policy_holder) 
   { 
      this.policy_number = policy_number;
      this.provider_name = provider_name;
      this.policy_holder = new PolicyHolder(policy_holder); // Copy Constructor
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
   
   
   /**
     * Sets the policy holder name.
     *
     * @param policy Holder - a Policy Holder
     */
   public void set_policy_holder(PolicyHolder policy_holder)
   {
      this.policy_holder = new PolicyHolder(policy_holder);
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
   
   
   /**
     * Gets the policy holder.
     *
     * @return a reference of a copy of the policy holder
     */
   public PolicyHolder get_policy_holder()
   {
      return new PolicyHolder(policy_holder);
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
      double bmi = policy_holder.calculate_body_mass_index();
      
      if (policy_holder.get_age() > 50) // If policy holder is older than 50
      {
         price += 75;
      }
      
      if (policy_holder.get_smoking_status().equals("smoker")) // If policy holder is a smoker
      {
         price += 100;
      }
      
      if (bmi > 35) // If policy holder BMI is over 35
      {
         price += (bmi - 35) * 20;
      }
      
      return price;
   }
   
   /** toString method
   @return a string containing the Policy's information
   */
   public String toString()
   {
      return String.format("Policy Number: " + policy_number +
               "\nProvider Name: " + provider_name + 
               "\n" + policy_holder.toString() +
               "\nPolicy Price: $%.2f", calculate_insurance_price());
   }

   
}
