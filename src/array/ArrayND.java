package array;

public class ArrayND {
/*Khai báo và khởi tạo*/
    /*1: chỉ khai khai báo và không khởi tạo
    -> chưa thể sử dụng*/
    int arr1_1[][]; int[][] arr1_2;
    /*2: Khai báo và khởi tạo với kích thước mảng
    có thể sử dụng trực tiếp, giá trị của các phần tử
    là giá trị mặc định của kiểu dữ liệu(0, 0.0f, 0.0. null, ...)*/
    float arr2_1[][] = new float[5][2]; float[][] arr2_2 = new float[5][];
    /*3: Khai báo và khởi tạo bằng giá trị trực tiếp*/
    double[][] arr3_1 = {{0.1, 0.3, 0.5},{0.1, 0.3, 0.5}};
    float[][] arr3_2 = {{1.2f, 2.0f}};
    /*4: khai báo và khởi tạo giá trị bằng từ khóa new*/
    String[] arr4_1 = new String[]{"index0", "index1", "index2", "index3"};
    /*Nếu muốn mảng chứa được nhiều kiểu dữ liệu tham chiếu (object) khác nhau thì
    khai báo kiểu dữ liệu Object cho mảng*/
    Object[][] arr = {{new String("First element")},
            {new String("First element"),
                    new Double(2.0), new Integer("11")}};
    /*Duyệt phần tử*/
    public static void traverseArray(int[][] arr){
        /*Duyệt dựa truyên chỉ mục (index), cách này cần biết trước min và
        max của index nếu không sẽ bị lỗi IndextOutOfBound.
        Trong quá trình duyệt có thể thay đổi giá trị tại vị trí mong muốn.
        Sử dụng các vòng lặp như while, for*/
        System.out.println("Traverse array by for");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println("Value of index ["+ i +"]["+j+"]: "+arr[i]);
                if(i == 3) {
                    arr[i][0] = 999;
                    System.out.println("Value of row "+i+" updated to "+arr[i][0]);
                }
            }
        }
        /*Duyệt tuần tự bằng foreach, các giá trị được in ra tuần tự theo thứ tự của index,
        cách duyệt này nhanh nhưng c|hỉ có thể xem mà không thay đổi được giá trị*/
        System.out.println("Traverse array by foreach");
        for(int[] row : arr){
            for(int value: row){
                System.out.print(value +" " );
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] arr2d = new int[2]   [2];
    }
}
