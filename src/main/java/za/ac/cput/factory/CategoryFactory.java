package za.ac.cput.factory;

import za.ac.cput.domain.Category;
import za.ac.cput.util.Helper;

public class CategoryFactory {
    public static Category createCategory (String description, int truckSize, String truckType) {
        if (Helper.isNullorEmpty(description)|| Helper.isNullorEmpty(truckType))
            return null;
        String categoryId = Helper.generateId();
        return Category.builder()
                .id(categoryId)
                .description(description)
                .truckSize(truckSize)
                .truckType(truckType).build();
    }
}
