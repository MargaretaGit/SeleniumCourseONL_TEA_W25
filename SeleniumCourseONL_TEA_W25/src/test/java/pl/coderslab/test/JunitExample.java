package pl.coderslab.test;

import org.junit.jupiter.api.*;

public class JunitExample {
    @Test
    public void firstTest() {
        System.out.println("first test");
    }
    @Test
    public void secondTest() {
        System.out.println("second test");
    }
    @BeforeEach
    public void beforeEach() {
        System.out.println("this will be run before each test");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("this will be run after each test");
    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Start testing");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("End testing");
    }
    }

