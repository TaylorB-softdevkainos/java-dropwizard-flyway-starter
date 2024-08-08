package org.example.daos;

import org.example.models.Employee;
import org.example.models.Sales;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SalesEmployeeDao {

    public List<Employee> getAllSalesEmployees() throws SQLException {
        List<Employee> salesEmployees = new ArrayList<>();

        try (Connection connection = DatabaseConnector.getConnection()) {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(
                    "select employee.id as \"Employee Id\", name, salary, bankNumber, "
                            + "nationalInsurance, sales.commissionRate from employee right join "
                            + "sales on employee.id = sales.employeeID;");

            while (resultSet.next()) {
                Employee salesEmployee = new Employee(
                        resultSet.getInt("employee.id"),
                        resultSet.getString("name"),
                        resultSet.getDouble("salary"),
                        resultSet.getString("bankNumber"),
                        resultSet.getString("nationalInsurance"));
                        new Sales(resultSet.getInt("sales.id"),
                                resultSet.getDouble("commissionRate"),
                                resultSet.getInt("employeeID"));

                salesEmployees.add(salesEmployee);
            }
        }

        return salesEmployees;
    }
}
