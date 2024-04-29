package controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.http.RequestEntity.post;
@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@SpringBootTest(class=ApplicationTests.Class)
public class SubWasteControllerTest {
    @Autowired
    private MockMvc mvc;
    @MockBean
    private SubWasteController subWasteController;
    @Test
    public void testGetAllSubWaste() throws Exception {
        Employee subWaste = getSubWaste();
        List<SubWaste> sub_WasteList = new ArrayList<>();
        subWaste.add(subWaste);
        given(subWasteController.getAllSubWaste()).willReturn(subWaste);
        mvc.perform(get("/subWaste/").contentType(APPLICATION_JSON)).andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name", is(sub_WasteList.getName())));
    }
    @Test
    public void testGetSubWaste() throws Exception {
        Employee subWaste = getSubWaste();
        given(employeeController.getEmployee(1)).willReturn(subWaste);
        mvc.perform(get("/subWaste" + subWaste.getId()).contentType(APPLICATION_JSON)).andExpect(status().isOk())
                .andExpect(jsonPath("name", is(subWaste.getName())));
    }
    @Test
    public void testDeleteSubWaste() throws Exception {
        Employee subWaste = getSubWaste();
        doNothing().when(subWasteController).deleteEmployee(1);
        mvc.perform(delete("subWaste/" + subWaste.getId()).contentType(APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
    }
    @Test
    public void testAddSubWaste() throws Exception {
        SubWaste subWaste = getSubWaste();
        doNothing().when(subWasteController).addSubWaste(subWaste);
        mvc.perform(post("/subWaste").content(asJson(subWaste)).contentType(APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
    }
    @Test
    public void testUpdateSubWaste() throws Exception {
        Employee subWaste = getSubWaste();
        doNothing().when(SubWasteController).updateSubWaste(subWaste);
        mvc.perform(put("/subWaste").content(asJson(subWaste)).contentType(APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();
    }
    private SubWaste getSubWaste() {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter Name: ");String name=scan.next();
        System.out.print("Waste Category: ");String wasteCategory=scan.next();
        String description="";
        do{
            System.out.print("description: ");String line=scan.nextLine();
            description+=line;
        }while(scan.hasNextLine());
         String tips="";
        do{
            System.out.print("tips: ");String line=scan.nextLine();
            tips+=line;
        }while(scan.hasNextLine());

        System.out.print("materialType: ");String materialType=scan.nextLine();
        System.out.print("rycle: ");String rycle= scan.next();
        SubWaste subWaste= new SubWaste(name,
                wasteCategory,
                description,
                tips,
                materialType,
                rycle);
        return subWaste;
    }
    private static String asJson(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


