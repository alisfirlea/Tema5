public class Main {

    public static void main(String[] args) {
        //Se da un sir de numere, sa se afiseze sirul dublat,maximul,minimul si suma lor
        int[] sir ={5,6,7,22,5,11,1,4};
        int[] sirDublat=new int[sir.length];
        //Sir dublat
        for (int i = 0; i <sir.length ; i++) {
            sirDublat[i]=sir[i]*2;

        }
        for (int i = 0; i <sirDublat.length ; i++) {

            System.out.println(sirDublat[i]);
        }
        //Gasit maxim
        int maxim=sir[0];
        for (int i = 0; i <sir.length ; i++) {
            if(maxim<sir[i]) maxim=sir[1];

        }
        System.out.println("Numarul maxim este "+maxim);
        //Suma elementelor din sir
        int suma=0;
        for (int k = 0; k <sir.length ; k++) {
            suma=suma+sir[k];


        }
        System.out.println("Suma este "+suma);
        //Gasit minim
        int minim=sir[0];
        for (int j = 0; j <sir.length; j++) {
            if(sir[j] <minim)
                minim=sir[j];

        }
        System.out.println("Numarul minim este "+minim);

    }
}
