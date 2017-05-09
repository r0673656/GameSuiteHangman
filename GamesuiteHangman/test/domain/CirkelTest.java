package domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CirkelTest {
	
	private Punt middelpunt;
	private Punt nieuwMiddelpunt;
	private int straal;
	private Cirkel cirkel;
	
	@Before
	public void setUp() throws Exception{
		middelpunt = new Punt(200,200);
		nieuwMiddelpunt = new Punt(100,150);
		straal = 20;
		
		cirkel = new Cirkel(middelpunt, straal);
	}
	
	@Test
	public void Cirkel_aanmaken_met_geldig_middelpunt_en_geldige_straal(){
		
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
		Cirkel andereCirkel = new Cirkel(middelpunt, straal);
		assertTrue(cirkel.equals(andereCirkel));
	}
	//@Test
	//public void Cirkels_anders_wanneer_tweede_null(){
		
	//}
	@Test
	public void Cirkels_anders_wanneer_middelpunt_verschillend(){
		
		Cirkel andere = new Cirkel(nieuwMiddelpunt, straal);
		assertFalse(cirkel.equals(andere));
	}
	@Test
	public void Cirkels_verschillend_wanneer_straal_verschillend(){
		Cirkel andere = new Cirkel(middelpunt, straal + 10);
		assertFalse(cirkel.equals(andere));
	}
	@Test
	public void equals_moet_false_teruggeven_als_parameter_null(){
		assertFalse(cirkel.equals(null));
	}
}
