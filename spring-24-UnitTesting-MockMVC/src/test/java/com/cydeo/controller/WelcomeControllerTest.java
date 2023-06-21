package com.cydeo.controller;

import org.checkerframework.framework.qual.QualifierArgument;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(WelcomeController.class)
class WelcomeControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void welcomeTest_NonPreferred() throws Exception {

        /*FORMING MOCK REQUEST*/
        RequestBuilder request = MockMvcRequestBuilders.get("/welcome")
                .accept(MediaType.APPLICATION_JSON);

        /* CONTAINING RESULT OF MOCK REQUEST */
        MvcResult result = mvc.perform(request).andReturn();

        /* VERIFYING THAT EXPECTED RESULT MATCHES TRUE RESULT */
        assertEquals(200, result.getResponse().getStatus());
        assertEquals("welcome", result.getResponse().getContentAsString());

    }






}