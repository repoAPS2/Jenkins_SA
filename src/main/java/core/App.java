package core;

public class App {


	public static void main(String[] args) {

		    System.out.println("Debit Card and Bad Credit is anagram? - " + Anagram.validate("Debit Card", "Bad Credit"));
		    System.out.println("Schoolmaster amnd The classroom is anagram? - " + Anagram.validate("Schoolmaster", "The classroom"));
		    System.out.println("The Hurricanes and These churn air is anagram? - " + Anagram.validate("The Hurricanes", "These churn air"));
		    System.out.println("Astronomers and No more stars is anagram? - " + Anagram.validate("Astronomers", "No more stars"));
		    System.out.println("Охренеть and Не хрена себе is anagram? - " + Anagram.validate("Охренеть", "Не хрена себе"));
	
	}
	
	
	private String checkStrValue = null;
	 public App() {this.checkStrValue ="SomeValue";}
	 
	 
	 
	 private void executeSomeConditions(){
		 if ("SomeValue".equals(this.checkStrValue)) {}
	 }
	 
	 
	 private static void incorrectAssignmentInIfCondition(){
		 boolean value = false;
		 if (value = true){}
		 else{}
	 } 
	 
	 
	 
	
}
