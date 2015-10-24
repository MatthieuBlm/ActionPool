/**
 * 
 */
package test.resource.resourcefuluser;

import static org.junit.Assert.*;

import org.junit.Test;

import resource.Resource;
import resource.resourcefuluser.ResourcefulUser;

/**
 * @author meyer
 *
 */
public class TestResourcefulUser<R extends Resource> {

	/**
	 * Test method for {@link resource.resourcefuluser.ResourcefulUser#ResourcefulUser()}.
	 */
	@Test
	public void testResourcefulUser() {
		ResourcefulUser<R> resUser = new ResourcefulUser<R>();
	}

	/**
	 * Test method for {@link resource.resourcefuluser.ResourcefulUser#resetResource()}.
	 */
	@Test
	public void testResetResource() {
		fail("Not yet implemented");
	}

}
