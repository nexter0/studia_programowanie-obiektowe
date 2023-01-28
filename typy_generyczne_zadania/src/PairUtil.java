public class PairUtil {
    public static <T> Pair<T> swap(Pair<T> pair) {
        return new Pair<>(pair.getSecond(), pair.getFirst());
    }
}
