/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab9.exercise1;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.*;
import java.util.Map;
import yahoofinance.*;

/**
 *
 * @author mihai.hulea
 */
public class Main {
    public static void main(String[] args) throws Exception {
  
    Stock stock = YahooFinance.get("INTC");
 
    BigDecimal price = stock.getQuote().getPrice();
    BigDecimal change = stock.getQuote().getChangeInPercent();
    BigDecimal peg = stock.getStats().getPeg();
    BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();

    stock.print();
    System.out.println("*************************************");
    String[] symbols = new String[] {"INTC", "BABA", "TSLA", "AIR.PA", "YHOO"};
    Map<String, Stock> stocks = YahooFinance.get(symbols); // single request
    Stock intel = stocks.get("INTC");
    Stock airbus = stocks.get("AIR.PA");
    
    intel.print();
    System.out.println("*************************************");
    airbus.print();
            
    }
}
