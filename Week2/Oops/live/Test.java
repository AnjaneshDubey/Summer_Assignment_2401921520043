package Week2.Oops.live;

import Week2.Oops.music.Playable;
import Week2.Oops.music.string.Veena;
import Week2.Oops.music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Veena V = new Veena();
        V.play();
        Saxophone S = new Saxophone();
        S.play();
        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }

}
