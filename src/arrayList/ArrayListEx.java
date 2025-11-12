package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {
    //Khai báo và khởi tạo
    /*Khởi tạo danh sách rỗng*/
    static ArrayList<Integer> emptyArrayList = new ArrayList<>();
    /*Khởi tạo danh sách từ 1 collection*/
    static ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    /*Khởi tạo danh sách với kích thước cho trướv*/
    static ArrayList<Integer> arrayListLimitSize = new ArrayList<>(10);
    /*2 cách dưới đây sẽ trả về 1 list unsize, không thể thêm phần tử vào list này.
    tuy nhiên Array.asList thì có thể thay đổi giá trị của phần tử còn List.of thì khôg thể.
     */
    static ArrayList<Integer> unresizeList = (ArrayList<Integer>) List.of(1, 2, 3, 4, 5);
    static ArrayList<Integer> unresizeList2 = (ArrayList<Integer>)Arrays.asList(1, 2, 3, 4, 5);



    //Các phước thức của ArrayList
    public static void arrayListMethods() {
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
        List<Integer> validValues = Arrays.asList(1, 2, 3, 4);
        arrayList.retainAll(validValues);
        /*Xóa những phần tử nằm trong danh sách cho trước*/
        List<Integer> invalidValues = Arrays.asList(-1, -2, -3, -4);
        arrayList.removeAll(invalidValues);
        //Lấy vị trí (index) của phần tử
        value = 2;
        /*Vị trí xuất hiện đầu tiên*/
        index = arrayList.indexOf(value);
        /*Vị trí xuất hiện cuối cùng*/
        index = arrayList.lastIndexOf(value);

    }

    //Sắp xếp danh sách
    public static List<Student> sortListASC(List<Student> list) {
        Collections.sort(list);
        return list;
    }
    public static List<Student> sortListDESC(List<Student> list) {
        List<Student> result = new  ArrayList<>(list);
        //selection sort
        for(int i=0; i<result.size();i++){
            Student selectST = result.get(i);
            int maxIndex=i;
            for(int j=i; j<result.size();j++){
                Student curSt =  result.get(j);
                if(curSt.name.compareTo(selectST.name)>0){
                    maxIndex=j;
                    selectST = curSt;
                }
            }
            Student tmp = result.get(i);
            result.set(i,selectST);
            result.set(maxIndex,tmp);
        }
        return result;
    }
    public static List<Student> reverseList(List<Student> list) {
        List<Student> result = new ArrayList<>();
        for(int i = list.size()-1; i>=0; i--){
            result.add(list.get(i));
        }
        return result;
    }
    //Gọp 2 danh sách nhưng không có trùng lặp ở 2 danh sách
    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>(list1);
        for(int i: list2){
            if(!result.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Student st1 = new Student("A", 11);
        Student st2 = new Student("B", 12);
        Student st3 = new Student("C", 13);
        Student st4 = new Student("D", 14);
//        List<Student> list = Arrays.asList(st2, st1, st1, st4, st3);
//        List<Student> sortListASC =  sortListASC(list);
//        System.out.println(sortListASC);
////        List<Student> sortListDESC=  sortListDESC(list);
//        List<Student> sortListDESC=  reverseList(sortListASC);
//        System.out.println(sortListDESC);
//        System.out.println("acs".compareTo("aaa"));
        List list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List list2 = Arrays.asList(6, 1, 7, 3, 4, 8, 9);
        System.out.println(mergeLists(list1, list2));
    }
}

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}