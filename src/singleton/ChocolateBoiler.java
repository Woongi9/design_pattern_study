package singleton;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (empty){
            empty = false;
            boiled = false;
            // 보일러에 우유와 초콜릿을 혼합한 재료를 넣음
        }
    }

    public void drain() {
        if (!empty && boiled) {
            empty = true;
        }
    }

    public void boil() {
        if (!empty && !boiled) {

        }
    }
}
