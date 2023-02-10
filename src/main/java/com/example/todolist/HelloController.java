package com.example.todolist;
import javafx.scene.control.*;

import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class HelloController {

    @FXML
    public ListView list;

    public ListView done;

    public DatePicker date;

    public Label add;

    public TextField write;

    public ProgressBar progress;


    public void initialize() {

    }

    public void keyPressed(KeyEvent event) {
        System.out.println(event);
    }

    public void anyAction() {
        if (date.getValue() == null) {
            list.getItems().add(write.getText());
        } else {
            list.getItems().add(write.getText() + " / " + date.getValue());
        }
    }
    public void listView1_KeyDown(KeyEvent e)
    {
       // System.out.println(e);
        if (e.getCode() == KeyCode.BACK_SPACE)
        {
           // System.out.println("YAY delete!!");
           // System.out.println(list.getItems());
            Object whatIsThis = list.getSelectionModel().getSelectedItems().get(0);
            //System.out.println(whatIsThis);
            Object deleted = list.getItems().remove(whatIsThis);
            done.getItems().add(whatIsThis);
            //System.out.println(list.getItems());

        }
    }
    }