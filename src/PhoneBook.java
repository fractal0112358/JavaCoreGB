import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PhoneBook {

    Map<String, HashSet<String>> pb = new HashMap();

    public PhoneBook() {
        this.pb = new HashMap();
    }


    public void add(String name, String phone){
        HashSet<String> book = pb.getOrDefault(name, new HashSet<>());
        book.add(phone);
        pb.put(name, book);
    }

    public void get(String name){
        System.out.println(name + " " + pb.get(name));
    }

}