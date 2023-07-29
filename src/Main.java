import javax.imageio.stream.FileImageInputStream;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Family family = new Family();

        Human human = new Human("Иван","Наташа","Ирина","Сергей");
        Human human1 = new Human("Борис","Света","Маша","Петр");
        family.addHuman(human);
        family.addHuman(human1);

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(human);
                oos.writeObject(human1);
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(family.getHumanList());
    }
}