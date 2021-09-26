public class Arraytoint {
    public static void main(String[] args){
        int[] a=new int[5];
        a[0]=5;
        a[1]=3;
        a[2]=3;
        a[3]=1;
        a[4]=7;
        String[] l=new String[5];
        String sum="@";
        for(int x=0;x<=4;x++){
            l[x]=Integer.toString(a[x]);
        }
        for(int c=0;c<=4;c++){
            sum=sum+l[c];
        }
        String[] result=sum.split("@");
        int num=Integer.parseInt(result.toString());
        System.out.println(num+2);
        System.out.println(" number should be 53319");
    }
}
