package controller;

import entity.WasteCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/waste")
public class WasteCategoryController {

    @Autowired
    WasteCategoryService wasteCategoryService;
    @GetMapping("/wasteCategory")
    public List<WasteCategory> getAllWasteCatergory(){
        return wasteCategoryService.getAllWasteCategory();
    }
    @GetMapping("/wasteCategory/{id}")
    public Employee getWasteCategory(@PathVariable("id") int id) {
        return WasteCategoryService.getWasteCategoryById(id);
    }
    @DeleteMapping("/wasteCatergory/{id}")
    public void deleteEmployee(@PathVariable("id") int id) {
        wasteCategoryService.deleteWasteCategoryById(id);
    }
    @PostMapping("/wasteCategory")
    public void addEmployee(@RequestBody WasteCategory wasteCategory) {
        wasteCategoryService.save(wasteCategory);
    }
    @PutMapping("/wasteCategory")
    public void updateWasteCategory(@RequestBody WasteCategory wasteCategory) {
        wasteCategoryService.save(wasteCategory);
    }
}
