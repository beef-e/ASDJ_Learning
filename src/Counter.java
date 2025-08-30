public class Counter {
    public Counter(){

    }

    public int count=0;

    public Counter(int n){
        count=n;
    }

    public int getCount(){
        return count;
    }

    public void setCount(int n){
        count=n;
    }

    public void increment(){
        count=count+1;
    }

    public void increment(int n){
        count=count+n;
    }

    public void decrement(int n){
        count=count-n;
    }

    public void reset(){
        count=0;
    }
}
