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
public class StackNode<Item> implements Iterable<Item> {
    private Node first;

    private int N;

    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        return N;
    }

    public void push(Item item){
        Node oldfirst=first;//这里应该是引用吧？？？明天验证一下
        first=new Node();
        first.item=item;
        first.next=oldfirst;
        N++;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private class Node{
        Item item;
        Node next;
    }
}
