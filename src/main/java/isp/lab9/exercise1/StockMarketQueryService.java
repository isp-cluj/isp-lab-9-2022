/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab9.exercise1;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

/**
 * Use https://financequotes-api.com/ (https://github.com/sstrickx/yahoofinance-api) SDK for getting stock financial data.
 * 
 * @author mihai.hulea
 */
public class StockMarketQueryService extends AbstractTableModel {
     
     private String[] columns = new String[] {"Name","Symbol", "Price", "Currency", "Change", "Exchange"};
     private String[] symbols = new String[] {"INTC", "BABA", "TSLA", "AIR.PA", "MSFT", "AAPL"};     
     private Map<String, Stock> stocks = new HashMap<String, Stock>();
     private ArrayList<StockItem> items = new ArrayList<>();
    
     
     public void requestData() throws IOException{
         stocks = YahooFinance.get(symbols);
         items = new ArrayList<>();
         stocks.values().stream().forEach(s -> items.add(new StockItem(s)));
         this.fireTableDataChanged();
     }
     
     
     /**
      * Used to populate drop down button (Combo Box).
      * @return 
      */
     public String[] getSymbols(){
         return symbols;
     }
     
    //--------------------------------------------------------------
    @Override
    public int getRowCount() {
        return stocks.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StockItem i = items.get(rowIndex);
        
        switch(columnIndex){
            case 0:return i.getName();
            case 1:return i.getSymbol();
            case 2: if(i.getPrice()!=null) return i.getPrice().toPlainString(); else return "N/A";
            case 3:return i.getCurrency();
            case 4:return i.getChange().toPlainString()+"%";
            case 5:return i.getExchange();
        }
        return "N/A";
    }
    
    @Override
    public String getColumnName(int index) {
        return columns[index];
    }
     
}
