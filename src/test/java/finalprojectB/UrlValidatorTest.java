
package finalprojectB;

import org.junit.Test;
import junit.framework.TestCase;

//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase {


   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   //this should return true as the url is valid but it does not
   @Test
   public void testManualTest()
   {

        //
        String[] schemes = { "http", "https" };
        UrlValidator urlValidator = new UrlValidator(schemes);
        assertTrue(urlValidator.isValid("http://tech.yahoo.com/rc/desktops/102;_ylt=Ao8yevQHlZ4On0O3ZJGXLEQFLZA5"));
 
   }
   
    @Test
    public void testManualTest_01() {

        
     UrlValidator urlValidator = new UrlValidator();
     assertTrue(urlValidator.isValid("ftp://foo.bar.com/"));
    }

   //this should return true as it is a valid scheme but the assertion fails
   @Test
   public void test_isValidScheme(){
        String[] schemes = { "http", "https" };
        UrlValidator urlValidator = new UrlValidator(schemes);
        assertTrue(urlValidator.isValidScheme("http"));
   }

   
   
   public void testYourFirstPartition()
   {
	 //You can use this function to implement your First Partition testing	   

   }
   
   public void testYourSecondPartition(){
		 //You can use this function to implement your Second Partition testing	   

   }
   //You need to create more test cases for your Partitions if you need to 
   
   public void testIsValid()
   {
	   //You can use this function for programming based testing

   }
   


}
