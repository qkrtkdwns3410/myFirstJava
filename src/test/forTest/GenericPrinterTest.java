package test.forTest;

import java.lang.reflect.ParameterizedType;


/**
 * packageName    : test.forTest
 * fileName       : GenericPrinterTest
 * author         : letscombine
 * date           : 2022-01-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-19        letscombine       최초 생성
 */


public class GenericPrinterTest {
      public static void main(String[] args) {
            GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();

            powderGenericPrinter.setMatherial(new Powder());
            Powder powder = powderGenericPrinter.getMatherial();
            System.out.println("powderGenericPrinter = " + powderGenericPrinter);

            System.out.println("========================");

            GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>();

            plasticGenericPrinter.setMatherial(new Plastic());
            Plastic plastic = plasticGenericPrinter.getMatherial();
            System.out.println("plasticGenericPrinter = " + plasticGenericPrinter);


      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    