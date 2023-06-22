package edu.datascientest.gestion_stock.component;

import org.springframework.stereotype.Component;

import edu.datascientest.gestion_stock.exception.StockException;

@Component
public class StockImplementation implements Stock {

    @Override
    public void addStock(int idArticle, int quantity) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public boolean idArticleDisponible(int idArticle, int quantity) {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public void removeArticle(int idArticle, int quantity) throws StockException {
	// TODO Auto-generated method stub
	
    }

	
}
