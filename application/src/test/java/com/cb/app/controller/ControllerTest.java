package com.cb.app.controller;


import com.cb.app.Main;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;


@ExtendWith(SpringExtension.class)
@SpringBootTest(value = {"server.servlet.context-path=/qa", "server.port=8093"})
@ContextConfiguration(classes = Main.class)
public class ControllerTest {

    @Autowired
    private WebApplicationContext ctx;

    private MockMvc mockMvc;

   /* @BeforeEach
    void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.ctx).build();
    }


    @Test
    public void testHelloController() throws Exception {
        mockMvc.perform(get("/health")).andExpect(content().string("Hello"));
    }*/
}
