class parawithreturn {
    static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        int res = add(10, 20);

        System.out.println(res);
    }
}