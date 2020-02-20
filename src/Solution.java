import java.util.Scanner;
//统计回文 ，输入两个字符串，将字符串2整体插入到字符串1，
// 让总字符串编程回文字符串，统计有多少中插法
public class Solution {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        String line1=a.next();
        String line2=a.next();
        int len=line1.length();
        int count=0;
        String s1,s2;
        //创建sb，因为它是可变长度的，用它来存放插入后的字符串
        StringBuilder sb;
        for(int i=0;i<=len;i++){
            //切割line1
            s1=line1.substring(0,i);
            //左闭右开substring(0,0)截取不到内容
            s2=line1.substring(i,len);
            sb=new StringBuilder(s1);
            sb.append(line2).append(s2);
            if(sb.toString().equals(sb.reverse().toString())){
                count++;
            }
            sb=null;
        }
        System.out.println(count);
    }
}
