class twodarray{
    public static void main(String args[]){
        int marks[][]={
            {1,2,3},//studenr 1
            {4,5,6}//student 2
        };

        System.out.println("The student 2 marks of subject 3 is :" +marks[1][2]);
        int i,j;
        for(i=0;i<marks.length;i++){
            for(j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j] + " ");
            }
        }
        System.out.println();
    }
}