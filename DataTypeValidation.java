package com.nu.ValidationFunction;

public class DataTypeValidation {
	boolean result = false;

	public boolean dTV(String userInput, String dataType) {

		switch (dataType) {

		case "INTEGER":
			result = (userInput.matches("[-0-9]+"));
			break;
		case "FLOAT":
			result = (userInput
					.matches("^[-+]?[0-9]*[.]?[0-9]+([eE][-+]?[0-9]+)?$") && (userInput
					.getBytes().length <= 4));
			break;
		case "DOUBLE":
			result = (userInput.matches("[+-]?([0-9]+{1,13}[.])?[0-9]+") && (userInput
					.getBytes().length <= 8));
			break;
		case "CHAR":
			result = (userInput.matches("[a-zA-Z0-9\\s]*"));
			break;
		case "BOOLEAN":
			result = ((userInput.equals("TRUE")) || (userInput.equals("false"))
					|| (userInput.equals("true")) || (userInput.equals("FALSE")));
			break;
		case "BYTE":
			result = ((userInput.getBytes().length <= 1) && (userInput
					.matches("[-0-9]+")));
			break;
		case "SHORT":
			result = (userInput.getBytes().length <= 2)
					&& (userInput.matches("[-0-9]+"));
			;
			break;
		case "LONG":
			result = (userInput.getBytes().length <= 8)
					&& (userInput.matches("[-0-9]+"));
			break;
		case "ALPHANUMERIC":
			result = (userInput.matches("[a-zA-Z0-9\\s\\S]*"));
			break;
		default:
			result=false;
		}
		return result;
	}
}
