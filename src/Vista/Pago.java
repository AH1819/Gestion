package Vista;

import Entity.Cat_pago;
import Entity.Cliente;
import Servicio.CatalogosServicio;
import Servicio.ClienteServicio;
import java.util.List;
import javax.swing.JOptionPane;

public class Pago extends javax.swing.JPanel {

    String opcion;
    String folio;
    Cliente cl = new Cliente();
    public Pago() {
        initComponents();
        Cargando.setVisible(false);
        N_cte.setEditable(false);
        Celular.setEditable(false);
        Municipio.setEditable(false);
        Residencia.setEditable(false);
        Manzana.setEditable(false);
        Lote.setEditable(false);
        Importe.setEditable(false);
        new Inicio().show();
        contrato.setVisible(false);
        Contrato.setEditable(false);
    }
    
    public Pago(String fol) {
        initComponents();
        this.folio = fol;
        Dato.setText(fol);
        Busqueda.setSelectedItem("Folio contrato");
        Cargando.setVisible(false);
        N_cte.setEditable(false);
        Celular.setEditable(false);
        Municipio.setEditable(false);
        Residencia.setEditable(false);
        Manzana.setEditable(false);
        Lote.setEditable(false);
        Importe.setEditable(false);
        new Inicio().show();
        new ContratoB().show();
        contrato.setVisible(true);
        contrato.setText("Folio cliente");
        Contrato.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Dato = new javax.swing.JTextField();
        Pago = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Residencia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Celular = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        D_pago = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        Municipio = new javax.swing.JTextField();
        N_cte = new javax.swing.JTextField();
        Lote = new javax.swing.JTextField();
        Manzana = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        T_pago = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        Importe = new javax.swing.JTextField();
        Cancelar = new javax.swing.JPanel();
        Cancel = new javax.swing.JLabel();
        Busqueda = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Contrato = new javax.swing.JTextField();
        contrato = new javax.swing.JLabel();
        Cargando = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de pago");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1030, 10));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Pago:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 60, -1));

        Dato.setBackground(new java.awt.Color(255, 255, 255));
        Dato.setForeground(new java.awt.Color(0, 0, 0));
        Dato.setText(" Ingrese el dato");
        Dato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DatoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DatoMouseReleased(evt);
            }
        });
        Dato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatoActionPerformed(evt);
            }
        });
        Dato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DatoKeyTyped(evt);
            }
        });
        add(Dato, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 140, 40));

        Pago.setBackground(new java.awt.Color(255, 255, 255));
        Pago.setForeground(new java.awt.Color(0, 0, 0));
        Pago.setText(" Cantidad a pagar");
        Pago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PagoMousePressed(evt);
            }
        });
        add(Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 190, 40));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Residencia:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 70, -1));

        Residencia.setBackground(new java.awt.Color(255, 255, 255));
        Residencia.setForeground(new java.awt.Color(0, 0, 0));
        add(Residencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 190, 40));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Celular:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        Celular.setBackground(new java.awt.Color(255, 255, 255));
        Celular.setForeground(new java.awt.Color(0, 0, 0));
        add(Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 230, 40));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Importe:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 70, -1));

        D_pago.setBackground(new java.awt.Color(255, 255, 255));
        D_pago.setForeground(new java.awt.Color(0, 0, 0));
        D_pago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        D_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_pagoActionPerformed(evt);
            }
        });
        add(D_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 220, 40));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Municipio:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 70, -1));

        Municipio.setBackground(new java.awt.Color(255, 255, 255));
        Municipio.setForeground(new java.awt.Color(0, 0, 0));
        add(Municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 210, 40));

        N_cte.setBackground(new java.awt.Color(255, 255, 255));
        N_cte.setForeground(new java.awt.Color(0, 0, 0));
        N_cte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_cteActionPerformed(evt);
            }
        });
        add(N_cte, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 430, 40));

        Lote.setBackground(new java.awt.Color(255, 255, 255));
        Lote.setForeground(new java.awt.Color(0, 0, 0));
        add(Lote, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 100, 40));

        Manzana.setBackground(new java.awt.Color(255, 255, 255));
        Manzana.setForeground(new java.awt.Color(0, 0, 0));
        Manzana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManzanaActionPerformed(evt);
            }
        });
        add(Manzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 90, 40));

        jLabel13.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Lote:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Manzana:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Tipo de pago:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        T_pago.setBackground(new java.awt.Color(255, 255, 255));
        T_pago.setForeground(new java.awt.Color(0, 0, 0));
        T_pago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(T_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 220, 40));

        jLabel16.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Descuento:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        Importe.setBackground(new java.awt.Color(255, 255, 255));
        Importe.setForeground(new java.awt.Color(0, 0, 0));
        Importe.setText(" Importe a pagar");
        add(Importe, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 190, 40));

        Cancelar.setBackground(new java.awt.Color(51, 102, 255));
        Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CancelarMousePressed(evt);
            }
        });

        Cancel.setBackground(new java.awt.Color(18, 90, 173));
        Cancel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Cancel.setForeground(new java.awt.Color(255, 255, 255));
        Cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-volver-30.png"))); // NOI18N
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CancelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout CancelarLayout = new javax.swing.GroupLayout(Cancelar);
        Cancelar.setLayout(CancelarLayout);
        CancelarLayout.setHorizontalGroup(
            CancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CancelarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CancelarLayout.setVerticalGroup(
            CancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CancelarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, 40));

        Busqueda.setBackground(new java.awt.Color(255, 255, 255));
        Busqueda.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Busqueda.setForeground(new java.awt.Color(0, 0, 0));
        Busqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción", "Folio contrato", "Folio cliente", "Telefono/celular" }));
        Busqueda.setToolTipText("Busqueda por distintos datos");
        Busqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BusquedaMousePressed(evt);
            }
        });
        Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaActionPerformed(evt);
            }
        });
        add(Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 160, 40));

        jButton1.setBackground(new java.awt.Color(18, 90, 173));
        jButton1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Realizar pago");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, -1, 40));

        Buscar.setBackground(new java.awt.Color(18, 90, 173));
        Buscar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 110, 40));

        Contrato.setBackground(new java.awt.Color(255, 255, 255));
        Contrato.setForeground(new java.awt.Color(0, 0, 0));
        Contrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContratoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ContratoMouseReleased(evt);
            }
        });
        Contrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContratoActionPerformed(evt);
            }
        });
        add(Contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 140, 40));

        contrato.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        contrato.setForeground(new java.awt.Color(0, 0, 0));
        contrato.setText("Folio del Contrato");
        add(contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, -1, -1));

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargando (1).gif"))); // NOI18N
        add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 60, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void D_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_pagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_pagoActionPerformed

    private void N_cteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N_cteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_N_cteActionPerformed

    private void ManzanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManzanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManzanaActionPerformed

    private void DatoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_DatoMouseReleased

    private void DatoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatoMousePressed
        if (Dato.getText().equals(" Ingrese el dato")) {
            Dato.setText("");
        }
    }//GEN-LAST:event_DatoMousePressed

    private void PagoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagoMousePressed

    }//GEN-LAST:event_PagoMousePressed

    private void CancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMousePressed

    }//GEN-LAST:event_CancelMousePressed

    private void CancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMousePressed

    }//GEN-LAST:event_CancelarMousePressed

    private void DatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatoActionPerformed

    private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedaMousePressed
        if (Dato.getText().isEmpty()) {
            Dato.setText(" Ingrese el dato");
        }
    }//GEN-LAST:event_BusquedaMousePressed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        if (Busqueda.getSelectedItem().equals("Folio contrato")) {
            contrato.setVisible(true);
            contrato.setText("Folio cliente");
        }
        if (Busqueda.getSelectedItem().equals("Folio cliente")) {
            contrato.setVisible(true);
            contrato.setText("Folio contrato");
        }
        if (Busqueda.getSelectedItem().equals("Telefono/celular")) {
            contrato.setVisible(true);
            contrato.setText("Telefono/celular");
        }
        if (Busqueda.getSelectedItem().equals("Selecciona una opción") || Dato.getText().equals(" Ingrese el dato") || Dato.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar y elegir el tipo de dato para la busqueda", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            new Hilos().show();
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void ContratoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContratoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContratoMousePressed

    private void ContratoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContratoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ContratoMouseReleased

    private void ContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContratoActionPerformed

    private void DatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DatoKeyTyped

        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_DatoKeyTyped

    public class Inicio implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            pago();
        }
    }
    
    public class ContratoB implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            Cargando.setVisible(true);
            contrato(folio);
            Cargando.setVisible(false);
        }
    }
    
    public class Hilos implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {

            Cargando.setVisible(true);

            if (Busqueda.getSelectedItem().equals("Folio contrato")) {
                contrato(Dato.getText());
                Cargando.setVisible(false);
            }
            if (Busqueda.getSelectedItem().equals("Folio cliente")) {
                cte();
                Cargando.setVisible(false);
            }
            if (Busqueda.getSelectedItem().equals("Telefono/celular")) {
                numc();
                Cargando.setVisible(false);
            }
        }
    }

    private void contrato(String num) {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.PagoCl_contrato(Integer.parseInt(num));
        int tam = lista.size();
        if (tam > 0) {
            for (int i = 0; i < tam; i++) {
                Contrato.setText(lista.get(i).getFolio().toString());
                N_cte.setText(lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m());
                Celular.setText(lista.get(i).getCelular());
                Municipio.setText(lista.get(i).getMunicipio());
                Residencia.setText(lista.get(i).getResidencia());
                Manzana.setText(lista.get(i).getNumeroMzn());
                Lote.setText(lista.get(i).getNumeroLt());
                Importe.setText(String.valueOf(lista.get(i).getDeuda()));
            }

        } else {
            Dato.setText(" Ingrese el dato");
            N_cte.setText("");
            Contrato.setText("");
            Celular.setText("");
            Municipio.setText("");
            Residencia.setText("");
            Manzana.setText("");
            Lote.setText("");
            Importe.setText(" Importe a pagar");
            Pago.setText(" Cantidad a pagar");
            JOptionPane.showMessageDialog(this, "No se encontro ningun registro", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void cte() {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.PagoCl_cte(Integer.parseInt(Dato.getText()));
        int tam = lista.size();
        if (tam > 0) {
            if (tam > 1) {
                int fol = 0;
                for (int i = 0; i < tam; i++) {
                    fol = lista.get(i).getFolio();
                }
                ContratosC cc = new ContratosC("Contrato", fol);
                cc.setVisible(true);
                
            } else {
                for (int i = 0; i < tam; i++) {
                    Contrato.setText(lista.get(i).getFolio().toString());
                    N_cte.setText(lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m());
                    Celular.setText(lista.get(i).getCelular());
                    Municipio.setText(lista.get(i).getMunicipio());
                    Residencia.setText(lista.get(i).getResidencia());
                    Manzana.setText(lista.get(i).getNumeroMzn());
                    Lote.setText(lista.get(i).getNumeroLt());
                    Importe.setText(String.valueOf(lista.get(i).getDeuda()));
                }
            }
        } else {
            Dato.setText(" Ingrese el dato");
            N_cte.setText("");
            Contrato.setText("");
            Celular.setText("");
            Municipio.setText("");
            Residencia.setText("");
            Manzana.setText("");
            Lote.setText("");
            Importe.setText(" Importe a pagar");
            Pago.setText(" Cantidad a pagar");
            JOptionPane.showMessageDialog(this, "No se encontro ningun registro", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void numc() {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.PagoCl_num(Dato.getText());
        int tam = lista.size();
        if (tam > 0) {
            if (tam > 1) {
                int fol = 0;
                for (int i = 0; i < tam; i++) {
                    fol = lista.get(i).getFolio();
                }
                ContratosC cc = new ContratosC("Contrato", fol);
                cc.setVisible(true);
            } else {
                for (int i = 0; i < tam; i++) {
                    Contrato.setText(lista.get(i).getCelular());
                    N_cte.setText(lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m());
                    Celular.setText(lista.get(i).getTelefono());
                    Municipio.setText(lista.get(i).getMunicipio());
                    Residencia.setText(lista.get(i).getResidencia());
                    Manzana.setText(lista.get(i).getNumeroMzn());
                    Lote.setText(lista.get(i).getNumeroLt());
                    Importe.setText(String.valueOf(lista.get(i).getDeuda()));
                }
            }
        } else {
            numt();
        }

    }

    private void numt() {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.PagoCl_numT(Dato.getText());
        int tam = lista.size();
        if (tam > 0) {
            if (tam > 1) {
                int fol = 0;
                for (int i = 0; i < tam; i++) {
                    fol = lista.get(i).getFolio();
                }
                ContratosC cc = new ContratosC("Contrato", fol);
                cc.setVisible(true);
            } else {
                for (int i = 0; i < tam; i++) {
                    Contrato.setText(lista.get(i).getTelefono());
                    N_cte.setText(lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m());
                    Celular.setText(lista.get(i).getCelular());
                    Municipio.setText(lista.get(i).getMunicipio());
                    Residencia.setText(lista.get(i).getResidencia());
                    Manzana.setText(lista.get(i).getNumeroMzn());
                    Lote.setText(lista.get(i).getNumeroLt());
                    Importe.setText(String.valueOf(lista.get(i).getDeuda()));
                }
            }
        } else {
            Dato.setText(" Ingrese el dato");
            N_cte.setText("");
            Contrato.setText("");
            Celular.setText("");
            Municipio.setText("");
            Residencia.setText("");
            Manzana.setText("");
            Lote.setText("");
            Importe.setText(" Importe a pagar");
            Pago.setText(" Cantidad a pagar");
            JOptionPane.showMessageDialog(this, "No se encontro ningun registro", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void pago() {
        CatalogosServicio cs = new CatalogosServicio();
        List<Cat_pago> lista = cs.Tipo_pago();
        int tam = lista.size();
        T_pago.addItem("Seleccione una opción");
        for (int i = 0; i < tam; i++) {
            T_pago.addItem(lista.get(i).getTipo_pago());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JComboBox<String> Busqueda;
    private javax.swing.JLabel Cancel;
    private javax.swing.JPanel Cancelar;
    private javax.swing.JLabel Cargando;
    private javax.swing.JTextField Celular;
    private javax.swing.JTextField Contrato;
    private javax.swing.JComboBox<String> D_pago;
    private javax.swing.JTextField Dato;
    private javax.swing.JTextField Importe;
    private javax.swing.JTextField Lote;
    private javax.swing.JTextField Manzana;
    private javax.swing.JTextField Municipio;
    private javax.swing.JTextField N_cte;
    private javax.swing.JTextField Pago;
    private javax.swing.JTextField Residencia;
    private javax.swing.JComboBox<String> T_pago;
    private javax.swing.JLabel contrato;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
