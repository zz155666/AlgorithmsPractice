

public class Interval2D的测试用例 {
    public static void main(String[] args) {
        double xlo=0.2;
        double xhi=0.5;
        double ylo=0.5;
        double yhi=0.6;
        int T=10000;

        Interval1D xin=new Interval1D(xlo,xhi);
        Interval1D yin=new Interval1D(ylo,yhi);

        Interval2D box=new Interval2D(xin,yin);
        box.draw();

        Counter c=new Counter("hits");
        for(int t=0;t<T;t++){
            double x=Math.random();
            double y=Math.random();
            Point2D p=new Point2D(x,y);
            if(box.contains(p)){
                c.increment();
            }else{
                p.draw();
            }
        }
        StdOut.println(c);
        StdOut.println(box.area());
    }
}
