package controller;

import model.Product;
import service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/ProductServlet")
//anotation @WebServlet để đánh dấu đây là một Servlet
//value hoặc urlPattern: để định danh đường dẫn đến Servlet


public class ProductServlet extends HttpServlet {
    //Tạo đối tượng service thao tác với CSDL, xử lý các request
    private ProductServiceImpl service;

    public ProductServlet() {
        this.service = new ProductServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Nhằm quy định về hành động đang yêu cầu từ phía Client
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action) {
            case "show":
                break;
            case "create":
                break;
            case "searchById":
                break;
            case "updateById":
                break;
            case "deleteById":
                break;
            default:
                displayListProduct(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action) {
            case "show":
                break;
            case "create":
                break;
            case "searchById":
                break;
            case "updateById":
                break;
            case "deleteById":
                break;
        }
    }

    private void displayListProduct(HttpServletRequest request, HttpServletResponse reponse) {
        //Nhận về danh sách sản phẩm và chuyển sang list.jsp để hiển thị
        List<Product> products = this.service.show();
        request.setAttribute("products", products); //Thông tin đính kèm khi reponse sang client
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/list.jsp"); // Để chuyển tiếp yêu cầu từ một servlet sang một servlet or jsp khác sử dụng RequestDispatcher
        try {
            dispatcher.forward(request, reponse); //Tài nguyên được xử lý và trả lại kết quả cho client
        } catch (ServletException |IOException e) {
            e.printStackTrace();
        }
    }

    private void createNew(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        String category = request.getParameter("category");
        RequestDispatcher dispatcher;

    }

    private void delete(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.service.searchById(id);
        RequestDispatcher dispatcher;
        if(product == null) {
            dispatcher = request.getRequestDispatcher("view/err.jsp");
        }
        else {
            service.deleteById(id);
            try {
                response.sendRedirect("/ProductServlet");
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



