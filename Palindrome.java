package textTransformatons;

import java.util.Scanner;

public class Palindrome {
	static String reverse;
	public static void main(String[] args){
		
		Scanner user = new Scanner(System.in);
		System.out.println("Type in your phrase to see if it is a palindrome: ");
		String input = user.nextLine();
		
		if(palindromeCheck(input)){
			System.out.println("Is a palindrome.");
		}
		else
			System.out.println("Not a palindrome.");
	}
	
	public static boolean palindromeCheck(String nString){
		String[] stringLetters = new String[nString.length()];
		String[] backwards = new String[nString.length()];
		boolean palin = false;
		
		int start, end;
		for(start = 0, end = 0; start < nString.length(); start++, end++){
			stringLetters[start] = nString.substring(start, end + 1);
		}
		
		int counter = nString.length() - 1;
		for(int i = 0; i < nString.length(); i++){
			backwards[i] = stringLetters[counter];
			counter--;
		}
		for(int j = 0; j < nString.length(); j++){
			//System.out.println(stringLetters[j]);
			//System.out.println(backwards[j]);
			if(stringLetters[j].equalsIgnoreCase(backwards[j])){
				palin = true;
			}
			else{
				palin = false;
			}
		}
		
		return palin;
	}
}
