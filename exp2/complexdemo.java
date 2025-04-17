import java.util.*;
class compalexnumber{
    int real;
    int img;
    void read(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter real & imaginary part");
        real= s.nextInt();
        img=s.nextInt();

    }
    compalexnumber add(compalexnumber c){
        compalexnumber result= new compalexnumber();
        result.real= this.real+c.real;
        result.img= this.img+c.img;
        return result;
    }
    void display(){
        System.out.println(real+"i"+img);

    }

}
public class complexdemo{
    public static void main(String[] args){
        compalexnumber c1= new compalexnumber();
        compalexnumber c2= new compalexnumber();
        c1.read();
        c2.read();
        compalexnumber c3= c1.add(c2);
        c3.display();
    }
}
