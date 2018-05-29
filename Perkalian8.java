
package perkalian8;

public class Perkalian8 {

    public static void main(String[] args) {
       int hasil1 = 0, hasil2 = 0, hasil3 = 0, awal1 = 0, awal2 = 0;
       
       System.out.println("Membuat Program Perkalian 8 dengan Perulangan");
       System.out.println("1. Menggunakan for");     
       for (int i=1;i<11;i++){
           hasil1 = i * 8;
           System.out.println(i + " x 8 = " + hasil1);
       }
       System.out.println("2. Menggunakan while");
       while (awal1<10){
           awal1 = awal1 + 1;
           hasil2 = awal1 * 8;
           System.out.println(awal1 + " x 8 = " + hasil2);
       }
       System.out.println("3. Menggunakan do while");
       do{
           awal2++;
           hasil3 = awal2 * 8;
           System.out.println(awal2 + " x 8 = " + hasil3);
       }while (awal2 < 10);
    }

    }
    

