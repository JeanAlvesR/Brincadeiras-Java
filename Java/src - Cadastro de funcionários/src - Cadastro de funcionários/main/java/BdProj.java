//NOME: JEAN ALVES ROCHA - RA: 2313057

import java.util.List;
import java.util.ArrayList;

public class BdProj {

    //Polimorfismo por coers�o -> declara um tipo de objeto, mas se comporta como outro.
    private List<Projeto> bdProj = new ArrayList<Projeto>();
    private Projeto projeto;

    public List<Projeto> getBdproj() {
        return bdProj;
    }

    public Projeto cadProj(Projeto proj) {

        if (consProjCod(proj) == null) {
            bdProj.add(proj);
            return proj;
        } else {
            return null;
        }

    }

    public Projeto consProjCod(Projeto proj) {

        for (int i = 0; i < bdProj.size(); i++) {

            if (proj.getCodigoProjeto().equals(bdProj.get(i).getCodigoProjeto())) {
                return bdProj.get(i);
            }

        }
        return null;
    }

    public Projeto removeProjCod(Projeto proj) {

        proj = consProjCod(proj);
        Projeto aux = proj;
        if (proj != null) {
            bdProj.remove(proj);
            return proj;
        } else {
            return null;
        }
    }

    public Projeto atualizaProjCod(Projeto proj) {

        for (int i = 0; i < bdProj.size(); i++) {
            if (proj.getCodigoProjeto().equals(bdProj.get(i).getCodigoProjeto())) {

                bdProj.set(i, proj);
                return bdProj.get(i);
            }

        }
        return null;

    }

}//fim da class

