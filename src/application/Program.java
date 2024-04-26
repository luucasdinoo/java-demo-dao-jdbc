package application;

import model.dao.DaoFactory;
import model.dao.ISellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {

        ISellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Teste 1: Seller findByID =====");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("\n=== Teste 1: Seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }
    }
}
