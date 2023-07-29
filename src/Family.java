import java.util.ArrayList;
import java.util.List;

public class Family {
    public List<Human> humanList;

    public Family(List<Human> humanList) {
        this.humanList = humanList;
    }
    public Family(){
        this(new ArrayList<>());
    }
    public void addHuman(Human human){
        humanList.add(human);
    }

    public Human fileHuman(String name){
        for(Human product: humanList){
            if (product.equals(name)){
                return product;
            }
        } return null;
    }
    public String getHumanList(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Human product: humanList){
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
