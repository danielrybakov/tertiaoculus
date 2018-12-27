package com.danielrybakov.tertiaoculus.cucumber.stepdefs;

import com.danielrybakov.tertiaoculus.TertiaoculusApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TertiaoculusApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
