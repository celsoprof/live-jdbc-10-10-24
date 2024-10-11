package br.com.fiap.livegames.factory;

import br.com.fiap.livegames.dao.GameDao;
import br.com.fiap.livegames.dao.impl.GameDaoImpl;

public class DaoFactory {

    public static GameDao getGameDao() {
        return new GameDaoImpl();
    }



}
