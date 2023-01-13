package com.java;

public class Main {

    public static void main(String[] args) {
    ModelForm f = new ModelForm(1, 30, "Вася Пупкин");
    WebFramework w = new WebFramework();
    w.save(f);
    }

}
//        Computer comp = new Computer("IBM XT", 5000);
////            SaveInterface saver = new SaveComputerToFile();
////            saver.save("out.dat", comp);
//        test();
//    }
//
//    public static void test() {
//        Computer comp = new Computer("IBM XT", 5000);
//        Computer comp2 = new OmenHP("OmenHP", 5000);
//
//        comp2.setData("IBM XT");
//        if (comp.name.compareTo(comp2.name)== 0 && comp.memory_size == comp2.memory_size){
//            System.out.println("Test ok");
//        }
//        else {
//            System.out.println("Test false");
//        }
//    }
//}