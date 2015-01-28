package org.java.restful.services;

import junit.framework.Assert;

import org.junit.Test;

public class DemoServiceTest {
	private DemoService service = new DemoService();
	
	@Test
	public void testEcho() {
		Assert.assertEquals("hello", service.echo("hello"));
	}
}
