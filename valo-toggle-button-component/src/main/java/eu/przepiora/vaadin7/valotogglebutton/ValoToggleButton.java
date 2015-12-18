package eu.przepiora.vaadin7.valotogglebutton;

import eu.przepiora.vaadin7.valotogglebutton.client.ValoToggleButtonClientRpc;
import eu.przepiora.vaadin7.valotogglebutton.client.ValoToggleButtonServerRpc;
import eu.przepiora.vaadin7.valotogglebutton.client.ValoToggleButtonState;

import com.vaadin.shared.MouseEventDetails;

// This is the server-side UI component that provides public API 
// for ValoToggleButton
public class ValoToggleButton extends com.vaadin.ui.AbstractComponent {

	private int clickCount = 0;

	// To process events from the client, we implement ServerRpc
	private ValoToggleButtonServerRpc rpc = new ValoToggleButtonServerRpc() {

		// Event received from client - user clicked our widget
		public void clicked(MouseEventDetails mouseDetails) {
			
			// Send nag message every 5:th click with ClientRpc
			if (++clickCount % 5 == 0) {
				getRpcProxy(ValoToggleButtonClientRpc.class)
						.alert("Ok, that's enough!");
			}
			
			// Update shared state. This state update is automatically 
			// sent to the client. 
			getState().text = "You have clicked " + clickCount + " times";
		}
	};

	public ValoToggleButton() {

		// To receive events from the client, we register ServerRpc
		registerRpc(rpc);
	}

	// We must override getState() to cast the state to ValoToggleButtonState
	@Override
	protected ValoToggleButtonState getState() {
		return (ValoToggleButtonState) super.getState();
	}
}
