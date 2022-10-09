class Calculator {
    private int x;
    private int y;

    private void myMethod() { //создание метода

    }

    Calculator(int x, int y) { // создание конструктора
        this.x = x;
        this.y = y;
    }

    int plus() {

        return x + y;
    }

    int minus() {

        return x - y;
    }

    int multi() {//multiplication

        return x * y;
    }

    int div() throws Exception {//division
        if (y == 0) {
            throw new Exception("На ноль делить нельзя.");
        }
        return x / y;
    }
}
