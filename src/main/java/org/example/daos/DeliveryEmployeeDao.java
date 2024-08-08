package org.example.daos;

import org.example.models.Employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeliveryEmployeeDao {

    public List<Employee> getAllDeliveryEmployees() throws SQLException {
        List<Employee> deliveryEmployees = new ArrayList<>();

        try (Connection connection = DatabaseConnector.getConnection()) {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(
                    "select employee.id as \"Employee Id\", name, salary,"
                            + " bankNumber, nationalInsurance from employee right join"
                            + " delivery on employee.id = delivery.employeeID;");

            while (resultSet.next()) {
                Employee deliveryEmployee = new Employee(
                        resultSet.getInt("employee.id"),
                        resultSet.getString("name"),
                        resultSet.getDouble("salary"),
                        resultSet.getString("bankNumber"),
                        resultSet.getString("nationalInsurance"));

                deliveryEmployees.add(deliveryEmployee);
            }
        }

        return deliveryEmployees;
    }
}
