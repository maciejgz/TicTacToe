package pl.mg.ttt.data.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import pl.mg.ttt.configuration.DatabaseConfigration;
import pl.mg.ttt.configuration.SecurityConfiguration;
import pl.mg.ttt.configuration.WebMvcConfiguration;

/**
 * Created by m on 2016-01-18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {DatabaseConfigration.class, SecurityConfiguration.class})
public class UserRepositoryTest {

    @Test
    public void simpleTest() {

    }
}
