public class 重写equal {
    private  int month=0;
    private  int day=0;
    private  int year=0;

    public 重写equal (int m,int d,int y){
        month=m;
        day=d;
        year=y;
    }

    public int month(){
        return month;
    }
    public int day(){
        return day;
    }
    public int year(){
        return year;
    }

    public String toString(){
        return month()+"/"+day()+"/"+year();
    }

    public boolean equals(Object x){
        if(this==x) return true;
        if(x==null) return false;
        if(this.getClass()!=x.getClass()){
            return false;
        }
        重写equal that=(重写equal)x;
        if(this.day!=that.day){
            return false;
        }
        if(this.month!=that.month){
            return false;
        }
        if(this.year!=that.year){
            return false;
        }
        return true;
    }

}
