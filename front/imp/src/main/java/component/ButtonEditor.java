package component;

import com.jackson.imp.view.CrudProducts;
import javax.swing.*;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ButtonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {
    private JButton button;
    private boolean isPushed;
    private JTable table;
    private int row, col;
    private CrudProducts frame;

    public ButtonEditor(JTable table, CrudProducts frame) {
        this.table = table;
        this.frame = frame;
        button = new JButton();
        button.addActionListener(this);
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        if (value instanceof JButton) {
            button.setText(((JButton) value).getText());
        }
        this.row = row;
        this.col = column;
        this.isPushed = true;
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isPushed) {
            if (col == 4) { try {
                // Suponiendo que el botón de editar está en la columna 4
                System.out.println("Editar en la fila: " + row);
                this.frame.editProduct(row);
                } catch (Exception ex) {
                    Logger.getLogger(ButtonEditor.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (col == 5) { // Suponiendo que el botón de eliminar está en la columna 5
                System.out.println("Eliminar en la fila: " + row);
                try {
                    this.frame.deleteProduct(row);
                } catch (Exception ex) {
                    Logger.getLogger(ButtonEditor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        isPushed = false;
        fireEditingStopped();
    }
}
