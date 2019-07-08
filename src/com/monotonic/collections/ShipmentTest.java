package com.monotonic.collections;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.Container;

import org.junit.jupiter.api.Test;

class ShipmentTest {
	

	private ProductFixtures pf =  new ProductFixtures();
	private Shipment shipment = new Shipment();
	
	@Test
	void testAdd() throws Exception {
		shipment.add(pf.door);
		shipment.add(pf.window);
		
//		assertThat(shipment, contains(pf.door, pf.window));
	}

	@Test
	void testReplace() throws Exception{
		shipment.add(pf.door);
		shipment.add(pf.window);
		
		shipment.replace(pf.door, pf.floorPanel);
		
//		assertThat(shipment, contains(pf.floorPanel, pf.window));
	}
	
	@Test
	
	void shouldNotReplaceMissingItems() throws Exception {
		shipment.add(pf.window);
		
		shipment.replace(pf.door, pf.floorPanel);
		
//		assertThat(shipment, contains(pf.window));
	}

	@Test
	void testPrepare() {
		shipment.add(pf.door);
		shipment.add(pf.floorPanel);
		shipment.add(pf.window);
		
		shipment.prepare();
		
//		assertThat(shipment.getLightVanProducts(), contains(pf.window));
//		assertThat(shipment.getHeavyVanProducts(), contains(pf.floorPanel, pf.door));
	}

	
	@Test
	void testIterator() {
		fail("Not yet implemented");
	}

}
