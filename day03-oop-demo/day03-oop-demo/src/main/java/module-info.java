module com.example.day03oopdemo {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.day03oopdemo to javafx.fxml;
    exports com.example.day03oopdemo;
}