import Controller.AnimalController;
import Model.AnimalType;
import Model.Animals;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Nursery {
    private AnimalController controller;
    private Statement sqlStatement;
    private ResultSet resultSet;
    private String SQLQuery;

    public List<Animals> getAll() {
        List<Animals> list = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connect = getConnection()) {
                {
                    sqlStatement = connect.createStatement();
                    SQLQuery = "SELECT * FROM all_animals ORDER BY Id";
                    resultSet = sqlStatement.executeQuery(SQLQuery);

                    while (resultSet.next()) {
                        AnimalType type = AnimalType.getType(resultSet.getInt(4));
                        String id = resultSet.getInt(0);
                        String name = resultSet.getString(1);
                        String day_of_birth = resultSet.getDate(2);
                    }
                }
            }
        }
        return list;
    }
}
