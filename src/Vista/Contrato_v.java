package Vista;

import Entity.Contrato;
import Servicio.ContratoServicio;
import static Vista.Interfaz2.content;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

public class Contrato_v extends javax.swing.JPanel {

    String opcion;

    public Contrato_v() {
        initComponents();
        espera.setVisible(false);
        esperabusqueda.setVisible(false);
        new MostrarC().show();
        Mostrar.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                JTable table = (JTable) evt.getSource();
                Point point = evt.getPoint();
                int row = Mostrar.rowAtPoint(point);

                if (evt.getClickCount() == 1) {
                    try {
                        usrnm.setText(Mostrar.getValueAt(Mostrar.getSelectedRow(), 0).toString());
                        Vali();
                    } catch (Exception e) {
                        usrnm.setText("Ingrese el folio de contrato a buscar");
                    }
                }
                if (evt.getClickCount() == 2) {
                    try {

                        usrnm.setText(Mostrar.getValueAt(Mostrar.getSelectedRow(), 0).toString());
                        ContratosC ct = new ContratosC(Integer.parseInt(usrnm.getText()), "contrato");
                        ct.setVisible(true);

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Sin contrato", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }

        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Mostrar = new javax.swing.JTable();
        Title = new javax.swing.JLabel();
        usrnm = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Buscar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        esperabusqueda = new javax.swing.JLabel();
        espera = new javax.swing.JLabel();
        Cargando = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mostrar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio Contrato", "municipio", "colonia", "calle", "avenida", "referencia", "mzn", "lt", "id_consumo", "id_periodo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Mostrar.getTableHeader().setReorderingAllowed(false);
        Mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MostrarMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(Mostrar);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1030, 330));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Contratos");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        usrnm.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        usrnm.setForeground(new java.awt.Color(102, 102, 102));
        usrnm.setText("Ingrese el folio de contrato a buscar");
        usrnm.setBorder(null);
        usrnm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usrnmMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                usrnmMouseReleased(evt);
            }
        });
        add(usrnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 620, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 620, 10));

        Buscar.setBackground(new java.awt.Color(18, 90, 173));
        Buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar");
        Buscar.setBorder(null);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 80, 30));

        Nuevo.setBackground(new java.awt.Color(18, 90, 173));
        Nuevo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Nuevo.setForeground(new java.awt.Color(255, 255, 255));
        Nuevo.setText("Nuevo");
        Nuevo.setBorder(null);
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        add(Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 80, 30));

        Edit.setBackground(new java.awt.Color(18, 90, 173));
        Edit.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Edit.setForeground(new java.awt.Color(255, 255, 255));
        Edit.setText("Editar");
        Edit.setBorder(null);
        Edit.setEnabled(false);
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, 80, 30));

        Delete.setBackground(new java.awt.Color(18, 90, 173));
        Delete.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Dar de baja");
        Delete.setBorder(null);
        Delete.setEnabled(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 420, 80, 30));

        esperabusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargando (1).gif"))); // NOI18N
        add(esperabusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 50, 50));

        espera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargando (1).gif"))); // NOI18N
        add(espera, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, 50, 50));

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spinner-para-iphone.gif"))); // NOI18N
        add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarMousePressed
        if (usrnm.getText().equals("") || usrnm.getText() == null || usrnm.getText().equals(" ")) {
            usrnm.setText("Ingrese el folio de contrato a buscar");
        }
    }//GEN-LAST:event_MostrarMousePressed

    private void usrnmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrnmMousePressed
        if (usrnm.getText().equals("Ingrese el folio de contrato a buscar")) {
            usrnm.setText("");
        }
    }//GEN-LAST:event_usrnmMousePressed

    private void usrnmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrnmMouseReleased

    }//GEN-LAST:event_usrnmMouseReleased

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        if (usrnm.getText().equals("Ingrese el folio de contrato a buscar") || usrnm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vacio", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            opcion = "Buscar contrato";
            new Hilos().show();
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        /*
        Contrato_regis p1 = new Contrato_regis("contrato");
        p1.setSize(1030, 479);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();*/
    }//GEN-LAST:event_NuevoActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        opcion = "Editar contrato";
        new Hilos().show();
    }//GEN-LAST:event_EditActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        opcion = "Baja contrato";
        new Hilos().show();
    }//GEN-LAST:event_DeleteActionPerformed

    public class Hilos implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            if (opcion.equals("Editar contrato")) {
                espera.setVisible(true);
                Editar();
            }
            if (opcion.equals("Baja contrato")) {
                espera.setVisible(true);
                Baja();
                espera.setVisible(false);
                new MostrarC().show();
            }
            if (opcion.equals("Buscar contrato")) {
                esperabusqueda.setVisible(true);
                Buscar();
                esperabusqueda.setVisible(false);
            }
        }

    }

    public class MostrarC implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            Title.setVisible(false);
            usrnm.setVisible(false);
            Buscar.setVisible(false);
            Mostrar.setVisible(false);
            jScrollPane2.setVisible(false);
            Nuevo.setVisible(false);
            Edit.setVisible(false);
            Delete.setVisible(false);
            Edit.setVisible(false);
            jSeparator1.setVisible(false);
            Cargando.setVisible(true);
            GetContratos();
            Cargando.setVisible(false);
            Title.setVisible(true);
            usrnm.setVisible(true);
            Buscar.setVisible(true);
            Mostrar.setVisible(true);
            jScrollPane2.setVisible(true);
            Nuevo.setVisible(true);
            Edit.setVisible(true);
            Delete.setVisible(true);
            Edit.setVisible(true);
            jSeparator1.setVisible(true);
        }
    }

    private void Buscar() {
        ContratoServicio cs = new ContratoServicio();
        List<Contrato> lista = cs.SearchContrato(Integer.parseInt(usrnm.getText()));
        int tam = lista.size();
        String list[][] = new String[tam][7];
        for (int i = 0; i < tam; i++) {
            list[i][0] = lista.get(i).getFolioContrato().toString();
            list[i][1] = lista.get(i).getNombre();
            list[i][2] = lista.get(i).getMunicipio() + "/ " + lista.get(i).getResidencia() + "/ " + lista.get(i).getNombreCalle() + "/ " + lista.get(i).getCalleReferencia() + "/ " + lista.get(i).getNumeroMzn() + "/ " + lista.get(i).getNumeroLt();
            list[i][3] = lista.get(i).getTipo_consumo();
            list[i][4] = lista.get(i).getTipo_periodo();
            list[i][5] = lista.get(i).getDeuda().toString();
            list[i][6] = lista.get(i).getStatus();
        }
        Mostrar.setModel(new javax.swing.table.DefaultTableModel(
                list,
                new String[]{
                    "Folio", "Nombre", "Direccion", "Consumo", "Periodo", "Deuda", "Status"
                }) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        if (Mostrar.getColumnModel().getColumnCount() > 0) {
            Mostrar.getColumnModel().getColumn(0).setPreferredWidth(10);
            Mostrar.getColumnModel().getColumn(1).setPreferredWidth(10);
            Mostrar.getColumnModel().getColumn(2).setPreferredWidth(300);
            Mostrar.getColumnModel().getColumn(3).setPreferredWidth(80);
            Mostrar.getColumnModel().getColumn(4).setPreferredWidth(50);
            Mostrar.getColumnModel().getColumn(5).setPreferredWidth(20);
            Mostrar.getColumnModel().getColumn(6).setPreferredWidth(20);
        }
    }

    private void Baja() {
        ContratoServicio cs = new ContratoServicio();
        cs.DardeBaja(Integer.parseInt(usrnm.getText()));
    }

    private void Editar() {
        Contrato_regis p1 = new Contrato_regis(true, Integer.parseInt(usrnm.getText()), "editar contrato");
        p1.setSize(1030, 479);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void GetContratos() {
        ContratoServicio cs = new ContratoServicio();
        List<Contrato> lista = cs.MostrarContratos();
        int tam = lista.size();
        String list[][] = new String[tam][7];

        for (int i = 0; i < tam; i++) {
            list[i][0] = lista.get(i).getFolioContrato().toString();
            list[i][1] = lista.get(i).getNombre();
            list[i][2] = lista.get(i).getMunicipio() + "/ " + lista.get(i).getResidencia() + "/ " + lista.get(i).getNombreCalle() + "/ " + lista.get(i).getCalleReferencia() + "/ " + lista.get(i).getNumeroMzn() + "/ " + lista.get(i).getNumeroLt();
            list[i][3] = lista.get(i).getTipo_consumo();
            list[i][4] = lista.get(i).getTipo_periodo();
            list[i][5] = lista.get(i).getDeuda().toString();
            list[i][6] = lista.get(i).getStatus();
        }
        Mostrar.setModel(new javax.swing.table.DefaultTableModel(
                list,
                new String[]{
                    "Folio", "Nombre", "Direccion", "Consumo", "Periodo", "Deuda", "Status"
                }) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        if (Mostrar.getColumnModel().getColumnCount() > 0) {
            Mostrar.getColumnModel().getColumn(0).setPreferredWidth(10);
            Mostrar.getColumnModel().getColumn(1).setPreferredWidth(10);
            Mostrar.getColumnModel().getColumn(2).setPreferredWidth(300);
            Mostrar.getColumnModel().getColumn(3).setPreferredWidth(80);
            Mostrar.getColumnModel().getColumn(4).setPreferredWidth(50);
            Mostrar.getColumnModel().getColumn(5).setPreferredWidth(20);
            Mostrar.getColumnModel().getColumn(6).setPreferredWidth(20);
        }
    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(21, 101, 192));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(18, 90, 173));
    }

    private void Vali() {
        int idcell = Mostrar.getSelectedRow();
        if (idcell <= -1) {

        } else {
            Edit.setEnabled(true);
            Delete.setEnabled(true);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel Cargando;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JTable Mostrar;
    private javax.swing.JButton Nuevo;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel espera;
    private javax.swing.JLabel esperabusqueda;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField usrnm;
    // End of variables declaration//GEN-END:variables
}
