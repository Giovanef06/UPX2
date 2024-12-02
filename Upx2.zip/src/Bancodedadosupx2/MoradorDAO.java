package Bancodedadosupx2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MoradorDAO {

    private BancoDeDados bancoDeDados;

    public MoradorDAO(BancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

    public void inserirMorador(Morador morador) {
        String sql = "INSERT INTO Morador (Nome, Email, Telefone, Endereco, DataRegistro, Pontuacao, HistoricoDenuncias) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = bancoDeDados.conectar();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, morador.getNome());
            statement.setString(2, morador.getEmail());
            statement.setString(3, morador.getTelefone());
            statement.setString(4, morador.getEndereco());
            statement.setDate(5, new Date(morador.getDataRegistro().getTime()));
            statement.setInt(6, morador.getPontos());
            statement.setString(7, morador.getHistoricoDenuncias());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Morador inserido com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir morador: " + e.getMessage());
        }
    }
}
