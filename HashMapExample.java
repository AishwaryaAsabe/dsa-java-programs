// import java.util.HashMap;

// public class HashMapExample {
//     public static void main(String[] args) {
//         // Create a HashMap to store student names and their IDs
//         HashMap<Integer, String> students = new HashMap<>();

//         // Adding key-value pairs
//         students.put(1, "Alice");
//         students.put(2, "Bob");
//         students.put(3, "Charlie");

//         // Accessing values by key
//         System.out.println("Student with ID 1: " + students.get(1));
        
//         // Iterating through the HashMap
//         for (Integer id : students.keySet()) {
//             System.out.println("ID: " + id + ", Name: " + students.get(id));
//         }
//     }
// }



import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String , Integer> data=new HashMap<>();

        data.put("Dinesh", 1);
        data.put("Lisha", 2);

        for (String id : data.keySet()) {
                        System.out.println("ID: " + id + ", Name: " + data.get(id));
                    }

                 System.out.println( data.get(1));  

                 System.out.println(data.size());

    }
}