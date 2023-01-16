package presentation;

import entities.EntierNaturel;
import exception.NombreNegatifException;

public class Application {
    public static void main(String[] args) {
        try {
            EntierNaturel en1 = new EntierNaturel(-1);
            en1.decrementer();
            System.out.println(en1.getVal());
        }catch (NombreNegatifException e){
            System.out.println(e.getMessage());        }
    }
}
