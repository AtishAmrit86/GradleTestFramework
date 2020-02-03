package com.myntrafrntendautomation.runner;

import net.serenitybdd.jbehave.SerenityStories;

public class runnerClass extends SerenityStories {
	
public runnerClass() {
		
		findStoriesCalled("*.story");
	}
}
