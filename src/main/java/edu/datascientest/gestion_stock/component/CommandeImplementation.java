package edu.datascientest.gestion_stock.component;

import org.springframework.stereotype.Component;

@Component
public class CommandeImplementation implements Commande {

	private Stock stock;

	public CommandeImplementation() {
		System.out.println("Constructeur CommandeImplementation");
	}

	@Override
	public Stock setStock(Stock stock) {
		this.stock = stock;
		return null;
	}

	@Override
	public Stock getStock() {
		return null;
	}

	@Override
	public void passerCommande(int idArticle, int quantite) {
		try {
			if (stock.idArticleDisponible(idArticle, quantite)) {
				stock.removeArticle(idArticle, quantite);
			} else {
				System.out.println("Pas de stock");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
