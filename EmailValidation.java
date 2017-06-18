package com.nu.ValidationFunction;

import java.io.IOException;

public class EmailValidation {
	boolean result = false;

	public boolean emailValidation(String userInput) {
		if (userInput.matches("[a-zA-Z0-9\\.\\S^\\@]+[\\@][A-Za-z0-9]+[\\.][A-Za-z0-9\\.]+")) {
			result = true;
		}
		return result;
	}
}
/*} catch (IOException e) {

	e.printStackTrace();

} finally {

	try {

		if (bw != null)
			bw.close();

		if (fw != null)
			fw.close();

	} catch (IOException ex) {

		ex.printStackTrace();

	}*/