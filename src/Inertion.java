/**
 * @ProjectName: AlgorithmsPractice
 * @Package: PACKAGE_NAME
 * @ClassName: Inertion
 * @Description: 插入排序
 * @Author: teerus
 * @CreateDate: 2018/8/5 20:26
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Inertion {

    public static void sort(Comparable[] a){
        // 将a[]按升序排列
        int N=a.length;
        //插入排序的二次循环  外层正序循环 内层倒序循环
        for(int i=0;i<N;i++){
            //将a[i]插入到a[i-1].a[i-2].a[i-3]....之中
            for(int j=i;j>0;j--){
                Comparable aj=a[j];
                Comparable aj1=a[j-1];
                if(less(aj,aj1)){
                    exch(a,j,j-1);
                }
            }
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
