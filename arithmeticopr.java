class arithmeticopr{
    public static void main(String aegs[]){
        int a=20;
        int b=10;
        int add,sub,multi,div;
        //arithmetic opertor
        add=a+b;
        System.out.println("Addition of 2 number:"+add);
        sub=a-b;
        System.out.println("subtraction of 2 number:"+sub);
        multi=a*b;
        System.out.println("Multiplication of 2 number:"+multi);
        div=a/b;
        System.out.println("Division of 2 number:"+div);

        //assignment operator
        System.out.println("Addition assignment\n");
        System.out.println(a+=b);
        System.out.println("Subtraction assignment\n");
        System.out.println(a-=b);
        System.out.println("Multiplication assignment\n");
        System.out.println(a*=b);
        System.out.println("Division assignment\n");
        System.out.println(a/=b);

        //unary operator
        System.out.println("postIncrement Oporator:");
        System.out.println(a++);
        System.out.println("present value of a");
        System.out.println(a);
        System.out.println("post Decrement Oporator:");
        System.out.println(a--);
        System.out.println("present value of a");
        System.out.println(a);
        System.out.println("pre Deccrement Oporator:");
        System.out.println(--a);
        System.out.println("pre Increment Oporator:");
        System.out.println(++a);
    }
}