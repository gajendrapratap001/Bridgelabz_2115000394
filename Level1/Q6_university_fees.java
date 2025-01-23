public class Q6_university_fees{
	public static void main(String[] args){
		int fees= 125000;
		int discountPercent= 10;
		int discount = (fees * discountPercent)/100;
		int newFees= fees- discount;
		System.out.println("The discoint amount is INR "+discount+" and final discounted fess is INR " +newFees);

	}
}
