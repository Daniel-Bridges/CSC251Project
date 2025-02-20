class PolicyHolder {

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
     * @param policy_holder_first_name    Policy holders first name
     * @param policy_holder_last_name  Policy holders last name
     * @param policy_holder_age  Policy holders age
     * @param policy_holder_smoking_status   Policy holder's smoking status 
     * @param policy_holder_height  Policy holder's height
     * @param policy_holder_weight  Policy holder's weight
     */
   public Policy(String policy_holder_first_name, 
   String policy_holder_last_name, int policy_holder_age, String policy_holder_smoking_status, 
   double policy_holder_height, double policy_holder_weight) 
   { 
      this.policy_holder_first_name = policy_holder_first_name;
      this.policy_holder_last_name = policy_holder_last_name;
      this.policy_holder_age = policy_holder_age;
      this.policy_holder_smoking_status = policy_holder_smoking_status;
      this.policy_holder_height = policy_holder_height;
      this.policy_holder_weight = policy_holder_weight;
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
   
}