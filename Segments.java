public class Segments{
	int x1;
	int x2;
	int y1;
	int y2;
	double lenght;

	public Segments(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public double isLenght(){
		
		lenght = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		return Math.sqrt(lenght);
	}

	public void equals(double lenght1, double lenght2){
		if(lenght1==lenght2){
			System.out.println("Длины отрезков равны");
		}else{
			System.out.println("Длины отрезков не равны");
		}
	}
}
		 