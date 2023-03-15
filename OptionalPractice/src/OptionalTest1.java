import java.util.Optional;

public class OptionalTest1 {
    public static void main(String[] args) {
//        int[] arr = null;
        int[] arr = new int[0];
        System.out.println("arr.length = " + arr.length);

//        Optional<String> opt = null; // 작동O, 바람직X
        Optional<String> opt = Optional.empty();
//        Optional<String> opt = Optional.of("abc");
        System.out.println("opt = " + opt);
//        System.out.println("opt.get() = " + opt.get()); // 예외발생

        String str = "";
//        try{
//            str = opt.get();
//        }catch (Exception e) {
//            str = ""; // 예외가 발생하면 빈문자열로 초기화
//        }

//        str = opt.orElse("Empty"); // Optional에 저장된 값이 null이면 ""반환
        str = opt.orElseGet(() -> "Empty"); // Optional에 저장된 값이 null이면 ""반환
        str = opt.orElseGet(() -> new String()); // Optional에 저장된 값이 null이면 ""반환
        str = opt.orElseGet(String::new); // Optional에 저장된 값이 null이면 ""반환
        System.out.println("str = " + str);
    }
}
