package org.booleanuk.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(HealthControllerTest.class)
public class HealthControllerTest {

    private HealthController healthController;

    public HealthControllerTest() {

        healthController = new HealthController();
    }

    @Test
    public void healthEndpointReturnsOK() {

        assertEquals("OK", healthController.health());
    }
}
