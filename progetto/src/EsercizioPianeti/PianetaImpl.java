package EsercizioPianeti;

import java.util.Set;

public class PianetaImpl implements Pianeta {

    public PianetaImpl() {
    }

    @Override
    public int contaPianeti(Set<CorpoCeleste> setPianeti) {
        return setPianeti.size();
    }

    @Override
    public boolean scopriPianeta(Set<CorpoCeleste> setPianeti, CorpoCeleste pianeta) {
        return setPianeti.contains(pianeta);
    }
}
