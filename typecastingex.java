class typecastingex{
    public static void main(String args[]){
        int a=100;
        byte b;
        double c=34.5;
        System.out.println("Converting int to byte :");
        b=(byte) a;
        System.out.println(b);
        System.out.println("converting double to byte:");
        b=(byte) c;
        System.out.println(b);
        System.out.println("converting double to int:");
        a=(int) c;
        System.out.println(a);
        System.out.println("converting int to  double:");
        c=(double) a;
        System.out.println(c);
        System.out.println("converting double to byte:");
        b=(byte) c;
        System.out.println("Its come error");
    }
}