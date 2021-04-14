package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunTestng {
	@Test
	private void tc1() {
		System.out.println("Method 1");
	}
	
	@Test
	private void tc2() {
		System.out.println("Method 2");
		Assert.assertTrue(false);
	}
	@Test
	private void tc3() {
		System.out.println("Method 3");
	}
	@Test
	private void tc4() {
		System.out.println("Method 4");
	}
	@Test
	private void tc5() {
		System.out.println("Method 5");
	}
	@Test
	private void tc6() {
		System.out.println("Method 6");
		Assert.assertTrue(false);
	}
}
