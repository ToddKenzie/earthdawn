package races;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RaceTest {

	@Test
	public void checkDwarfVisionAbilityIsHeatVision() {
		Race underTest = new Dwarf();
		String vision = underTest.checkVisionType();
		assertThat(vision, is("Heat Sight"));
	}
	
	@Test
	public void checkElfVisionAbilityIsLowLight() {
		Race underTest = new Elf();
		String vision = underTest.checkVisionType();
		assertThat(vision, is("Low-Light Vision"));
	}
	
	@Test
	public void checkWindlingVisionAbilityIsAstralSensitive() {
		Race underTest = new Windling();
		String vision = underTest.checkVisionType();
		assertThat(vision, is("Astral-Sensitive Sight"));
	}
	
	@Test
	public void checkHumanVisionAbilityIsNormal() {
		Race underTest = new Human();
		String vision = underTest.checkVisionType();
		assertThat(vision, is("Normal Vision"));
	}
	
}
