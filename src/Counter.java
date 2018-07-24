public class Counter {

    private  int _count=0;
    private  String _id="";

    public Counter(String id){
        _id=id;
        _count=0;
    }
    public void increment(){
        _count++;
    }
    public int tolly(){
        return  _count;
    }
    public String toString(){
        return  "对象id:"+_id+" 当前计数:"+_count;
    }
}
