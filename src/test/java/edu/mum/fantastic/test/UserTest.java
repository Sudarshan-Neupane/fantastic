package edu.mum.fantastic.test;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.mum.fantastic.domain.Address;
import edu.mum.fantastic.domain.Phone;
import edu.mum.fantastic.domain.Profile;
import edu.mum.fantastic.domain.Profile.Gender;
import edu.mum.fantastic.domain.Profile.Hobbies;
import static edu.mum.fantastic.domain.Profile.Hobbies.READING;
import static edu.mum.fantastic.domain.Profile.Hobbies.SPORTS;
import edu.mum.fantastic.domain.User;
import edu.mum.fantastic.service.UserService;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class UserTest extends BaseTest {

    @Autowired
    private UserService userService;
    private static final String FIRST_NAME = "Sudarshan";
    private static final String MIDDLE_NAME = "";
    private static final String LAST_NAME = "Neupane";
    private static final String USER_NAME = "sneupane@gmail.com";
    private static final String PASSWORD = "nepal@123";
    private static final String RE_PASSWORD = "nepal@123";
    private static final String MOBILE = "3196140233L";
    private static final String ADDRESS1 = "1000N 4th STREET";
    private static final String ADDRESS2 = "";
    private static final String CITY = "FAIRFIELD";
    private static final String STATE = "IOWA";
    private static final String ZIP_CODE = "52557";
//	private static final String COUNTRY = "United State of America";

    private static final String CHANGED_LAST_NAME = "Neupane JI";

    @Before
    public void addUserTest() {
        User user = new User(FIRST_NAME, MIDDLE_NAME, LAST_NAME, USER_NAME,
                PASSWORD, RE_PASSWORD);
        userService.add(user);
        User u = userService.findByUserName(USER_NAME);
        System.out.println("username: " + u.getUserName());
        Assert.assertEquals(USER_NAME, u.getUserName());
    }

    @Test
	// @After(value = addUserTest)
    // @DependsOn(value = edu.mum.fantastic.test.UserTest.addUserTest)
    public void updateUserTest() {
        Set<Hobbies> hc = new HashSet<>();
        Hobbies[] h = new Hobbies[]{SPORTS, READING};
        hc.add(Hobbies.SPORTS);
        hc.add(Hobbies.READING);
        User user = userService.findByUserName(USER_NAME);
        Phone p = new Phone();
        p.setArea("319");
        p.setPrefixValue("614");
        p.setNumber("0233");
        user.setLastName(CHANGED_LAST_NAME);
        Address address = new Address(ADDRESS1, ADDRESS2, CITY, STATE, ZIP_CODE);
        Profile profile = new Profile(Gender.MALE, p, new Date(), address);
        profile.setHobbies(hc);
        user.setProfile(profile);
        userService.update(user);
        User u = userService.findByUserName(USER_NAME);
        System.out.println(u.getLastName());
        Assert.assertEquals(CHANGED_LAST_NAME, u.getLastName());
    }
}
