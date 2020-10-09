package reflect;



import java.lang.reflect.Field;

//反射

public class Reflect {

    private String name;
    private int age;

    public String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Reflect(){

    }

    public Reflect(String name, int age){
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
        System.out.println(className+"\n"+p2);

         Field[]  allfiled= c2.getDeclaredFields();
        for (Field field : allfiled) {
            System.out.println(field.getName()+"\n"+field.getType());
        }

        //获取类的对象
        Class<Reflect> c3=Reflect.class;
        try {
            Reflect f4=c3.newInstance();
            f4.setName("小明");
            f4.setAge(12);
            f4.showInfo();
        }catch (Exception e){

            System.out.println("没有获取到该对象");

        }

    }




}
