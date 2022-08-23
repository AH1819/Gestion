package Vista;

public class Reportes extends javax.swing.JPanel {

    
    
    public Reportes() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Reportes = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        Label_registro = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Reportes.setBackground(new java.awt.Color(255, 255, 255));
        Reportes.setForeground(new java.awt.Color(0, 0, 0));
        Reportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 360, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1030, 10));

        Label_registro.setBackground(new java.awt.Color(255, 255, 255));
        Label_registro.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Label_registro.setForeground(new java.awt.Color(0, 0, 0));
        Label_registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_registro.setText("Reportes");
        add(Label_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_registro;
    private javax.swing.JComboBox<String> Reportes;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
