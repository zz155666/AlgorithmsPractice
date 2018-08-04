/**
 * @ProjectName: AlgorithmsPractice
 * @Package: PACKAGE_NAME
 * @ClassName: unionfind
 * @Description: 动态连通性算法
 * @Author: teerus
 * @CreateDate: 2018/8/3 21:05
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class UnionFind {

    private int[] id;
    private int count;

    public UnionFind(int N){
        count=N;
        id=new int[N];
        for(int i=0;i<N;i++){
            id[i]=i;
        }
    }

    public int count(){
        return count;
    }

    public boolean connected(int p,int q){
        return find(p)==find(q);
    }
    public int find(int p){
        return id[p];
    }
    public void union(int p,int q){
        //将pq归并到相同的分量中
        int pID=find(p);
        int qID=find(q);

        if(pID==qID){
            return;
        }

        for(int i=0;i<id.length;i++){
            if(id[i]==pID){
                id[i]=qID;
            }
        }
        count--;
    }

    public static void main(){
        int N=100;
        UnionFind uf=new UnionFind(N);
        while(!StdIn.isEmpty()){
            int p=StdIn.readInt();
            int q=StdIn.readInt();

            if(uf.connected(p,q)){
                continue;
            }
            uf.union(p,q);
            StdOut.println(p+" "+q);
        }
        StdOut.println(uf.count()+"components");
    }

}
