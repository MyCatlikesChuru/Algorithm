import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        var ref = new Object() {
            String startsWith = phone_book[0];
        };
        //
        boolean result = Arrays.stream(phone_book)
                .filter(s -> !s.equals(ref.startsWith))
                .map(phone -> {
                    if (phone.startsWith(ref.startsWith)) return "false";
                    ref.startsWith = phone;
                    return "true";
                })
                .collect(Collectors.toList())
                .contains("false");

        return !result;
    }
}