package pract;

public class DuplicateCharacterFInd {

	public static void main(String arg[]) throws Exception {

		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//
		// System.out.println("Enter the string to count the number of duplicate it
		// has");
		//
		// String str = br.readLine();
		CustomeFunction cus = new CustomeFunction();
		// cus.findItNumOfDupliChar(str);
		String str = "he Apple Special September event has just concluded. As widely speculated, Apple today" + ""
				+ " launched three new iPhones -- iPhone 11, iPhone 11 Pro and iPhone 11 Pro Max-- "
				+ "at an event held in Steve Jobs Theatre, Cupertino. The company also launched th"
				+ "e Apple Watch Series 5 along with a new 10.2";
		cus.findItNumOfDupliCharWord(str);

	}
}
