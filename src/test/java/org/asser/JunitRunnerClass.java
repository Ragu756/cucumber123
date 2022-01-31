package org.asser;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitRunnerClass {
	
  
	@Test
	public void tc55() {

	  Result rs = JUnitCore.runClasses(Employee.class,Sample.class);
	  
	  int runCount = rs.getRunCount();
	  
	  System.out.println("total runcount:"+runCount);
	  
	  System.out.println("total ignore count:"+rs.getIgnoreCount());
	  System.out.println("total runtime:"+rs.getRunCount());
	  System.out.println("failureCount:"+rs.getFailureCount());
	  
	  List<Failure> li = rs.getFailures();
	  
	  for (Failure x : li) {
		System.out.println(x);
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}
	
	
	
	

}
