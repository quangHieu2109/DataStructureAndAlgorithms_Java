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
    public static String reverseString(String input){
        Stack<Character> st = new Stack<>();
        for(char c :  input.toCharArray()){
            st.push(c);
        }
        StringBuffer sb = new StringBuffer();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();

    }
    public static boolean validBracket(String input){
        List<String> openBracket = List.of("{", "[", "(");
        List<String> closeBracket = List.of("}", "]", ")");
        Map<String, String> bracket = new HashMap<>();
        bracket.put(")", "(");
        bracket.put("]", "[");
        bracket.put("}", "{");
        Stack<String> bracketsOfInput = new Stack();
        //Duyệt từng kí tự của input
        for(char c : input.toCharArray()){
//            System.out.println("Current character: "+ c);
            //Kiểm tra xem nó có phải là ngoặc mở hay không
            if(openBracket.contains(String.valueOf(c))){
//                System.out.println("Open bracket: "+c);
                //Đúng -> thêm vào stack
                bracketsOfInput.push(String.valueOf(c));
            //Sai -> kiểm tra có phải ngoặc đóng hay không
            }else if(closeBracket.contains(String.valueOf(c))){
//                System.out.println("Close bracket: "+c);

                //Đúng -> Kiểm tra xem trước đó có ngoặc mở tương ứng hay không
                String open = bracket.get(String.valueOf(c));
                //Có -> cặp ngoặc hợp lệ
                if(!bracketsOfInput.isEmpty() && bracketsOfInput.peek().equals(open)){
                    bracketsOfInput.pop();
                }else{
                    //Không có -> không hợp lệ
                    return false;
                }
            }
        }
        if(!bracketsOfInput.isEmpty()) return false;
        return true;
    }
    public static void closestSmaller(int[] input){
        Stack<Integer> inputElement = new Stack<>();
        for(int i : input){
            inputElement.push(i);
        }
        outWhile:
        while(!inputElement.isEmpty()){
            int curValue = inputElement.pop();
            Stack <Integer> tempElement = new  Stack<>();
            tempElement.addAll(inputElement);
            while(!tempElement.isEmpty()){
                if(tempElement.peek()<curValue){
                    System.out.println("The closet less than value of "+curValue+" is "+tempElement.pop());
                    continue outWhile;
                }
                tempElement.pop();
            }
            System.out.println("There are no element less than "+curValue);
        }
    }
    public static void main(String[] args) {
        stack = new Stack();
        stack.addAll(Arrays.asList(1, 4, 3, 2, 5, 4, 1, 4));
        closestSmaller(new int[]{1, 4, 3, 2, 5, 4, 1, 4});
//       Stack<Integer> copy = new Stack<>();
//       copy.addAll(stack);
//        System.out.println(stack);
//        System.out.println(copy);

    }
}
