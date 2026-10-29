
package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloControllerTest {

    private final HelloController controller = new HelloController();

    @Test
    void homeReturnsGreeting() {
        assertEquals(
            "Hello from Java DevOps Project!",
            controller.home().get("message")
        );
    }

    @Test
    void healthReturnsUp() {
        assertEquals("UP", controller.health().get("status"));
    }
}

