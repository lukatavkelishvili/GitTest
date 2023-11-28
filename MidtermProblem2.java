//2. კონსოლიდან შემოდის ტექსტი. დაბეჭდეთ True თუ ტექსტში 
//არსებული ყველა lowercase ინგლისური ასო ზრდადობით არის დალაგებული, False თუ არაა. 
//ტექსტში სხვა სიმბოლოებიც შეიძლება შეგხვდეთ და იმათ ყურადღება არ მიაქციოთ.  
//მაგ: “a bcAAA!” -> true, “” -> true “ABCDz,a” -> false (Practice02)
//Tags: String, char, charOperations, isLowerCase   




import acm.program.ConsoleProgram;


public class MidtermProblem2 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		boolean answer = symbolChecks(text);
		println(answer);
		
	}
	
	private boolean symbolChecks(String text) {
		String result = "";
		return rootPaneCheckingEnabled;
		
	}

}
