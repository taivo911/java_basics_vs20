package week4;

public class ex75 {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();
    }

    public static class DecreasingCounter {
        private int value;   // object variable that remembers the value of the counter
        private int initialValue;

        public DecreasingCounter(int valueAtStart) {
            this.value = valueAtStart;
            this.initialValue = valueAtStart;
        }

        public void printValue() {
            System.out.println("value: " + this.value);
        }

        public void decrease() {
            // write here the code that decrements the value of counter by one
            if(this.value > 0){
                this.value--;
            }
        }

        public void setInitial(){
            this.value = this.initialValue;
        }

        public void reset(){
            this.value = 0;
        }

        // and here the rest of the methods
    }
}

