class Add {
    static int max(int a, int b){
        if (a > b){
            return a; 
        }
        else {
            return b;
        }

    }


public static void main(String [] args) {
    int result = max(7, 51);
    System.out.println(result);
}
}