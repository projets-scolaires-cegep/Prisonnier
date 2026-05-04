public class test {

    public static void main(String[] args) {
        
        position pospris = new position(0,0);
        prisonnier pris = new prisonnier("Kevin", pospris, new horsPrison());

        observateur policeObs = new police();
        observateur gendarmeObs = new gendarme();
        pris.inscrire(policeObs);
        pris.inscrire(gendarmeObs);

        System.out.println("État initial : Hors Prison, position : " + pris.pos.getposition());
        System.out.println("------");

        System.out.println("Tentative d'entrée en prison à (5,5) :");
        pris.getE().entrerPrison(pris, 5, 5);
        System.out.println("État actuel : " + pris.getE().getClass().getSimpleName() + ", position : " + pris.pos.getposition());
        System.out.println("------");

        System.out.println("Déplacement à l'intérieur de la prison à (6,6) :");
        pris.getE().deplacer(pris, 6, 6);
        System.out.println("État actuel : " + pris.getE().getClass().getSimpleName() + ", position : " + pris.pos.getposition());
        System.out.println("------");

        System.out.println("Déplacement hors de la prison à (15,15) :");
        pris.getE().deplacer(pris, 15, 15);
        System.out.println("État actuel : " + pris.getE().getClass().getSimpleName() + ", position : " + pris.pos.getposition());
        System.out.println("------");

        System.out.println("Déplacement libre hors de la prison à (20,5) :");
        pris.getE().deplacer(pris, 20, 5);
        System.out.println("État actuel : " + pris.getE().getClass().getSimpleName() + ", position : " + pris.pos.getposition());
        System.out.println("------");

		System.out.println("termine");
    }
}