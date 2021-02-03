package locklear.PARTICLES;

import locklear.SUPPORT.Mineral;
import java.lang.Math;

public class A_Particle extends Particle {
	static double pDiameter = 1.3;
	static double pVolume = 124;
	static double pSurfaceArea = 7;
	static Mineral pComposition = Mineral.DILITHIUM;

	boolean isRefined = false;
	static int AParticleCount = 0;

	public A_Particle(String retrievalCode) {
		super(retrievalCode, pDiameter	, pVolume, pSurfaceArea, pComposition);
		AParticleCount++;
	}

	public double scatterLight() {
		return pComposition.strength * Math.sqrt(10) * 0.28 * pComposition.mass;
	}
	
	 public boolean isRefined() {
		return isRefined;
	}

	public void setRefined(boolean isRefined) {
		this.isRefined = isRefined;
	}

}
