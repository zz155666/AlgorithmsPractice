/**
 * @ProjectName: AlgorithmsPractice
 * @Package: PACKAGE_NAME
 * @ClassName: 三向切分的快速排序
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2018/8/9 20:57
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Quick3way {

    public static void sort(Comparable[] a){
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }
    private static void sort(Comparable[] a,int lo,int hi){
        if(hi<=lo){
            return;
        }
        int lt=lo,i=lo+1,gt=hi;
        Comparable v=a[lo];
        while(i<=gt){
            int cmp=a[i].compareTo(v);
            if(cmp<0){
                exch(a,lt++,i++);
            }else if(cmp>0){
                exch(a,i,gt--);
            }else{
                i++;
            }
        }
        sort(a,lo,lt-1);
        sort(a,gt+1,hi);
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
