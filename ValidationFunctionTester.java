package com.nu.ValidationFunction;


import java.util.Scanner;

public class ValidationFunctionTester {
	public static void main(String[] args) {
		System.out.println("Enter seq. no of Data Validation to be done:"
				+ "\n" + "1. Data type" + "\n" + "2. Data length" + "\n"
				+ "3. Special Characters" + "\n" + "4. Domain Value" + "\n"
				+ "5. Format Validation" + "\n"
				+ "6. Special Validation – Like E-mail validation");
		Scanner sc = new Scanner(System.in);
		int seqInput = 0;
		boolean result = false;
		boolean bError = true;
		do {
			try {
				seqInput = Integer.parseInt(sc.next());
				if(seqInput<7)
				bError = false;

			} catch (Exception e) {
				System.out.println("Wrong input-Enter sequence no.");
			}

		} while (bError);
		System.out.println("Enter Data to be tested");
		String userInput = sc.next();
		
		switch (seqInput) {
		case 1:
			System.out.println("Enter DataType");
			String dataType = sc.next();
			DataTypeValidation D1 = new DataTypeValidation();
			result = D1.dTV(userInput, dataType);
			break;
		case 2:
			System.out.println("Enter Max Length of data");
			int validLength = sc.nextInt();
			DataLengthValidation D2 = new DataLengthValidation();
			result = D2.dLV(userInput, validLength);
			break;
		case 3:
			System.out.println("Enter special characters to be excluded");
			char[] specialCharacters = sc.next().toCharArray();
			SpecialCharactersValidation D3 = new SpecialCharactersValidation();
			result = D3.specialCharactersValidation(userInput,
					specialCharacters);
			break;
		case 4:
			System.out.println("Enter no of elements in domain list");
			int no = sc.nextInt();
			String listOfValues[]= new String[no];
			System.out.println("enter list of elements in domain");
			for (int i = 0; i < no; i++){
				listOfValues[i] = sc.next();
			}
			DomainValueValidation D4 = new DomainValueValidation();
			result = D4.domainValueValidation(userInput, listOfValues);
			break;
		case 5:
			FormatValidation D5 = new FormatValidation();
			System.out.println("enter valid date format");
			String validDate=sc.next();
			result = D5.formatValidation(userInput,validDate);
			break;
		case 6:
			EmailValidation D6 = new EmailValidation();
			result = D6.emailValidation(userInput);
			break;
		}
		if (result == true)
			System.out.println("VALID DATA");
		else
			System.out.println("INVALID DATA");
	sc.close();
	}
}
