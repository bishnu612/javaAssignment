package Encapsulation;

public class Student {

    private int  id;
    private String name;

//parametrized constructor

    public Student(int id, String name){
       this.id= id;
       this.name=name;
    }
    public void setId(int id){
        if (id<=0){
            System.out.println("Invalid Number");
        }else {
            this.id = id;
        }
    }

    public int getId(){

        return id;
    }

    public String getName(){

        return name;
    }

    public void setName(String name){

        this.name=name;
    }
}
