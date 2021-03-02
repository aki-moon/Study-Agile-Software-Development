package agilesoftwaredevelopment.designpattern.mediator;

import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class QuickEntryMediator {
	private JTextField itsTextField;
	private JList<?> itsList;

	public QuickEntryMediator(JTextField textField, JList<?> list) {
		itsTextField = textField;
		itsList = list;
		itsTextField.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void removeUpdate(DocumentEvent e) {
				textFieldChanged();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				textFieldChanged();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				textFieldChanged();
			}
		});
	}

	private void textFieldChanged() {
		String prefix = itsTextField.getText();
		if (prefix.length() == 0) {
			itsList.clearSelection();
			return;
		}
		ListModel<?> listModel = itsList.getModel();
		boolean found = false;
		for (int i = 0; found == false && i < listModel.getSize(); i++) {
			Object object = listModel.getElementAt(i);
			String string = object.toString();
			if (string.startsWith(prefix)) {
				itsList.setSelectedValue(object, true);
			}
		}
		if (!found) {
			itsList.clearSelection();
		}
	}
}
