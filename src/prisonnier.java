import java.util.ArrayList;

public class prisonnier implements observable{
	
	ArrayList<observateur> lesobs;
	String nom;
	position pos;
	etatPrisonnier e;
	
	
	public etatPrisonnier getE() {
		return e;
	}



	public void setE(etatPrisonnier e) {
		this.e = e;
	}



	public prisonnier(String nom, position pos, etatPrisonnier e) {
		super();
		this.lesobs=new ArrayList<observateur>();
		this.nom = nom;
		this.pos = pos;
		this.e = e;
	}



	@Override
	public void notifyall() {
		// TODO Auto-generated method stub
		for(observateur o:this.lesobs)
			o.notifyme(this);
	}



	@Override
	public void inscrire(observateur o) {
		// TODO Auto-generated method stub
		this.lesobs.add(o);
	}


	@Override
	public void desinscrire(observateur o) {
		lesobs.removeIf(obs -> obs.equals(o));
	}
	
	void deplacer(prisonnier p,float nvx,float nvy) {};
	void entrerPrison(prisonnier p,float nvx,float nvy) {};
	
	
}
