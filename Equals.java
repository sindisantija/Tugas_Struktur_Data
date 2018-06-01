
package equals;

public class Equals {

    public static void main(String[] args) {
        String st1="saya suka makan bakso";
        String st2="saya suka makan bakso";
        String st3="saya suka ";
        String st4="makan ";
        String st5="bakso";
        String st6=st3+st4+st5;
        
        System.out.println("statement 1 : " + st1);
        System.out.println("statement 2 : " + st2);
        System.out.println("statement 3 : " + st3);
        System.out.println("statement 4 : " + st4);
        System.out.println("statement 5 : " + st5);
        System.out.println("statement 6 : " + st6);
        System.out.println("");
        System.out.println("Membuktikan bahwa penggunaan == dan equals tidak selamanya nilainya sama");
        System.out.println("");
        System.out.println("gunakan ==");
        System.out.println("statement 6 == statement 1 : " + (st6==st1));
        System.out.println("statement 1 == statement 2 : " + (st1==st2));
        System.out.println("statement 6 == statement 2 : " + (st6==st2));
        System.out.println("");
        System.out.println("gunakan equals :");
        System.out.println("statement6.equals(statement1) : " + (st6.equals(st1)));
        System.out.println("statement1.equals(statement2) : " + (st1.equals(st2)));
        System.out.println("statement6.equals(statement2) : " + (st6.equals(st2)));
    }
    
}
