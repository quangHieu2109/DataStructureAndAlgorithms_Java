package set;

import java.util.*;

public class SetEx {
    //Khai báo
    static Set<Integer> hashSet = new HashSet(); //không có thứ tự
    static Set treeSet = new TreeSet();//sắp xếp theo giá trị
    static Set linkedHashSet = new LinkedHashSet();//sắp xếp theo thứ tự thêm vào

    //Các phương thức
    public static void setMethods() {
        //Thêm phần tử đơn lẻ
        hashSet.add(1);//[1]
        hashSet.add(2);//[1, 2]
        //Thêm 1 danh sách (collection)
        hashSet.addAll(Arrays.asList(3, 4, 5, 6, 2));//[1, 2, 3, 4, 5, 6]
        //Lấy kích thước set
        int size = hashSet.size();
        //Duyệt phần tử
        /*dùng for*/
        for (int value : hashSet) {
            System.out.println(value);
        }
        /*dung Iterator*/
        Iterator itr = hashSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        //Xóa 1 phần tử khỏi set
        hashSet.remove(1);//[2, 3, 4, 5, 6]
        //Xóa toàn bộ set
        hashSet.clear();
        hashSet.removeAll(hashSet);
        //Kiểm tra set có rỗng hay không
        boolean isEmpty = hashSet.isEmpty();
    }

    public static String toString(Set set) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (!set.isEmpty()) {
            for (Object object : set) {
                stringBuffer.append(object.toString());
                stringBuffer.append("; ");
            }
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        List values = Arrays.asList(3, 4, -1, 5, -5, 6, 2);
        hashSet.addAll(values);
        linkedHashSet.addAll(values);
        treeSet.addAll(values);
        System.out.println("HashSet: " + toString(hashSet)); //[-1; 2; 3; 4; -5; 5; 6]
        System.out.println("LinkedHashSet: " + toString(linkedHashSet));//[3; 4; -1; 5; -5; 6; 2]
        System.out.println("TreeSet: " + toString(treeSet));//[-5; -1; 2; 3; 4; 5; 6]
        Iterator itr = hashSet.iterator();

    }
}
