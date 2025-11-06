package linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    //Constructor
    public static void linkedListConstructors(){
        //Tạo 1 LinkedList rỗng
        LinkedList emptyLinkedList =  new LinkedList();
        //Tạo 1 linkedList từ 1 Collections có sẵn
        LinkedList linkedList = new LinkedList(new ArrayList());
    }
    public static void linkedListMethods(){
        LinkedList<Integer> linkedList = new LinkedList();
    //---Thêm phần tử vào list---
        //Thêm phần tử vào cuối danh sách
        linkedList.add(1);
        linkedList.add(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
    //Thêm phần tử vào đầu danh sách
        linkedList.addFirst(-1);
        linkedList.addFirst(-2);
    //Thêm phần tử vào vị trí bất kì
        linkedList.add(2, 0); // [-2, -1, 0, 1, 2, 3, 4]
    //Xóa 1 phần tử ra khỏi danh sách
        /*Xóa dựa trên index*/
        //remove() <=> remove(0)
        linkedList.remove(0); // [-1, 0, 1, 2, 3, 4]
        /*Xóa dựa trên value*/
        linkedList.remove(Integer.valueOf(0));//[-1, 1, 2, 3, 4]
        linkedList.remove(new Integer(-1));//[1, 2, 3, 4]

    //Kiểm tra list có chứa 1 phần tử nào đó hay không
        boolean contain = linkedList.contains(1); // true
    //Lấy phần tử ;//[1, 2, 3, 4]
        int value;
        /*Lấy phần tử đấu tiên*/
        value=linkedList.getFirst();//1
        value = linkedList.element();
        /*Lấy phần tử cuối cùng*/
        value = linkedList.getLast();//4
        /*Lấy phần tử dựa trên index*/
        int index = 2;
        value = linkedList.get(index);//3
    //Lấy vị trí của 1 phần tử, -1 nếu không chứa ;//[1, 2, 3, 4]
        /*Vị trí xuất hiện đầu tiên*/
        value = 3;
        int fistIndex = linkedList.indexOf(value);//2
        /*vị trí xuất hiện cuối cùng*/
        int lastIndex = linkedList.lastIndexOf(value);//2

    //Lấy kích thước (số phần tử) của list
        int size = linkedList.size();//4
    //Xóa toàn bộ danh sách
        linkedList.clear();
        linkedList.removeAll(linkedList);
    //Một số hàm lấy phần tử nâng cao. Đa số các hàm lấy phần tử ở trên đều sẽ ném lỗi
        //NoSuchElementException nếu danh sách rỗng, còn những hàm này thì sẽ trả về null
        value = linkedList.peek();
        value = linkedList.peekFirst();
        value = linkedList.peekLast();

    }
    public static void traverseLinkedList(LinkedList linkedList){
        //Duyệt bằng for
        for(int i=0; i < linkedList.size(); i++){
            System.out.print(linkedList.get(i)+" ");
        }
        //Duyệt bằng foreach
        for(Object obj : linkedList){
            System.out.print(obj.toString()+" ");
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.remove();
//        System.out.println(linkedList.remove());
        System.out.println(linkedList.peekFirst());;
    }

}
