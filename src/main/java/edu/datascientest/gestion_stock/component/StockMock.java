package edu.datascientest.gestion_stock.component;

import edu.datascientest.gestion_stock.exception.StockException;

public class StockMock implements Stock {

	
	public StockMock() {
		super();
		System.out.println("Constructeur StockMock");
	}

	@Override
	public void addStock(int idArticle, int quantity) {

		System.out.println("addStock");
	}

	@Override
	public boolean idArticleDisponible(int idArticle, int quantity) {
		System.out.println("idArticleDisponible");
		return false;
	}

	@Override
	public void removeArticle(int idArticle, int quantity) throws StockException {
		System.out.println("removeArticle");
	}

}
