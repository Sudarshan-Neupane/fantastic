package edu.mum.fantastic.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.mum.fantastic.domain.User;
import edu.mum.fantastic.service.UserService;

public class UserTest extends BaseTest {

	@Autowired
	private UserService userService;
	private static final String FIRST_NAME = "Sudarshan";
	private static final String MIDDLE_NAME = "";
	private static final String LAST_NAME = "Neupane";
	private static final String USER_NAME = "sneupane@gmail.com";
	private static final String PASSWORD = "nepal@123";
	private static final Long MOBILE = 3196140233L;
	private static final String ADDRESS1 = "1000N 4th STREET";
	private static final String ADDRESS2 = "";
	private static final String CITY = "FAIRFIELD";
	private static final String STATE = "IOWA";
	private static final String ZIP_CODE = "52557";
	private static final String COUNTRY = "United State of America";

	private static final String CHANGED_LAST_NAME = "Neupane JI";

	@Before
	public void addUserTest() {
		User user = new User(FIRST_NAME, MIDDLE_NAME, LAST_NAME, USER_NAME,
				PASSWORD, MOBILE, ADDRESS1, ADDRESS2, CITY, STATE, ZIP_CODE,
				COUNTRY);
		userService.add(user);
		User u = userService.findByUserName(USER_NAME);
		System.out.println("username: " + u.getUserName());
		Assert.assertEquals(USER_NAME, u.getUserName());
	}

	@Test
	// @After(value = addUserTest)
	// @DependsOn(value = edu.mum.fantastic.test.UserTest.addUserTest)
	public void updateUserTest() {
		User user = userService.findByUserName(USER_NAME);
		user.setLastName(CHANGED_LAST_NAME);
		userService.update(user);
		User u = userService.findByUserName(USER_NAME);
		System.out.println(u.getLastName());
		Assert.assertEquals(CHANGED_LAST_NAME, u.getLastName());
	}
}
