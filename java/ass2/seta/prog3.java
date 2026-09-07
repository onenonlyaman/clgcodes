interface Integer {
    void check(int num);
}

class NumberCheck implements Integer {
    public void check(int num) {
        if (num >= 0) {
            System.out.println(num + " is Positive");
        } else {
            System.out.println(num + " is Negative");
        }
    }
}
class prog3
{
    public static void main(String[] args) {
        NumberCheck obj = new NumberCheck();
        obj.check(45);
        obj.check(-12);
    }
}
