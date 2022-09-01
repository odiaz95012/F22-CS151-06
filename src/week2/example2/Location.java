package week2.example2;

public class Location {

	private double latitude;
	private double longitude;

	public Location() {
	}

	public Location(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	// calculate distance between two locations
	// referred from :
	// https://stackoverflow.com/questions/3694380/calculating-distance-between-two-points-using-latitude-longitude
	public double getDistance(Location other) {

		final int R = 6371; // Radius of the earth

		double latDistance = Math.toRadians(other.latitude - this.latitude);
		double lonDistance = Math.toRadians(other.longitude - this.longitude);
		double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) + Math.cos(Math.toRadians(this.latitude))
				* Math.cos(Math.toRadians(other.latitude)) * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double distance = R * c * 1000; // convert to meters

		distance = Math.pow(distance, 2);
		return Math.sqrt(distance);
	}

	public static void main(String[] args) {
		Location sjsu = new Location(37.33578624343321, -121.88006997482594);
		Location goldenGate = new Location(37.80799311665714, -122.47526935570986);

		System.out.println(sjsu.getDistance(goldenGate));
	}

}
