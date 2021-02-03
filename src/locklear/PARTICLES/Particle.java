package locklear.PARTICLES;

import locklear.SUPPORT.Mineral;

public abstract class Particle implements Scatterable {
	private String retrievalCode;
	private double pDiameter;
	private double pVolume;
	private double pSurfaceArea;
	private Mineral pComposition;
	private boolean isRefined;

	public Particle(String retrievalCode, double pDiameter, double pVolume, double pSurfaceArea, Mineral pComposition) {
		this.retrievalCode = retrievalCode;
		this.pDiameter = pDiameter;
		this.pVolume = pVolume;
		this.pSurfaceArea = pSurfaceArea;
		this.pComposition = pComposition;
	}

	public void displayParticleInfo() {
		System.out.printf("%s Particle: %s \t Scatter Light Factor: %.2f\n", pComposition.name(), retrievalCode,
				scatterLight());
		System.out.printf("Diameter: \t %.2f \t Volume: %.2f\n", pDiameter, pVolume);
		System.out.printf("Surface Area: \t %.2f \t Refined: %s\n", pSurfaceArea, isRefined);
		System.out.printf("Mineral Mass: \t %.2f \t Mineral Strength: %s\n", pComposition.mass, pComposition.strength);
		System.out.println();
	}

	public abstract double scatterLight();

	public String getRetrievalCode() {
		return retrievalCode;
	}

	public void setRetrievalCode(String retrievalCode) {
		this.retrievalCode = retrievalCode;
	}

}
