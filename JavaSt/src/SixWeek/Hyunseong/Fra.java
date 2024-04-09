package SixWeek.Hyunseong;

public class Fra {
    public static void main(String args[]){
        MyLinkedList list = new MyLinkedList();

        list.append(3); // 리스트에 데이터 3 추가
        list.append(4); // 리스트에 데이터 3 추가
        list.append(1); // 리스트에 데이터 1 추가
        list.append(2); // 리스트에 데이터 2 추가
        list.append(5); // 리스트에 데이터 3 추가

        list.printNd(); // 리스트 순회 및 출력
    }
}
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class MyLinkedList{
    Node headNode;

    public MyLinkedList(){
        headNode = null;
    }

    public void append(int insertNumber){
        Node nd = new Node(insertNumber);
        if(headNode == null){
            //노드가 하나도 없을 경우
            headNode = nd;
        }else{
            Node node = headNode;
            while(node.next != null){
                node = node.next;
            }
            node.next = nd;
        }
    }
    public void printNd(){
        Node current = headNode;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
