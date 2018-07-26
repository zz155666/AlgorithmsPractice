public class 测试计数器 {

    public static void main(String[] args) {
        int T=100000;
        Accumulator a=new Accumulator();
        for(int t=0;t<T;t++){
            a.addDataValue(StdRandom.random());
        }
        StdOut.println(a);
    }
}
