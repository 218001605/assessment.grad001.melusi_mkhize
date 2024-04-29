package entity;

import jakarta.persistence.*;

@Entity
/*@Table(name = "WasteCategory", indexes = {
        @Index(name = "idx_wastecategory_id", columnList = "id")
})*/
@Table
public class WasteCategory {
    @Id
    @GeneratedValue(strategy =@GeneratedValue.AUTO)
    @Column
    public long id;
    @Column
    public String waste_Category;


    public WasteCategory(String wasteCategory){
         this.wasteCategory=wasteCategory;
     }

    public WasteCategory() {
        waste_Category=null;
    }

    public long getId() {
        return id;
    }

    public String getWaste_Category() {
        return waste_Category;
    }

    public void setWaste_Category(String waste_Category) {
        this.waste_Category = waste_Category;
    }
}
