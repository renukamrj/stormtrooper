package locklear.PARTICLES;

import locklear.SUPPORT.Mineral;
import java.lang.Math;

public class B_Particle extends Particle {

	static double pDiameter = 1.7;
	static double pVolume = 396;
	static double pSurfaceArea = 18;
	static Mineral pComposition = Mineral.TRITANIUM;
	boolean isRefined = false;
	static int BParticleCount = 0;

	public B_Particle(String retrievalCode) {
		super(retrievalCode, pDiameter, pVolume, pSurfaceArea, pComposition);
		BParticleCount++;
	}

	public double scatterLight() {
		return pComposition.strength * Math.sqrt(10);
	}

	public boolean isRefined() {
		return isRefined;
	}

	public void setRefined(boolean isRefined) {
		this.isRefined = isRefined;
	}
}
