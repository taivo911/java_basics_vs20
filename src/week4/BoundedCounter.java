package week4;

public class BoundedCounter {
    public static void main(String[] args);
        private int value;
        private int upperLimit;

        public BoundedCounter(int upperLimit) {
            // write code here
            this.upperLimit = upperLimit;
            this.value = 0;
        }

        public void next() {
            // write code here
            if(this.value != this.upperLimit) {
                this.value++;
            } else {
                this.value = 0;
            }

        }

        public String toString() {
            // write code here
            if(this.value < 10) {
                return "0" + this.value;
            }
            return "" + this.value;
        }

        public int getValue() {
            // write here code that returns the value
            return this.value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

