import java.util.HashMap;
import java.util.Map;


public class Scrabble {
		
		private static Map<String, Integer> wordScrabble = new HashMap<>();
		
		public Scrabble(){
			wordScrabble.put("A", 1);
			wordScrabble.put("E", 1);
			wordScrabble.put("I", 1);
			wordScrabble.put("O", 1);
			wordScrabble.put("U", 1);
			wordScrabble.put("L", 1);
			wordScrabble.put("N", 1);
			wordScrabble.put("R", 1);
			wordScrabble.put("S", 1);
			wordScrabble.put("T", 1);
			wordScrabble.put("D", 2);
			wordScrabble.put("G", 2);
			wordScrabble.put("B", 3);
			wordScrabble.put("C", 3);
			wordScrabble.put("M", 3);
			wordScrabble.put("P", 3);
			wordScrabble.put("F", 4);
			wordScrabble.put("H", 4);
			wordScrabble.put("V", 4);
			wordScrabble.put("W", 4);
			wordScrabble.put("Y", 4);
			wordScrabble.put("K", 5);
			wordScrabble.put("J", 8);
			wordScrabble.put("X", 8);
			wordScrabble.put("Q", 10);
			wordScrabble.put("Z", 10);
			
		}
	
	
	public static int getScore(String word){
		int score = 0;
		for ( int i = 0; i < word.length(); i++){
			String key = (word.charAt(i) + "").toUpperCase();
			if(wordScrabble.containsKey(key)){
				 score+= wordScrabble.get(key);
			
				
			}
		}
		return score;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = new Scrabble().getScore("cabbage");
		System.out.println(score);

	}

}


