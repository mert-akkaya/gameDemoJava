package gameDemo.Abstract;

import java.rmi.RemoteException;

import gameDemo.Entities.Gamer;

public interface CheckGamerService {
	boolean checkIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException;
}
