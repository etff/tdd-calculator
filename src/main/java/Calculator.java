public class Calculator {
    public int plus(int x, int y) {
        if (y == 0 ) {
            return x;
        }

        return plus(x + 1, y - 1);
    }

    public int minus(int x, int y) {
        if (y == 0) {
            return x;
        }
        return minus(x - 1, y -1 );
    }
}
