package org.studies;

import org.junit.Assert;
import org.junit.Test;

public class Junit1 {
@Test
public void test() {
	System.out.println("test0");
	Assert.assertTrue("test ", true);
	}
@Test
public void test1() {
	Assert.assertTrue("test 1", true);
}
@Test
public void test2() {
	Assert.assertTrue("test 2", false);
}
@Test
public void test3() {
	Assert.assertTrue("test 3", true);

}
}
