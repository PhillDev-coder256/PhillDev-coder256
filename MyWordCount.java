package count;
import java.util.*;

public class MyWordCount {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Type a sentence of your choice: ");
		
		String sentence = keyboardInput.nextLine();
		
		sentence = sentence.trim();
		
		int counter = 0;
		if(sentence.length() == 0) {
			counter = 0;
		}else {
			counter++;
			for(int i = 0; i < sentence.length(); i++) {
				if(sentence.charAt(i) == ' '
						&& sentence.charAt(i+1) != ' ') {
					counter++;
				}
			}
		}
		System.out.println("There are " + counter + " words in the sentence");
	}

}
