import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public class JHava {
    private int hitPoints = 52489112;
    private String greeting = "BLARGH";

    @NotNull
    public int getHitPoints() {
        return hitPoints;
    }

    @NotNull
    public String utterGreeting() {
        return getGreeting();
    }

    @NotNull
    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Nullable
    public String determineFriendshipLevel() {
        return null;
    }

    public void offerFood() {
        Hello.handOverFood("pizza");
    }

    public void extendHandInFriendship() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        System.out.println(Hello.makeProclamation());

        System.out.println("Spells:");
        Spellbook spellbook = new Spellbook();
        for (String spell : spellbook.spells) {
            System.out.println(spell);
        }

        System.out.println("Max Spell Count: " + Spellbook.MAX_SPELL_COUNT);
        Spellbook.getSpellbookGreeting();

        try {
            Hello.acceptApology();
        } catch (IOException e) {
            System.out.println("Caught!");
        }
    }
}
