/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rocnikovka;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Petr
 */
public class C4 extends Application {

    int j = 0;
    int col1 = 6;
    int col2 = 6;
    int col3 = 6;
    int col4 = 6;
    int col5 = 6;
    int col6 = 6;
    int col7 = 6;

    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        pane.setVgap(3);
        pane.setHgap(3);
        Scene scene = new Scene(pane, 500, 500);
        Button btn1 = new Button("1");
        pane.add(btn1, 0, 0);
        btn1.setMinSize(45, 30);
        Button btn2 = new Button("2");
        pane.add(btn2, 1, 0);
        btn2.setMinSize(45, 30);
        Button btn3 = new Button("3");
        pane.add(btn3, 2, 0);
        btn3.setMinSize(45, 30);
        Button btn4 = new Button("4");
        pane.add(btn4, 3, 0);
        btn4.setMinSize(45, 30);
        Button btn5 = new Button("5");
        pane.add(btn5, 4, 0);
        btn5.setMinSize(45, 30);
        Button btn6 = new Button("6");
        pane.add(btn6, 5, 0);
        btn6.setMinSize(45, 30);
        Button btn7 = new Button("7");
        pane.add(btn7, 6, 0);
        btn7.setMinSize(45, 30);
        Label player = new Label();
        pane.add(player, 10, 0);
        Label tie = new Label("Remíza?");
        for (int k = 0; k < 7; k++) {
            for (int l = 1; l < 7; l++) {
                Button btn = new Button();
                btn.setMinSize(45, 45);
                pane.add(btn, k, l);
                btn.setDisable(true);
            }
        }
        btn1.setOnAction((e) -> {

            if (j % 2 == 1) {
                Button btnX = new Button("X");
                btnX.setDisable(true);
                btnX.setMinSize(45, 45);
                pane.add(btnX, 0, col1);
                player.setText("Hraje hráč 1 (O)");

            } else {
                Button btnO = new Button("O");
                btnO.setDisable(true);
                btnO.setMinSize(45, 45);
                pane.add(btnO, 0, col1);
                player.setText("Hraje hráč 2 (X)");

            }
            col1--;
            j++;
            if (col1 == 0) {
                btn1.setDisable(true);
            }
            if (j == 42) {
                pane.add(tie, 10, 0);
                player.setVisible(false);
            }

        });
        btn2.setOnAction((e) -> {
            if (j % 2 == 1) {
                Button btnX = new Button("X");
                btnX.setDisable(true);
                btnX.setMinSize(45, 45);
                pane.add(btnX, 1, col2);
                player.setText("Hraje hráč 1 (O)");

            } else {
                Button btnO = new Button("O");
                btnO.setDisable(true);
                btnO.setMinSize(45, 45);
                pane.add(btnO, 1, col2);
                player.setText("Hraje hráč 2 (X)");

            }
            col2--;
            j++;
            if (col2 == 0) {
                btn2.setDisable(true);

            }
            if (j == 42) {
                pane.add(tie, 10, 0);
                player.setVisible(false);

            }
        });
        btn3.setOnAction((e) -> {
            if (j % 2 == 1) {
                Button btnX = new Button("X");
                btnX.setDisable(true);
                btnX.setMinSize(45, 45);
                pane.add(btnX, 2, col3);
                player.setText("Hraje hráč 1 (O)");

            } else {
                Button btnO = new Button("O");
                btnO.setDisable(true);
                btnO.setMinSize(45, 45);
                pane.add(btnO, 2, col3);
                player.setText("Hraje hráč 2 (X)");

            }
            col3--;
            j++;
            if (col3 == 0) {
                btn3.setDisable(true);
            }
            if (j == 42) {
                pane.add(tie, 10, 0);
                player.setVisible(false);

            }
        });
        btn4.setOnAction((e) -> {
            if (j % 2 == 1) {
                Button btnX = new Button("X");
                btnX.setDisable(true);
                btnX.setMinSize(45, 45);
                pane.add(btnX, 3, col4);
                player.setText("Hraje hráč 1 (O)");

            } else {
                Button btnO = new Button("O");
                btnO.setDisable(true);
                btnO.setMinSize(45, 45);
                pane.add(btnO, 3, col4);
                player.setText("Hraje hráč 2 (X)");

            }
            col4--;
            j++;
            if (col4 == 0) {
                btn4.setDisable(true);
            }
            if (j == 42) {
                pane.add(tie, 10, 0);
                player.setVisible(false);

            }
        });
        btn5.setOnAction((e) -> {
            if (j % 2 == 1) {
                Button btnX = new Button("X");
                btnX.setDisable(true);
                btnX.setMinSize(45, 45);
                pane.add(btnX, 4, col5);
                player.setText("Hraje hráč 1 (O)");

            } else {
                Button btnO = new Button("O");
                btnO.setDisable(true);
                btnO.setMinSize(45, 45);
                pane.add(btnO, 4, col5);
                player.setText("Hraje hráč 2 (X)");

            }
            col5--;
            j++;
            if (col5 == 0) {
                btn5.setDisable(true);
            }
            if (j == 42) {
                pane.add(tie, 10, 0);
                player.setVisible(false);

            }
        });
        btn6.setOnAction((e) -> {
            if (j % 2 == 1) {
                Button btnX = new Button("X");
                btnX.setDisable(true);
                btnX.setMinSize(45, 45);
                pane.add(btnX, 5, col6);
                player.setText("Hraje hráč 1 (O)");

            } else {
                Button btnO = new Button("O");
                btnO.setDisable(true);
                btnO.setMinSize(45, 45);
                pane.add(btnO, 5, col6);
                player.setText("Hraje hráč 2 (X)");

            }
            col6--;
            j++;
            if (col6 == 0) {
                btn6.setDisable(true);
            }
            if (j == 42) {
                pane.add(tie, 10, 0);
                player.setVisible(false);

            }
        });
        btn7.setOnAction((e) -> {
            if (j % 2 == 1) {
                Button btnX = new Button("X");
                btnX.setDisable(true);
                btnX.setMinSize(45, 45);
                pane.add(btnX, 6, col7);
                player.setText("Hraje hráč 1 (O)");

            } else {
                Button btnO = new Button("O");
                btnO.setDisable(true);
                btnO.setMinSize(45, 45);
                pane.add(btnO, 6, col7);
                player.setText("Hraje hráč 2 (X)");

            }
            col7--;
            j++;
            if (col7 == 0) {
                btn7.setDisable(true);
            }
            if (j == 42) {
                pane.add(tie, 10, 0);
                player.setVisible(false);

            }
        });

        primaryStage.setTitle("Connect4");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
