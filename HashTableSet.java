public class HashTableSet {

    private Node[] dataMap;
    private int size=7;
    
    class Node{
        Node next;
        int value ;
        String Key;

        public Node(String Key,int value){
            this.Key=Key;
            this.value=value;
        }
    }

    public HashTableSet(){
        dataMap=new Node[size];
    }

    private int hash(String Key) {
        int hash = 0;
        char[] keyChars = Key.toCharArray();

        for (int i = 0; i < keyChars.length; i++) {
            int asciivalue = keyChars[i];
            hash = (hash + asciivalue * 23) % dataMap.length;
        }
        return hash;
    }

    public void set(int value, String Key){
        int index=hash(Key);
        Node newNode=new Node(Key, value);
        if(dataMap[index]==null){
           dataMap[index]=newNode;
        }
        else{
            Node temp =dataMap[index];
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    
    public Node[] getDataMap() {
        return dataMap;
    }

    public void printTable(){
        for(int i=0;i<dataMap.length;i++){
            System.out.println(i +":");
            Node temp =dataMap[i];
            while (temp!=null) {
                System.out.println("   {" + temp.Key +"=" + temp.value+"}");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        HashTableSet ht=new HashTableSet();
        ht.set(34, "Aishwarya");
        ht.set(36, "Aishwara");
        ht.set(1564, "Shrey");
        ht.printTable();
    }
}
