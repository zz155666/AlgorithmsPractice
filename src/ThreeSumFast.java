import java.util.Arrays;

/**
 * @ProjectName: AlgorithmsPractice
 * @Package: PACKAGE_NAME
 * @ClassName: ThreeSumFast
 * @Description: 3-sum问题的快速算法
 * @Author: teerus
 * @CreateDate: 2018/8/2 20:43
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ThreeSumFast {

    public static int count(int [] a){
        Arrays.sort(a);
        int N=a.length;
        int cnt=0;
        for (int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(二分查找.rank(-a[i]-a[j],a)>j){
                    cnt++;
                }
            }
        }
        return cnt;
    }

}
