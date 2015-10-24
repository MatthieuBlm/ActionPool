package test.resource;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import resource.Resource;


public abstract class TestResource {

	@Test
	public void testDescription() {
		Resource res= createResource();
		assertEquals(resourceString(), res.description());
	}

	protected abstract Resource createResource();
	protected abstract String resourceString();
}
