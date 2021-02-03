package locklear.COLLECTOR;

import java.util.ArrayList;

import locklear.PARTICLES.Particle;
import locklear.SUPPORT.Location;

public class ParticleCollector {
	
	String collectorID;
	Location collectorPOS;
	ArrayList<Particle> collectorPool;
	static final int COLLECTOR_CAPACITY = 500;

	public ParticleCollector(String collectorID, Location collectorPOS) {
		this.collectorID = collectorID;
		this.collectorPOS = collectorPOS;
	}

	public boolean collectorParticle(Particle p) {
		if(collectorPool == null)
			collectorPool = new ArrayList<Particle>();
		if (collectorPool.size() < COLLECTOR_CAPACITY) {
			collectorPool.add(p);
			return true;
		} else {
			return false;
		}
	}
	
	public String getCollectorID() {
		return collectorID;
	}

	public void setCollectorID(String collectorID) {
		this.collectorID = collectorID;
	}

	public Location getCollectorPOS() {
		return collectorPOS;
	}

	public void setCollectorPOS(Location collectorPOS) {
		this.collectorPOS = collectorPOS;
	}

	public ArrayList<Particle> getCollectorPool() {
		return collectorPool;
	}

	public void setCollectorPool(ArrayList<Particle> collectorPool) {
		this.collectorPool = collectorPool;
	}

}
