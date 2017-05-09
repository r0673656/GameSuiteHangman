package domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CirkelTest {
	
	private Punt middelpunt;
	private int straal;
	private Cirkel cirkel;
	
	@Before
	public void setUp() throws Exception{
		cirkel = new Cirkel(middelpunt, straal);
	}
	
	@Test
	public void Cirkel_aanmaken_met_geldig_middelpunt_en_geldige_straal(){
		Cirkel cirkel = new Cirkel(middelpunt, straal);
		assertEquals(middelpunt, cirkel.getMiddelpunt());
		assertEquals(straal, cirkel.getStraal());
		
	}
	@Test (expected = IllegalArgumentException.class)
	public void Exception_wanneer_cirkel_aanmaken_met_middelpunt_null(){
		cirkel = new Cirkel(null, straal);
	}
	@Test (expected = IllegalArgumentException.class)
	public void Exception_cirkel_aanmaken_kleiner_nul(){
		cirkel = new Cirkel(middelpunt, -1);
	}
	@Test (expected = IllegalArgumentException.class)
	public void Exception_cirkel_aanmaken_straal_is_nul(){
		cirkel = new Cirkel(middelpunt,0);
	}
	@Test
	public void Cirkels_gelijk_zelfde_middelpunt_zelfde_straal(){
		
	}
	@Test
	public void Cirkels_anders_wanneer_tweede_null(){
		
	}
	@Test
	public void Cirkels_anders_wanneer_middelpunt_verschillend(){
		
	}
	@Test
	public void Cirkels_verschillend_wanneer_straal_verschillend(){
		
	}
}
