package locklear.SUPPORT;

public class Location {
	String name;
	int X;
	int Y;

	public Location(String name, int x, int y) {
		this.name = name;
		this.X = x;
		this.Y = y;
	}

	public void euclideanDistance(Location L) {

	}

	public String toString() {
		return "";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}
}
