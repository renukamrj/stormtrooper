package locklear.REFINERY;

import java.util.ArrayDeque;
import java.util.ArrayList;

import locklear.COLLECTOR.ParticleCollector;
import locklear.PARTICLES.Particle;
import locklear.SUPPORT.Location;

public class ParticleExtractor {
	String extractorID;
	Location extractorPOS;
	ArrayDeque<Particle> extractorPool;

	static final int EXTRACTOR_CAPACITY = 500;

	public ParticleExtractor(String extractorID, Location extractorPOS) {
		this.extractorID = extractorID;
		this.extractorPOS = extractorPOS;
	}

	public boolean extractParticles(ParticleCollector pc) {
		if(extractorPool == null)
			extractorPool = new ArrayDeque<Particle>();
		
		if (extractorPool.size() + pc.getCollectorPool().size() <= EXTRACTOR_CAPACITY) {
			for (int counter = 0; counter < pc.getCollectorPool().size(); counter++) {
				extractorPool.add(pc.getCollectorPool().get(counter));
			}
			return true;
		} else {
			System.out.println("Extractor Pool does not have sufficient capacity");
			return false;
		}
	}

	public ArrayDeque<Particle> getExtractorPool() {
		return extractorPool;
	}

	public void setExtractorPool(ArrayDeque<Particle> extractorPool) {
		this.extractorPool = extractorPool;
	}
}
