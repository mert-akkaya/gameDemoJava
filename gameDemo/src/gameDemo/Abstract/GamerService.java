package gameDemo.Abstract;

import gameDemo.Entities.Gamer;

public interface GamerService {
	void register(Gamer gamer) throws Exception;
	void update(Gamer gamer);
	void delete(Gamer gamer);
}
