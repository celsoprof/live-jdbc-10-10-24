package br.com.fiap.livegames.dao.impl;

import br.com.fiap.livegames.dao.ConnectionManager;
import br.com.fiap.livegames.dao.GameDao;
import br.com.fiap.livegames.model.Game;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GameDaoImpl implements GameDao {

    PreparedStatement stmt = null;
    Connection conexao = null;

    @Override
    public void cadastrar(Game game) {

        conexao = ConnectionManager.getConnection();

        String sql = "INSERT INTO TB_GAMES (ID, TITLE, VALOR, DESCRIPTION) " +
                "VALUES (SEQ_GAMES.NEXTVAL,?,?,?)";

        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, game.getTitle());
            stmt.setDouble(2, game.getValor());
            stmt.setString(3, game.getDescription());
            stmt.executeUpdate();

            System.out.println("Game cadastrado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }


    }

    @Override
    public void alterar(Game game) {

    }

    @Override
    public void excluir(int id) {

    }

    @Override
    public List<Game> listar() {

        conexao = ConnectionManager.getConnection();

        List<Game> games = new ArrayList<Game>();

        String sql = "SELECT * FROM TB_GAMES ORDER BY TITLE DESC";

        try {
            stmt = conexao.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Game game = new Game();
                game.setId(rs.getInt("ID"));
                game.setTitle(rs.getString("TITLE"));
                game.setValor(rs.getDouble("VALOR"));
                game.setDescription(rs.getString("DESCRIPTION"));
                games.add(game);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return games;
    }

    @Override
    public Game buscarPorId(int id) {
        return null;
    }
}
