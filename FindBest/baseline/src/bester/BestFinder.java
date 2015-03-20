package bester;

/**
 * Created by fcmeng on 3/19/15.
 */
public class BestFinder {
    public static Bestable findBest(Bestable[] bestables) {
        if(bestables.length == 0) return null;

        Bestable best=bestables[0];
        for(int i=1;i<bestables.length;i++){
            if(bestables[i].betterThan(best)) best=bestables[i];
        }
        return best;
    }
}
