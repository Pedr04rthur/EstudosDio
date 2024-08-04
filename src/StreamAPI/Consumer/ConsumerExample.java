package StreamAPI.Consumer;
import java.util.function.Consumer;
import java.util.List;


public class ConsumerExample {
    public static void main(String[] args) {
        List<String> strings = List.of("Pedro","Arthur");
        forEach(strings,(String s) -> System.out.println(s));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for(T e : list){
            consumer.accept(e);
        }
    }
}
