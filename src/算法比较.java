/**
 * @ProjectName: AlgorithmsPractice
 * @Package: PACKAGE_NAME
 * @ClassName: 算法比较
 * @Description: 比较两种算法的执行效率
 * @Author: teerus
 * @CreateDate: 2018/8/5 23:09
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class 算法比较 {

    public static double time (String alg,Double[] a){
        Stopwatch timer=new Stopwatch();
        if(alg.equals("Insertion")){
            Inertion.sort(a);
        }
        if(alg.equals("Selection")){
            Selection.sort(a);
        }
        if(alg.equals("Shelltion")){
            Shelltion.sort(a);
        }
        return timer.elapsedTime();
    }


    public static double timeRandomInput(String alg,int N,int T){
        double total=0.0;
        Double[] a=new Double[N];
        for(int t=0;t<T;t++){
            for (int i=0;i<N;i++){
                a[i]=StdRandom.uniform();
            }
            total+=time(alg,a);
        }
        return total;
    }

    public static void main(String[] args) {
        int N=100;
        int T=10;
        double t1=timeRandomInput("Insertion",N,T);
        double t2=timeRandomInput("Selection",N,T);
        double t3=timeRandomInput("Shelltion",N,T);

        StdOut.println("第一个算法的时间为："+t1+"  第二个算法的时间为："+t2+"  他们的比值为："+t2/t1);

    }

}
