/**
 * Created by a13davidtm on 10/03/2015.
 */
public class HiloA extends Thread {
    @Override
    public void run() {
        for(int i=0 ; i<30 ; i++){
            System.out.print("NO");
        }
    }
}
