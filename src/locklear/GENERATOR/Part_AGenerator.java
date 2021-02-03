package locklear.GENERATOR;

import locklear.PARTICLES.A_Particle;
import locklear.SUPPORT.Location;

public class Part_AGenerator extends ParticleGenerator {

	static final String PTYPE = "A_Particle";
	static final int PCAPACITY = 100;
	static int GENERATED_COUNT = 0;

	public Part_AGenerator(String pGeneratorID, Location pGeneratorPos) {
		super(pGeneratorID, pGeneratorPos);

		GENERATED_COUNT++;
	}

	public A_Particle generateParticle() {
		A_Particle particle = new A_Particle("A" + GENERATED_COUNT);
		return particle;
	}

}
