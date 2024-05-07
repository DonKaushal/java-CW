package lk.ijse.controller;

import lk.ijse.dto.Location;
import lk.ijse.dto.Owner;
import lk.ijse.dao.VehiclesDAO;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.LocalDate;

public class OwnerController {
    private VehiclesDAO dao;
    private Owner owner;

    public TextField firstNameField;
    public TextField lastNameField;
    public TextField addressField;

    public OwnerController() {
        dao = null;
        owner = null;
    }

    public OwnerController(VehiclesDAO dao, Owner owner) {
        this.dao = dao;
        this.owner = owner;

    }

    @FXML
    public void initialize() {

        if (owner != null) {
            firstNameField.setText(owner.getFirstName());
            lastNameField.setText(owner.getLastName());
            addressField.setText(owner.getAddress());

        }
    }

    public void okClick(ActionEvent actionEvent) {
        // Validation
        boolean allOk = validateEmpty(firstNameField);
        allOk &= validateEmpty(lastNameField);
        allOk &= validateEmpty(addressField);

    }

    public void cancelClick(ActionEvent actionEvent) {


    }

    private void addChangeOwner() {
        if (owner == null) {
            owner = new Owner(0, firstNameField.getText(), lastNameField.getText() , addressField.getText());
            dao.addOwner(owner);
        } else {
            owner.setFirstName(firstNameField.getText());
            owner.setLastName(lastNameField.getText());

            owner.setAddress(addressField.getText());

            dao.changeOwner(owner);
        }
    }


    private boolean validateEmpty(TextField field) {
        if (field.getText().trim().isEmpty()) {
            field.getStyleClass().removeAll("fieldRight");
            field.getStyleClass().add("fieldWrong");
            return false;
        } else {
            field.getStyleClass().removeAll("fieldWrong");
            field.getStyleClass().add("fieldRight");
            return true;
        }

    }


}



