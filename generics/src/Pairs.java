import java.util.Date;
public class Pairs<k,v> {
    k key;
    v value;

    Pairs(k key,v value){
        this.key=key;
        this.value=value;
    }

    public void setKey(k key) {
        this.key = key;
    }

    public void setValue(v value) {
        this.value = value;
    }

    public k getKey() {
        return key;
    }

    public v getValue() {
        return value;
    }
}
