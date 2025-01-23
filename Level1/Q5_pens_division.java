public class Q5_pens_division {
	public static void main(String[] args) {
		int pens = 14;
		int stu = 3;
		int quant = pens/stu;
		int remain = pens % stu;
		System.out.print("The Pen Per Student is " + quant + " and the remaining pen not distributed is " + remain);

	}
}
