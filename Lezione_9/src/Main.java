
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import classes.*;

public class Main {
	
	public static Logger Log = LoggerFactory.getLogger(Main.class);
	
	static List<Product> productList = new ArrayList<Product>();
	static List<Order> orderList = new ArrayList<Order>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product(1, "Guida Zelda", "Books", 50.00);
		Product p2 = new Product(2, "Pala", "Boys", 10.00);
		Product p3 = new Product(3, "Ciuccio", "Baby", 2.00);
		Product p4 = new Product(4, "Bicicletta", "Boys", 350.00);
		Product p5 = new Product(5, "Zelda videogioco", "Boys", 70.00);
		Product p6 = new Product(6, "Tomo del sapere", "Books", 150.00);
		Product p7 = new Product(7, "Culla", "Baby", 400.00);
		Product p8 = new Product(8, "Pannolini", "Baby", 4.00);
		Product p9 = new Product(9, "Harry Potter", "Books", 110.00);
		Product p10 = new Product(10, "LOTR", "Books", 150.00);
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);
		productList.add(p6);
		productList.add(p7);
		productList.add(p8);
		productList.add(p9);
		productList.add(p10);
		
		Customer c1 = new Customer(1, "Pippo", 2);
		Customer c2 = new Customer(2, "Pluto", 1);
		Customer c3 = new Customer(3, "Qui", 3);
		Customer c4 = new Customer(4, "Quo", 2);
		Customer c5 = new Customer(5, "Qua", 1);
		
		Order o1 = new Order(1, "Spedito", LocalDate.of(2021, 1, 25), LocalDate.of(2021, 01, 26), productList, c5);
		
		
		//ESERCIZIO 1
		System.out.println("ESERCIZIO 1");
		Stream<Product> elementoLista = productList.stream();
		Stream<Product> elementoListaFiltratoPrezzo = elementoLista.filter(ele -> ele.getPrice() > 100);
		Stream<Product> elementoListaFiltratoLibro = elementoListaFiltratoPrezzo.filter(ele -> ele.getCategory().equals("Books"));
		List<Product> productListFiltrati = elementoListaFiltratoLibro.collect(Collectors.toList());
		System.out.println(productListFiltrati);
		
		//ESERCIZIO 2
		System.out.println("ESERCIZIO 2");
		
		//ESERCIZIO 3
		System.out.println("ESERCIZIO 3");
		
		//ESERCIZIO 4
		System.out.println("ESERCIZIO 4");
	}

}
