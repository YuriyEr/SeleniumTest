package JUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UserTests {
    private static HashMap<String, User> userMap;

    @Before
    public void setUp() {
        userMap = new HashMap<String, User>();
        userMap.put("Max", new User(01, "Max", 25, Gender.MALE));
        userMap.put("Sasha", new User(02, "Max", 30, Gender.FAMALE));
        userMap.put("Vasa", new User(02, "Max", 21, Gender.FAMALE));
    }


    @Test
    public void getAllUsers() {
        Assert.assertEquals(3, userMap.size());
//        Assert.assertEquals(userMap.size()+1, userMap.size());
    }

    @Test
    public void getAllUsersNotNull() {
        Assert.assertNotNull(userMap);
    }

    @After
    public void clouseTest(){
        System.out.println("Тесты завершены");
    }

}
