package com.csys.template.factory;
import com.csys.template.domain.Stock;
import com.csys.template.domain.StockHistory;
import com.csys.template.dto.StockDTO;
import com.csys.template.dto.StockHistoryDTO;
import org.springframework.security.core.context.SecurityContextHolder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StockFactory {

    public static String getUserAuthenticated() {
        String user;
        if (SecurityContextHolder.getContext().getAuthentication() != null) {
            user = SecurityContextHolder.getContext().getAuthentication().getName();
        } else {
            user = "anonymousUser";
        }
        return user;
    }

    public static StockDTO stockToStockDTO(Stock stock){
        StockDTO stockDTO = new StockDTO();
        stockDTO.setId(stock.getId());
        stockDTO.setBlood(stock.getBlood());
        stockDTO.setCode(stock.getCode());
        stockDTO.setCodedonateur(stock.getCodedonateur());
        stockDTO.setUserCreate(stock.getUserCreate());
        LocalDate d= stock.getDateCreate();
        String x=d.toString();
        stockDTO.setDateCreate(x);
        stockDTO.setDateperime(stock.getDateperime());


        return stockDTO;

    }

    public static StockHistoryDTO stockToStockHistoryDTO(StockDTO stock){
        StockHistoryDTO stockDTO = new StockHistoryDTO();
        stockDTO.setCode(stock.getCode());
        stockDTO.setBlood(stock.getBlood());
        stockDTO.setCodedonateur(stock.getCodedonateur());
        stockDTO.setUserCreate(stock.getUserCreate());
        stockDTO.setDateCreate(stock.getDateCreate());
        stockDTO.setDateperime(stock.getDateperime());
        stockDTO.setService("Add");


        return stockDTO;

    }
    public static StockHistoryDTO DELstockToStockHistoryDTO(StockDTO stock){
        StockHistoryDTO stockDTO = new StockHistoryDTO();
        stockDTO.setCode(stock.getCode());
        stockDTO.setBlood(stock.getBlood());
        stockDTO.setCodedonateur(stock.getCodedonateur());
        stockDTO.setUserCreate(stock.getUserCreate());
        stockDTO.setDateCreate(stock.getDateCreate());
        stockDTO.setDateperime(stock.getDateperime());
        stockDTO.setService("Remove");


        return stockDTO;

    }

    public static Stock stockDTOToStock(StockDTO stockDTO){
        Stock stock = new Stock();
        LocalDate d = LocalDate.now();
        String  x =d.toString();
        String [] tab = x.split("-");
        Integer y= Integer.parseInt(tab[1]);
        Integer z=Integer.parseInt(tab[0]);
        y=y+3;
        if (y>12)
        {
            y=y-12;
            z=z+1;
        }
        tab[0]=z.toString();
        tab[1]=y.toString();
        String v= tab[0]+"-"+tab[1]+"-"+tab[2];

        stock.setId(stockDTO.getId());
        stock.setBlood(stockDTO.getBlood());
        stock.setCode(stockDTO.getCode());
        stock.setCodedonateur(stockDTO.getCodedonateur());
        stock.setUserCreate(getUserAuthenticated());
        stock.setDateCreate(d);
        stock.setDateperime(v);


        return stock ;
    }

    public static List<StockDTO> stocksToStocksDTO(List<Stock> stocks){
        List<StockDTO> stockDTOS = new ArrayList<StockDTO>();
        for(Stock patient : stocks){
            stockDTOS.add(stockToStockDTO(patient));
        }
        return stockDTOS;
    }

    public static List<Stock> stocksDTOToStocks(List<StockDTO> stockDTOS){
        List<Stock> stocks = new ArrayList<Stock>();
        for(StockDTO stockDTO : stockDTOS){
            stocks.add(stockDTOToStock(stockDTO));

        }
        return stocks;
    }
}
