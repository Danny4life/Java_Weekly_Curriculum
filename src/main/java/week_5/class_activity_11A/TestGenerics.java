package week_5.class_activity_11A;

public class TestGenerics {
    public static void main(String[] args) {
        GenericClass<Integer> num = new GenericClass<>();
        num.add(10);
//        GenericClass<String> str = new GenericClass<>();
//        str.add("John");


        System.out.println(num.getObj());
        //System.out.println(str.getObj());
    }
}
