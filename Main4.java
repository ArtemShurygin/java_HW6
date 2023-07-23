import java.util.*;

public class Main4{
        private static HashMap<String, ArrayList> phones = new HashMap();
        public static void new_phone(String name, String phoneNumber) {
            if (phones.containsKey(name)) {
            ArrayList phoneNumbers = phones.get(name);
            phoneNumbers.add(phoneNumber);
            phones.put(name, phoneNumbers);
            } else {
            ArrayList phoneNumbers = new ArrayList();
            phoneNumbers.add(phoneNumber);
            phones.put(name, phoneNumbers);
            }
        }

        public static void print_phones() {
            ArrayList<Map.Entry<String, ArrayList>> list =
            new ArrayList(phones.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, ArrayList>>() {
            public int compare(Map.Entry<String, ArrayList> obj1, Map.Entry<String, ArrayList>
            obj2) {
            return obj2.getValue().size() - obj1.getValue().size();
            }
            });
            for (Map.Entry<String, ArrayList> entry : list) {
            System.out.println(entry.getKey() + entry.getValue());
            }
            }

            public static void main(String[] args) {
                new_phone("Иванов", "11111");
                new_phone("Петров", "22221");
                new_phone("Смирнов", "33331");
                new_phone("Иванов", "11112");
                new_phone("Иванов", "11113");
                new_phone("Смирнов", "33332");
                print_phones();
}
}