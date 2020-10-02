import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	private Logger logger = Logger.getLogger(LoginTest.class.getClass());
	
	@Test
	public void testLogin() {
		logger.info("@@@@@@@ inside testLogin @@@@@@@@");
		Assert.assertEquals((1+1), 2);
	}

}
