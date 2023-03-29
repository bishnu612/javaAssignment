package Array;

public class ArrayEx {

    public void displayArray() {

        int number[] = {1, 2, 3, 4, 5};

        int sum = 0;
       // for ( int j = 0; j < number.length; j++)
        //{
            //sum += number[j];
            //System.out.println("Sum of array is :" + sum);
        //}

        //for each loop
        for (int i:number) {
            sum = sum + number[i-1];
                    }
        System.out.println("Sum of array is :" + sum);
    }

    public void courseArray(){
        String[] course ={"java","c","c++"};

        for (String name:course){
            if(name.equals("c")){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
            System.out.println("Name of course is"+name);
                    }
        System.out.println(course[1]);



    }

    public static void main(String[] args) {
        ArrayEx arrayEx = new ArrayEx();
        ArrayEx courseArray= new ArrayEx();
        arrayEx.displayArray();
        arrayEx.courseArray();
    }
}

