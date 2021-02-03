package locklear.GENERATOR;

import locklear.PARTICLES.C_Particle;
import locklear.SUPPORT.Location;

public class Part_CGenerator extends ParticleGenerator {

	static final String PTYPE = "C_Particle";
	static final int PCAPACITY = 210;
	static int GENERATED_COUNT = 0;

	public Part_CGenerator(String pGeneratorID, Location pGeneratorPos) {
		super(pGeneratorID, pGeneratorPos);

		GENERATED_COUNT++;
	}

	public C_Particle generateParticle() {
		C_Particle particle = new C_Particle("C" + GENERATED_COUNT);
		return particle;
	}

}