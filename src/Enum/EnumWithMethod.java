package Enum;

public enum EnumWithMethod {
    SUM {
        public double action(double firstValue, double secondValue) {
            return firstValue + secondValue;
        }
    },
    SUBTRACT {
        public double action(double firstValue, double secondValue) {
            return firstValue - secondValue;
        }
    },
    MULTIPLY {
        public double action(double firstValue, double secondValue) {
            return firstValue * secondValue;
        }
    },
    DIVIDE {
        public double action(double firstValue, double secondValue) {
            if (secondValue == 0) {
                System.out.println("На ноль делить нельзя");
                return 0;
            } else {
                return firstValue / secondValue;
            }
        }
    };
    public abstract double action(double firstValue, double secondValue);
}
