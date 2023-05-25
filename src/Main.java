class Main{
    public static void main(String[] args) {
        int a = 1000 * 1000;
//        System.out.println(a);
        System.out.println(punishment(2));
    }
    public static boolean punishment(int num){
//        for(int i  =1; i <= 1000; i++){
                if(check(Integer.toString(9 * 9), "" ,  (9))){
                    System.out.println(true);
                    System.out.println(flag);
                    flag = false;
                }

//        }
        return false;
    }

    private static boolean check(String one, String two , int target) {
        for(int i = 0; i < one.length(); i++) {
            for(int j = 0; j < one.length() - i; j++) {

                int num = 0;
                StringBuilder s= new StringBuilder();
                for(int k = i; k < j; k++) {
//                    System.out.print();
                    s.append(one.charAt(k));
                    num += one.charAt(k) - '0';
                    if( num == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static boolean flag = false;
}