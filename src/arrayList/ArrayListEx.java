package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
//Khai báo và khởi tạo
    /*Khởi tạo danh sách rỗng*/
    static ArrayList<Integer> emptyArrayList = new ArrayList<>();
    /*Khởi tạo danh sách từ 1 collection*/
    static ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    /*Khởi tạo danh sách với kích thước cho trướv*/
    static ArrayList<Integer> arrayListLimitSize = new ArrayList<>(10);
//Các phước thức của ArrayList
    public static void arrayListMethods(){
    //Lấy kích thước của danh sách
        int size = arrayList.size();
    //Thêm 1 phần tử vào danh sách
        int value = 5, index = 2;
        /*Thêm vào cuối danh sách*/
        arrayList.add(value);
        /*Thêm vào vị trí cho trước*/
        arrayList.add(index, value);
    //Thêm 1 collection vào danh sách
        /*Thêm vào cuối danh sách*/
        List<Integer> list = Arrays.asList(-1, -2, -3, -4);
        arrayList.addAll(list);
        /*Thêm vào vị trí chỉ định*/
        arrayList.addAll(index, list);
    //Xóa phần tử khỏi danh sách
        /*Xóa phần tử dự trên index*/
        arrayList.remove(index);
        /*Xóa phần tử dựa trên value*/
        arrayList.remove(new Integer(value));
        /*Xóa những phần tử không nằm trong danh sách cho trước*/
        List<Integer> validValues =  Arrays.asList(1, 2, 3, 4);
        arrayList.retainAll(validValues);
        /*Xóa những phần tử nằm trong danh sách cho trước*/
        List<Integer> invalidValues =  Arrays.asList(-1, -2, -3, -4);
        arrayList.removeAll(invalidValues);
    //Lấy vị trí (index) của phần tử
        value = 2;
        /*Vị trí xuất hiện đầu tiên*/
        index = arrayList.indexOf(value);
        /*Vị trí xuất hiện cuối cùng*/
        index = arrayList.lastIndexOf(value);

    }

}
