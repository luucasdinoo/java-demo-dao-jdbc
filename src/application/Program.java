package application;

import model.dao.DaoFactory;
import model.dao.ISellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
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

        System.out.println("\n=== Teste 3: Seller findAll =====");
        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== Teste 4: Seller insert =====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Adicionado! novo ID= " + newSeller.getId());

        System.out.println("\n=== Teste 5: Seller update =====");
        seller = sellerDao.findById(1);
        seller.setName("Matha Waine");
        sellerDao.update(seller);
        System.out.println("Atualização finalizada! ");

    }
}
