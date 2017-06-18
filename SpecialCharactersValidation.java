package com.nu.ValidationFunction;

public class SpecialCharactersValidation {
	private boolean result = true;

	public boolean specialCharactersValidation(String userInput,char specialCharacters[]) {
		for (char cSpclChar : specialCharacters) {
			for (byte cInputChar : userInput.getBytes()) {
				if (cInputChar == cSpclChar)
					result = false;

			}
		}
		return result;
	}
}
