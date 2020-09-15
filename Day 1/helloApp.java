
class Result {
	public static void main(String[] args) {
		int marks = Integer.parseInt(args[0]);
		if(marks>70){
			System.out.println("First class distinction");
		}
		else if (marks>60 && marks<70){
			System.out.println("First class");
		}
		else if (marks>50 && marks<60){
			System.out.println("Second class");
		}
		else if (marks>35 && marks<50){
			System.out.println("pass");
		}
		else{
			System.out.println("Fail");
		}
	}
}