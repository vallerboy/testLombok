import lombok.*;

@Data
public class Player {
    private int id;
    private String name;
    private String nickname;
    private int hp;
    private int mana;

    @NeedInternet
    public void shout(){
        System.out.println("Ja krzyyyyycze!");
    }
}
