package com.nu.ValidationFunction;

public class DataTypeValidationFunctions {

	public boolean INTEGER(String userInput) {
		return (userInput.matches("[-0-9]+"));
	}

	public boolean FLOAT(String userInput) {
		return (userInput.matches("^[-+]?[0-9]*[.]?[0-9]+([eE][-+]?[0-9]+)?$") && (userInput
				.getBytes().length <= 4));
	}

	public boolean DOUBLE(String userInput) {
		return (userInput.matches("[+-]?([0-9]+{1,13}[.])?[0-9]+") && (userInput
				.getBytes().length <= 8));
	}

	public boolean CHAR(String userInput) {
		return (userInput.matches("[a-zA-Z]+\\S+"));
	}

	public boolean BOOLEAN(String userInput) {
		return (userInput == "TRUE" || userInput == "true"
				|| userInput == "false" || userInput == "FALSE");

	}

	public boolean BYTE(String userInput) {
		return ((userInput.getBytes().length <= 1) && (userInput
				.matches("[-0-9]+")));

	}

	public boolean SHORT(String userInput) {
		return (userInput.getBytes().length <= 2)
				&& (userInput.matches("[-0-9]+"));
	}

	public boolean LONG(String userInput) {
		return (userInput.getBytes().length <= 8)
				&& (userInput.matches("[-0-9]+"));
	}

}
