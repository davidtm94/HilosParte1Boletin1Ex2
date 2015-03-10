public class Main {
/*
* Vamos a hacer un programa similar al anterior pero instanciando 2 threads.
En el HiloA mostrará el mensaje NO, hasta un maximo de 30 veces
En el HiloB mostrará el mensaje YES, hasta un máximo de 30 veces
En el programa principal mostrará un mensaje “Ejecución en HiloA” y se ejecutará el
HiloA; luego mostrará un mensaje “Ejecución en HiloB” y se ejecutará el HiloB; y luego un
mensaje “Ejecución en main”
* */
    public static void main(String[] args) {
        HiloA fioA=new HiloA();
        HiloB fioB=new HiloB();
        System.out.println("Ejecucion en HiloA");
        fioA.start();
        System.out.println("Ejecucion en HiloB");
        fioB.start();
        System.out.println("Ejecucion en main");
    }
}
