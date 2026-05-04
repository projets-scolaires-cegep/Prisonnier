
public class police implements observateur{

	@Override
	public void notifyme(prisonnier p) {
		// TODO Auto-generated method stub
		System.out.println("police!"+p.nom+" est a la position"+"("+p.pos.x+","+p.pos.y+")");
		
	}

}
