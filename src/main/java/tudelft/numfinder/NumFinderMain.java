package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        nf.find(new int[] {4, 25, 7, 9});

        // this crashes
        nf.find(new int[] {3, 4, 2, 1});
//SE ARREGLO CAMBIANDO LA POSICION DEL 3 CON EL 4
        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
