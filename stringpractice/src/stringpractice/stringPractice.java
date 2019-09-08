package stringpractice;

public class stringPractice {
static String firstSentence ;
static String secondSentence;
static String thirdSentence;

	public static void main(String[] args) {
     // deleteLetter();
	//middleWord();
//printLength();
	//indexLetter();
	//lastLetter();
	//conjuctionPrint();
	//replaceWord();
	//upperCase();
	//deleteSpace();
	compareLength();
	}
	private static void deleteLetter() {
		System.out.println("firstSentence".substring(0,3));
	}
private static void middleWord() {
 String word1 = "yeet";
	String word2 = "yeet";
	String word3= "yeet";
	
	System.out.println(word1.substring(0,4)+" "+ word2.substring(0,4) +" "+ word3.substring(0,4));
System.out.println(word1.substring(0,0) + " " +" " +" "+" "+" "+word2.substring(0,4) + " " + word3.substring(0,0));

}

private static void printLength() {

	
	String word = "yeet";
	
	int wordLength = word.length();
	System.out.println("yeet");
	System.out.println(word.length());
	
	
	
	
	
}
private static void indexLetter() {

	System.out.println("yeet " + "yeet " + "yeet");
	System.out.println("yeet".charAt(1) +" "+ "0,2 is index of e");
	
	
	
	
}

private static void lastLetter() {
	
	System.out.println("yeet " + "yeet " + "yeet");
	System.out.println("yeet " + "yeet " + "yeet".charAt(2));
	
	
	
	
	
	
}
private static void conjuctionPrint() {
	String word1 = "yeet";
	String word2 = "yeet";
			String word3 = "yeet";
			System.out.println("yeet " + "yeet " + "yeet ");
	System.out.println(word1. replace(" ","") + word2.replace(" ","") + word3.replace(" ","") );
	
	
}
private static void replaceWord() {

	var word= "yeet , kaboom, feet"	;
	System.out.println(word);
var replace = word.replace("ee","xx");


System.out.println(replace );




	
}
public static void upperCase() {

String word = "yeet, yeet, yeet";
System.out.println(word.toUpperCase());

}
public static void deleteSpace() {
	
String word = "yeet yeet yeet";
	System.out.println(word);
System.out.println(word.replace(" ",""));
	
	
	
}
public static void compareLength(){
	
	
	String word= "yeet";
	String word1 ="throw that football!";
	System.out.println(word);
	System.out.println(word1);
	int var1 = word1.compareTo(word1);
    System.out.println("word & word1 comparison:" +var1);
	System.out.println();
System.out.println();








}



