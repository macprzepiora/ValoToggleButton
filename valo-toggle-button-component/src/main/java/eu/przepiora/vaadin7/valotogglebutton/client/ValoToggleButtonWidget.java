package eu.przepiora.vaadin7.valotogglebutton.client;

import com.google.gwt.user.client.ui.Label;

// Extend any GWT Widget
public class ValoToggleButtonWidget extends Label {

	public ValoToggleButtonWidget() {

		// CSS class-name should not be v- prefixed
		setStyleName("valo-toggle-button");

		// State is set to widget in ValoToggleButtonConnector		
	}

}