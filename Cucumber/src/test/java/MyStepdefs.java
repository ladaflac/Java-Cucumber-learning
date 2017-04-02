import com.javafortesters.domainentities.User;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lada on 3.5.2016.
 */
public class MyStepdefs {
    public User user;

    @Given("^Unesem sve potrebne podatke o budućem useru$")
    public void unesemSvePotrebnePodatkeOBudućemUseru() {

    }

    @When("^Pokrenem akciju spremanja novog usera$")
    public void pokrenemAkcijuSpremanjaNovogUsera() {
        User user = new User();
    }
    //throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
 //   }

    @Then("^Novi user ima defaultni username$")
    public void noviUserImaDefaultniUsername() {
        assertEquals("default username expected","username",user.getUsername());
    }
// }
// throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//
//        throw new PendingException();
//    }

    @And("^Novi user ima defaultni password$")
    public void noviUserImaDefaultniPassword() {
        assertEquals("default password expected","password",user.getPassword());
    }
    /*throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }*/
}
