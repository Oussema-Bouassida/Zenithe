package com.csys.template.service;
import com.csys.template.domain.Stock;
import com.csys.template.dto.CounterDTO;
import com.csys.template.dto.StockDTO;
import com.csys.template.dto.StockHistoryDTO;
import com.csys.template.factory.StockFactory;
import com.csys.template.repository.StockRepository;
import com.google.common.base.Preconditions;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StockService {
    private final StockRepository stockRepository;
    private final CounterService counterService;
    private final StockHistoryService stockHistoryService;

    public StockService(StockRepository stockRepository, CounterService counterService, StockHistoryService stockHistoryService) {
        this.stockRepository = stockRepository;
        this.counterService = counterService;
        this.stockHistoryService = stockHistoryService;
    }

//    @Transactional(readOnly = true)
//    public List<StockDTO> findAll(){
//        List<Stock> stocks = stockRepository.findAll();
//        return StockFactory.stocksToStocksDTO(stocks);
//    }

//    @Transactional(readOnly = true)
//    public StockDTO findStockByCode(String code) {
//        Stock stock = stockRepository.findBycode(code);
//        com.csys.template.util.Preconditions.checkBusinessLogique(stock != null,"stock does  Not found!");
//        StockDTO stockDTO = StockFactory.stockToStockDTO(stock);
//
//        return stockDTO;
//    }

    @Transactional(readOnly = true)
    public StockDTO findStockByCode(String code) {
        Stock stock = stockRepository.findBycode(code);
        com.csys.template.util.Preconditions.checkBusinessLogique(stock != null,"stock does  Not found!");
        StockDTO stockDTO = StockFactory.stockToStockDTO(stock);

        return stockDTO;
    }

    @Transactional(readOnly = true)
    public List<StockDTO> findAll(Specification<Stock> stockSpecification) {
        List<Stock> stocks = stockRepository.findAll(stockSpecification);
        com.csys.template.util.Preconditions.checkBusinessLogique(stocks != null, "error.couldn't-find-stock");
        List<StockDTO> stockDTOS = StockFactory.stocksToStocksDTO(stocks);

        return stockDTOS;
    }

    @Transactional(readOnly = true)
    public StockDTO findStockByblood(String blood) {
        Stock stock = stockRepository.findByblood(blood);
        com.csys.template.util.Preconditions.checkBusinessLogique(stock != null,"stock does  Not found!");
        StockDTO stockDTO = StockFactory.stockToStockDTO(stock);

        return stockDTO;
    }
    @Transactional
    public StockDTO addStock(StockDTO stockDTO){
        Preconditions.checkArgument (stockDTO != null, "Stock added!");
        CounterDTO counter = counterService.findCounterByType("stock");
        stockDTO.setCode(counter.getPrefix()+counter.getSuffix());
        counter.setSuffix(counter.getSuffix()+1);
        counterService.updateCounter(counter);
        StockHistoryDTO stockHistoryDTO= StockFactory.stockToStockHistoryDTO(stockDTO);
        stockHistoryService.addStockHistory(stockHistoryDTO);
        Stock d =stockRepository.save(StockFactory.stockDTOToStock(stockDTO));
        return StockFactory.stockToStockDTO(d);
    }
    @Transactional
    public StockDTO remove(String code){
        Stock stock = stockRepository.findBycode(code);
        StockDTO stockDTO =StockFactory.stockToStockDTO(stock);
        StockHistoryDTO stockHistoryDTO= StockFactory.DELstockToStockHistoryDTO(stockDTO);
        stockHistoryService.addStockHistory(stockHistoryDTO);
        stockRepository.deleteById(stock.getId().toString());

        return stockDTO;
    }

}
