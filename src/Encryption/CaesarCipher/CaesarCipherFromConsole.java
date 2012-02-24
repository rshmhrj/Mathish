package Encryption.CaesarCipher;

import java.io.*;
import java.util.Scanner;

public class CaesarCipherFromConsole
	{

		public static char[] alphabetLowercase = {'a', 'b', 'c', 'd', 'e', 'f',
				'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

		public static char[] alphabetUppercase = {'A', 'B', 'C', 'D', 'E', 'F',
				'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

		public static char[] otherChars = {' ', '!', '@', '#', '$', '%', '^',
				'&', '*', '(', ')', '_', '+', '1', '2', '3', '4', '5', '6',
				'7', '8', '9', '0', '-', '=', '[', ']', '{', '}', '\\', '|',
				';', ':', '\'', '"', ',', '<', '.', '>', '/', '?', '`', '~'};

		public static void main(String[] args)
			{
				System.out
						.println("This program will either encrypt or decrypt a string of text using the Caesar Cipher.");
				body();
				System.out.println("End of Program.");
			} // end method main

		private static void body()
			{
				Scanner input = new Scanner(System.in).useDelimiter("\r\n");

				System.out
						.print("For encryption enter 1; For decryption enter 2:");
				int type = input.nextInt();
//				while (type != 0 | type != 1)
//					{
//						System.out
//								.print("Encrypt=1..Decrypt=2..There are no other options.");
//						type = input.nextInt();
//					}
				System.out.print("Enter the text to be worked on:");
				String text = input.next();

				System.out.print("Choose the amount of the shift (0 - 26):");
				int shift = input.nextInt();
//				while (shift > 26)
//					{
//						System.out
//								.print("Dude, seriously?  Please stick between 0 and 26.");
//						shift = input.nextInt();
//					}

				if (type == 1)
					{
						System.out.println("****Encrypted text: "
								+ encrypt(shift, text));

					}
				else if (type == 2)
					{
						System.out.println("****Decrypted text: "
								+ decrypt(shift, text));
					}
				else
					{
						System.out
								.println("Please enter a valid choice.  Either 1 or 2.");
						body();
					}

				System.out
						.println("Would you like to perform another encryption/decryption?");
				System.out.print("Enter 1 for Yes:");
				int another = input.nextInt();

				if (another == 1)
					{
						System.out
								.println("***************************************");
						body();
					}
				else
				;
			}

		public static String encrypt(int shift, String text)
			{
				char[] textChars = text.toCharArray();

				int textSize = text.length();
				int textCounter = 0;

				while (textCounter < textSize)
					{
						if (shift == 0)
							{
								return text;
							}
						else if (shift < 0)
							{

							}
						else
							{
								for (int i = 0; i <= 42; i++)
									{
										if (text.charAt(textCounter) == otherChars[i])
											{
												int modShift = i + shift;
												if (modShift > 42)
													modShift -= 43;

												textChars[textCounter] = otherChars[modShift];
												textCounter = textCounter + 1;
												break;
											}
										if (i <= 25
												&& text.charAt(textCounter) == alphabetLowercase[i])
											{
												int modShift = i + shift;
												if (modShift > 25)
													modShift -= 26;

												textChars[textCounter] = alphabetLowercase[modShift];
												textCounter = textCounter + 1;
												break;
											}
										if (i <= 25
												&& text.charAt(textCounter) == alphabetUppercase[i])
											{
												int modShift = i + shift;
												if (modShift > 25)
													modShift -= 26;

												textChars[textCounter] = alphabetUppercase[modShift];
												textCounter = textCounter + 1;
												break;
											}
									}
							}
					}

				String eText = new String(textChars);

				return eText;
			}

		public static String decrypt(int shift, String text)
			{
				char[] textChars = text.toCharArray();

				int textSize = text.length();
				int textCounter = 0;

				while (textCounter < textSize)
					{
						if (shift == 0)
							{
								return text;
							}
						else if (shift < 0)
							{

							}
						else
							{
								for (int i = 0; i <= 42; i++)
									{
										if (text.charAt(textCounter) == otherChars[i])
											{
												int modShift = i - shift;
												if (modShift < 0)
													modShift += 43;

												textChars[textCounter] = otherChars[modShift];
												textCounter = textCounter + 1;
												break;
											}
										if (i <= 25
												&& text.charAt(textCounter) == alphabetLowercase[i])
											{
												int modShift = i - shift;
												if (modShift < 0)
													modShift += 26;

												textChars[textCounter] = alphabetLowercase[modShift];
												textCounter = textCounter + 1;
												break;
											}
										if (i <= 25
												&& text.charAt(textCounter) == alphabetUppercase[i])
											{
												int modShift = i - shift;
												if (modShift < 0)
													modShift += 26;

												textChars[textCounter] = alphabetUppercase[modShift];
												textCounter = textCounter + 1;
												break;
											}
									}
							}
					}

				String dText = new String(textChars);

				return dText;
			}

	} // end class CaesarCipher