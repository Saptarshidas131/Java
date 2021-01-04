class function_return {
    public static void main(String[] args){
        int sum = additionParams(30,40);
        System.out.println(sum);
    }

    public static int additionParams(int a, int b) {

        int sum = a + b;
        return sum;
    }
}
