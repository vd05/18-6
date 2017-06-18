package com.nu.ValidationFunction;

public class DataLengthValidation {
	int stringLength;

	public boolean dLV(String userInput, int validLength) {
		stringLength = userInput.length();
		if (stringLength <= validLength)
			return true;
		else
			return false;
	}
}
