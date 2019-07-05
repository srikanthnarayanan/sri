package cuc;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HolyTester 

{

@Given("I am a {word} tester")
public void I_am_a_bad_tester(String a) 
{
	System.out.println("---------------------");
	System.out.println("@Given - I am a "+a+" tester");
	
}

@When("I go to work")
public void I_go_to_work() 
{
	System.out.println("@When - I go to work");
	
}

@Then("I {word} it")
public void I_mess_it(String b) 
{

	System.out.println("@Then - I "+b+" it");
	
}

@And("My boss {word} me")
public void My_boss_fires_me(String c) 
{

	System.out.println("@And - My boss "+c+" me");
	
}

@But("The developer {word} me")
public void dev(String d) 
{

	System.out.println("@But - The developer "+d+" me");
	
}


	
}
