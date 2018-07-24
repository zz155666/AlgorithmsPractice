
public class 掷骰子 {
    public static void main(String[] args) {

        int T=100000000;
        int Sides=6;
        Counter[] rolls=new Counter[Sides+1];
        for (int i=1;i<=Sides;i++){
            rolls[i]=new Counter(i+"'s");
        }
        for(int t=0;t<T;t++){
            int result=StdRandom.uniform(1,Sides+1);
            rolls[result].increment();
        }
        for (int i=1;i<=Sides;i++){
            StdOut.println(rolls[i]);
        }
    }
}
