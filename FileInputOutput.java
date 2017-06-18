package com.nu.FileInputOutput;

import java.io.*;
import java.util.StringTokenizer;

import com.nu.ValidationFunction.*;

public class FileInputOutput {
	public static void main(String[] args) throws IOException {
		DataTypeValidation type = new DataTypeValidation();
		DataLengthValidation len = new DataLengthValidation();
		SpecialCharactersValidation specialChar = new SpecialCharactersValidation();
		DomainValueValidation domain = new DomainValueValidation();
		EmailValidation email = new EmailValidation();
		FormatValidation format = new FormatValidation();
		int flag = 1;
		String recordValidvalues[] = { "N", "M", "D", "A", "R" };
		String flagValues[] = { "A", "I" };
		BufferedReader br = null;
		boolean result1 = true, result2 = true, result3 = true;
		String FILENAME = "D:\\errorFile.txt";
		BufferedWriter bw = null;
		FileWriter fw = null;
		fw = new FileWriter(FILENAME);
		bw = new BufferedWriter(fw);
		// String[] line = new String[16];

		try {
			br = new BufferedReader(new FileReader("D:\\File1.txt"));
			String contentLine = br.readLine();
			while (contentLine != null) {
				String[] line = new String[16];
				int index = 0;
				StringTokenizer s = new StringTokenizer(contentLine, "~", true);
				String currentToken = "~", previousToken = "~";
				while (s.hasMoreTokens()) {
					currentToken = s.nextToken();
					if (currentToken.equals("~") && previousToken.equals("~")) {
						line[index] = null;
						index++;
					}

					else {

						if (!currentToken.equals("~")) {
							line[index] = currentToken;
							index++;
						}
					}

					previousToken = currentToken;
				}
				
				// for(String st:line)
				// System.out.println(st);
				// String[] line = contentLine.split("~");
				/*
				 * boolean dataType[] = { type.dTV(line[0], "ALPHANUMERIC"),
				 * type.dTV(line[1], "ALPHANUMERIC"), type.dTV(line[2], "CHAR"),
				 * type.dTV(line[3], "CHAR"), type.dTV(line[4], "INTEGER"),
				 * email.emailValidation(line[5]), type.dTV(line[6], "INTEGER"),
				 * type.dTV(line[7], "ALPHANUMERIC"),
				 * domain.domainValueValidation(line[8], recordValidvalues),
				 * domain.domainValueValidation(line[9], flagValues),
				 * format.formatValidation(line[10], "dd/mm/yyyy"),
				 * type.dTV(line[11],
				 * "ALPHANUMERIC"),format.formatValidation(line[12],
				 * "dd/mm/yyyy"), type.dTV(line[13],
				 * "ALPHANUMERIC"),format.formatValidation(line[14],
				 * "dd/mm/yyyy"), type.dTV(line[15], "ALPHANUMERIC") }; boolean
				 * length[] = { len.dLV(line[0], 10), len.dLV(line[1], 30),
				 * len.dLV(line[2], 100), len.dLV(line[3], 100),
				 * len.dLV(line[4], 6), len.dLV(line[5], 100), len.dLV(line[6],
				 * 20), len.dLV(line[7], 100), len.dLV(line[8], 1),
				 * len.dLV(line[9], 1), len.dLV(line[10], 12), len.dLV(line[11],
				 * 30),len.dLV(line[12], 12), len.dLV(line[13],
				 * 30),len.dLV(line[14], 12), len.dLV(line[15], 30) };
				 */
				// for(int j=0;j<line.length;j++)
				// System.out.println(line[j]);
				for (int j = 1; j <= 16; j++) {
					result3 = true;
					if (j == 1) {
						if (line[j - 1] == null)
							result3 = false;
						else {

							result1 = type.dTV(line[j - 1], "ALPHANUMERIC");
							result2 = len.dLV(line[j - 1], 10);
						}
					} else if (j == 2) {
						if (line[j - 1] == null)
							result3 = false;
						else {

							result1 = type.dTV(line[j - 1], "CHAR");
							result2 = len.dLV(line[j - 1], 30);
						}
					} else if (j == 12) {
						if (line[j - 1] == null)
							result3 = false;
						else {
							result1 = type.dTV(line[j - 1], "ALPHANUMERIC");
							result2 = len.dLV(line[j - 1], 30);
						}
					} else if (j == 14 || j == 16) {
						if (line[j - 1] == null)
							result3 = true;
						else {
							result1 = type.dTV(line[j - 1], "ALPHANUMERIC");
							result2 = len.dLV(line[j - 1], 30);
						}
					} else if (j == 6) {
						if (line[j - 1] == null)
							result3 = false;
						else {
							result1 = email.emailValidation(line[5]);
							result2 = len.dLV(line[j - 1], 100);
						}
					} else if (j == 3) {
						if (line[j - 1] == null)
							result3 = false;
						else {
							result1 = type.dTV(line[j - 1], "ALPHANUMERIC");
							result2 = len.dLV(line[j - 1], 100);
						}
					} else if (j == 4) {
						if (line[j - 1] == null)
							result3 = true;
						else {
							result1 = type.dTV(line[j - 1], "ALPHANUMERIC");
							result2 = len.dLV(line[j - 1], 100);
						}
					} else if (j == 8) {
						if (line[j - 1] == null)
							result3 = false;
						else {
							result1 = type.dTV(line[j - 1], "ALPHANUMERIC");
							result2 = len.dLV(line[j - 1], 100);
						}
					} else if (j == 9) {
						if (line[j - 1] == null)
							result3 = false;
						else {
							result1 = domain.domainValueValidation(line[j - 1],
									recordValidvalues);
							result2 = len.dLV(line[j - 1], 1);
						}
					} else if (j == 10) {
						if (line[j - 1] == null)
							result3 = false;
						else {
							result1 = domain.domainValueValidation(line[j - 1],
									flagValues);
							result2 = len.dLV(line[j - 1], 1);
						}
					} else if (j == 5) {
						if (line[j - 1] == null)
							result3 = false;
						else {
							result1 = type.dTV(line[j - 1], "INTEGER");
							result2 = len.dLV(line[j - 1], 6);
						}
					} else if (j == 7) {
						if (line[j - 1] == null)
							result3 = true;
						else {
							result1 = type.dTV(line[j - 1], "INTEGER");
							result2 = len.dLV(line[j - 1], 20);
						}
					} else if (j == 11) {
						if (line[j - 1] == null)
							result3 = false;
						else {
							result1 = format.formatValidation(line[j - 1]);
							result2 = len.dLV(line[j - 1], 11);
						}
					} else if (j == 13 || j == 15) {
						if (line[j - 1] == null)
							result3 = true;
						else {
							result1 = format.formatValidation(line[j - 1]);
							result2 = len.dLV(line[j - 1], 11);
						}
					}

					
					if (result1 == false)
						bw.write("issue in data type of record no:" + flag
								+ " field ----" + j + "----" + line[j - 1]);
					if (result2 == false)
						bw.write("issue in lemgth of record no:" + flag
								+ "  field ----" + j + "----" + line[j - 1]);
					if (result3 == false)
						bw.write("field absent in record: " + flag
								+ "  field no---" + j);

					if (result1 == false)
					 System.out.println("issue in data type of record no:" +
					 flag + " field ----" + j + "----" + line[j - 1]); if
					  (result2 == false)
					  System.out.println("issue in lemgth of record no:" + flag
					  + "  field ----" + j + "----" + line[j - 1]); if (result3
					  == false) System.out.println("field absent in record: " +
					 flag + "  field no---" + j );
					 
				}

				flag++;
				contentLine = br.readLine();
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ioe) {
				System.out.println("Error in closing the BufferedReader");
			}
		}
	}
}
