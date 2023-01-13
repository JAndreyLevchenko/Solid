package com.java;

public class Computer {
    String name;
    int memory_size;

    public Computer(String name, int memory_size) {
        this.name = name;
        this.memory_size = memory_size;
    }

    public void setData(String name){
        this.name = name;
    }
}
//    public void save(){
//        System.out.println("Сохранения обьекта класса в файл");
//    }
//    public void load(){
//        System.out.println("Загрузка обьекта класса из файла");
//    }
//}
