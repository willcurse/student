public class studnt {
    String name;     //instance of variable
    String address;
    String program;
    int age;    

    public studnt(String name,String address,String program,int age){
        this.name=name;
        this.address=address;     //constructor
        this.program=program;
        this.age=age;
    }

    public void display(){
        System.out.println(name);
        System.out.println(address); //method
        System.out.println(program);
        System.out.println(age);
    }



public static void main(String[] args) {
    studnt s1=new studnt("utkarsh", "aligarh", "bca", 22);
    System.out.println("the student is :"+s1.name);
    System.out.println(" and the student's address is :"+s1.address);
    System.out.println("the program  is :"+s1.program);
    System.out.println("the age is :"+s1.age);

}
}    
    




