public class OperadoresLogicos {
    public static void main(String[] args) {

        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r, r1, r2, r3;

        r = (x<y && y<z)?true:false;
        System.out.println(r);

        r1 = (x<y || y<z)?true:false;
        System.out.println(r1);

        r2 = (x<y ^ y<z)?true:false;
        System.out.println(r2);

        r3 = (y==z)?true:false;
          System.out.println(r3);


    }
}
