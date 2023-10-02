public class File_5 {
    public static void main(String[] args) {
        int even = 0, odd = 0;
        for (int i = 1; i <=10; i++) {
            if ( i % 2 == 0 ) {
                even = even + 1;
            }
            else{
                odd = odd + 1;
            }

        }

        if (even > odd){
            System.out.println(" More even");
        } else if (odd < even) {
            System.out.println("More odd");
        } else {
            System.out.println("Equal");
        }
    }
}
