package edu.datascientest.gestion_stock.component;

import edu.datascientest.gestion_stock.exception.StockException;


public interface Stock {

	
	void addStock(int idArticle, int quantity);
	boolean idArticleDisponible(int idArticle, int quantity);
	void removeArticle(int idArticle, int quantity) throws StockException;
	
}
