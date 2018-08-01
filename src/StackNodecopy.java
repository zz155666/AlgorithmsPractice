import java.util.Iterator;

/**
 * @ProjectName: AlgorithmsPractice
 * @Package: PACKAGE_NAME
 * @ClassName: StackNode
 * @Description: 下压堆栈（链表实现）
 * @Author: teerus
 * @CreateDate: 2018/7/31 23:11
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class StackNodecopy<Item> implements Iterable<Item> {
    private NodeTest first;
    private int N;

    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        return N;
    }
    public StackNodecopy(String nae){
        first=new NodeTest();
        first.name="1";
    }
    public void push(String nae){
        StdOut.println("初始变量");
        first.toString();
        NodeTest oldfirst=first;
        StdOut.println("传值以后测试");
        first.toString();
        oldfirst.toString();
        first=new NodeTest();

        first.name=nae;
        first.next=oldfirst;
        StdOut.println("赋完值测试");
        first.toString();
        oldfirst.toString();
        N++;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private class NodeTest{
        String name;
        NodeTest next;
        public String toString(){

            String des="节点内容："+name;

            if(next!=null){
                des+="还有"+next.name;
            }
            StdOut.println(des);
            return des;
        }
    }

}

