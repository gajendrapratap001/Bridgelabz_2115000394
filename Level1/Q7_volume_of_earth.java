public class Q7_volume_of_earth{
	public static void main(String[] args){
		double radius_in_km= 6378;
		final double pie= Math.PI;
		double radius_in_miles= (radius_in_km/1.6);
		double vol_in_km= (4*pie* (Math.pow(radius_in_km,3)))/3;
		double vol_in_miles = (4*pie* (Math.pow(radius_in_miles,3)))/3;
		System.out.print("The volume of earth in cubic kilometers is "+vol_in_km+" and cubic miles is "+vol_in_miles);

	}
}
