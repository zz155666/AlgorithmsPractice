public class 测试计数器2 {

    public static void main(String[] args) {
        int T=100000;
        VisualAccumular a=new VisualAccumular(T,1.0);
        for(int t=0;t<T;t++){
            a.addDataValue(StdRandom.random());
        }
        StdOut.println(a);
    }

}
