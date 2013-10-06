import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.jboss.weld.environment.se.events.ContainerInitialized;


public class Second {
	
	@Inject	private First f;
	
	public void printI(){
		if(f != null )
			System.out.println(f.getInt());
		else
			System.out.println("F is null");
	}
	
	public void main(@Observes ContainerInitialized event){
		printI();
	}

}
