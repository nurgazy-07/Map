import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("muktarbek", 123);
//        map.put("nurmukhammed", 987);
//        map.put("aiturgan", 111);
//        map.put("gulumkan", 222);
//        map.put("MUKTARBEK", 937);
//        System.out.println(map);
//        HashMap<Integer, User> userHashMap = new HashMap<>();
//        userHashMap.put(1, new User("java 12"));
//        userHashMap.put(2, new User("java 13"));
//        System.out.println(userHashMap.get(2));
//
//        Map<String, Integer> lindedHashMap = new LinkedHashMap<>();
//        map.put("muktarbek", 123);
//        map.put("nurmukhammed", 987);
//        map.put("aiturgan", 111);
//        map.put("gulumkan", 222);
//        map.put("MUKTARBEK", 937);
////
//        Map<String, String> mapCon = new LinkedHashMap<>();
//        mapCon.put("nurgazy", "7771212");
//        mapCon.put("nur", "7771313");
//        mapCon.put("nurmukhammed", "7771414");
//        Phone phone = new Phone();
//        Scanner scanner = new Scanner(System.in);
//        while (true){
//            System.out.println("""
//                    1.addContact
//                    2.getContact
//                    3.removeContact
//                    4.getAllContact
//                    choose command:
//                    """);
//            switch (scanner.nextLine()){
//                case "1" ->{
//                    System.out.println(phone.addContact("Azhybek", "233223"));
//                }
//                case "2" ->{
//                    System.out.println(phone.getContact("nurgazy"));
//                }
//                case "3" ->{
//                    phone.removevContact("nurmukhammed");
//                }
//                case "4" ->{
//                    System.out.println(phone.getCotacts());
//                }
//            }
////        }
//        String[] languages = new String[]{"Java", "PhP", "Js", "Java", "Go", "C++", "C#", "C++", "C++"};
//        System.out.println(method(languages));
//
        Car car1 = new Car(1, 2323);
        Car car2 = new Car(2, 1212);
        Car car3 = new Car(3,1616);

        DannyeCar dannyeCar1 = new DannyeCar(2017, "Huydai", 20000, "black");
        DannyeCar dannyeCar2 = new DannyeCar(2015, "Lexus", 30000, "white");
        DannyeCar dannyeCar3 = new DannyeCar(2018, "Audi", 15000, "blue");
HashMap<Car, DannyeCar> hashMap = new HashMap<>();
hashMap.put(car1, dannyeCar1);
hashMap.put(car2, dannyeCar2);
hashMap.put(car3, dannyeCar3);

        for (Map.Entry<Car, DannyeCar> carDannyeCarEntry : hashMap.entrySet()) {
            System.out.println(carDannyeCarEntry.getKey()+" "+carDannyeCarEntry.getValue());
        }

    }

//public static Map<String, Integer> method(String[] array){
//        Map<String, Integer> map = new HashMap<>();
//    for (String string : array) {
//        if(!map.containsKey(string)){
//            map.put(string,1);
//
//        }else {
//            map.put(string, map.get(string)+1);
//        }
//    }
//return map;
//    }

}