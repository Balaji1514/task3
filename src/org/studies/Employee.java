package org.studies;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
//import org.junit.runner.RunWith;
//import org.junit.runners.Suite;

//@RunWith(Suite.class)
//@Suite.SuiteClasses({Junit1.class,Junit.class})
public class Employee {
@Test
public void test() {
	Result rd = JUnitCore.runClasses(Junit.class,Junit1.class);
	System.out.println("failure count "+ rd.getFailureCount());
	System.out.println("suite status  " + rd.wasSuccessful());
	System.out.println("run time  "+rd.getRunTime());
	System.out.println("ignore count  "+rd.getIgnoreCount());
	System.out.println("run count  "+rd.getRunCount());
	
	List<Failure> failures = rd.getFailures();
	for (Failure x : failures) {
		System.out.println(x);
	}
}
}
