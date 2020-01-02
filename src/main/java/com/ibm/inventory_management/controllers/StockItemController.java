package com.ibm.inventory_management.controllers;

import java.util.ArrayList;
import java.util.List;

import com.ibm.inventory_management.services.StockItemApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockItemController {

    private final StockItemApi service;

    public StockItemController(StockItemApi service) {
        this.service = service;
    }

    @GetMapping(path = "/stock-items", produces = "application/json")
    public List listStockItems() {
        return this.service.listStockItems();
    }
}
