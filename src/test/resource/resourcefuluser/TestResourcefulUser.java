/**
 * 
 */
package src.test.resource.resourcefuluser;

import static org.junit.Assert.*;

import org.junit.Test;

import src.resource.Resource;
import src.resource.resourcefuluser.ResourcefulUser;

/**
 * @author meyer
 *
 */
public abstract class TestResourcefulUser<R extends Resource> {

	/**
	 * Test method for {@link resource.resourcefuluser.ResourcefulUser#ResourcefulUser()}.
	 * Test method for {@link resource.resourcefuluser.ResourcefulUser#resetResource()}.
	 */
	@Test
	public void testResourcefulUser() {
		ResourcefulUser<R> resUser = new ResourcefulUser<R>();
		assertEquals(null, resUser.getResource());
		resUser.resetResource();
		assertEquals(null, resUser.getResource());
	}

}
