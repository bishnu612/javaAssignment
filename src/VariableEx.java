public class VariableEx {

//static variable
    static int d =559;
    //instance variable
    int b =779;

    //METHOD
    public void display(){
        //local variable
        int a =5;
        int c =7;
                System.out.println("local variable is :" +a);
        System.out.println("instance variable is :" +b);
        System.out.println("local variable is :" +c);
        System.out.println("The Sum of a and c is :"+(a+c));

    }

    //main method:
    public static void main(String[] args) {
        VariableEx zz = new VariableEx();
       // VariableEx c=new VariableEx();
        zz.display();

        System.out.println(zz.b);
        System.out.println(VariableEx.d);

    }
}
