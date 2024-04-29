package service;
import entity.WasteCategory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class WasteCategoryService {
    @Autowired
    WasteCategoryRepository repository;
    public WasteCatergory getWastCategoryId(int id) {
        return resipotory.findAll(id);
    }
    public List<WasteCategory> getWasteCatergory(){
        List<WasteCategory> wast_c_List= new ArrayList<>();
        repository.findAll().foreach(wasteCategory.wast_c_List.add(wasteCategory));
        return wast_c_List;
    }
    public void saveOrUpdate(WasteCatergory wasteCategory) {
        repository.save(wasteCategory);
    }
    public void deleteWasteCatergoryById(int id) {
        return repository.deleteById(id);
    }

}
