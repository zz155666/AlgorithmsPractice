/**
 * @ProjectName: AlgorithmsPractice
 * @Package: PACKAGE_NAME
 * @ClassName: 希尔排序
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2018/8/6 20:36
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Shelltion {

    public static void sort(Comparable[] a){
        // 将a[]按升序排列
        int N=a.length;
        int h=1;
        int n3=N/3;
        while(h<n3){
            h=3*h+1;
        }
        //希尔排序 先制造一个h有序数组
        while(h>=1){
            for (int i=h;i<N;i++){
                for(int j=i;j>=h;j-=h){
                    Comparable aj=a[j];
                    Comparable ajh=a[j-h];
                    if(less(aj,ajh)){
                        int jh=j-h;
                        exch(a,j,jh);
                    }
                }
            }
            h=h/3;
        }
    }
    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    private static void exch(Comparable[] a,int i,int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    private static void show(Comparable[] a){
        for(int i=0;i<a.length;i++){
            StdOut.println(a[i]+" ");
        }
    }
    public static boolean isShorted(Comparable[] a){
        for(int i=1;i<a.length;i++){
            if(less(a[i],a[i-1])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String[] a=In.readStrings();
        sort(a);
        assert isShorted(a);
        show(a);
    }

}
