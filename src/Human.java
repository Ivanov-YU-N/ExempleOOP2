import java.io.Serializable;

public class Human implements Serializable {
    private String father;
    private String mather;
    private String doughter;
    private String son;

    public Human(String father, String mather, String doughte, String son) {
        this.father = father;
        this.mather = mather;
        this.doughter = doughte;
        this.son = son;
    }

    @java.lang.Override
    public String toString() {
        return "father=" + father + ", mother=" + mather + ", doughter=" + doughter +
                ", son=" + son;
    }
}