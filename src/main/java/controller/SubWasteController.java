package controller;

import entity.SubWaste;
import entity.WasteCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.SubWasteService;

import java.util.List;

@RestController
@RequestMapping(path="/SubWaste")
public class SubWasteController {
    @Autowired
    SubWasteService subWasteService;
    public List<SubWaste> getAllSubWaste(){
        return subWasteService.getAllSubWasteService();
    }
    @GetMapping("/subWaste/{id}")
    public SubWaste getSubWaste(@PathVariable("id") int id) {
        return SubWasteService.getSubWasteById(id);
    }
    @DeleteMapping("/subWaste/{id}")
    public void deleteEmployee(@PathVariable("id") int id) {
        wasteCategoryService.deleteSubWasteById(id);
    }
    @PostMapping("/subWaste")
    public void addSubWaste(@RequestBody SubWaste subWaste) {
        SubWasteService.save(subWaste);
    }
    @PutMapping("/subWaste")
    public void updateSubWaste(@RequestBody SubWaste subWaste) {
        SubWasteService.save(subWaste);
    }
}
