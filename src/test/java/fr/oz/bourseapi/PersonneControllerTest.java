package fr.oz.bourseapi;

import fr.oz.bourseapi.controller.PersonneController;
import fr.oz.bourseapi.service.PersonneService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = PersonneController.class)
public class PersonneControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PersonneService personneService;

    @Test
    public void testGetPersonnes() throws Exception {
        mockMvc.perform(get("/personnes")).andExpect(status().isOk());
    }

}
