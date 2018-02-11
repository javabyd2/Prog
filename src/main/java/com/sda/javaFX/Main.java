package com.sda.javaFX;

import com.sda.javaFX.model.Person;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Observable;

public class Main extends Application {

    private  Stage primaryStage;
    private BorderPane rootLayout;
    private ObservableList<Person>personObservableList= FXCollections.observableArrayList();

//    static {
//
//    }


    public Main(){
        personObservableList.add(new Person("John", "Kovalsky"));
        personObservableList.add(new Person("John", "Kovalsky"));
        personObservableList.add(new Person("John", "Kovalsky"));
        personObservableList.add(new Person("John", "Kovalsky"));
        personObservableList.add(new Person("John", "Kovalsky"));
        personObservableList.add(new Person("John", "Kovalsky"));

    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage=primaryStage;

        initRootLayout();
        showPersonLayout();

//        @Override
//        public void start(Stage primaryStage) throws Exception{
//            BorderPane root = FXMLLoader.load(getClass().getClassLoader().getResource("RootLayout.fxml"));
//            AnchorPane mainMenu = FXMLLoader.load(getClass().getClassLoader().getResource("PersonLayout.fxml"));
//
//
//            primaryStage.setTitle("Hello World");
//            primaryStage.setScene(new Scene(root));
//
//
//            primaryStage.show();
//            root.setCenter(mainMenu);
//
//        }
    }

    public void initRootLayout()throws IOException{
        rootLayout = FXMLLoader.load(getClass().getClassLoader().getResource("RootLayout.fxml"));
        Scene scene = new Scene(rootLayout);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public void showPersonLayout()throws IOException{
        AnchorPane person = FXMLLoader.load(getClass().getClassLoader().getResource("PersonOverView.fxml"));
        rootLayout.setCenter(person);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
