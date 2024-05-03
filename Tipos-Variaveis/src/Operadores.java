public class Operadores {
    public static void main(String[] args) {
        //classe Operadores.java
        //x repetição

        String nomeUm = "Ramon";
        String Nomedois = new String("Ramon");
            System.out.println(nomeUm.equals(Nomedois));

        int numero1 = 2;
        int numero2 = 2;

        boolean SimNao = numero1 == numero2;
            System.out.println("numero 1 é igual a numero 2? " + SimNao);

        SimNao = numero1 != numero2;
            System.out.println("O numero 1 é diferente do numero 2? " + SimNao);
        
        SimNao = numero1 > numero2;
            System.out.println("O numero 1 é maior que o numero 2? " + SimNao);

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

        if (numero1 == numero2){
            System.out.println("Numero 1  é igual ao numero 2");
        }


        
            


    }
    
}
