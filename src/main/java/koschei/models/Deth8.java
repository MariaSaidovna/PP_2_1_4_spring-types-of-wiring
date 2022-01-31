package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Deth8 {

    private String deth = "!";

    public void setDeth(String deth) {
        this.deth = deth;
    }

   @Override
    public String toString() {
        return deth.toString();
    }

}
