package edu.datascientest.gestion_stock.component;

public interface Commande {
	Stock setStock(Stock stock);
	Stock getStock();
	void passerCommande(int idArticle, int quantite);

}

