import java.util.Iterator;

/**
 * @ProjectName: AlgorithmsPractice
 * @Package: PACKAGE_NAME
 * @ClassName: QueueNode
 * @Description: 队列实现
 * @Author: teerus
 * @CreateDate: 2018/8/1 21:11
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class QueueNode<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int N;
    private class Node{
        Item item;
        Node next;
    }
    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        return N;
    }
    public void enqueue(Item item){
        Node oldlast=last;
        last=new Node();
        last.item=item;
        last.next=null;
        if(isEmpty()) {
            first=last;
        }else{
            oldlast.next=last;
        }
        N++;
    }
    public Item dequeue(){
        Item item=first.item;
        first=first.next;
        if(isEmpty()){
            last=null;
        }
        N--;
        return item;
    }
    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
