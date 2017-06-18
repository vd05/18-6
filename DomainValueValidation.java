package com.nu.ValidationFunction;

public class DomainValueValidation {
	private boolean result = false;

	public boolean domainValueValidation(String userInput,
			String listOfValues[]) {
		for (String list : listOfValues) {
			if (userInput.equals(list))
				result = true;
		}
		return result;
	}
}
