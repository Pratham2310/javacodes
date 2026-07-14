class BitwiseOperators 
{
    	public static void main(String[] args) {
       		int num1 = 12; // Binary: 1100
        		int num2 = 5;  // Binary: 0101

        		// Bitwise AND
        		int andResult = num1 & num2; // 1100 & 0101 = 0100 (4 in decimal)
        		System.out.println("Bitwise AND: " + num1 + " & " + num2 + " = " + andResult);

        		// Bitwise OR
        		int orResult = num1 | num2; // 1100 | 0101 = 1101 (13 in decimal)
        		System.out.println("Bitwise OR: " + num1 + " | " + num2 + " = " + orResult);

        		// Bitwise XOR
        		int xorResult = num1 ^ num2; // 1100 ^ 0101 = 1001 (9 in decimal)
        		System.out.println("Bitwise XOR: " + num1 + " ^ " + num2 + " = " + xorResult);

        		// Bitwise NOT
        		int notResult = ~num1; // ~1100 = 0011 (In 2's complement: -13)
        		System.out.println("Bitwise NOT: ~" + num1 + " = " + notResult);

        		// Bitwise Left Shift
        		int leftShiftResult = num1 << 2; // 1100 << 2 = 110000 (48 in decimal)
        		System.out.println("Bitwise Left Shift: " + num1 + " << 2 = " + leftShiftResult);

        		// Bitwise Right Shift
        		int rightShiftResult = num1 >> 2; // 1100 >> 2 = 11 (3 in decimal)
        		System.out.println("Bitwise Right Shift: " + num1 + " >> 2 = " + rightShiftResult);

        		// Bitwise Unsigned Right Shift
        		int unsignedRightShiftResult = num1 >>> 2; // 1100 >>> 2 = 11 (3 in decimal)
        		System.out.println("Bitwise Unsigned Right Shift: " + num1 + " >>> 2 = " + unsignedRightShiftResult);
    }
}
