package Vista;

import Entity.Cat_Consumo;
import Entity.Cat_periodo;
import Entity.Cliente;
import Entity.Contrato;
import Entity.DetTipoconsumoTarifa;
import Entity.ErrorsAndSuccesses;
import Servicio.CatalogosServicio;
import Servicio.ClienteServicio;
import Servicio.ContratoServicio;
import Servicio.TarifaServicio;
import static Vista.Interfaz2.content;
import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class Contrato_regis extends javax.swing.JPanel {

    String nombre;
    String app;
    String apm;
    Date nac;
    String tel;
    String rfc;
    String celular;
    String email;
    String curp;
    String Muni;
    String Resi;
    String nom_calle;
    String Refe;
    int Manz;
    int Lot;
    int folio;
    String ubicacion;
    int idconsumo;
    int idperiodo;
    String opcion;
    private boolean edit;
    int id;
    ErrorsAndSuccesses es = new ErrorsAndSuccesses();

    public Contrato_regis(Cliente cliente, String ubicacion) {
        initComponents();
        Cargando.setVisible(false);
        GetConsumo();
        GetPeriodo();
        this.nombre = cliente.getNombre();
        this.app = cliente.getApellido_p();
        this.apm = cliente.getApellido_m();
        this.nac = cliente.getFecha_nac();
        this.tel = cliente.getTelefono();
        this.rfc = cliente.getRfc();
        this.curp = cliente.getCurp();
        this.email = cliente.getEmail();
        this.celular = cliente.getCelular();
        this.Lot = cliente.getNumeroLt();
        this.Manz = cliente.getNumeroMzn();
        this.Muni = cliente.getMunicipio();
        this.Resi = cliente.getResidencia();
        this.nom_calle = cliente.getNombreCalle();
        this.Refe = cliente.getCalleReferencia();
        this.ubicacion = ubicacion;
        InsertarCliente();
        if (opcion.equals("Si")) {
            Referencia.setText(cliente.getCalleReferencia());
            Municipio.setText(cliente.getMunicipio());
            Residencia.setText(cliente.getResidencia());
            Nombre_calle.setText(cliente.getNombreCalle());
            Lote.setText(cliente.getNumeroLt().toString());
            Manzana.setText(cliente.getNumeroMzn().toString());
        }
    }

    public Contrato_regis(int folio, String ubicacion) {
        initComponents();
        Cargando.setVisible(false);
        GetConsumo();
        GetPeriodo();
        this.ubicacion = ubicacion;
        this.folio = folio;
    }

    public Contrato_regis(boolean edit, int folio, String ubicacion) {
        initComponents();
        Cargando.setVisible(false);
        this.ubicacion = ubicacion;
        if (edit == true) {
            Obtener(folio);
            Contrato.setText("Modificar datos del contrato");
            Registrar.setText("Guardar");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Municipio = new javax.swing.JTextField();
        Consumo = new javax.swing.JComboBox<>();
        Periodo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Tipo_p = new javax.swing.JLabel();
        Residencia = new javax.swing.JTextField();
        Nombre_calle = new javax.swing.JTextField();
        Referencia = new javax.swing.JTextField();
        Manzana = new javax.swing.JTextField();
        Lote = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Folio = new javax.swing.JLabel();
        Contrato = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rerefencia = new javax.swing.JLabel();
        Tipo_c = new javax.swing.JLabel();
        Tarifa = new javax.swing.JComboBox<>();
        tarifa = new javax.swing.JLabel();
        observaciones = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Observaciones = new javax.swing.JTextArea();
        Cargando = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Municipio.setBackground(new java.awt.Color(255, 255, 255));
        Municipio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Municipio.setForeground(new java.awt.Color(0, 0, 0));
        Municipio.setText(" Municipio");
        Municipio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MunicipioMousePressed(evt);
            }
        });
        Municipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MunicipioKeyTyped(evt);
            }
        });
        add(Municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 170, 40));

        Consumo.setBackground(new java.awt.Color(255, 255, 255));
        Consumo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Consumo.setForeground(new java.awt.Color(0, 0, 0));
        Consumo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción" }));
        Consumo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Consumo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ConsumoItemStateChanged(evt);
            }
        });
        Consumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsumoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConsumoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ConsumoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ConsumoMouseReleased(evt);
            }
        });
        Consumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsumoActionPerformed(evt);
            }
        });
        Consumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ConsumoKeyTyped(evt);
            }
        });
        add(Consumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 170, 40));

        Periodo.setBackground(new java.awt.Color(255, 255, 255));
        Periodo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Periodo.setForeground(new java.awt.Color(0, 0, 0));
        Periodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción" }));
        Periodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Periodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PeriodoMousePressed(evt);
            }
        });
        add(Periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 200, 40));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Municipio:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, 20));

        Tipo_p.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Tipo_p.setForeground(new java.awt.Color(0, 0, 0));
        Tipo_p.setText("Periodo a pagar:");
        add(Tipo_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 150, 40));

        Residencia.setBackground(new java.awt.Color(255, 255, 255));
        Residencia.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Residencia.setForeground(new java.awt.Color(0, 0, 0));
        Residencia.setText(" Col/barrio/fracc");
        Residencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ResidenciaMousePressed(evt);
            }
        });
        Residencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ResidenciaKeyTyped(evt);
            }
        });
        add(Residencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 200, 40));

        Nombre_calle.setBackground(new java.awt.Color(255, 255, 255));
        Nombre_calle.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Nombre_calle.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_calle.setText(" Nombre de la calle");
        Nombre_calle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Nombre_calleMousePressed(evt);
            }
        });
        Nombre_calle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nombre_calleKeyTyped(evt);
            }
        });
        add(Nombre_calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 140, 40));

        Referencia.setBackground(new java.awt.Color(255, 255, 255));
        Referencia.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Referencia.setForeground(new java.awt.Color(0, 0, 0));
        Referencia.setText(" Calle de referencia");
        Referencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ReferenciaMousePressed(evt);
            }
        });
        add(Referencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 150, 40));

        Manzana.setBackground(new java.awt.Color(255, 255, 255));
        Manzana.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Manzana.setForeground(new java.awt.Color(0, 0, 0));
        Manzana.setText(" Num. Manz");
        Manzana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ManzanaMousePressed(evt);
            }
        });
        Manzana.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ManzanaKeyTyped(evt);
            }
        });
        add(Manzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 90, 40));

        Lote.setBackground(new java.awt.Color(255, 255, 255));
        Lote.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Lote.setForeground(new java.awt.Color(0, 0, 0));
        Lote.setText(" Num. Lt");
        Lote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoteMousePressed(evt);
            }
        });
        Lote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LoteKeyTyped(evt);
            }
        });
        add(Lote, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 90, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1030, 10));

        Folio.setForeground(new java.awt.Color(0, 0, 0));
        Folio.setText("Folio:");
        add(Folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        Contrato.setBackground(new java.awt.Color(255, 255, 255));
        Contrato.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Contrato.setForeground(new java.awt.Color(0, 0, 0));
        Contrato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Contrato.setText("Contrato");
        add(Contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Col/barrio/fracc:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 180, 20));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nombre de la calle:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 120, 20));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Numero de manzana: ");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 140, 30));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Lote/Numero Exterior:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 150, 30));

        rerefencia.setBackground(new java.awt.Color(0, 0, 0));
        rerefencia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        rerefencia.setForeground(new java.awt.Color(0, 0, 0));
        rerefencia.setText("Calle de referencia:");
        add(rerefencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 120, 20));

        Tipo_c.setBackground(new java.awt.Color(0, 0, 0));
        Tipo_c.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Tipo_c.setForeground(new java.awt.Color(0, 0, 0));
        Tipo_c.setText("Tipo de consumo:");
        add(Tipo_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 120, 40));

        Tarifa.setBackground(new java.awt.Color(255, 255, 255));
        Tarifa.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Tarifa.setForeground(new java.awt.Color(0, 0, 0));
        Tarifa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(Tarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 160, 40));

        tarifa.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tarifa.setForeground(new java.awt.Color(0, 0, 0));
        tarifa.setText("Tarifa:");
        add(tarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 110, 40));

        observaciones.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        observaciones.setForeground(new java.awt.Color(0, 0, 0));
        observaciones.setText("Observaciones:");
        add(observaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 110, 30));

        Registrar.setBackground(new java.awt.Color(18, 90, 173));
        Registrar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setText("Registrar");
        Registrar.setBorder(null);
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, 100, 40));

        Regresar.setBackground(new java.awt.Color(18, 90, 173));
        Regresar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setText("Volver");
        Regresar.setBorder(null);
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 100, 40));

        Observaciones.setBackground(new java.awt.Color(255, 255, 255));
        Observaciones.setColumns(20);
        Observaciones.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Observaciones.setForeground(new java.awt.Color(0, 0, 0));
        Observaciones.setRows(5);
        jScrollPane1.setViewportView(Observaciones);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 270, 100));

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spinner-para-iphone.gif"))); // NOI18N
        add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void MunicipioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MunicipioMousePressed
        if (Municipio.getText().equals(" Municipio")) {
            Municipio.setText("");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Colonia");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de la calle");
        }
        if (Manzana.getText().isEmpty()) {
            Manzana.setText(" Num. Manz");
        }
        if (Lote.getText().isEmpty()) {
            Lote.setText(" Num. Lt");
        }
        if (Referencia.getText().isEmpty()) {
            Referencia.setText(" Calle de referencia");
        }

    }//GEN-LAST:event_MunicipioMousePressed

    private void ConsumoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsumoMousePressed


    }//GEN-LAST:event_ConsumoMousePressed

    private void ConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsumoActionPerformed

    private void PeriodoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PeriodoMousePressed


    }//GEN-LAST:event_PeriodoMousePressed

    private void ResidenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResidenciaMousePressed
        if (Residencia.getText().equals(" Col/barrio/fracc")) {
            Residencia.setText("");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de la calle");
        }
        if (Manzana.getText().isEmpty()) {
            Manzana.setText(" Num. Manz");
        }
        if (Lote.getText().isEmpty()) {
            Lote.setText(" Num. Lt");
        }
        if (Referencia.getText().isEmpty()) {
            Referencia.setText(" Calle de referencia");
        }
    }//GEN-LAST:event_ResidenciaMousePressed

    private void Nombre_calleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nombre_calleMousePressed
        if (Nombre_calle.getText().equals(" Nombre de la calle")) {
            Nombre_calle.setText("");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Colonia");
        }
        if (Manzana.getText().isEmpty()) {
            Manzana.setText(" Num. Manz");
        }
        if (Lote.getText().isEmpty()) {
            Lote.setText(" Num. Lt");
        }
        if (Referencia.getText().isEmpty()) {
            Referencia.setText(" Calle de referencia");
        }
    }//GEN-LAST:event_Nombre_calleMousePressed

    private void ManzanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManzanaMousePressed
        if (Manzana.getText().equals(" Num. Manz")) {
            Manzana.setText("");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Colonia");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de la calle");
        }
        if (Lote.getText().isEmpty()) {
            Lote.setText(" Num. Lt");
        }
        if (Referencia.getText().isEmpty()) {
            Referencia.setText(" Calle de referencia");
        }
    }//GEN-LAST:event_ManzanaMousePressed

    private void LoteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoteMousePressed
        if (Lote.getText().equals(" Num. Lt")) {
            Lote.setText("");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Colonia");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de la calle");
        }
        if (Manzana.getText().isEmpty()) {
            Manzana.setText(" Num. Manz");
        }
        if (Referencia.getText().isEmpty()) {
            Referencia.setText(" Calle de referencia");
        }
    }//GEN-LAST:event_LoteMousePressed

    private void ReferenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReferenciaMousePressed
        if (Referencia.getText().equals(" Calle de referencia")) {
            Referencia.setText("");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Colonia");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de la calle");
        }
        if (Lote.getText().isEmpty()) {
            Lote.setText(" Num. Lt");
        }
        if (Manzana.getText().isEmpty()) {
            Manzana.setText(" Num. Manz");
        }
    }//GEN-LAST:event_ReferenciaMousePressed

    private void MunicipioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MunicipioKeyTyped
        // TODO add your handling code here:
        entrada(evt);
    }//GEN-LAST:event_MunicipioKeyTyped

    private void ResidenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ResidenciaKeyTyped

    }//GEN-LAST:event_ResidenciaKeyTyped

    private void Nombre_calleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre_calleKeyTyped

    }//GEN-LAST:event_Nombre_calleKeyTyped

    private void ManzanaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ManzanaKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_ManzanaKeyTyped

    private void LoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoteKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_LoteKeyTyped

    private void ConsumoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConsumoKeyTyped

    }//GEN-LAST:event_ConsumoKeyTyped

    private void ConsumoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsumoMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_ConsumoMouseReleased

    private void ConsumoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsumoMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_ConsumoMouseEntered

    private void ConsumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsumoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_ConsumoMouseClicked

    private void ConsumoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ConsumoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            GetIdconsumo();
            new Tari().show();
        }
    }//GEN-LAST:event_ConsumoItemStateChanged

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        if(edit == true){
            
        }else{
            InsertarContrato(folio);
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        if (edit != true) {
            if (ubicacion.equals("contrato")) {
                Contrato_v p1 = new Contrato_v();
                p1.setSize(1030, 500);
                p1.setLocation(0, 0);

                content.removeAll();
                content.add(p1, BorderLayout.CENTER);
                content.revalidate();
                content.repaint();
            }
            if (ubicacion.equals("insert cliente")) {
                Clientes p1 = new Clientes();
                p1.setSize(1030, 500);
                p1.setLocation(0, 0);

                content.removeAll();
                content.add(p1, BorderLayout.CENTER);
                content.revalidate();
                content.repaint();
            }
            if (ubicacion.equals("cliente")) {
                Clientes p1 = new Clientes();
                p1.setSize(1030, 500);
                p1.setLocation(0, 0);

                content.removeAll();
                content.add(p1, BorderLayout.CENTER);
                content.revalidate();
                content.repaint();
            }
        } else {
            Contrato_v p1 = new Contrato_v();
            p1.setSize(1030, 500);
            p1.setLocation(0, 0);

            content.removeAll();
            content.add(p1, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }

    }//GEN-LAST:event_RegresarActionPerformed
    public class Tari implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            GetTarifa(idconsumo);
        }
    }

    private void GetConsumo() {

        CatalogosServicio cs = new CatalogosServicio();
        List<Cat_Consumo> lista = cs.GetConsumo();
        int tam = lista.size();

        for (int i = 0; i < tam; i++) {
            Consumo.addItem(lista.get(i).getTipo_consumo());
        }
    }

    private void GetIdconsumo() {
        CatalogosServicio cs = new CatalogosServicio();
        idconsumo = cs.GetIdconsumo(Consumo.getSelectedItem().toString());
    }

    private void GetPeriodo() {

        CatalogosServicio cs = new CatalogosServicio();
        List<Cat_periodo> lista = cs.GetPeriodo();
        int tam = lista.size();

        for (int i = 0; i < tam; i++) {
            Periodo.addItem(lista.get(i).getTipo_periodo());
        }
    }

    private void GetIdperiodo() {
        CatalogosServicio cs = new CatalogosServicio();
        idperiodo = cs.GetIdperiodo(Periodo.getSelectedItem().toString());
    }

    private void InsertarCliente() {
        Cliente c = new Cliente();
        ClienteServicio cs = new ClienteServicio();
        String status = "activo";
        folio = cs.InsertarCliente(nombre, app, apm, nac, tel, celular, email, curp, rfc, Muni, Resi, nom_calle, Refe, Manz, Lot, status);
        Existencia();
    }

    public void InsertarContrato(int folio) {
        GetIdperiodo();
        ContratoServicio cs = new ContratoServicio();
        String status = "activo";
        Double deuda = 0.0;
        GetTarifaid();
        es.setResultact(cs.InsertarContrato(Municipio.getText(), Residencia.getText(), Nombre_calle.getText(), Referencia.getText(), Observaciones.getText(), Integer.parseInt(Manzana.getText()), Integer.parseInt(Lote.getText()), id, idconsumo, idperiodo, deuda, folio, status));
    }

    private void entrada(KeyEvent evt) {
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }

    private void Existencia() {
        if (ubicacion.equals("insert cliente")) {
            String[] arreglo = {"Si", "No"};
            int opcionp = JOptionPane.showOptionDialog(null, "¿Desea incluir este domicilio en el contrato?", "Contrato", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Si");
            if (arreglo[opcionp].equals("Si")) {
                opcion = "Si";
            } else {
                opcion = "No";
            }
        }
    }

    private void GetTarifa(int id) {
        TarifaServicio ts = new TarifaServicio();
        List<DetTipoconsumoTarifa> lista = ts.Tarifas(id);

        int tam = lista.size();
        Tarifa.removeAllItems();
        Tarifa.addItem("Selecciona una opción");
        for (int i = 0; i < tam; i++) {

            Tarifa.addItem(lista.get(i).getTarifa().toString());
            Folio.setText(lista.get(i).getConsec().toString());

        }
    }

    private void GetTarifaid() {
        TarifaServicio ts = new TarifaServicio();
        id = ts.Tarifaid(idconsumo, Double.parseDouble(Tarifa.getSelectedItem().toString()));
    }

    private void Obtener(int folio) {
        ContratoServicio cts = new ContratoServicio();
        List<Contrato> lista = cts.SearchContrato(folio);
        int tam = lista.size();
        for (int i = 0; i < tam; i++) {
            Municipio.setText(lista.get(i).getMunicipio());
            Residencia.setText(lista.get(i).getResidencia());
            Nombre_calle.setText(lista.get(i).getNombreCalle());
            Referencia.setText(lista.get(i).getCalleReferencia());
            Manzana.setText(lista.get(i).getNumeroMzn().toString());
            Lote.setText(lista.get(i).getNumeroLt().toString());
            Consumo.removeAllItems();
            Periodo.removeAllItems();
            Tarifa.removeAllItems();
            Consumo.addItem(lista.get(i).getId_consumo().toString());
            Periodo.addItem(lista.get(i).getId_periodo().toString());
            Observaciones.setText(lista.get(i).getObservaciones());
            Tarifa.addItem(lista.get(i).getConsec().toString());
            //Folio.setText(lista.get(i).getFolio_cte().toString());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cargando;
    private javax.swing.JComboBox<String> Consumo;
    private javax.swing.JLabel Contrato;
    private javax.swing.JLabel Folio;
    private javax.swing.JTextField Lote;
    private javax.swing.JTextField Manzana;
    private javax.swing.JTextField Municipio;
    private javax.swing.JTextField Nombre_calle;
    private javax.swing.JTextArea Observaciones;
    private javax.swing.JComboBox<String> Periodo;
    private javax.swing.JTextField Referencia;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField Residencia;
    private javax.swing.JComboBox<String> Tarifa;
    private javax.swing.JLabel Tipo_c;
    private javax.swing.JLabel Tipo_p;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel observaciones;
    private javax.swing.JLabel rerefencia;
    private javax.swing.JLabel tarifa;
    // End of variables declaration//GEN-END:variables
}
