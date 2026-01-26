class arrayex1d{
    public static void main(String args[]){
        int month_days[];//create null set for array
        month_days=new int[3];
        //assign values 
        month_days[0]=30;
        month_days[1]=28;
        month_days[2]=30;
        System.out.println("Feb has" +month_days[1]+"days.");

        //Even directly also declared the vlues of array

        int months_days[]={30,31,30};
        System.out.println("March has"+months_days[2]+"days");
    }
}