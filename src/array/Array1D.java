package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Array1D {
/*Khai báo và khởi tạo*/
    /*1: chỉ khai khai báo và không khởi tạo
    -> chưa thể sử dụng*/
    int arr1_1[]; int[] arr1_2;
    /*2: Khai báo và khởi tạo với kích thước mảng
    có thể sử dụng trực tiếp, giá trị của các phần tử
    là giá trị mặc định của kiểu dữ liệu(0, 0.0f, 0.0. null, ...)*/
    float arr2_1[] = new float[5]; float[] arr2_2 = new float[5];
    /*3: Khai báo và khởi tạo bằng giá trị trực tiếp*/
    double[] arr3_1 = {0.1, 0.3, 0.5};
    float[] arr3_2 = {1.2f, 2.0f};
    /*4: khai báo và khởi tạo giá trị bằng từ khóa new*/
    String[] arr4_1 = new String[]{"index0", "index1", "index2", "index3"};
    /*Nếu muốn mảng chứa được nhiều kiểu dữ liệu tham chiếu (object) khác nhau thì
    khai báo kiểu dữ liệu Object cho mảng*/
    Object[] arr = {new String("First element"),
            new Double(2.0), new Integer("11")};
/*Truy cập phần tử*/
    public static void getElementOfArray(int[] arr, int index){
        //Chỉ lấy được phần tử của index có giá trị từ 0 -> arr.length-1
        //Ngoài những giá trị này sẽ ném lỗi IndexOutOfBound
        if(index <0 || index >= arr.length) System.out.println("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: Index invalid!");
        else System.out.println(arr[index]);
    }
/*Duyệt phần tử*/
    public static void traverseArray(int[] arr){
        /*Duyệt dựa truyên chỉ mục (index), cách này cần biết trước min và
        max của index nếu không sẽ bị lỗi IndextOutOfBound.
        Trong quá trình duyệt có thể thay đổi giá trị tại vị trí mong muốn.
        Sử dụng các vòng lặp như while, for*/
        System.out.println("Traverse array by for");
        for(int i=0; i<arr.length; i++){
            System.out.println("Value of index "+ i +": "+arr[i]);
            if(i == 3) {
                arr[3] = 999;
                System.out.println("Value of index "+i+" updated to "+arr[3]);
            }
        }
        System.out.println("Traverse array by while");
        int i = arr.length-1;
        while(i>=0){
            System.out.println("Value of index "+ i +": "+arr[i]);
            if(i == 3) {
                arr[3] = -999;
                System.out.println("Value of index "+i+" updated to "+arr[3]);
            }
            i--;
        }
        /*Duyệt tuần tự bằng foreach, các giá trị được in ra tuần tự theo thứ tự của index,
        cách duyệt này nhanh nhưng c|hỉ có thể xem mà không thay đổi được giá trị*/
        System.out.println("Traverse array by foreach");
        for(int value:arr) System.out.println(value);
    }
/*Các thuộc tính (properties) của Array (Kông phải hàm- method)*/
    public static void propertiesOfArray(int[] arr){
        /*Chiều dài (số lượng phần tử) của mảng*/
        System.out.println("arr.length: total element of arr: "+arr.length);
        /*Lưu ý: length là property của Array chứ không phải hàm
        nếu sử dụng .length() là sai
         */
    }
/*Các hàm của Arrays*/
    public static void methodsOdArrays(int[] arr){
        /*Chuyển mảng thành chuỗi*/
        System.out.println("print array: "+Arrays.toString(arr));
        /*Sắp xếp mảng tăng dần*/
        System.out.println("------------------------------");
        System.out.println("array before sort: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("array after sort: "+Arrays.toString(arr));
        /*So sánh 2 mảng*/
        System.out.println("------------------------------");
        int[] otherArr = new int[]{1,2,1,2,3,1};
        System.out.println("array: "+Arrays.toString(arr));
        System.out.println("otherArray: "+Arrays.toString(arr));
        System.out.println("arr is equal otherArr: "+Arrays.equals(arr, otherArr));
        /*Gán giá trị cho toàn bộ mảng*/
        System.out.println("array before fill: "+Arrays.toString(arr));
        int newValue = 3503;
        Arrays.fill(arr, newValue);
        System.out.println("array after fill values: "+Arrays.toString(arr));
        /*Tìm kiếm nhị phân: tìm vị trí của 1 giá trị đầu vào trong mảng
        * mảng phải được sắp xếp trước khi thực hiện tìm kiếm*/
        int findValue = 5;
        //sắp xếp mảng
        Arrays.sort(arr);
        System.out.println("array: "+Arrays.toString(arr));
        int index = Arrays.binarySearch(arr, findValue);
        System.out.println("Index of "+findValue+" is "+index);
        /*Chuyển mảng thành danh sách
        *Hàm này nhận vào nhiều giá trị khác nhau và trả về 1 danh sách (List)
        * chứ những giá trị này chứ không chuyển các giá trị của 1 mảng thành List*/
        List arrList1 = Arrays.asList(arr); // {arr}
        List arrList2 = Arrays.asList(arr, otherArr); //{arr, otherArr}
        List arrList3 = Arrays.asList(1, 2, 3, 4, 5);//[1,2,3,4,5]
        /*Copy mảng: Vì mảng là kiểu dữ liệu tham chiếu nên khi gán newArr = arr và
        thay đổi giá trị phần tử của newArr thì phần tử của arr cũng sẽ thay đổi theo.
        Để khắc phục tình trạng này thì ta cần dùng hàm Copy để khi thao tác trên mảng
        copy thì mảng gốc không bị ảnh hưởng
         */
        //arr = {1, 2, 3, 4, 5}
        int[] arrCopy = Arrays.copyOf(arr, arr.length);//arrCopy equal arr
        arrCopy = Arrays.copyOf(arr, arr.length+5);//[1, 2, 3, 4, 5, 0, 0, 0, 0, 0]
        /*Copy 1 đoạn của mảng: copyOfRange(arr, from, to)*/
        arrCopy =  Arrays.copyOfRange(arr, 1,3); //[2, 3]
        /*Chuyển mảng đa chiều thành String*/
        int[][] arr2d = new  int[2][2];
        System.out.println("Print 2dArray: "+Arrays.deepToString(arr2d));
    }
    //Vận dụng
    /*Viết hàm tính tổng giá trị các phần tử của 1 array*/
    public static int sumArray(int[] array){
        int sum = 0;
        for(int value: array){
            sum += value;
        }
        return sum;
    }
    public static int mostFrequentElement(int[] arr){
        Map<Integer,Integer> countAppend = new HashMap<>();
        for(int value: arr){
            if(countAppend.containsKey(value)){
                countAppend.put(value, countAppend.get(value) + 1);
            }else {
                countAppend.put(value, 1);
            }
        }
        int result = arr[0];
        int maxFreq = countAppend.get(arr[0]);
        for(Map.Entry<Integer,Integer> entry: countAppend.entrySet()){
            if(entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
    /*Tìm chuỗi các phần tử liên tiếp có tổng lớp nhất*/
    public static int maximumSubArraySum(int[] arr){
        /*Ta có: nếu tổng các phần tử trước đó và phần tử hiện tại mà nhỏ hơn hoặc
        bằng phần tử hiện tại thì các phần tử trước đó không giúp tổng subArray lớn hơn
        -> bắt đầu subArray ở phần tử hiện tại.
         */
        int curSum = arr[0];
        int maxSum = arr[0];
        for(int i =1; i<arr.length; i++){
            curSum = Math.max(curSum+arr[i],arr[i]);
            maxSum = Math.max(curSum, maxSum);

        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr_1[] = {1, 3,5, 0, 7, 1, 6};
        System.out.println("Sum of array: "+sumArray(arr_1));
        System.out.println("Most append elelment: "+ mostFrequentElement(arr_1));
//        getElementOfArray(arr_1, -1); //Index invalid!
//        getElementOfArray(arr_1, arr_1.length);//Index invalid!
//        getElementOfArray(arr_1, 0);//1
//        //-----------------//
//        traverseArray(arr_1);
//        methodsOdArrays(arr_1);

    }

}
