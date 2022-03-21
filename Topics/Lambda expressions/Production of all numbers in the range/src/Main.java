import java.util.function.LongBinaryOperator;


class Operator {
    public static LongBinaryOperator binaryOperator = (x, y) -> {
        long sum=1;
        for (long i = x; i <=y ; i++) {
            sum=sum*i;
        }
            return sum;
        };

    public static void main(String[] args) {
        System.out.println(binaryOperator.applyAsLong(0, 1));
    }
}