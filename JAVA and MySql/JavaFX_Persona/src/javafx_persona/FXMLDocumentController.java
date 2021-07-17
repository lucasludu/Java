/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_persona;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author Lucaaas
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField txt_name;
    @FXML
    private TextField txt_address;
    @FXML
    private TextField txt_age;
    @FXML
    private TableView<Records> table;
    @FXML
    private TableColumn<Records, String> col_id;
    @FXML
    private TableColumn<Records, String> col_name;
    @FXML
    private TableColumn<Records, String> col_address;
    @FXML
    private TableColumn<Records, String> col_age;
    @FXML
    private Button btn_Add;

    Connection conn;
    PreparedStatement pst;

    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/addressPerson", "root", "");
        } catch (ClassNotFoundException | SQLException e) {

        }
    }

  
    @FXML
    private void Add(ActionEvent event) {

        Connect();
        String name = txt_name.getText();
        String address = txt_address.getText();
        String age = txt_age.getText();

        try {

            pst = conn.prepareStatement("insert into records (name, address, age) values (?, ?, ?)");
            pst.setString(1, name);
            pst.setString(2, address);
            pst.setString(3, age);
            int status = pst.executeUpdate();

            if (status == 1) {

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success");
                alert.setHeaderText("Member");
                alert.setContentText("Record addedd succesfully");
                alert.showAndWait();

                txt_name.setText("");
                txt_address.setText("");
                txt_age.setText("");
                txt_name.requestFocus();

            } else {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Fail");
                alert.setHeaderText("Member");
                alert.setContentText("Record Addedd Failed");
                alert.showAndWait();

            }

        } catch (Exception e) {

            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, e);

        }

    }

    public void table() {

        ObservableList<Records> records = FXCollections.observableArrayList();

        try {

            pst = conn.prepareStatement("select id, name, address, age from records");
            ResultSet rs = pst.executeQuery();
            {
                while (rs.next()) {

                    Records record = new Records();
                    record.setId(rs.getString("id"));
                    record.setName(rs.getString("name"));
                    record.setAddress(rs.getString("address"));
                    record.setAge(rs.getString("age"));
                    records.add(record);

                }
            }
            
            table.setItems(records);
            col_id.setCellValueFactory(f -> f.getValue().idProperty());
            col_name.setCellValueFactory(f -> f.getValue().nameProperty());
            col_address.setCellValueFactory(f -> f.getValue().addressProperty());
            col_age.setCellValueFactory(f -> f.getValue().ageProperty());
            
        } catch (SQLException e) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, e);
        }

    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Connect();
        table();
    }


}
