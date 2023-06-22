package edu.datascientest.gestion_stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.datascientest.gestion_stock.component.Commande;
import edu.datascientest.gestion_stock.component.Stock;

@SpringBootApplication
public class GestionStockApplication {

    private Stock stock;

    private Commande commande;

    @Autowired
    public GestionStockApplication(Stock stock, Commande commande) {
	this.stock = stock;
	this.commande = commande;
    }

    public static void main(String[] args) {
	SpringApplication.run(GestionStockApplication.class, args);
    };

}
