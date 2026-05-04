
public class horsPrison extends etatPrisonnier{

	@Override
	void entrerPrison(prisonnier p,float nvx,float nvy) {
		if (position.prisonx1 < nvx && nvx < position.prisonx2
				&& position.prisony1 < nvy && nvy < position.prisony2) {
			p.pos.setposition(nvx, nvy);
			p.setE(new dansPrison());
			System.out.println(p.nom + " est maintenant en prison à la position: (" + nvx + "," + nvy + ")");
		} else {
			System.out.println("Cet endroit n'est pas dans la prison.");
		}
	}

	@Override
	void deplacer(prisonnier p, float nvx, float nvy) {
		// TODO Auto-generated method stub
		super.deplacer(p, nvx, nvy);
		p.pos.setposition(nvx, nvy);
		p.notifyall();
	}
	

}
