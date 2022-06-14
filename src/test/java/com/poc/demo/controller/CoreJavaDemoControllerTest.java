package com.poc.demo.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
@ExtendWith(MockitoExtension.class)
@WebMvcTest(CoreJavaDemoController.class)
public class CoreJavaDemoControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    CoreJavaDemoController coreJavaDemoController;

    @Test
    void chkExperimentInnerClass() throws Exception {
        this.mockMvc.perform(get("/corejava/innerclass"))
                .andExpect(status().isOk());

    }
}
