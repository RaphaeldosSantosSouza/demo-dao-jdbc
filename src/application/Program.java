package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "TI");
		
		Seller seller = new Seller(23, "Henri", "henri@gmail.com", new Date(), 4000.0, obj);
		
		System.out.println(seller);
	}

}
