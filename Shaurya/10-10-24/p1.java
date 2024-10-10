class p1 {
    public static void main(String[] args) {   
        // for(int i = 1; i <= 6; ++i) {
        //     char ch = 'A';
        //     for(int j = 1; j <= i; ++j) {
        //         System.out.print(ch + " ");
        //         ch += 1;
        //     }
        //     System.out.println();
        // }

        for(char i = 'A'; i <= 'F'; ++i) {
            for(char j = 'A'; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}