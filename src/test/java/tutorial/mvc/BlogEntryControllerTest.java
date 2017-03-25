package tutorial.mvc;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * Created by tugul on 25/03/17.
 */
public class BlogEntryControllerTest {
    @InjectMocks
    private BlogEntryController blogController;

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(blogController)
                .build();
    }

    @Test
    public void test() throws Exception {
        // It loads /test url and prints output
        mockMvc.perform(get("/test")).andDo(print());

        // Performs post request with JSON parameter
        mockMvc.perform(post("/test")
                .content("{\"title\":\"Test Blog Title\"}")
                .contentType(MediaType.APPLICATION_JSON)
        ).andDo(print());
    }
}
