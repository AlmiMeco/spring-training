package com.cydeo.controller;

import com.cydeo.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StudentController.class)
class StudentControllerTest {


    @Autowired
    private MockMvc mvc;

    @MockBean
    StudentService studentService;

    @Test
    void getStudentTest() throws Exception {

        mvc.perform(MockMvcRequestBuilders.get("/student")
                        .accept(MediaType.APPLICATION_JSON))
                        .andExpect(status().isOk())
                        .andExpect(content().json("{\"firstName\": \"Mike\", \"lastName\":  \"Smith\", \"age\": 20}")) // <- HardCoded JSON Controller Return (what's returned from /student (GET) )
                        .andDo(print())
                        .andReturn();
    }


    /*

        OUTPUT (thanks to line 33)

            MockHttpServletRequest:
                HTTP Method = GET
                Request URI = /student
                Parameters = {}
                Headers = [Accept:"application/json"]
                Body = null
                Session Attrs = {}

            Handler:
                Type = com.cydeo.controller.StudentController
                Method = com.cydeo.controller.StudentController#getStudent()

            Async:
                Async started = false
                Async result = null

            Resolved Exception:
                Type = null

            ModelAndView:
                View name = null
                View = null
                Model = null

            FlashMap:
                Attributes = null

            MockHttpServletResponse:
                Status = 200
                Error message = null
                Headers = [Content-Type:"application/json"]
                Content type = application/json
                Body = {"firstName":"Mike","lastName":"Smith","age":20}
                Forwarded URL = null
                Redirected URL = null
                Cookies = []*/

}