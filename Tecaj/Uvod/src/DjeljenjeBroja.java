public class DjeljenjeBroja {
    public static void  main(String[] args){
        int dij = 0;
        for(int i = 0; i <= 33; i = i + 3){
            if(i % 3 == 0) {
                dij = dij + i;
            }
        }
        System.out.println("Verzija 1:\n");
        System.out.println("Zbroj brojeva djeljivih sa 3 je: " + dij);
    }
}