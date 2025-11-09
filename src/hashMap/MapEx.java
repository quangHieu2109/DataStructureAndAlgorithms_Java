package hashMap;

import java.util.*;

public class MapEx {
    //Khai báo và khởi tạo
    static Map<String, Integer> hashMap = new HashMap<String, Integer>();
    static Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
    static Map<String, Integer> treeMap = new TreeMap<>();
    //Các phương thức của map
    public static void mapMethods(){
    //Thêm 1 phần tử vào map, nếu key chưa có thì thêm cặp key-value vào trong map,
        //nếu đã có thì sẽ ghi đè value của key đó
        hashMap.put("first", 1); //1
        hashMap.put("second", 2);//1 2
        hashMap.put("first", 11);//11 2
    //Chèn 1 map chỉ định vào map hiện tại
        linkedHashMap.putAll(hashMap);
    //Xóa phần tử dựa trên Key
        hashMap.remove("first");
    //Lấy Value dựa trên Key
        Integer value = hashMap.get("second");
    //Kiểm tra 1 key đã tồn tại hay chưa
        boolean contain = hashMap.containsKey("second");
    //Kiểm tra có chứa 1 value cho trước hay không
        boolean containValue = hashMap.containsValue(2);
    //Lấy tất cả Key
        Set keySet =  hashMap.keySet();
    //Lấy tất cả Key-Value
        Set entrySet =  hashMap.entrySet();

    }

    public static void main(String[] args) {
        mapMethods();
        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
        System.out.println("---------------------------------");
        for(Object key : hashMap.keySet()){
            System.out.println("Key: " + key + " Value: " + hashMap.get(key));
        }
    }
}
