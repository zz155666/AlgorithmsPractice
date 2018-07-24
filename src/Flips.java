

public class Flips {

    public  static  void main(String[] args){
        int T=100000000;
        Counter heads=new Counter("heads");
        Counter tails=new Counter("tails");
        for(int t=0;t<T;t++){
            if(StdRandom.bernoulli(0.5)){
                heads.increment();
            }else{
                tails.increment();
            }
        }
        StdOut.println(heads);
        StdOut.println(tails);

        int d=heads.tolly()-tails.tolly();
        StdOut.println("delta:"+Math.abs(d));
    }

}
