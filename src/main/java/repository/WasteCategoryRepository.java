package repository;

import entity.WasteCategory;
import org.springframework.data.repository.CrudRepository;

public interface WasteCategoryRepository  extends CrudRepository<WasteCategory, Long> {
}
