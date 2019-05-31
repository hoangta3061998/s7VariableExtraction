class FizzBuzzTest {
    public static void main(String[] args) {
        int num = 3;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(num);
        System.out.println(result.equals(expected));
    }
}