package com.pbl.internjava.practice2;

public class GoodsManager {
    private Goods[] goodsList;
    private int count;

    public GoodsManager(int size) {
        goodsList = new Goods[size];
        count = 0;
    }

    public boolean addGoods(Goods item) {
        for (int i = 0; i < count; i++) {
            if (goodsList[i].getProductCode().equals(item.getProductCode())) {
                System.out.println("Duplicate product code!");
                return false;
            }
        }
        if (count < goodsList.length) {
            goodsList[count++] = item;
            System.out.println("Added successfully!");
            return true;
        }
        System.out.println("List is full!");
        return false;
    }

    public void displayAll() {
        System.out.println("=== INVENTORY LIST ===");
        for (int i = 0; i < count; i++) {
            goodsList[i].displayInfo();
        }
    }
}

