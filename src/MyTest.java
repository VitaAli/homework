import lt.infobalt.itakademija.javalang.exam.socialnetwork.BaseSocialNetworkTest;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

public class MyTest extends BaseSocialNetworkTest {

	@Override
	protected SocialNetwork getSocialNetwork() {
		return new MySocialNetwork();
	}

	

}
