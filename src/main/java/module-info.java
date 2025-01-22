module com.ep.demojafafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ep.demojafafx to javafx.fxml;
    exports com.ep.demojafafx;
}