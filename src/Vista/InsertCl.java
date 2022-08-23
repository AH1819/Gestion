package Vista;

import Entity.Cliente;
import Entity.Contrato_generado;
import Entity.ErrorsAndSuccesses;
import Servicio.ClienteServicio;
import static Vista.Interfaz2.content;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;

public class InsertCl extends javax.swing.JPanel {

    boolean editar;
    String ubicacion;
    int folio;
    int folio_cte;
    String rfco = "NNNN000000NN0";
    String telefonoo = "Sin numero";
    String emailo = "Sin email";

    ErrorsAndSuccesses es = new ErrorsAndSuccesses();

    public InsertCl(String ventana) {
        initComponents();
        Cargando.setVisible(false);
        Folio.setVisible(false);
        Foliot.setVisible(false);
        this.ubicacion = ventana;
        es.setUbicacion(ventana);
    }

    public InsertCl(boolean edit, int folio, String ubicacion) {
        initComponents();
        Cargando.setVisible(false);
        this.editar = edit;
        this.ubicacion = ubicacion;
        this.folio = folio;
        es.setUbicacion(ubicacion);
        if (editar == true) {
            Obtener(folio);
            Cliente_Datos.setText("Modificar datos de cliente");
            Next_or_New.setText("Guardar");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JLabel();
        apm = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        rfc = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        Separador = new javax.swing.JSeparator();
        ap_p = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        RFC = new javax.swing.JTextField();
        app = new javax.swing.JLabel();
        ap_m = new javax.swing.JTextField();
        tel = new javax.swing.JLabel();
        Folio = new javax.swing.JTextField();
        Foliot = new javax.swing.JLabel();
        Cliente_Domicilio = new javax.swing.JLabel();
        Cliente_Datos = new javax.swing.JLabel();
        Año = new javax.swing.JTextField();
        Mes = new javax.swing.JTextField();
        Dia = new javax.swing.JTextField();
        guion2 = new javax.swing.JLabel();
        guion = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        Celular = new javax.swing.JTextField();
        celular = new javax.swing.JLabel();
        curp = new javax.swing.JLabel();
        Next_or_New = new javax.swing.JButton();
        Curp = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        Separador2 = new javax.swing.JSeparator();
        Municipio = new javax.swing.JTextField();
        municipio = new javax.swing.JLabel();
        Residencia = new javax.swing.JTextField();
        Nombre_calle = new javax.swing.JTextField();
        Referencia = new javax.swing.JTextField();
        residencia = new javax.swing.JLabel();
        nombre_calle = new javax.swing.JLabel();
        referencia = new javax.swing.JLabel();
        Manzana = new javax.swing.JTextField();
        Lote = new javax.swing.JTextField();
        manzana = new javax.swing.JLabel();
        lote = new javax.swing.JLabel();
        Cargando = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setText("* Nombre:");
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        apm.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        apm.setForeground(new java.awt.Color(0, 0, 0));
        apm.setText("* Apellido materno: ");
        add(apm, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, 20));

        fecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setText("* Fecha de nacimiento:");
        add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, -1, 20));

        rfc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        rfc.setForeground(new java.awt.Color(0, 0, 0));
        rfc.setText("RFC: ");
        add(rfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText(" Ingrese el nombre");
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameMousePressed(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 40));
        add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1030, 10));

        ap_p.setBackground(new java.awt.Color(255, 255, 255));
        ap_p.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ap_p.setForeground(new java.awt.Color(0, 0, 0));
        ap_p.setText(" Ingrese el apellido paterno");
        ap_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ap_pMousePressed(evt);
            }
        });
        ap_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ap_pActionPerformed(evt);
            }
        });
        ap_p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ap_pKeyTyped(evt);
            }
        });
        add(ap_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 180, 40));

        Telefono.setBackground(new java.awt.Color(255, 255, 255));
        Telefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Telefono.setForeground(new java.awt.Color(0, 0, 0));
        Telefono.setText(" Ingrese el numero de telefono");
        Telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TelefonoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TelefonoMousePressed(evt);
            }
        });
        Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelefonoKeyTyped(evt);
            }
        });
        add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 180, 40));

        RFC.setBackground(new java.awt.Color(255, 255, 255));
        RFC.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        RFC.setForeground(new java.awt.Color(0, 0, 0));
        RFC.setText(" Ingrese el RFC");
        RFC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RFCMousePressed(evt);
            }
        });
        RFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RFCKeyTyped(evt);
            }
        });
        add(RFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 140, 40));

        app.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        app.setForeground(new java.awt.Color(0, 0, 0));
        app.setText("* Apellido paterno: ");
        add(app, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, 20));

        ap_m.setBackground(new java.awt.Color(255, 255, 255));
        ap_m.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ap_m.setForeground(new java.awt.Color(0, 0, 0));
        ap_m.setText(" Ingrese el apellido materno");
        ap_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ap_mMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ap_mMouseReleased(evt);
            }
        });
        ap_m.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ap_mKeyTyped(evt);
            }
        });
        add(ap_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 180, 40));

        tel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tel.setForeground(new java.awt.Color(0, 0, 0));
        tel.setText(" Telefono: ");
        add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, 20));

        Folio.setEditable(false);
        Folio.setBackground(new java.awt.Color(255, 255, 255));
        Folio.setForeground(new java.awt.Color(0, 0, 0));
        Folio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FolioMousePressed(evt);
            }
        });
        Folio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FolioActionPerformed(evt);
            }
        });
        add(Folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 80, 20));

        Foliot.setForeground(new java.awt.Color(0, 0, 0));
        Foliot.setText("Folio del cliente");
        add(Foliot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 20));

        Cliente_Domicilio.setBackground(new java.awt.Color(255, 255, 255));
        Cliente_Domicilio.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Cliente_Domicilio.setForeground(new java.awt.Color(0, 0, 0));
        Cliente_Domicilio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cliente_Domicilio.setText("Cliente-Domicilio");
        add(Cliente_Domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1030, 20));

        Cliente_Datos.setBackground(new java.awt.Color(255, 255, 255));
        Cliente_Datos.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Cliente_Datos.setForeground(new java.awt.Color(0, 0, 0));
        Cliente_Datos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cliente_Datos.setText("Cliente-Datos personales");
        add(Cliente_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, -1));

        Año.setBackground(new java.awt.Color(255, 255, 255));
        Año.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Año.setForeground(new java.awt.Color(0, 0, 0));
        Año.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Año.setText("Año");
        Año.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AñoMousePressed(evt);
            }
        });
        Año.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AñoKeyTyped(evt);
            }
        });
        add(Año, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 40, 40));

        Mes.setBackground(new java.awt.Color(255, 255, 255));
        Mes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Mes.setForeground(new java.awt.Color(0, 0, 0));
        Mes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Mes.setText("Mes");
        Mes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MesMousePressed(evt);
            }
        });
        Mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesActionPerformed(evt);
            }
        });
        Mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MesKeyTyped(evt);
            }
        });
        add(Mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 40, 40));

        Dia.setBackground(new java.awt.Color(255, 255, 255));
        Dia.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Dia.setForeground(new java.awt.Color(0, 0, 0));
        Dia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Dia.setText("Dia");
        Dia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DiaMousePressed(evt);
            }
        });
        Dia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DiaKeyTyped(evt);
            }
        });
        add(Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 40, 40));

        guion2.setBackground(new java.awt.Color(255, 255, 255));
        guion2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        guion2.setForeground(new java.awt.Color(0, 0, 0));
        guion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guion2.setText("-");
        add(guion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 20, 40));

        guion.setBackground(new java.awt.Color(255, 255, 255));
        guion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        guion.setForeground(new java.awt.Color(0, 0, 0));
        guion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guion.setText("-");
        add(guion, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 20, 40));

        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Email.setForeground(new java.awt.Color(0, 0, 0));
        Email.setText(" Ingrese el email");
        Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EmailMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EmailMousePressed(evt);
            }
        });
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailKeyTyped(evt);
            }
        });
        add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 200, 40));

        email.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setText("Email: ");
        add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, 20));

        Celular.setBackground(new java.awt.Color(255, 255, 255));
        Celular.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Celular.setForeground(new java.awt.Color(0, 0, 0));
        Celular.setText(" Ingrese el numero de celular");
        Celular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CelularMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CelularMousePressed(evt);
            }
        });
        Celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CelularKeyTyped(evt);
            }
        });
        add(Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 180, 40));

        celular.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        celular.setForeground(new java.awt.Color(0, 0, 0));
        celular.setText("* Celular: ");
        add(celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, 20));

        curp.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        curp.setForeground(new java.awt.Color(0, 0, 0));
        curp.setText("* Curp: ");
        add(curp, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, -1, 20));

        Next_or_New.setBackground(new java.awt.Color(18, 90, 173));
        Next_or_New.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Next_or_New.setForeground(new java.awt.Color(255, 255, 255));
        Next_or_New.setText("Siguente");
        Next_or_New.setBorder(null);
        Next_or_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_or_NewActionPerformed(evt);
            }
        });
        add(Next_or_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 100, 40));

        Curp.setBackground(new java.awt.Color(255, 255, 255));
        Curp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Curp.setForeground(new java.awt.Color(0, 0, 0));
        Curp.setText(" Ingrese la curp");
        Curp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CurpMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CurpMousePressed(evt);
            }
        });
        Curp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CurpKeyTyped(evt);
            }
        });
        add(Curp, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, 170, 40));

        Cancelar.setBackground(new java.awt.Color(18, 90, 173));
        Cancelar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("Volver");
        Cancelar.setBorder(null);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 100, 40));
        add(Separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1030, 10));

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
        add(Municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 140, 40));

        municipio.setBackground(new java.awt.Color(0, 0, 0));
        municipio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        municipio.setForeground(new java.awt.Color(0, 0, 0));
        municipio.setText("Municipio:");
        add(municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 70, 20));

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
        add(Residencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 180, 40));

        Nombre_calle.setBackground(new java.awt.Color(255, 255, 255));
        Nombre_calle.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Nombre_calle.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_calle.setText(" Nombre de calle");
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
        add(Nombre_calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 180, 40));

        Referencia.setBackground(new java.awt.Color(255, 255, 255));
        Referencia.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Referencia.setForeground(new java.awt.Color(0, 0, 0));
        Referencia.setText(" Calle de referencia");
        Referencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ReferenciaMousePressed(evt);
            }
        });
        add(Referencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 150, 40));

        residencia.setBackground(new java.awt.Color(0, 0, 0));
        residencia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        residencia.setForeground(new java.awt.Color(0, 0, 0));
        residencia.setText("Col/barrio/fracc:");
        add(residencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 120, 20));

        nombre_calle.setBackground(new java.awt.Color(0, 0, 0));
        nombre_calle.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombre_calle.setForeground(new java.awt.Color(0, 0, 0));
        nombre_calle.setText("Nombre calle:");
        add(nombre_calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 253, 100, -1));

        referencia.setBackground(new java.awt.Color(0, 0, 0));
        referencia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        referencia.setForeground(new java.awt.Color(0, 0, 0));
        referencia.setText("Calle de referencia:");
        add(referencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 120, 20));

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
        add(Manzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 90, 40));

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
        add(Lote, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 100, 40));

        manzana.setBackground(new java.awt.Color(0, 0, 0));
        manzana.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        manzana.setForeground(new java.awt.Color(0, 0, 0));
        manzana.setText("Manzana: ");
        add(manzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 70, 20));

        lote.setBackground(new java.awt.Color(0, 0, 0));
        lote.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lote.setForeground(new java.awt.Color(0, 0, 0));
        lote.setText("Lote/Numero Exterior:");
        add(lote, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 150, 20));

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spinner-para-iphone.gif"))); // NOI18N
        add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void nameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMousePressed
        if (name.getText().equals(" Ingrese el nombre")) {
            name.setText("");
        }
        if (ap_p.getText().isEmpty()) {
            ap_p.setText(" Ingrese el apellido paterno");
        }
        if (ap_m.getText().isEmpty()) {
            ap_m.setText(" Ingrese el apellido materno");
        }
        if (Año.getText().isEmpty()) {
            Año.setText("Año");
        }
        if (Mes.getText().isEmpty()) {
            Mes.setText("Mes");
        }
        if (Dia.getText().isEmpty()) {
            Dia.setText("Dia");
        }
        if (RFC.getText().isEmpty()) {
            RFC.setText(" Ingrese el RFC");
        }
        if (Telefono.getText().isEmpty()) {
            Telefono.setText(" Ingrese el numero de telefono");
        }
        if (Curp.getText().isEmpty()) {
            Curp.setText(" Ingrese la curp");
        }
        if (Celular.getText().isEmpty()) {
            Celular.setText(" Ingrese el numero de celular");
        }
        if (Email.getText().isEmpty()) {
            Email.setText(" Ingrese el email");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de calle");
        }
        if (Referencia.getText().isEmpty()) {
            Referencia.setText(" Calle de referencia");
        }
        if (Manzana.getText().isEmpty()) {
            Manzana.setText(" Num. Mzn");
        }
        if (Lote.getText().isEmpty()) {
            Lote.setText(" Num. Lt");
        }

    }//GEN-LAST:event_nameMousePressed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed

    }//GEN-LAST:event_nameActionPerformed

    private void ap_pMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ap_pMousePressed
        if (ap_p.getText().equals(" Ingrese el apellido paterno")) {
            ap_p.setText("");
        }
        if (name.getText().isEmpty()) {
            name.setText(" Ingrese el nombre");
        }
        if (ap_m.getText().isEmpty()) {
            ap_m.setText(" Ingrese el apellido materno");
        }
        if (Año.getText().isEmpty()) {
            Año.setText("Año");
        }
        if (Mes.getText().isEmpty()) {
            Mes.setText("Mes");
        }
        if (Dia.getText().isEmpty()) {
            Dia.setText("Dia");
        }
        if (RFC.getText().isEmpty()) {
            RFC.setText(" Ingrese el RFC");
        }
        if (Telefono.getText().isEmpty()) {
            Telefono.setText(" Ingrese el numero de telefono");
        }
        if (Curp.getText().isEmpty()) {
            Curp.setText(" Ingrese la curp");
        }
        if (Celular.getText().isEmpty()) {
            Celular.setText(" Ingrese el numero de celular");
        }
        if (Email.getText().isEmpty()) {
            Email.setText(" Ingrese el email");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de calle");
        }
        if (Referencia.getText().isEmpty()) {
            Referencia.setText(" Calle de referencia");
        }
        if (Manzana.getText().isEmpty()) {
            Manzana.setText(" Num. Mzn");
        }
        if (Lote.getText().isEmpty()) {
            Lote.setText(" Num. Lt");
        }
    }//GEN-LAST:event_ap_pMousePressed

    private void ap_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ap_pActionPerformed

    }//GEN-LAST:event_ap_pActionPerformed

    private void TelefonoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoMouseExited

    }//GEN-LAST:event_TelefonoMouseExited

    private void TelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoMousePressed
        if (Telefono.getText().equals(" Ingrese el numero de telefono")) {
            Telefono.setText("");
        }
        if (name.getText().isEmpty()) {
            name.setText(" Ingrese el nombre");
        }
        if (ap_m.getText().isEmpty()) {
            ap_m.setText(" Ingrese el apellido materno");
        }
        if (ap_p.getText().isEmpty()) {
            ap_p.setText(" Ingrese el apellido paterno");
        }
        if (Año.getText().isEmpty()) {
            Año.setText("Año");
        }
        if (Dia.getText().isEmpty()) {
            Dia.setText("Dia");
        }
        if (Mes.getText().isEmpty()) {
            Mes.setText("Mes");
        }
        if (RFC.getText().isEmpty()) {
            RFC.setText(" Ingrese el RFC");
        }
        if (Curp.getText().isEmpty()) {
            Curp.setText(" Ingrese la curp");
        }
        if (Celular.getText().isEmpty()) {
            Celular.setText(" Ingrese el numero de celular");
        }
        if (Email.getText().isEmpty()) {
            Email.setText(" Ingrese el email");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de calle");
        }
        if (Referencia.getText().isEmpty()) {
            Referencia.setText(" Calle de referencia");
        }
        if (Manzana.getText().isEmpty()) {
            Manzana.setText(" Num. Mzn");
        }
        if (Lote.getText().isEmpty()) {
            Lote.setText(" Num. Lt");
        }
    }//GEN-LAST:event_TelefonoMousePressed

    private void RFCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RFCMousePressed
        if (RFC.getText().equals(" Ingrese el RFC")) {
            RFC.setText("");
        }
        if (name.getText().isEmpty()) {
            name.setText(" Ingrese el nombre");
        }
        if (ap_m.getText().isEmpty()) {
            ap_m.setText(" Ingrese el apellido materno");
        }
        if (ap_p.getText().isEmpty()) {
            ap_p.setText(" Ingrese el apellido paterno");
        }
        if (Año.getText().isEmpty()) {
            Año.setText("Año");
        }
        if (Dia.getText().isEmpty()) {
            Dia.setText("Dia");
        }
        if (Mes.getText().isEmpty()) {
            Mes.setText("Mes");
        }
        if (Telefono.getText().isEmpty()) {
            Telefono.setText(" Ingrese el numero de telefono");
        }
        if (Curp.getText().isEmpty()) {
            Curp.setText(" Ingrese la curp");
        }
        if (Celular.getText().isEmpty()) {
            Celular.setText(" Ingrese el numero de celular");
        }
        if (Email.getText().isEmpty()) {
            Email.setText(" Ingrese el email");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de calle");
        }
        if (Referencia.getText().isEmpty()) {
            Referencia.setText(" Calle de referencia");
        }
        if (Manzana.getText().isEmpty()) {
            Manzana.setText(" Num. Mzn");
        }
        if (Lote.getText().isEmpty()) {
            Lote.setText(" Num. Lt");
        }
    }//GEN-LAST:event_RFCMousePressed

    private void ap_mMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ap_mMousePressed
        if (ap_m.getText().equals(" Ingrese el apellido materno")) {
            ap_m.setText("");
        }
        if (name.getText().isEmpty()) {
            name.setText(" Ingrese el nombre");
        }
        if (ap_p.getText().isEmpty()) {
            ap_p.setText(" Ingrese el apellido paterno");
        }
        if (Año.getText().isEmpty()) {
            Año.setText("Año");
        }
        if (Mes.getText().isEmpty()) {
            Mes.setText("Mes");
        }
        if (Dia.getText().isEmpty()) {
            Dia.setText("Dia");
        }
        if (RFC.getText().isEmpty()) {
            RFC.setText(" Ingrese el RFC");
        }
        if (Telefono.getText().isEmpty()) {
            Telefono.setText(" Ingrese el numero de telefono");
        }
        if (Curp.getText().isEmpty()) {
            Curp.setText(" Ingrese la curp");
        }
        if (Celular.getText().isEmpty()) {
            Celular.setText(" Ingrese el numero de celular");
        }
        if (Email.getText().isEmpty()) {
            Email.setText(" Ingrese el email");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de calle");
        }
        if (Referencia.getText().isEmpty()) {
            Referencia.setText(" Calle de referencia");
        }
        if (Manzana.getText().isEmpty()) {
            Manzana.setText(" Num. Mzn");
        }
        if (Lote.getText().isEmpty()) {
            Lote.setText(" Num. Lt");
        }
    }//GEN-LAST:event_ap_mMousePressed

    private void ap_mMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ap_mMouseReleased

    }//GEN-LAST:event_ap_mMouseReleased

    private void AñoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñoMousePressed
        if (Año.getText().equals("Año")) {
            Año.setText("");
        }
        if (name.getText().isEmpty()) {
            name.setText(" Ingrese el nombre");
        }
        if (ap_m.getText().isEmpty()) {
            ap_m.setText(" Ingrese el apellido materno");
        }
        if (ap_p.getText().isEmpty()) {
            ap_p.setText(" Ingrese el apellido paterno");
        }
        if (Mes.getText().isEmpty()) {
            Mes.setText("Mes");
        }
        if (Dia.getText().isEmpty()) {
            Dia.setText("Dia");
        }
        if (RFC.getText().isEmpty()) {
            RFC.setText(" Ingrese el RFC");
        }
        if (Telefono.getText().isEmpty()) {
            Telefono.setText(" Ingrese el numero de telefono");
        }
        if (Curp.getText().isEmpty()) {
            Curp.setText(" Ingrese la curp");
        }
        if (Celular.getText().isEmpty()) {
            Celular.setText(" Ingrese el numero de celular");
        }
        if (Email.getText().isEmpty()) {
            Email.setText(" Ingrese el email");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de calle");
        }
        if (Referencia.getText().isEmpty()) {
            Referencia.setText(" Calle de referencia");
        }
        if (Manzana.getText().isEmpty()) {
            Manzana.setText(" Num. Mzn");
        }
        if (Lote.getText().isEmpty()) {
            Lote.setText(" Num. Lt");
        }
    }//GEN-LAST:event_AñoMousePressed

    private void MesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MesMousePressed
        if (Mes.getText().equals("Mes")) {
            Mes.setText("");
        }
        if (name.getText().isEmpty()) {
            name.setText(" Ingrese el nombre");
        }
        if (ap_m.getText().isEmpty()) {
            ap_m.setText(" Ingrese el apellido materno");
        }
        if (ap_p.getText().isEmpty()) {
            ap_p.setText(" Ingrese el apellido paterno");
        }
        if (Año.getText().isEmpty()) {
            Año.setText("Año");
        }
        if (Dia.getText().isEmpty()) {
            Dia.setText("Dia");
        }
        if (RFC.getText().isEmpty()) {
            RFC.setText(" Ingrese el RFC");
        }
        if (Telefono.getText().isEmpty()) {
            Telefono.setText(" Ingrese el numero de telefono");
        }
        if (Curp.getText().isEmpty()) {
            Curp.setText(" Ingrese la curp");
        }
        if (Celular.getText().isEmpty()) {
            Celular.setText(" Ingrese el numero de celular");
        }
        if (Email.getText().isEmpty()) {
            Email.setText(" Ingrese el email");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de calle");
        }
        if (Referencia.getText().isEmpty()) {
            Referencia.setText(" Calle de referencia");
        }
        if (Manzana.getText().isEmpty()) {
            Manzana.setText(" Num. Mzn");
        }
        if (Lote.getText().isEmpty()) {
            Lote.setText(" Num. Lt");
        }
    }//GEN-LAST:event_MesMousePressed

    private void MesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesActionPerformed

    }//GEN-LAST:event_MesActionPerformed

    private void DiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiaMousePressed
        if (Dia.getText().equals("Dia")) {
            Dia.setText("");
        }
        if (name.getText().isEmpty()) {
            name.setText(" Ingrese el nombre");
        }
        if (ap_m.getText().isEmpty()) {
            ap_m.setText(" Ingrese el apellido materno");
        }
        if (ap_p.getText().isEmpty()) {
            ap_p.setText(" Ingrese el apellido paterno");
        }
        if (Año.getText().isEmpty()) {
            Año.setText("Año");
        }
        if (Mes.getText().isEmpty()) {
            Mes.setText("Mes");
        }
        if (RFC.getText().isEmpty()) {
            RFC.setText(" Ingrese el RFC");
        }
        if (Telefono.getText().isEmpty()) {
            Telefono.setText(" Ingrese el numero de telefono");
        }
        if (Curp.getText().isEmpty()) {
            Curp.setText(" Ingrese la curp");
        }
        if (Celular.getText().isEmpty()) {
            Celular.setText(" Ingrese el numero de celular");
        }
        if (Email.getText().isEmpty()) {
            Email.setText(" Ingrese el email");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de calle");
        }
        if (Referencia.getText().isEmpty()) {
            Referencia.setText(" Calle de referencia");
        }
        if (Manzana.getText().isEmpty()) {
            Manzana.setText(" Num. Mzn");
        }
        if (Lote.getText().isEmpty()) {
            Lote.setText(" Num. Lt");
        }
    }//GEN-LAST:event_DiaMousePressed

    private void FolioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FolioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_FolioMousePressed

    private void FolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FolioActionPerformed

    private void TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (Telefono.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_TelefonoKeyTyped

    private void AñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AñoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (Año.getText().trim().length() == 4) {
            evt.consume();
        }
    }//GEN-LAST:event_AñoKeyTyped

    private void MesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MesKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (Mes.getText().trim().length() == 2) {
            evt.consume();
        }
    }//GEN-LAST:event_MesKeyTyped

    private void DiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DiaKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (Dia.getText().trim().length() == 2) {
            evt.consume();
        }
    }//GEN-LAST:event_DiaKeyTyped

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        // TODO add your handling code here:
        entrada(evt);
    }//GEN-LAST:event_nameKeyTyped

    private void ap_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ap_pKeyTyped
        // TODO add your handling code here:
        entrada(evt);
    }//GEN-LAST:event_ap_pKeyTyped

    private void ap_mKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ap_mKeyTyped
        // TODO add your handling code here:
        entrada(evt);
    }//GEN-LAST:event_ap_mKeyTyped

    private void EmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailMouseExited

    private void EmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailMousePressed

        if (Email.getText().equals(" Ingrese el email")) {
            Email.setText("");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de calle");
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
        if (Dia.getText().isEmpty()) {
            Dia.setText("Dia");
        }
        if (name.getText().isEmpty()) {
            name.setText(" Ingrese el nombre");
        }
        if (ap_m.getText().isEmpty()) {
            ap_m.setText(" Ingrese el apellido materno");
        }
        if (ap_p.getText().isEmpty()) {
            ap_p.setText(" Ingrese el apellido paterno");
        }
        if (Año.getText().isEmpty()) {
            Año.setText("Año");
        }
        if (Mes.getText().isEmpty()) {
            Mes.setText("Mes");
        }
        if (RFC.getText().isEmpty()) {
            RFC.setText(" Ingrese el RFC");
        }
        if (Telefono.getText().isEmpty()) {
            Telefono.setText(" Ingrese el numero de telefono");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Curp.getText().isEmpty()) {
            Curp.setText(" Ingrese la curp");
        }
        if (Celular.getText().isEmpty()) {
            Celular.setText(" Ingrese el numero de celular");
        }
    }//GEN-LAST:event_EmailMousePressed

    private void EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailKeyTyped

    private void CelularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CelularMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_CelularMouseExited

    private void CelularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CelularMousePressed
        if (Celular.getText().equals(" Ingrese el numero de celular")) {
            Celular.setText("");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de calle");
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
        if (Dia.getText().isEmpty()) {
            Dia.setText("Dia");
        }
        if (name.getText().isEmpty()) {
            name.setText(" Ingrese el nombre");
        }
        if (ap_m.getText().isEmpty()) {
            ap_m.setText(" Ingrese el apellido materno");
        }
        if (ap_p.getText().isEmpty()) {
            ap_p.setText(" Ingrese el apellido paterno");
        }
        if (Año.getText().isEmpty()) {
            Año.setText("Año");
        }
        if (Mes.getText().isEmpty()) {
            Mes.setText("Mes");
        }
        if (RFC.getText().isEmpty()) {
            RFC.setText(" Ingrese el RFC");
        }
        if (Telefono.getText().isEmpty()) {
            Telefono.setText(" Ingrese el numero de telefono");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Curp.getText().isEmpty()) {
            Curp.setText(" Ingrese la curp");
        }
        if (Email.getText().isEmpty()) {
            Email.setText(" Ingrese el email");
        }
    }//GEN-LAST:event_CelularMousePressed

    private void CelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CelularKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (Celular.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_CelularKeyTyped

    private void CurpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CurpMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_CurpMouseExited

    private void CurpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CurpMousePressed
        if (Curp.getText().equals(" Ingrese la curp")) {
            Curp.setText("");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de calle");
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
        if (Dia.getText().isEmpty()) {
            Dia.setText("Dia");
        }
        if (name.getText().isEmpty()) {
            name.setText(" Ingrese el nombre");
        }
        if (ap_m.getText().isEmpty()) {
            ap_m.setText(" Ingrese el apellido materno");
        }
        if (ap_p.getText().isEmpty()) {
            ap_p.setText(" Ingrese el apellido paterno");
        }
        if (Año.getText().isEmpty()) {
            Año.setText("Año");
        }
        if (Mes.getText().isEmpty()) {
            Mes.setText("Mes");
        }
        if (RFC.getText().isEmpty()) {
            RFC.setText(" Ingrese el RFC");
        }
        if (Telefono.getText().isEmpty()) {
            Telefono.setText(" Ingrese el numero de telefono");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Celular.getText().isEmpty()) {
            Celular.setText(" Ingrese el numero de celular");
        }
        if (Email.getText().isEmpty()) {
            Email.setText(" Ingrese el email");
        }

    }//GEN-LAST:event_CurpMousePressed

    private void CurpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CurpKeyTyped
        if (Curp.getText().trim().length() == 18) {
            evt.consume();
        }
    }//GEN-LAST:event_CurpKeyTyped

    private void Next_or_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_or_NewActionPerformed
        if (RFC.getText().equals(" Ingrese el RFC") || RFC.getText().isEmpty()) {
            
        } else {
            rfco = RFC.getText();
        }
        if (Telefono.getText().equals(" Ingrese el numero de telefono") || Telefono.getText().isEmpty()) {
            
        }else{
            telefonoo = Telefono.getText();
        }
        if(Email.getText().equals(" Ingrese el email")||Email.getText().isEmpty()){
            
        }else{
            emailo = Email.getText();
        }
        if (name.getText().equals(" Ingrese el nombre") || ap_p.getText().equals(" Ingrese el apellido paterno")
                || ap_m.getText().equals(" Ingrese el apellido materno") || Año.getText().equals("Año")
                || Mes.getText().equals("Mes") || Dia.getText().equals("Dia")
                || Celular.getText().equals(" Ingrese el numero de celular") || Municipio.getText().equals(" Municipio")
                || Residencia.getText().equals(" Col/barrio/fracc") || Nombre_calle.getText().equals(" Nombre de calle")
                || Referencia.getText().equals(" Calle de referencia") || Manzana.getText().equals(" Num. Mzn") || Lote.getText().equals(" Num. Lt")
                || name.getText().isEmpty() || ap_m.getText().isEmpty() || ap_p.getText().isEmpty() || Año.getText().isEmpty()
                || Mes.getText().isEmpty() || Dia.getText().isEmpty()
                || Celular.getText().isEmpty() || Municipio.getText().isEmpty()
                || Residencia.getText().isEmpty() || Nombre_calle.getText().isEmpty() || Referencia.getText().isEmpty()
                || Manzana.getText().isEmpty() || Lote.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los campos no estan llenos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (Año.getText().trim().length() < 4 || Mes.getText().trim().length() < 2 || Dia.getText().trim().length() < 2) {
                JOptionPane.showMessageDialog(this, "Fecha de nacimiento no valida", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (Curp.getText().trim().length() < 18) {
                    JOptionPane.showMessageDialog(this, "Curp no valida", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (Celular.getText().trim().length() < 10) {
                        JOptionPane.showMessageDialog(this, "Numero de celular no valido", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        new MostrarC().show();
                    }
                }
            }
        }

    }//GEN-LAST:event_Next_or_NewActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        Confirmacion();
    }//GEN-LAST:event_CancelarActionPerformed

    private void MunicipioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MunicipioMousePressed
        if (Municipio.getText().equals(" Municipio")) {
            Municipio.setText("");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de calle");
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
        if (Dia.getText().isEmpty()) {
            Dia.setText("Dia");
        }
        if (name.getText().isEmpty()) {
            name.setText(" Ingrese el nombre");
        }
        if (ap_m.getText().isEmpty()) {
            ap_m.setText(" Ingrese el apellido materno");
        }
        if (ap_p.getText().isEmpty()) {
            ap_p.setText(" Ingrese el apellido paterno");
        }
        if (Año.getText().isEmpty()) {
            Año.setText("Año");
        }
        if (Mes.getText().isEmpty()) {
            Mes.setText("Mes");
        }
        if (RFC.getText().isEmpty()) {
            RFC.setText(" Ingrese el RFC");
        }
        if (Telefono.getText().isEmpty()) {
            Telefono.setText(" Ingrese el numero de telefono");
        }
        if (Curp.getText().isEmpty()) {
            Curp.setText(" Ingrese la curp");
        }
        if (Celular.getText().isEmpty()) {
            Celular.setText(" Ingrese el numero de celular");
        }
        if (Email.getText().isEmpty()) {
            Email.setText(" Ingrese el email");
        }
    }//GEN-LAST:event_MunicipioMousePressed

    private void MunicipioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MunicipioKeyTyped
        // TODO add your handling code here:
        entrada(evt);
    }//GEN-LAST:event_MunicipioKeyTyped

    private void ResidenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResidenciaMousePressed
        if (Residencia.getText().equals(" Col/barrio/fracc")) {
            Residencia.setText("");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de calle");
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
        if (Dia.getText().isEmpty()) {
            Dia.setText("Dia");
        }
        if (name.getText().isEmpty()) {
            name.setText(" Ingrese el nombre");
        }
        if (ap_m.getText().isEmpty()) {
            ap_m.setText(" Ingrese el apellido materno");
        }
        if (ap_p.getText().isEmpty()) {
            ap_p.setText(" Ingrese el apellido paterno");
        }
        if (Año.getText().isEmpty()) {
            Año.setText("Año");
        }
        if (Mes.getText().isEmpty()) {
            Mes.setText("Mes");
        }
        if (RFC.getText().isEmpty()) {
            RFC.setText(" Ingrese el RFC");
        }
        if (Telefono.getText().isEmpty()) {
            Telefono.setText(" Ingrese el numero de telefono");
        }
        if (Curp.getText().isEmpty()) {
            Curp.setText(" Ingrese la curp");
        }
        if (Celular.getText().isEmpty()) {
            Celular.setText(" Ingrese el numero de celular");
        }
        if (Email.getText().isEmpty()) {
            Email.setText(" Ingrese el email");
        }
    }//GEN-LAST:event_ResidenciaMousePressed

    private void ResidenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ResidenciaKeyTyped

    }//GEN-LAST:event_ResidenciaKeyTyped

    private void Nombre_calleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nombre_calleMousePressed
        if (Nombre_calle.getText().equals(" Nombre de calle")) {
            Nombre_calle.setText("");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
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
        if (Dia.getText().isEmpty()) {
            Dia.setText("Dia");
        }
        if (name.getText().isEmpty()) {
            name.setText(" Ingrese el nombre");
        }
        if (ap_m.getText().isEmpty()) {
            ap_m.setText(" Ingrese el apellido materno");
        }
        if (ap_p.getText().isEmpty()) {
            ap_p.setText(" Ingrese el apellido paterno");
        }
        if (Año.getText().isEmpty()) {
            Año.setText("Año");
        }
        if (Mes.getText().isEmpty()) {
            Mes.setText("Mes");
        }
        if (RFC.getText().isEmpty()) {
            RFC.setText(" Ingrese el RFC");
        }
        if (Telefono.getText().isEmpty()) {
            Telefono.setText(" Ingrese el numero de telefono");
        }
        if (Curp.getText().isEmpty()) {
            Curp.setText(" Ingrese la curp");
        }
        if (Celular.getText().isEmpty()) {
            Celular.setText(" Ingrese el numero de celular");
        }
        if (Email.getText().isEmpty()) {
            Email.setText(" Ingrese el email");
        }
    }//GEN-LAST:event_Nombre_calleMousePressed

    private void Nombre_calleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre_calleKeyTyped

    }//GEN-LAST:event_Nombre_calleKeyTyped

    private void ReferenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReferenciaMousePressed
        if (Referencia.getText().equals(" Calle de referencia")) {
            Referencia.setText("");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de calle");
        }
        if (Lote.getText().isEmpty()) {
            Lote.setText(" Num. Lt");
        }
        if (Manzana.getText().isEmpty()) {
            Manzana.setText(" Num. Manz");
        }
        if (Dia.getText().isEmpty()) {
            Dia.setText("Dia");
        }
        if (name.getText().isEmpty()) {
            name.setText(" Ingrese el nombre");
        }
        if (ap_m.getText().isEmpty()) {
            ap_m.setText(" Ingrese el apellido materno");
        }
        if (ap_p.getText().isEmpty()) {
            ap_p.setText(" Ingrese el apellido paterno");
        }
        if (Año.getText().isEmpty()) {
            Año.setText("Año");
        }
        if (Mes.getText().isEmpty()) {
            Mes.setText("Mes");
        }
        if (RFC.getText().isEmpty()) {
            RFC.setText(" Ingrese el RFC");
        }
        if (Telefono.getText().isEmpty()) {
            Telefono.setText(" Ingrese el numero de telefono");
        }
        if (Curp.getText().isEmpty()) {
            Curp.setText(" Ingrese la curp");
        }
        if (Celular.getText().isEmpty()) {
            Celular.setText(" Ingrese el numero de celular");
        }
        if (Email.getText().isEmpty()) {
            Email.setText(" Ingrese el email");
        }
    }//GEN-LAST:event_ReferenciaMousePressed

    private void ManzanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManzanaMousePressed
        if (Manzana.getText().equals(" Num. Manz")) {
            Manzana.setText("");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de calle");
        }
        if (Lote.getText().isEmpty()) {
            Lote.setText(" Num. Lt");
        }
        if (Referencia.getText().isEmpty()) {
            Referencia.setText(" Calle de referencia");
        }
        if (Dia.getText().isEmpty()) {
            Dia.setText("Dia");
        }
        if (name.getText().isEmpty()) {
            name.setText(" Ingrese el nombre");
        }
        if (ap_m.getText().isEmpty()) {
            ap_m.setText(" Ingrese el apellido materno");
        }
        if (ap_p.getText().isEmpty()) {
            ap_p.setText(" Ingrese el apellido paterno");
        }
        if (Año.getText().isEmpty()) {
            Año.setText("Año");
        }
        if (Mes.getText().isEmpty()) {
            Mes.setText("Mes");
        }
        if (RFC.getText().isEmpty()) {
            RFC.setText(" Ingrese el RFC");
        }
        if (Telefono.getText().isEmpty()) {
            Telefono.setText(" Ingrese el numero de telefono");
        }
        if (Curp.getText().isEmpty()) {
            Curp.setText(" Ingrese la curp");
        }
        if (Celular.getText().isEmpty()) {
            Celular.setText(" Ingrese el numero de celular");
        }
        if (Email.getText().isEmpty()) {
            Email.setText(" Ingrese el email");
        }
    }//GEN-LAST:event_ManzanaMousePressed

    private void ManzanaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ManzanaKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_ManzanaKeyTyped

    private void LoteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoteMousePressed
        if (Lote.getText().equals(" Num. Lt")) {
            Lote.setText("");
        }
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
        }
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Nombre de calle");
        }
        if (Manzana.getText().isEmpty()) {
            Manzana.setText(" Num. Manz");
        }
        if (Referencia.getText().isEmpty()) {
            Referencia.setText(" Calle de referencia");
        }
        if (Dia.getText().isEmpty()) {
            Dia.setText("Dia");
        }
        if (name.getText().isEmpty()) {
            name.setText(" Ingrese el nombre");
        }
        if (ap_m.getText().isEmpty()) {
            ap_m.setText(" Ingrese el apellido materno");
        }
        if (ap_p.getText().isEmpty()) {
            ap_p.setText(" Ingrese el apellido paterno");
        }
        if (Año.getText().isEmpty()) {
            Año.setText("Año");
        }
        if (Mes.getText().isEmpty()) {
            Mes.setText("Mes");
        }
        if (RFC.getText().isEmpty()) {
            RFC.setText(" Ingrese el RFC");
        }
        if (Telefono.getText().isEmpty()) {
            Telefono.setText(" Ingrese el numero de telefono");
        }
        if (Curp.getText().isEmpty()) {
            Curp.setText(" Ingrese la curp");
        }
        if (Celular.getText().isEmpty()) {
            Celular.setText(" Ingrese el numero de celular");
        }
        if (Email.getText().isEmpty()) {
            Email.setText(" Ingrese el email");
        }
    }//GEN-LAST:event_LoteMousePressed

    private void LoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoteKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_LoteKeyTyped

    private void RFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RFCKeyTyped
        if (RFC.getText().trim().length() == 13) {
            evt.consume();
        }
    }//GEN-LAST:event_RFCKeyTyped

    public class MostrarC implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            name.setVisible(false);
            ap_p.setVisible(false);
            ap_m.setVisible(false);
            Año.setVisible(false);
            Mes.setVisible(false);
            Dia.setVisible(false);
            RFC.setVisible(false);
            Telefono.setVisible(false);
            nombre.setVisible(false);
            app.setVisible(false);
            apm.setVisible(false);
            fecha.setVisible(false);
            rfc.setVisible(false);
            tel.setVisible(false);
            guion.setVisible(false);
            guion2.setVisible(false);
            Cliente_Datos.setVisible(false);
            Separador.setVisible(false);
            Next_or_New.setVisible(false);
            Cancelar.setVisible(false);
            Celular.setVisible(false);
            Curp.setVisible(false);
            Email.setVisible(false);
            Municipio.setVisible(false);
            Residencia.setVisible(false);
            Nombre_calle.setVisible(false);
            Referencia.setVisible(false);
            Manzana.setVisible(false);
            Lote.setVisible(false);
            Separador2.setVisible(false);
            Cliente_Domicilio.setVisible(false);
            celular.setVisible(false);
            manzana.setVisible(false);
            lote.setVisible(false);
            municipio.setVisible(false);
            residencia.setVisible(false);
            nombre_calle.setVisible(false);
            referencia.setVisible(false);
            curp.setVisible(false);
            email.setVisible(false);
            Cargando.setVisible(true);
            Folio.setVisible(false);
            Foliot.setVisible(false);
            if (editar == true) {
                Actualizar();
                if (es.getResultact() == 1) {
                    regresar();
                } else {
                    name.setVisible(true);
                    ap_p.setVisible(true);
                    ap_m.setVisible(true);
                    Año.setVisible(true);
                    Mes.setVisible(true);
                    Dia.setVisible(true);
                    RFC.setVisible(true);
                    Telefono.setVisible(true);
                    nombre.setVisible(true);
                    app.setVisible(true);
                    apm.setVisible(true);
                    fecha.setVisible(true);
                    rfc.setVisible(true);
                    tel.setVisible(true);
                    guion.setVisible(true);
                    guion2.setVisible(true);
                    Cliente_Datos.setVisible(true);
                    Separador.setVisible(true);
                    Next_or_New.setVisible(true);
                    Cancelar.setVisible(true);
                    Celular.setVisible(true);
                    Curp.setVisible(true);
                    Email.setVisible(true);
                    Municipio.setVisible(true);
                    Residencia.setVisible(true);
                    Nombre_calle.setVisible(true);
                    Referencia.setVisible(true);
                    Manzana.setVisible(true);
                    Lote.setVisible(true);
                    Separador2.setVisible(true);
                    Cliente_Domicilio.setVisible(true);
                    celular.setVisible(true);
                    manzana.setVisible(true);
                    lote.setVisible(true);
                    municipio.setVisible(true);
                    residencia.setVisible(true);
                    nombre_calle.setVisible(true);
                    referencia.setVisible(true);
                    curp.setVisible(true);
                    email.setVisible(true);
                    Cargando.setVisible(false);
                    Folio.setVisible(true);
                    Foliot.setVisible(true);
                }
            } else {
                Mostrar();
            }
            Cargando.setVisible(false);
        }
    }

    private void Confirmacion() {
        if (ubicacion.equals("editar cliente")) {
            String[] arreglo = {"Si", "No"};
            int opcionp = JOptionPane.showOptionDialog(null, "¿Desea descartar los cambios?", "Actualizacion", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Si");
            if (arreglo[opcionp].equals("Si")) {
                new Regresar().show();
            } else {

            }
        }
        if (ubicacion.equals("insert cliente")) {
            String[] arreglo = {"Si", "No"};
            int opcionp = JOptionPane.showOptionDialog(null, "¿Desea descartar los datos?", "Creacion", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Si");
            if (arreglo[opcionp].equals("Si")) {
                new Regresar().show();
            } else {

            }
        }
    }

    public class Regresar implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            Folio.setVisible(false);
            name.setVisible(false);
            ap_p.setVisible(false);
            ap_m.setVisible(false);
            Año.setVisible(false);
            Mes.setVisible(false);
            Dia.setVisible(false);
            RFC.setVisible(false);
            Telefono.setVisible(false);
            nombre.setVisible(false);
            app.setVisible(false);
            apm.setVisible(false);
            fecha.setVisible(false);
            rfc.setVisible(false);
            tel.setVisible(false);
            guion.setVisible(false);
            guion2.setVisible(false);
            Cliente_Datos.setVisible(false);
            Separador.setVisible(false);
            Next_or_New.setVisible(false);
            Cancelar.setVisible(false);
            Celular.setVisible(false);
            Curp.setVisible(false);
            Email.setVisible(false);
            Municipio.setVisible(false);
            Residencia.setVisible(false);
            Nombre_calle.setVisible(false);
            Referencia.setVisible(false);
            Manzana.setVisible(false);
            Lote.setVisible(false);
            Separador2.setVisible(false);
            Cliente_Domicilio.setVisible(false);
            celular.setVisible(false);
            manzana.setVisible(false);
            lote.setVisible(false);
            municipio.setVisible(false);
            residencia.setVisible(false);
            nombre_calle.setVisible(false);
            referencia.setVisible(false);
            curp.setVisible(false);
            email.setVisible(false);
            Cargando.setVisible(true);
            regresar();
        }
    }

    private void Actualizar() {

        String fech = Año.getText() + "-" + Mes.getText() + "-" + Dia.getText();
        Date fec = Date.valueOf(fech);
        ClienteServicio cs = new ClienteServicio();
        es.setResultact(cs.ActualizarCliente(folio, name.getText(), ap_p.getText(), ap_m.getText(),
                fec, telefonoo, Celular.getText(), emailo, Curp.getText(), rfco, Municipio.getText(),
                Residencia.getText(), Nombre_calle.getText(), Referencia.getText(), Manzana.getText(),
                Lote.getText()));
    }

    private void Mostrar() {
        String fech = Año.getText() + "-" + Mes.getText() + "-" + Dia.getText();
        Date fec = Date.valueOf(fech);

        ClienteServicio cs = new ClienteServicio();
        String status = "activo";
        folio_cte = cs.InsertarCliente(name.getText(), ap_p.getText(), ap_m.getText(),
                fec, telefonoo, Celular.getText(), emailo, Curp.getText(), rfco, Municipio.getText(),
                Residencia.getText(), Nombre_calle.getText(), Referencia.getText(), Manzana.getText(), Lote.getText(), status);
        if (folio_cte == -1) {
            JOptionPane.showMessageDialog(this, "Algo salio mal al insertar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Contrato_generado cg = new Contrato_generado();
            cg.setNombre_cliente(name.getText());
            Cliente c = new Cliente(folio_cte, Municipio.getText(),
                    Residencia.getText(), Nombre_calle.getText(), Referencia.getText(),
                    Manzana.getText(), Lote.getText());
            Contrato_regis p1 = new Contrato_regis(c, ubicacion);
            p1.setSize(1030, 500);
            p1.setLocation(0, 0);

            content.removeAll();
            content.add(p1, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
    }

    private void regresar() {
        if (ubicacion.equals("contrato")) {
            Contrato_v p1 = new Contrato_v();
            p1.setSize(1030, 479);
            p1.setLocation(0, 0);

            content.removeAll();
            content.add(p1, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
        if (ubicacion.equals("insert cliente") || ubicacion.equals("editar cliente")) {
            Clientes p1 = new Clientes();
            p1.setSize(1030, 479);
            p1.setLocation(0, 0);

            content.removeAll();
            content.add(p1, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
    }

    private void Obtener(int folio) {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.SearchClientes(folio);
        int tam = lista.size();
        for (int i = 0; i < tam; i++) {
            Folio.setText(lista.get(i).getFolio().toString());
            name.setText(lista.get(i).getNombre());
            ap_p.setText(lista.get(i).getApellido_p());
            ap_m.setText(lista.get(i).getApellido_m());
            Date fech = lista.get(i).getFecha_nac();
            LocalDate nac = fech.toLocalDate();
            int Year = nac.getYear();
            DecimalFormat dmFormat = new DecimalFormat("00");
            String mes = dmFormat.format(Double.valueOf(nac.getMonthValue()));
            String dia = dmFormat.format(Double.valueOf(nac.getDayOfMonth()));
            Año.setText(String.valueOf(Year));
            Mes.setText(String.valueOf(mes));
            Dia.setText(String.valueOf(dia));
            RFC.setText(lista.get(i).getRfc());
            Telefono.setText(lista.get(i).getTelefono());
            Celular.setText(lista.get(i).getCelular());
            Email.setText(lista.get(i).getEmail());
            Curp.setText(lista.get(i).getCurp());
            Municipio.setText(lista.get(i).getMunicipio());
            Residencia.setText(lista.get(i).getResidencia());
            Nombre_calle.setText(lista.get(i).getNombreCalle());
            Referencia.setText(lista.get(i).getCalleReferencia());
            Manzana.setText(lista.get(i).getNumeroMzn());
            Lote.setText(lista.get(i).getNumeroLt());
        }
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Año;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel Cargando;
    private javax.swing.JTextField Celular;
    private javax.swing.JLabel Cliente_Datos;
    private javax.swing.JLabel Cliente_Domicilio;
    private javax.swing.JTextField Curp;
    private javax.swing.JTextField Dia;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Folio;
    private javax.swing.JLabel Foliot;
    private javax.swing.JTextField Lote;
    private javax.swing.JTextField Manzana;
    private javax.swing.JTextField Mes;
    private javax.swing.JTextField Municipio;
    private javax.swing.JButton Next_or_New;
    private javax.swing.JTextField Nombre_calle;
    private javax.swing.JTextField RFC;
    private javax.swing.JTextField Referencia;
    private javax.swing.JTextField Residencia;
    private javax.swing.JSeparator Separador;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField ap_m;
    private javax.swing.JTextField ap_p;
    private javax.swing.JLabel apm;
    private javax.swing.JLabel app;
    private javax.swing.JLabel celular;
    private javax.swing.JLabel curp;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel guion;
    private javax.swing.JLabel guion2;
    private javax.swing.JLabel lote;
    private javax.swing.JLabel manzana;
    private javax.swing.JLabel municipio;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre_calle;
    private javax.swing.JLabel referencia;
    private javax.swing.JLabel residencia;
    private javax.swing.JLabel rfc;
    private javax.swing.JLabel tel;
    // End of variables declaration//GEN-END:variables
}
