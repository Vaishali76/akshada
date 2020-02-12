package pck5;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class cls5 {
	@Given("I am a good tester")
	public void I_am_a_good_tester() {
		System.out.println("I am a good tester");	
    }
	@And("I work in accenture")
	public void I_work_in_accenture() {
		System.out.println("I work in accenture");
    }
	@Given("I am bad tester")
	public void I_am_bad_tester() {
		System.out.println("I am bad tester");	
    }
	@And("I work in wipro")
	public void I_work_in_wipro() {
		System.out.println("I work in wipro");
    }
	@Given ("I am a developer")
	public void I_am_a_developer() {
		System.out.println("I am a developer");
	}
    @And("I work in accenture for 1 year")
	public void I_work_in_accenture_for_1_year() {
		System.out.println("I work in accenture for 1 year");
	}
    @Given ("I am an experienced devloper")
	public void I_am_an_experienced_devloper() {
		System.out.println("I am an experienced devloper");
	}
    @And("I worked so hard")
	public void I_worked_so_hard() {
		System.out.println("I worked so hard");
	}
	
}
