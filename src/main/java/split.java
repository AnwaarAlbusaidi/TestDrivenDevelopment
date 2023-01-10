import java.util.ArrayList;

public class split {
	public static void main(String[] args) {
		ArrayList<String> result = new ArrayList<String>();
		result = spilt("Anwaar Mohammed", ' ');
		for (int i = 0 ; i < result.size(); i++)
			System.out.println(result.get(i));
		
	}
	
	/**
	 * This is a re-implementation of split method
	 * @param str for word string
	 * @param ch for delimiter
	 * @return array list
	 */
	public static ArrayList<String> spilt(String str, Character ch) {

		ArrayList<String> spiltArrayList = new ArrayList<String>();

		String word = "";
		if(str != null && ch != null) 
		{
		for (int i = 0; i < str.length(); i++) {
			word = word + str.charAt(i);
			if (str.charAt(i) == ch || i == str.length() - 1) {
				spiltArrayList.add(word);
				word = "";
			}
		   }
		}
		return spiltArrayList;
	}
}
