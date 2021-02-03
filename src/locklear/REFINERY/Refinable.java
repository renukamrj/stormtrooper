package locklear.REFINERY;

import locklear.PARTICLES.A_Particle;
import locklear.PARTICLES.B_Particle;
import locklear.PARTICLES.C_Particle;

public interface Refinable {

	A_Particle refineAParticle(A_Particle p);

	B_Particle refineBParticle(B_Particle p);

	C_Particle refineCParticle(C_Particle p);

}
