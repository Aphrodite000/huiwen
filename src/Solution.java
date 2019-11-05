import java.util.Scanner;
//统计回文
public class Solution {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        String line1=a.next();
        String line2=a.next();
        int len=line1.length();
        int count=0;
        String s1,s2;
        StringBuilder sb;
        for(int i=0;i<=len;i++){
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
