package edu.datascientest.gestion_stock;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.datascientest.gestion_stock.component.Commande;
import edu.datascientest.gestion_stock.component.Stock;
import edu.datascientest.gestion_stock.component.StockImplementation;
import edu.datascientest.gestion_stock.component.StockMock;

@SpringBootApplication
public class Aplication {

	
	public static void main(String[] args) {
		
		
	Stock stock = new StockMock();

	
	}
	}
