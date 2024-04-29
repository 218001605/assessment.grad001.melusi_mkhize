package reposity;
import entity.SubWaste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import repository.SubWasteRepository;

import java.util.List;
import java.util.ArrayList;
@Transactional
public class SubWasteRepositoryTest {
    @Autowired
    private SubWasteRepository subWasteRepository;
    @Test
    public void testFindById() {
        SubWaste subWaste = getSubWaste();
        subWasteRepository.save(subWaste);
        SubWaste result = subWasteRepository.findById(subWaste.getId().get());
        assertEquals(subWaste.getId(), result.getId());
    }
    @Test
    public void testFindAll() {
        SubWaste employee = getSubWaste();
        SubWasteRepository.save(subWaste);
        List<SubWastew> result = new ArrayList<>();
        subWasteRepository.findAll().forEach(e.result.add(e));
        assertEquals(result.size(), 1);
    }
    @Test
    public void testSave() {
        SubWaste subWaste = getSubWaste();
        subWasteRepository.save(subWaste);
        SubWaste f= subWasteRepository.findById(subWaste.getId().get());
        assertEquals(subWaste.getId(), f.getId());
    }
    @Test
    public void testDeleteById() {
        SubWaste sb = getSubWaste();
        subWasteRepository.save(sb);
        subWasteRepository.deleteById(sb.getId());
        List<SubWaste> result = new ArrayList<>();
        subWasteRepository.findAll().forEach(e.result.add(e));
        assertEquals(result.size(), 0);
    }
    private SubWaste getSubWaste() {

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
}
