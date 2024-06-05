import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Contact {
public static void main(String[] args) {
Map<Integer, ArrayList<String>> phoneBook = new HashMap<Integer, ArrayList<String>>();
Map<Integer, String> nameBook = new HashMap<Integer, String>();
nameBook.put(0, "Воронина А.А.");
nameBook.put(1, "Лисицина Е.В.");
nameBook.put(2, "Воронина А.Ю.");
nameBook.put(3, "Лебедев А.С.");
for (int i = 0; i < nameBook.size(); i++) {
if (phoneBook.get(i) == null) {
phoneBook.put(i, new ArrayList<String>());
phoneBook.get(i).add("99890-785-12-" + i + i + ";" + " " + "7650-855-01-" + i + i);
}
System.out.println("Номер телефона" + " " + nameBook.get(i) + " :" + phoneBook.get(i));
}

}
}
public void printSortedContacts() {
    Comparator<Entry<Contact, List<Long>>> comparator = Comparator
            .comparing(entry -> Integer.valueOf(entry.getValue().size()));
    List<Entry<Contact, List<Long>>> sortedList = new LinkedList<>(phoneBook.entrySet());

    sortedList.sort(comparator.reversed());

    for (Entry<Contact, List<Long>> entry : sortedList) {
        System.out.println(entry);
    }
}
