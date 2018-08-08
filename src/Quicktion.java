/**
 * @ProjectName: AlgorithmsPractice
 * @Package: PACKAGE_NAME
 * @ClassName: Quicktion
 * @Description: 快速排序算法
 * @Author: teerus
 * @CreateDate: 2018/8/8 21:05
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Quicktion {

    public static void sort(Comparable[] a){
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }

    private static void sort(Comparable[] a,int lo,int hi){
        if(hi<=lo){
            return;
        }
        int j=partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    private static int partition(Comparable[] a,int lo,int hi){
        int i=lo,j=hi+1;
        Comparable v=a[lo];
        while(true){
            while(less(a[++i],v)){
                if(i==hi){
                    break;
                }
            }
            while(less(v,a[--j])){
                if(j==lo){
                    break;
                }
            }
            if(i>j){
                break;
            }
            exch(a,i,j);
        }
        exch(a,lo,j);
        return j;
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
