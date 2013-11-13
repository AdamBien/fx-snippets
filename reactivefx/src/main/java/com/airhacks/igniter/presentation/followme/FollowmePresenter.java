package com.airhacks.igniter.presentation.followme;

/*
 * #%L
 * igniter
 * %%
 * Copyright (C) 2013 Adam Bien
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
import com.airhacks.igniter.business.flightcontrol.boundary.Tower;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;
import javax.inject.Inject;

/**
 *
 * @author adam-bien.com
 */
public class FollowmePresenter implements Initializable {

    @FXML
    Label a;
    @Inject
    Tower tower;

    String pilot;

    @FXML
    TextField b;

    @FXML
    TextField c;

    IntegerProperty bNumber = new SimpleIntegerProperty();
    IntegerProperty cNumber = new SimpleIntegerProperty();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Bindings.bindBidirectional(b.textProperty(), bNumber, new NumberStringConverter());
        Bindings.bindBidirectional(c.textProperty(), cNumber, new NumberStringConverter());
        a.textProperty().bind(bNumber.add(cNumber).asString());
    }

    public void launch() {
    }

}
