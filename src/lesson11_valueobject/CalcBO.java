package lesson11_valueobject;

// Business Object
// Value Object + 商業 Logic 方法
public class CalcBO { 
    int x, y;
    int add() {
        return x + y;
    }
    int sub() {
        return x - y;
    }
    int multi() {
        return x * y;
    }
    int div() {
        return x / y;
    }
}
