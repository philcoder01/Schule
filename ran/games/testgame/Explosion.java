package at.ran.games.testgame;

import java.io.IOException;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.particles.ConfigurableEmitter;
import org.newdawn.slick.particles.ParticleIO;
import org.newdawn.slick.particles.ParticleSystem;

public class Explosion {
	/**
	 * the particle system which contains an explosion emitter which we want to
	 * duplicate
	 */
	private ParticleSystem explosionSystem;
	/** The original emitter we've duplicated */
	private ConfigurableEmitter explosionEmitter;

	public Explosion() throws SlickException {
		try {
			// load the particle system containing our explosion emitter
			explosionSystem = ParticleIO.loadConfiguredSystem("testdata/endlessexplosion.xml");
			// get the emitter, it's the first (and only one) in this particle
			// system
			explosionEmitter = (ConfigurableEmitter) explosionSystem.getEmitter(0);
			// set the original emitter in the middle of the screen at the top
			explosionEmitter.setPosition(400, 100);
			// create 5 duplicate emitters
			for (int i = 0; i < 5; i++) {
				// a single duplicate of the first emitter is created here
				ConfigurableEmitter newOne = explosionEmitter.duplicate();
				// we might get null as a result - protect against that
				if (newOne == null)
					throw new SlickException("Failed to duplicate explosionEmitter");
				// give the new emitter a new unique name
				newOne.name = newOne.name + "_" + i;
				// place it somewhere on a row below the original emitter
				newOne.setPosition((i + 1) * (800 / 6), 400);
				// and add it to the original particle system to get the new
				// emitter updated and rendered
				explosionSystem.addEmitter(newOne);
			}
		} catch (IOException e) {
			throw new SlickException("Failed to load particle systems", e);
		}
	}
	
	
	public ParticleSystem getExplosionSystem(){
		return this.explosionSystem;
	}
	
}
