import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
}
