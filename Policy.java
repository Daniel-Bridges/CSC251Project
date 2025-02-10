class Policy {
   
   private int policy_number;
   private String provider_name;
   private String policy_holder_first_name;
   private String policy_holder_last_name;
   private int policy_holder_age;
   private String policy_holder_smoking_status; // Either "smoker" or "non-smoker"
   private double policy_holder_height; // in inches
   private double policy_holder_weight; // in pounds
   
   
   /**
     * No args constructor
     */
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
   
   /**
     * Args constructor
     *
     * @param policy_number   Unique number for each policy
     * @param provider_name   The policy provider's name
     * @param policy_holder_first_name    Policy holders first name
     * @param policy_holder_last_name  Policy holders last name
     * @param policy_holder_age  Policy holders age
     * @param policy_holder_smoking_status   Policy holder's smoking status 
     * @param policy_holder_height  Policy holder's height
     * @param policy_holder_weight  Policy holder's weight
     */
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
      this.policy_holder_height = policy_holder_height;
      this.policy_holder_weight = policy_holder_weight;
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
     * Sets the policy holder's first name.
     *
     * @param policy_holder_first_name the policy holders first name
     */
   public void set_policy_holder_first_name(String policy_holder_first_name)
   {
      this.policy_holder_first_name = policy_holder_first_name;
   }
   
   /**
     * Sets the policy holder's last name.
     *
     * @param policy_holder_last_name the policy holders last name
     */
   public void set_policy_holder_last_name(String policy_holder_last_name)
   {
      this.policy_holder_last_name = policy_holder_last_name;
   }
   
   /**
     * Sets the policy holder's age.
     *
     * @param policy_holder_age the policy holders age name
     */
   public void set_policy_holder_age(int policy_holder_age)
   {
      this.policy_holder_age = policy_holder_age;
   }
   
   /**
     * Sets the policy holder's smoking status.
     *
     * @param policy_holder_smoking_status the policy holders smoking status
     */
   public void set_policy_holder_smoking_status(String policy_holder_smoking_status)
   {
      this.policy_holder_smoking_status = policy_holder_smoking_status;
   }
   
   /**
     * Sets the policy holder's height.
     *
     * @param policy_holder_height the policy holders height
     */
   public void set_policy_holder_height(double policy_holder_height)
   {
      this.policy_holder_height = policy_holder_height;
   }
   
   /**
     * Sets the policy holder's weight.
     *
     * @param policy_holder_weight the policy holders weight
     */
   public void set_policy_holder_weight(double policy_holder_weight)
   {
      this.policy_holder_weight = policy_holder_weight;
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
     * Gets the policy holders first name.
     *
     * @return the policy holders first name as a String
     */
   public String get_policy_holder_first_name()
   {
      return this.policy_holder_first_name;
   }
   
   /**
     * Gets the policy holders last name.
     *
     * @return the policy holders last name as a String
     */
   public String get_policy_holder_last_name()
   {
      return this.policy_holder_last_name;
   }
   
   /**
     * Gets the policy holders age.
     *
     * @return the policy holders age as an in
     */
   public int get_policy_holder_age()
   {
      return this.policy_holder_age;
   }
   
   /**
     * Gets the policy holders smoking status.
     *
     * @return the policy holders smoking status as a String
     */
   public String get_policy_holder_smoking_status()
   {
      return this.policy_holder_smoking_status;
   }
   
   /**
     * Gets the policy holders height.
     *
     * @return the policy holders height as a double
     */
   public double get_policy_holder_height()
   {
      return this.policy_holder_height;
   }
   
   /**
     * Gets the policy holders height.
     *
     * @return the policy holders weight as a double
     */
   public double get_policy_holder_weight()
   {
      return this.policy_holder_weight;
   }
   
   // Other Functions
   
   /**
     * Calculates the BMI index
     * Uses the policy holder's weight and height
     *
     * @return the calculated BMI
     */
   public double calculate_body_mass_index()
   {
      return (policy_holder_weight * 703) / (policy_holder_height * policy_holder_height);
   }
   
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
