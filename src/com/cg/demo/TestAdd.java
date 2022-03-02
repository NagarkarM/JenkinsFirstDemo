package com.cg.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAdd {

	JenkinsDemo jd=null;
	
	@Before
	public void setUp() throws Exception {
		jd=new JenkinsDemo();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAddNums() {
		assertEquals(150,jd.addNums(100, 150));
	}

}
