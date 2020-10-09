import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String mybook[]=new String[5];
        int[] nun=new int[]{1,5,6,9,70};
        int num[]={12,13,5,8,42};
      int a=num[1];
        System.out.println(a);

        boolean equal= Arrays.equals(nun,num);
        System.out.println(equal);
       Arrays.sort(num);
       String nums=Arrays.toString(nun);
        System.out.println(nums);

        int o=Arrays.binarySearch(num,8);
        System.out.println(o);

        for (int i = 0; i <num.length ; i++) {

           int d=num[i];
            System.out.println(d);

        }


        //随机生成6位字符串
        String result="";
        for (int i = 0; i < 6; i++) {

          //int r=(int)(Math.random()*26+97);
            //System.out.println(r);
            double dd=Math.random()*26+97;
            System.out.println(dd);
          //result=result+(char)r;

        }

        //System.out.println(result);

        //iter+tab键 快捷生成foreach

        String number="123";
        int newnum=Integer.parseInt(number);
        System.out.println(newnum);
        //字符转基本数据类型
       String word="123";
       int newWord=new Integer(word);
       int newWords=Integer.parseInt(word);
       //基本数据类型转字符
       double doub=0.569;
       String newDoub=String.valueOf(doub);
       String intStr=5+"";

        System.out.println(num);


    }

}
