class SumOfDigits 
{
    	public static void main(String[] args) {
        	int num = 245;  
        	int sum = 0;

        	// Loop to extract digits and sum them
        	while (num != 0) 
{
            	sum += num % 10;  // Add the last digit
            	num /= 10;  // Remove the last digit
        	}

        	System.out.println("The sum of the digits is: " + sum);
    }
}
