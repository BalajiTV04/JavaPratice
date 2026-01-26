class datatypesex{
    public static void main(String args[]){
        int num;
        long days;
        long seconds;
        num=100;
        days=20;
        seconds=days*24*60*60;
        System.out.println("Integer datatyes Example");
        System.out.println("Num is:"+num);
        System.out.println("Seconds for 20 days is : " +seconds);

        double pi,area,r;
        r=10.6;
        pi=3.1416;
        area=pi*r*r;
        System.out.println("Floating data type Example");
        System.out.println("area of circle:" + area);

        char chr1,chr2;
        chr1=88;
        chr2='y';
        System.out.println("Character Datatype Example");
        System.out.println("chr1 and chr2 is :");
        System.out.println(chr1+" "+chr2);

        boolean b;
        b=false;
        System.out.println("Boolean datatype Example");
        System.out.println("b is :" + b);
        b=true;
        System.out.println("Updated value of b is :" +b);
    }
}