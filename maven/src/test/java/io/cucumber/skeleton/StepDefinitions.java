package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given("There is still a world to live in")
    public void there_is_still_a_world_to_live_in() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        HelloWorld hello = new HelloWorld();
        hello.hello1();
    }
    @When("I say Hello before World")
    public void i_say_hello_before_world() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        HelloWorld hello = new HelloWorld();
        hello.hello2();
    }
    @Then("I can now say Hello World")
    public void i_can_now_say_hello_world() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        HelloWorld hello = new HelloWorld();
        hello.hello3();
    }
}
