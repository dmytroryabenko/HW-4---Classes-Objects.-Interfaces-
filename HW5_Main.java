package HW5;
public class HW5_Main {
    public static void main(String[] args) {

        HW5_MyList<Integer> nums = new HW5_MyList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);
        nums.add(70);

        System.out.println("Smallest element of list " + nums.smallest());
        System.out.println("Largest element of list " + nums.largest());
    }
}

