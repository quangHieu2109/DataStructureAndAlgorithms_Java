package stack_queue;

import java.util.*;

public class StackAndQueue {
    static Stack<Integer> stack;
    static Queue<Integer> queue;
    //Constructor
    public static void Stack_QueueConstructors(){
    //Cả stack chỉ có 1 constructor rỗng còn queue thì có thêm constructor nhận vào 1 collection
        //Tạo từ constructor rỗng
        stack =  new Stack();
        //Tạo từ 1 Collections có sẵn
        queue = new LinkedList();
        queue = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
    }
    public static void generalMethods(){
    //Kích thước - số phần tử
        int stackSize = stack.size();
        int queueSize = queue.size();
    //Kiểm tra có chứa 1 phân tử cho trước hay không
        boolean stackContain = stack.contains(new Integer(1));
        boolean queueContain = queue.contains(new Integer(1));
    //Xóa mọi phần tử
        stack.clear();
        queue.clear();
    //Kiểm tra có rỗng hay không
        boolean isStackEmpty = stack.isEmpty();
                isStackEmpty = stack.empty(); //chỉ stack mới có
        boolean isQueueEmpty = queue.isEmpty();

    }
    public static void stackMethod(){
        //thêm phần tử vào đỉnh
        stack.push(1);
        stack.add(2); // không nên dùng
        //lấy phần tử ở đỉnh ra và xóa nó khỏi stack
        int out = stack.pop();
        //lấy phần tử ổ đỉnh ra nhưng không xóa
        out = stack.peek();

    }
    public static void queueMethods(){
        //thêm phần tử vào cuối hàng đợi
        queue.add(1);
        queue.offer(2);
        //Lấy và xóa phần tử đầu tiên
        int out = queue.poll();
        out = queue.remove();
        //Lấy nhưng không xóa phân tử đầu tiên
        out =  queue.peek();
        out = queue.element();
    }
    public static void main(String[] args) {
        Stack st = new Stack();

    }
}
