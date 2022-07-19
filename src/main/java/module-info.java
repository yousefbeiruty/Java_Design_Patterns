module com.example.corepatterns {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.corepatterns to javafx.fxml;
    exports com.example.corepatterns;
}