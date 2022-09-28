
package week2.example3;

import week2.example2.Location;

public class MemoryModel {

	public static void example1() {
		double lon = 123.12312;
		Location sjsu;
		sjsu = new Location(37.33578624343321, lon);
		Location goldenGate = new Location(37.80799311665714, sjsu.getLongitude()); // as a reference or value?
	}

	public static void example2() {
		Location loc1 = new Location(39.9, 116.4);
		Location loc2 = new Location(55.8, 37.6);
		loc1 = loc2;
		loc1.setLatitude(-8.3);
		System.out.println(loc2.getLatitude() + ", " + loc2.getLongitude());

		//		What does this program print?
		//				A. 55.8, 37.6
		//				B. -8.3, 37.6
		//				C. -8.3, 116.4
		//				D. 39.9, 116.4
	}

	public static void main(String[] args) {
		example1();
		example2();
	}
}
