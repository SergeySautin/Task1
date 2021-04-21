public class Main{
	public static void main(String[] args){
		
		Segments line1 = new Segments(1, 1, 2, 2);
		double lenght1 = line1.isLenght();
		System.out.println(lenght1);

		Segments line2 = new Segments(-3, 0, 1, 1);
		double lenght2 = line2.isLenght();
		System.out.println(lenght2);

		line1.equals(lenght1, lenght2);

	}
}