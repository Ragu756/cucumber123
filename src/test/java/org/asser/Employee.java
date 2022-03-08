package org.asser;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Employee {

	@Test(priority=-15)

	private void tc3() {
    System.out.println("test 3");
	}
	@Ignore
	@Test
	private void tc2() {
    System.out.println("test 2");
	}
	  
	@Test(priority=15)
	private void tc1() {
    System.out.println("test 1");
	}
	
	
	
	
	
}
