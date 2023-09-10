package za.ac.cput.service.impl;
import za.ac.cput.domain.Category;
import za.ac.cput.repository.impl.CategoryRepository;
import za.ac.cput.service.CategoryService;

import java.util.Set;
public class CategoryServiceImpl implements CategoryService {

    private static CategoryServiceImpl service = null;
    private CategoryRepository repository = null;

    private CategoryServiceImpl(){
        repository = CategoryRepository.getRespository();
    }

    public static CategoryServiceImpl getService(){
        if (service==null){
            service = new CategoryServiceImpl();
        }
        return service;
    }

    @Override
    public Category create(Category category) {
        Category created = repository.create(category);
        return created;
    }

    @Override
    public Category read(String categoryId) {
        Category read = repository.read(categoryId);
        return read;
    }

    @Override
    public Category update(Category category) {
        Category updated = repository.update(category);
        return updated;
    }

    @Override
    public boolean delete(String categoryId) {
        boolean success = repository.delete(categoryId);
        return success;
    }

    @Override
    public Set<Category> getAll() {
        return repository.getAll();
    }
}
