package service;

import entity.SubWaste;
import entity.WasteCategory;
import org.springframework.beans.factory.annotation.Autowired;
import repository.SubWasteRepository;

import java.util.ArrayList;
import java.util.List;

public class SubWasteService {
    @Autowired
    SubWasteRepository SubWasteRepository;
    public SubWaste getSubWasteId(int id) {
        return resipotory.findAll(id);
    }
    public List<SubWaste> getSubWaste(){
        List<SubWaste> sub_was_List= new ArrayList<>();
        repository.findAll().foreach(subWaste.wast_c_List.add(subWaste));
        return sub_was_List;
    }
    public void saveOrUpdate(SubWaste subWaste) {
        repository.save(subWaste);
    }
    public void deleteWasteCatergoryById(int id) {
        return repository.deleteById(id);
    }
}
