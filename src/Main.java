import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> modifiedList = new ArrayList<>();
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        System.out.println("   Получаем отфильтрованный список значений:");
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0 && intList.get(i) % 2 == 0) {
                modifiedList.add(intList.get(i));
            }
        }
        System.out.println(modifiedList);
        System.out.println("   Сортируем полученный список по возрастанию:");
        Collections.sort(modifiedList);
        System.out.println(modifiedList);

        System.out.println("   Фильтруем и сортируем исходный список с помощью Stream:");
        Stream<Integer> stream = intList.stream();
        stream
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}