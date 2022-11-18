package HW5;
import java.util.ArrayList;
public class HW5_MyList<T extends Number> {

        ArrayList<T> list = new ArrayList<>();

        public void add(T value) {
            list.add(value);
        }
        public T largest() {
            T value = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).doubleValue() > value.doubleValue()) {
                    value = list.get(i);
                }
            }
            return value;
        }
        public T smallest() {
            T value = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).doubleValue() < value.doubleValue()) {
                    value = list.get(i);
                }
            }
            return value;
        }
    }
