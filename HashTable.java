// class HashTable {
// private int size=7;

// private Node[] dataMap;

// class Node{
//     String key;
//     int value;
//     Node next;

//     public Node(String key, int value){
//         this.key=key;
//         this.value=value;

//     }
// }

// public HashTable(){
//     dataMap=new Node[size];
// }

// public Node[] getDataMap(){
//     return dataMap;
// }

// public void printTable(){
//     for(int i=0; i<dataMap.length;i++){
//         System.out.println(i +":");
//         if(dataMap[i] !=null){
//             Node temp=dataMap[i];
//             while(temp!=null){
//                 System.out.println("   {" + temp.key + ", " + temp.value + "}");       
//                temp=temp.next;     }
//         }
//     }
// }


//  public static void main(String[] args) {
//     HashTable myHashTable=new HashTable();
//     myHashTable.printTable();
//  }
    

// }


/**
 * HashTable
 */
public class HashTable {

    private int  size=6;
    private Node[] dataMap;

    public class Node {
    Node next;
    String key;
    int value;
    Node(String key , int value){
        this.value=value;
        this.key=key;
    }

        
    }

    public HashTable(){
        dataMap=new Node[size];
    }

    public Node[] getDataMap(){
        return dataMap;
    }


    public void printTable(){
        for(int i=0;i<dataMap.length;i++){
            System.out.println(i +":");
            Node temp =dataMap[i];
            while (temp!=null) {
                System.out.println("   {" + temp.key +"=" + temp.value+"}");
                temp=temp.next;
            }
        }
    }


    private int hash(String key){
        int hash=0;
        char[] keyChars=key.toCharArray();
        for(int i=0;i<keyChars.length;i++){
            int asciivalue=keyChars[i];
            hash= (hash + asciivalue *23)%dataMap.length;
        }
        return hash;
    }


    public void set(String key, int value){
        int index=hash(key);
        Node newNode=new Node(key, value);
        if(dataMap[index]==null){
            dataMap[index]=newNode;
        }
        else{
            Node temp=dataMap[index];
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public static void main(String[] args) {
        HashTable ht=new HashTable();
        
        ht.set("Hello", 56);
        ht.printTable();
    }
}

