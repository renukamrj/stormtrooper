package locklear.SUPPORT;

public enum Mineral {
	DILITHIUM(40,140),
	TRITANIUM(80,180),
	UNAMIUM(90,270);
	
	public double mass;
	public double strength;

	Mineral(double mass , double strength )
	{
		this.mass=mass;
		this.strength=strength;		
	}
}
