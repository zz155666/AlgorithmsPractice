public class 泛型定容栈测试用例 {

    public static void main(String[] args) {
       FixedCapacityStack<String> s;
       s=new FixedCapacityStack<String>(100);
       while (!StdIn.isEmpty()){
           String item=StdIn.readString();
           if(!item.equals("_")){
                s.push(item);
           }else if(!s.isEmpty()){
                StdOut.print(s.pop()+" ");
           }
           StdOut.println("("+s.size()+" left on stack");
       }
    }
}
