package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProducService {
    private final List<Product> products;

    public ProductServiceImpl() {
        //Tạo list ảo chứa danh sách các đối tượng cần để tương tác
        this.products = new ArrayList<>();
        products.add(new Product(1, "KIA", 100, "Car"));
        products.add(new Product(2, "Hyundai",120, "Car"));
        products.add(new Product(3, "Toyota", 80, "Car"));
        products.add(new Product(4, "Ford", 130, "Car"));
        products.add(new Product(5, "Chevrolet", 70, "Car"));
    }

    @Override
    public List<Product> show() {
        return products;
    }

    @Override
    public void create(Product product) {
        products.add(product);
    }

    @Override
    public Product searchById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId() == id){
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public void updateById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.set(id, products.get(i));
            }
        }
    }
        @Override
    public void deleteById(int id) {
        Product product = searchById(id);
        if(product != null) {
            products.remove(product);
        }
    }
}
