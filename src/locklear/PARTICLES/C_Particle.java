package locklear.PARTICLES;

import locklear.SUPPORT.Mineral;

public class C_Particle extends Particle {
	static double pDiameter = 2.1;
	static double pVolume = 518;
	static double pSurfaceArea = 24;
	static Mineral pComposition = Mineral.UNAMIUM;
	boolean isRefined = false;
	static int CParticleCount = 0;

	public C_Particle(String retrievalCode) {
		super(retrievalCode, pDiameter, pVolume, pSurfaceArea, pComposition);
		CParticleCount++;
	}

	public double scatterLight() {
		return pComposition.mass * 10;
	}

	public boolean isRefined() {
		return isRefined;
	}

	public void setRefined(boolean isRefined) {
		this.isRefined = isRefined;
	}
}
