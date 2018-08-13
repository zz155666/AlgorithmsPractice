/**
 * @ProjectName: AlgorithmsPractice
 * @Package: PACKAGE_NAME
 * @ClassName: Selection
 * @Description: 选择排序
 * @Author: teerus
 * @CreateDate: 2018/8/5 16:57
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Selection {

    public static void sort(Comparable[] a){
        // 将a[]按升序排列
        int N=a.length;
        //选择排序 外层循环每一个空位 内层找到适合空位最小的
        for(int i=0;i<N;i++){
            int min=i;
            for(int j=i+1;j<N;j++){
                Comparable aj=a[j];
                Comparable amin=a[min];
                if(less(aj,amin)){
                    min=j;
                }
            }
            exch(a,i,min);
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
