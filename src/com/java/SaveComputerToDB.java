package com.java;

public class SaveComputerToDB implements SaveInterface {
    public void save(String path, Computer cmp) {
        System.out.println("Сохранение в БД " + path + ", " + cmp);
    }
}

