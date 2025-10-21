package com.pbl.internjava.practice2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GoodsManager manager = new GoodsManager(10);

        Food food = new Food("F01", "Milk", 20, 1.5,
                LocalDate.of(2025, 9, 1),
                LocalDate.of(2025, 10, 10),
                "Vinamilk");

        Electronics tv = new Electronics("E01", "TV Samsung", 2, 500.0, 24, 0.8);
        Crockery bowl = new Crockery("C01", "Bowl", 60, 2.0, "Minh Long", LocalDate.of(2025, 10, 1));

        manager.addGoods(food);
        manager.addGoods(tv);
        manager.addGoods(bowl);

        manager.displayAll();
    }
}
