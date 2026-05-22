package lincolnbuk.caleu.gof;

import lincolnbuk.caleu.gof.facade.Facade;
import lincolnbuk.caleu.gof.singleton.SingletonEager;
import lincolnbuk.caleu.gof.singleton.SingletonLazy;
import lincolnbuk.caleu.gof.singleton.SingletonLazyHolder;
import lincolnbuk.caleu.gof.strategy.ComportamentoDefensivo;
import lincolnbuk.caleu.gof.strategy.ComportamentoNormal;
import lincolnbuk.caleu.gof.strategy.ComportamentoOfensivo;
import lincolnbuk.caleu.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Sigleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder= SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		
		// Strategy
		
		ComportamentoNormal normal = new ComportamentoNormal();
		ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
		ComportamentoOfensivo ofensivo = new ComportamentoOfensivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
        robo.setComportamento(ofensivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Adriano", "53437320");
		
		
		
	}

}
