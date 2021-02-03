package locklear.GENERATOR;

import locklear.PARTICLES.B_Particle;
import locklear.SUPPORT.Location;

public class Part_BGenerator extends ParticleGenerator {

	static final String PTYPE = "B_Particle";
	static final int PCAPACITY = 180;
	static int GENERATED_COUNT = 0;

	public Part_BGenerator(String pGeneratorID, Location pGeneratorPos) {
		super(pGeneratorID, pGeneratorPos);

		GENERATED_COUNT++;
	}

	public B_Particle generateParticle() {
		B_Particle particle = new B_Particle("B" + GENERATED_COUNT);
		return particle;
	}

}