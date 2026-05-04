
public class dansPrison extends etatPrisonnier{

	@Override
	void entrerPrison(prisonnier p,float nvx,float nvy) {
		// TODO Auto-generated method stub
		super.entrerPrison(p, nvx, nvy);
		System.out.println("je suis deja en prison. coordonees non modifies.");
	}

	@Override
	void deplacer(prisonnier p,float nvx,float nvy) {
		if (position.prisonx1 < nvx && nvx < position.prisonx2
				&& position.prisony1 < nvy && nvy < position.prisony2) {
			p.pos.setposition(nvx, nvy);
			System.out.println("Le prisonnier s'est deplace a:" + nvx + "," + nvy + "\nTout va bien");
		} else {
			p.setE(new horsPrison());
			p.pos.setposition(nvx, nvy);
			p.notifyall();
			System.out.println(p.nom + " est maintenant hors de la prison à la position: (" + nvx + "," + nvy + ")");
		}
	}


	

}
