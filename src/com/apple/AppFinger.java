
package com.apple;
import java.util.ArrayList;
import java.util.List;

/**
 * 苹果装框类
 * @author wujun
 * @date 2019/11/16
 */
public class AppFinger {
    public static void main(String[] args) {
        System.out.println(show(888));
    }

    /**
     * 除二取余装正好对应框子编号
     */
    public  static  List<Integer>  rep1(int num,ArrayList list){
        int r,i=1;
        //循环获取，当余数为1的时候，记下框的值，框的值和
        while (num!=0){
            r=num%2;
            num = num/2;
            if(r==1){
                list.add(i);
            }
            i++;
        }
        return  list;
    }

    public static List<Integer> show(int num){
        //创建一个集合
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();



        int num2 = num;
        int cent = 511;
        int last = 489;
        //当总数大于511，即前面9个框子装不下的时候，这个时候拿最后一个框，将剩余的按照除二取余法运算
        if (num>cent){
                num = num - last;
                AppFinger.rep1(num,list);
                list.add(10);
                return list;
                //当数量在489和511之间的时候 可以按照除2取余，也可以先拿最后一个，前面的再除2取余
            }
            /*else if(num>=last){
                 AppFinger.rep1(num,list);
                System.out.println(list);
                num2 = num2 - last;
                 AppFinger.rep1(num2,list2);
                list2.add(10);
                System.out.println(list2);

            }*/
            //当数量小于489的时候，直接除2取余
            else {
                AppFinger.rep1(num,list);
                return list;
            }
    }
}
