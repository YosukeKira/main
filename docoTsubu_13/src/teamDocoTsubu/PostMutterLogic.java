package teamDocoTsubu;

import java.util.List;

public class PostMutterLogic {

	public void mutterAdd( Mutter mutter,List<Mutter> mutterList ) {
		mutterList.add(0,mutter);
	}

}
