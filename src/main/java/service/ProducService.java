package service;

import model.Product;

import java.util.List;

public interface ProducService<E> {
    List<E> show(); // trả về danh sách tất cả các sản phẩm
    void create(Product product); //tạo sản phẩm
    Product searchById(int id); //Tìm sản phẩm theo id
    void updateById(int id); // Update sản phẩm theo id
    void deleteById(int id); //Xóa sản phẩm theo id



}
