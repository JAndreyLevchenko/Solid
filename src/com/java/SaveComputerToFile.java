package com.java;

public class SaveComputerToFile implements SaveInterface {
    public void save(String path, Computer cmp) {
        System.out.println("Сохранение в файл " + path + ", " + cmp);
    }
}



