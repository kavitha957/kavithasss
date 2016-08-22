package LogicalProgram;

import java.util.Scanner;

public class hignumrepletstr {
public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	    System.out.println("Enter the word: ");
	    String ms = s.nextLine();
	    String res = "";
	    int count = 0;

	    String[] words = ms.split("");
	    for(int i = 0; i < words.length; i++) {
	        for(int j = 0; j < words[i].length(); j++) {
	            for(int k = 1; k < words[i].length(); k++) {
	                char temp = words[i].charAt(k);
	                if(temp == words[i].charAt(k-1)) {
	                    count++;
	                }

	            }

	        }
	    }
}
}
