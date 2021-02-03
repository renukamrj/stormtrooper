package locklear.REFINERY;

import java.util.ArrayDeque;
import java.util.ArrayList;

import locklear.PARTICLES.A_Particle;
import locklear.PARTICLES.B_Particle;
import locklear.PARTICLES.C_Particle;
import locklear.PARTICLES.Particle;
import locklear.SUPPORT.Location;

public class ParticleRefiner implements Refinable {
	String refinerID;
	String refinerName;
	Location refinerPos;
	ArrayList<Particle> pStorage;
	ArrayList<A_Particle> Refined_AStorage;
	ArrayList<B_Particle> Refined_BStorage;
	ArrayList<C_Particle> Refined_CStorage;

	public ParticleRefiner(String refinerID, String refinerName, Location refinerPos) {
		this.refinerID = refinerID;
		this.refinerName = refinerName;
		this.refinerPos = refinerPos;
	}

	public A_Particle refineAParticle(A_Particle p) {
		p.setRefined(true);
		return p;
	}

	public B_Particle refineBParticle(B_Particle p) {
		p.setRefined(true);
		return p;
	}

	public C_Particle refineCParticle(C_Particle p) {
		p.setRefined(true);
		return p;
	}

	public boolean emptyExtractor(ParticleExtractor pe) {
		boolean result = false;
		if (pStorage == null)
			pStorage = new ArrayList<Particle>();
		if (Refined_AStorage == null)
			Refined_AStorage = new ArrayList<A_Particle>();
		if (Refined_BStorage == null)
			Refined_BStorage = new ArrayList<B_Particle>();
		if (Refined_CStorage == null)
			Refined_CStorage = new ArrayList<C_Particle>();
		for (Particle p : pe.getExtractorPool()) {
			pStorage.add(p);
			if (p.getRetrievalCode().startsWith("A"))
				result= Refined_AStorage.add((A_Particle) p);
			else if (p.getRetrievalCode().startsWith("B"))
				result= Refined_BStorage.add((B_Particle) p);
			else if (p.getRetrievalCode().startsWith("C"))
				result=  Refined_CStorage.add((C_Particle) p);
			if(result== false)
				return result;
		}
		return result;
	}

	public void sampleParticles(int count) {
		int i = 0;

		for (int counter = 0; counter < pStorage.size(); counter++) {
			if (i < count) {
				pStorage.get(counter).displayParticleInfo();
				i++;
			}
		}
	}

	public void displayInfo() {
		System.out.printf("__________PARTICLE REFINER_________");
		System.out.printf("Refiner ID: %s \n", refinerID);
		System.out.printf("Location [X: %d, Y: %d] \n", refinerPos.getX(), refinerPos.getY());
		System.out.printf("Current Particle Storage: %d particles  \n", pStorage.size());
		System.out.printf("Current A Particle Storage: %d particles \n", Refined_AStorage.size());
		System.out.printf("Current B Particle Storage: %d particles \n", Refined_BStorage.size());
		System.out.printf("Current C Particle Storage: %d particles \n", Refined_CStorage.size());

	}

}
