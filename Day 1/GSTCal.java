
class GST {
	public static void main(String[] args) {
		String state = args[0];
		float ini = Integer.parseInt(args[1]);
		float tax = 0;
		float cost = 0;
		if(state.equals("KA")){
			tax = 5;
			cost = ini - (ini * tax)/100; 
		}
		else if(state.equals("DL")){
			tax = 8;
			cost = ini - (ini *tax)/100;
		}
		else if(state.equals("UP")){
			tax = 4;
			cost = ini - (ini *tax)/100;
		}
		System.out.println(cost);
	}
}