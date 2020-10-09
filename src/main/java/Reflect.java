import java.lang.reflect.Field;

//反射

public class Reflect {
    private String name;
    private int age;

    public String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Reflect(){

    }

    public Reflect(String name,int age){
        this.name=name;
        this.age=age;

    }
    public  void showInfo(){

        System.out.println("大家好，我是"+name+"，今年"+age+"岁了！");

    }


    public static void main(String[] args) {
        //先获取calss类
        Class c1=Reflect.class;
        try {
            Field f=c1.getField("address");
            System.out.println(f);
        }catch (Exception e){

            System.out.println("没有这个属性");

        }
        //通过对象获取class
        Reflect f1=new Reflect();
       Class c2=f1.getClass();
         String className= c2.getName();
           Package p2=c2.getPackage();
        System.out.println(className+"/n"+p2);


    }




}
