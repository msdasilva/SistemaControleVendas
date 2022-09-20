
import controller.CategoriaController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(CategoriaController.class)
class CategoriaIntegrationTest {

    private MockMvc mockMvc;
    private final static String URL_CONTROLLER = "/api/categorias";

    @Test
    @DisplayName("valida lista de categoria")
    void getAllCategoryTest() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get(URL_CONTROLLER)
                        .contentType(MediaType.APPLICATION_JSON)
                ).andExpect(status().isOk());
    }
}
