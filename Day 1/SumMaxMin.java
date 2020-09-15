
class SumMaxMin {
	public static void main(String[] args) {
		int mi = Integer.MAX_VALUE, ma = Integer.MIN_VALUE, sum = 0;
		for(int i=0;i<args.length;i++){
			int currNum = Integer.parseInt(args[i]);
			if(currNum<mi){
				mi = currNum;
			}
			if(currNum>ma){
				ma = currNum;
			}
			sum += currNum;
		}
		System.out.println("Sum: "+sum);
		System.out.println("Min: "+mi);
		System.out.println("Max: "+ma);
	}
}