module ChallangeUI {
    requires javafx.controls;
    requires  javafx.fxml;
    requires  java.xml;
    //requires  jlfgr;

    opens sample.datamodel;
    opens sample;
}