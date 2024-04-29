package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class SubWaste extends WasteCategory{
        @Id
        @GeneratedValue(strategy=@Generated.Auto)
        public long id;
        @Column
        public String name;
        //public String WasteCategory;
        @Column
        public String description;
        @Column
        public String tips;
        @Column
        public String materialType;
        @Column
        public String rycle;
        @Column
        public long fk_id;
        public SubWaste(){
            super();
            name=null;
            description=null;
             tips=null;
             materialType=null;
             rycle=null;
             //fk_id=null;
        }
        public SubWaste(String name, String wasteCategory, String description, String tips, String materialType, String rycle) {
            super(wasteCategory);
            this.name=name;
            this.description = description;
            this.tips = tips;
            this.materialType = materialType;
            this.rycle = rycle;
            super.id = fk_id;
    }

        public String getDescription() {
                return description;
        }

        @Override
        public String getWaste_Category() {
                return super.getWaste_Category();
        }

        @Override
        public long getId() {
                return id;
        }

        public long getFk_id() {
                return fk_id=getId();
        }

        public String getName() {
                return name;
        }

        public String getRycle() {
                return rycle;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public void setMaterialType(String materialType) {
                this.materialType = materialType;
        }

        public void setTips(String tips) {
                this.tips = tips;
        }

        public String getMaterialType() {
                return materialType;
        }

        public void setRycle(String rycle) {
                this.rycle = rycle;
        }

        public void setName(String name) {
                this.name = name;
        }
}
