package Week_2;
class SwapWithoutTemp {
    public static void main(String[] args) {
        int a,b;
        a = 10;
        b = 20;
        a = a + b; //a = 10 + 20, a = 30
        b = a - b; //b = 30 - 20, b = 10
        a = a - b; //a = 30 - 10, a = 20
        System.out.println(a);
        System.out.println(b);

    }
    
}
