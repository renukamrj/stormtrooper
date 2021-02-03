package locklear.GENERATOR;

import locklear.PARTICLES.Particle;
import locklear.SUPPORT.Location;

public abstract class ParticleGenerator implements Generatable {
	String pGeneratorID;
	Location pGeneratorPos;

	ParticleGenerator(String pGeneratorID, Location pGeneratorPos) {
		this.pGeneratorID = pGeneratorID;
		this.pGeneratorPos = pGeneratorPos;
	}

	public abstract Particle generateParticle();
}
