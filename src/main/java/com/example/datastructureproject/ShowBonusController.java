package com.example.datastructureproject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

//Second screen of system
public class ShowBonusController implements Initializable {
    BonusStack stack = new BonusStack();
    PriorityQueue queue = new PriorityQueue();
    FileOperations fileOperations = new FileOperations();
    BinarySearchTree binarySearchTree = new BinarySearchTree();

    @FXML
    private Label labelText;

    @FXML
    private TextArea textArea;

    @FXML
    private Button listForNameButton;

    @FXML
    private Button listForPositionButton;

    @FXML
    private Button addBonusButton;

    @FXML
    private Button showWinnersButton;

    //this method disables the buttons at the beginning
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        labelText.setText("PLEASE ADD BONUSES");
        listForNameButton.setDisable(true);
        listForPositionButton.setDisable(true);
        showWinnersButton.setDisable(true);
    }

    //This method is used for add bonus to the stack
    @FXML
    void addBonusButtonClick(ActionEvent event) {
        int bonus = Integer.parseInt(textArea.getText());
        stack.push(bonus);
        textArea.setText("");
        showWinnersButton.setDisable(false);
    }

    @FXML
    void showWinnersButtonClick(ActionEvent event) {
        labelText.setText("BONUS WINNERS");
        addBonusButton.setDisable(true);
        textArea.setText("");
        try {
            fileOperations.addIntoQueue(queue);
        } catch (IOException e) {
            e.printStackTrace();
        }
        queue.giveBonus(stack);

        textArea.appendText("Name - Surname - Position - Score - Bonus"+"\n");
        NodePriorityQueue temp = queue.head;
        while (temp != null){
            textArea.appendText(temp.person.toString()+"\n");
            temp = temp.next;
        }
        //making other buttons not disable
        listForNameButton.setDisable(false);
        listForPositionButton.setDisable(false);
    }

    //This method sorts and prints names alphabetically.
    @FXML
    void onListForNameButtonClick(ActionEvent event) {
        textArea.setText("Name - Surname - Score - Bonus"+"\n");
        ArrayList<String> nameList = new ArrayList<>();
        NodePriorityQueue temp = queue.head;
        while (temp != null){
            nameList.add(temp.person.getName()+" "+temp.person.getSurname()+" - "+temp.person.getScore()+" "+temp.person.getBonus());
            temp = temp.next;
        }
        Collections.sort(nameList);
        for (String data: nameList){
            textArea.appendText(data + "\n");
        }
    }

    //This method sorts and prints information of employees by positions.
    @FXML
    void onListForPositionButtonClick(ActionEvent event) {
        NodePriorityQueue temp = queue.head;
        while (temp != null){
            binarySearchTree.insert(temp.person.getPosition(), temp.person.getName()+" "+temp.person.getSurname()+" "+temp.person.getBonus());
            temp = temp.next;
        }
        textArea.setText("Position - Name - Surname - Bonus"+"\n");
        binarySearchTree.inorder(binarySearchTree.root,textArea);
    }

    public static void showPositionList(int data, String value, TextArea textArea){
        textArea.appendText(data+" - "+value+"\n");
    }
}