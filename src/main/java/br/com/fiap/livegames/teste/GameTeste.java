package br.com.fiap.livegames.teste;

import br.com.fiap.livegames.dao.impl.GameDaoImpl;
import br.com.fiap.livegames.factory.DaoFactory;
import br.com.fiap.livegames.model.Game;
import br.com.fiap.livegames.model.Produtora;

import java.util.List;

public class GameTeste {

    public static void main(String[] args) {

        cadastrar();
        listar();

    }

    private static void listar() {

        //GameDaoImpl gameDao = new GameDaoImpl();

        List<Game> games = DaoFactory.getGameDao().listar();

        for (Game game : games) {
            System.out.println("Id: " + game.getId());
            System.out.println("Titulo: " + game.getTitle());
        }

    }

    private static void cadastrar() {
        GameDaoImpl gameDao = new GameDaoImpl();

        Produtora produtora = new Produtora();
        produtora.setIdProdutora(100);
        produtora.setNomeProdutora("Nintendo");

        Game game = new Game();
        game.setId(0);
        game.setTitle("Batletoads");
        game.setValor(130.99);
        game.setDescription("Jogo de luta bem legal.");

        gameDao.cadastrar(game);
    }

}


