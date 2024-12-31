public class App {
    public static void main(String [] args){
        int i, j=0;
        for( i=0; i<2; i++){
            inner: for(j=i; j<3; j++){
                break inner;
            }
            System.out.println("i = " + i + "j = " + j);
        }
    }
}
