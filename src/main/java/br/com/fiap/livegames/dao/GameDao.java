package br.com.fiap.livegames.dao;

import br.com.fiap.livegames.model.Game;

import java.util.List;

public interface GameDao {

    void cadastrar(Game game);
    void alterar(Game game);
    void excluir(int id);
    List<Game> listar();
    Game buscarPorId(int id);

}
