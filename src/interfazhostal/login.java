package interfazhostal;

import java.sql.*; 
import java.awt.*;
import javax.swing.JOptionPane;
import Conexiones.*;
import javax.swing.table.DefaultTableModel;

public class login extends javax.swing.JFrame {
    Connection ccn;
    
    public login() {
        initComponents();
        setLocationRelativeTo(null); //centrar ventana
        Inicio.setLocationRelativeTo(null);
        frmNuevoCliente.setLocationRelativeTo(null);
        frmNuevaReserva.setLocationRelativeTo(null);
        MostrarDatos();
        MostrarRegistroTabla();
        MostrarDatosReservas();
        MostrarRegistroTablaReservas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inicio = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnTrabajadores = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnReserva = new javax.swing.JButton();
        btnCaja = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        frmNuevoCliente = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtClienteApellidoP = new javax.swing.JTextField();
        txtClienteApellidoM = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtClienteNombre = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cbClienteSexo = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        dbClienteNac = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        txtClienteNacionalidad = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtClienteTel = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtClienteDNI = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btnClienteAgregar = new javax.swing.JButton();
        btnClienteBuscar = new javax.swing.JButton();
        btnClienteActualizar = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnClienteInicio = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClienteEncontrado = new javax.swing.JTable();
        frmNuevaReserva = new javax.swing.JFrame();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        dcFechaReserva = new com.toedter.calendar.JDateChooser();
        dcFechaIngreso = new com.toedter.calendar.JDateChooser();
        dcFechaSalida = new com.toedter.calendar.JDateChooser();
        cbTipoHab = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        txtNroHab = new javax.swing.JTextField();
        cbPiso = new javax.swing.JComboBox<>();
        txtBuscarClienteReserva = new javax.swing.JTextField();
        btnBuscarClienteReserva = new javax.swing.JButton();
        txtBuscarTrabajador = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaResultado = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        cbEstadoCuenta = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        rbtnSi = new javax.swing.JRadioButton();
        rbtnNo = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        btnRegistrarReserva = new javax.swing.JButton();
        btnActualizarReservas = new javax.swing.JButton();
        btnEliminarReserva = new javax.swing.JButton();
        btnProcesarPago = new javax.swing.JButton();
        btnVolverInicio = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaReservas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logButton = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        usuario = new javax.swing.JTextField();
        btnSalirLogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        Inicio.setMinimumSize(new java.awt.Dimension(1200, 750));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(229, 164, 0));

        btnInicio.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casaI.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnTrabajadores.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnTrabajadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trabajadorI.png"))); // NOI18N
        btnTrabajadores.setText("Trabajadores");
        btnTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrabajadoresActionPerformed(evt);
            }
        });

        btnClientes.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnReserva.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reserva.png"))); // NOI18N
        btnReserva.setText("Reserva");
        btnReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaActionPerformed(evt);
            }
        });

        btnCaja.setBackground(new java.awt.Color(255, 255, 255));
        btnCaja.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pago.png"))); // NOI18N
        btnCaja.setText("Caja");
        btnCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajaActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoHostal.png"))); // NOI18N

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReserva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTrabajadores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hostalAp1_.png"))); // NOI18N
        jLabel5.setText("460 - 260 ");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hostalAp2_.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hostalAp3_.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hostalAp4_.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio.getContentPane());
        Inicio.getContentPane().setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmNuevoCliente.setMinimumSize(new java.awt.Dimension(1200, 700));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("REGISTRO DE CLIENTES");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(409, 409, 409))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(24, 24, 24))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel12.setText("Apellido Paterno:");

        txtClienteApellidoP.setText(" ");
        txtClienteApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteApellidoPActionPerformed(evt);
            }
        });

        txtClienteApellidoM.setText(" ");
        txtClienteApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteApellidoMActionPerformed(evt);
            }
        });

        jLabel13.setText("Apellido Materno:");

        jLabel14.setText("Nombre:");

        txtClienteNombre.setText(" ");

        jLabel16.setText("Sexo:");

        cbClienteSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jLabel17.setText("Fecha Nacimiento:");

        jLabel18.setText("Nacionalidad:");

        jLabel19.setText("Tel/cel: ");

        jLabel20.setText("Documento:");

        jLabel22.setText("Buscar por N° DNI:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel17)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(dbClienteNac, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(cbClienteSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtClienteApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtClienteApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(52, 52, 52)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel19)
                                .addComponent(jLabel18)
                                .addComponent(jLabel20)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClienteNacionalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(txtClienteTel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtClienteDNI, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtClienteApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtClienteNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClienteApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel19)
                    .addComponent(txtClienteTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtClienteDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(cbClienteSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dbClienteNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        btnClienteAgregar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnClienteAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnClienteAgregar.setText("Agregar Cliente");
        btnClienteAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteAgregarActionPerformed(evt);
            }
        });

        btnClienteBuscar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnClienteBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnClienteBuscar.setText("Buscar");
        btnClienteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteBuscarActionPerformed(evt);
            }
        });

        btnClienteActualizar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnClienteActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/userI.png"))); // NOI18N
        btnClienteActualizar.setText("Actualizar");
        btnClienteActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActualizarActionPerformed(evt);
            }
        });

        btnEliminarCliente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnClienteInicio.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnClienteInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casaI.png"))); // NOI18N
        btnClienteInicio.setText("Inicio");
        btnClienteInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnClienteAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnClienteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnClienteActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnClienteInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnClienteAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClienteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClienteActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClienteInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(102, 204, 255));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("RESUMEN DE CLIENTES");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(455, 455, 455))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaClienteEncontrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaClienteEncontrado);

        javax.swing.GroupLayout frmNuevoClienteLayout = new javax.swing.GroupLayout(frmNuevoCliente.getContentPane());
        frmNuevoCliente.getContentPane().setLayout(frmNuevoClienteLayout);
        frmNuevoClienteLayout.setHorizontalGroup(
            frmNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(frmNuevoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frmNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(frmNuevoClienteLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        frmNuevoClienteLayout.setVerticalGroup(
            frmNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmNuevoClienteLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        frmNuevaReserva.setMinimumSize(new java.awt.Dimension(1200, 850));

        jPanel9.setBackground(new java.awt.Color(255, 153, 0));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Registro de habitaciones");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(417, 417, 417))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel15)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        jLabel24.setText("Fecha de Reserva:");

        jLabel25.setText("Fecha de ingreso:");

        jLabel26.setText("Fecha de salida:");

        jLabel27.setText("Habitacion:");

        jLabel28.setText("Piso");

        jLabel29.setText("Tipo de habitacion:");

        jLabel30.setText("Cliente:");

        jLabel31.setText("Trabajador: ");

        cbTipoHab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matrimonial", "Simple", "Doble", "Triple" }));

        jLabel32.setText("Cama adicional: ");

        txtNroHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroHabActionPerformed(evt);
            }
        });

        cbPiso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1er piso", "2do psio" }));

        btnBuscarClienteReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscarClienteReserva.setText("Buscar");
        btnBuscarClienteReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteReservaActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel33.setText("Resumen de cuota");

        txtaResultado.setColumns(20);
        txtaResultado.setRows(5);
        jScrollPane2.setViewportView(txtaResultado);

        jLabel34.setText("Estado:");

        cbEstadoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagado", "Debe" }));

        rbtnSi.setText("Si");

        rbtnNo.setText("No");
        rbtnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(rbtnSi)
                .addGap(40, 40, 40)
                .addComponent(rbtnNo)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnSi)
                    .addComponent(rbtnNo))
                .addContainerGap())
        );

        jLabel35.setText("Cantidad Personas:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(27, 27, 27))
                            .addComponent(jLabel32)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel27))
                                .addGap(10, 10, 10)))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbPiso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNroHab)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(dcFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtCant))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dcFechaReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(dcFechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbTipoHab, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBuscarClienteReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(txtBuscarTrabajador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarClienteReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(cbEstadoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(214, 214, 214))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarClienteReserva)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscarClienteReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel24)
                        .addComponent(dcFechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(txtBuscarTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(dcFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(dcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addGap(17, 17, 17)
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(cbTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtNroHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(cbPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEstadoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

        btnRegistrarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reserva.png"))); // NOI18N
        btnRegistrarReserva.setText("Registrar reserva");
        btnRegistrarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarReservaActionPerformed(evt);
            }
        });

        btnActualizarReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/userI.png"))); // NOI18N
        btnActualizarReservas.setText("Actualizar");
        btnActualizarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarReservasActionPerformed(evt);
            }
        });

        btnEliminarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        btnEliminarReserva.setText("Eliminar");
        btnEliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarReservaActionPerformed(evt);
            }
        });

        btnProcesarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pago.png"))); // NOI18N
        btnProcesarPago.setText("Procesar");
        btnProcesarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarPagoActionPerformed(evt);
            }
        });

        btnVolverInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casaI.png"))); // NOI18N
        btnVolverInicio.setText("Inicio");
        btnVolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolverInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProcesarPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizarReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizarReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProcesarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolverInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 204, 102));

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Resumen de reservas");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(458, 458, 458))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(23, 23, 23))
        );

        tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablaReservas);

        javax.swing.GroupLayout frmNuevaReservaLayout = new javax.swing.GroupLayout(frmNuevaReserva.getContentPane());
        frmNuevaReserva.getContentPane().setLayout(frmNuevaReservaLayout);
        frmNuevaReservaLayout.setHorizontalGroup(
            frmNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(frmNuevaReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frmNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(frmNuevaReservaLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        frmNuevaReservaLayout.setVerticalGroup(
            frmNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmNuevaReservaLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmNuevaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));

        jPanel1.setBackground(new java.awt.Color(229, 164, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(219, 164, 0));
        jLabel3.setText("Bienvenido!");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Registrese para continuar");

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña:");

        logButton.setBackground(new java.awt.Color(229, 164, 0));
        logButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        logButton.setText("Entrar");
        logButton.setActionCommand("");
        logButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logButtonActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        password.setMinimumSize(new java.awt.Dimension(0, 17));
        password.setPreferredSize(new java.awt.Dimension(0, 17));

        usuario.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        btnSalirLogin.setBackground(new java.awt.Color(240, 150, 0));
        btnSalirLogin.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnSalirLogin.setText("Salir");
        btnSalirLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(122, 122, 122))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usuario)
                            .addComponent(btnSalirLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(logButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalirLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Modo 3  Logo png.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logButtonActionPerformed
        Conexion ccn = new Conexion();
        
        try(Connection connection = ccn.getConnection();
         Statement statement = connection.createStatement()){
            
        String codUser = usuario.getText();
        String passUser = password.getText();
        
        if("".equals(codUser))
            JOptionPane.showMessageDialog(null, "Ingrese usuario");
        else if("".equals(passUser))
                JOptionPane.showMessageDialog(null, "Ingrese contraseña");
            else{
                String query = "SELECT * FROM UsuariosHostal WHERE IdUsuario = ? AND IdPassword = ?";
                
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, codUser);
                preparedStatement.setString(2, passUser);
                
                ResultSet resultSet = preparedStatement.executeQuery();
                
                    if (resultSet.next()) {
                        // Usuario válido, puedes realizar acciones adicionales aquí
                        Inicio.setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
                    }
                }   
            }
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("No se pudo estables conexion :(");
        }
        
    }//GEN-LAST:event_logButtonActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void btnCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCajaActionPerformed

    private void btnTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrabajadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTrabajadoresActionPerformed

    private void txtClienteApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteApellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteApellidoPActionPerformed

    private void txtClienteApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteApellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteApellidoMActionPerformed

    private void btnClienteAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteAgregarActionPerformed
        //validar de que no hallan campos vacios, antes de guardar los datos
        if(txtClienteNombre.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Falta ingresar  el nombre");
           txtClienteNombre.requestFocus();
       }else if(txtClienteApellidoP.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Falta ingresar  el apellido paterno");
           txtClienteApellidoP.requestFocus();
       }else if(txtClienteNacionalidad.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Falta ingresar la nacionalidad");
           txtClienteNacionalidad.requestFocus();
       }else if(txtClienteDNI.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Falta ingresar el docuemnto");
           txtClienteDNI.requestFocus();
       }else{
           try{
               Connection con1 = null;
               Conexion ccn = new Conexion();
               con1 = ccn.getConnection();
               
               String SQLGuardar = "INSERT INTO ClientesHostal(Documento,ApellidoP,ApellidoM,Nombre,Nacionalidad,Sexo,Tel,FechaNac)VALUES(?,?,?,?,?,?,?,?)";
               PreparedStatement pst = con1.prepareCall(SQLGuardar);
               
                pst.setString(1, txtClienteDNI.getText());
                pst.setString(2, txtClienteApellidoP.getText());
                pst.setString(3, txtClienteApellidoM.getText());
                pst.setString(4, txtClienteNombre.getText());
                pst.setString(5, txtClienteNacionalidad.getText());
                String sexo = (String) cbClienteSexo.getSelectedItem();
                pst.setString(6, sexo);
                pst.setInt(7, Integer.parseInt(txtClienteTel.getText()));
                java.util.Date fechaNac = dbClienteNac.getDate();
               if (fechaNac != null) {
                java.sql.Date fechaNacSQL = new java.sql.Date(fechaNac.getTime());
                pst.setDate(8, fechaNacSQL);
                }
                
                int n = pst.executeUpdate();
                pst.close();
                if(n>0){
                    JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
                    limpiarDatosClientes();
                }
           }catch(SQLException | NumberFormatException e){
               e.printStackTrace();
               JOptionPane.showMessageDialog(null, "Error al guardar los datos ");
           }
       }
    }//GEN-LAST:event_btnClienteAgregarActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        frmNuevoCliente.setVisible(true);
        Inicio.setVisible(false);

    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Inicio.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnClienteInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteInicioActionPerformed
        Inicio.setVisible(true);
        frmNuevoCliente.setVisible(false);
    }//GEN-LAST:event_btnClienteInicioActionPerformed

    private void btnClienteActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActualizarActionPerformed
        MostrarDatos();
        MostrarRegistroTabla();
    }//GEN-LAST:event_btnClienteActualizarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirLoginActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirLoginActionPerformed

    private void btnClienteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteBuscarActionPerformed
        String Documento =  txtBuscarCliente.getText();
        
        DefaultTableModel modelo = (DefaultTableModel) tablaClienteEncontrado.getModel();
        modelo.setRowCount(0);
    
    try {
        Connection con = null;
        Conexion ccn = new Conexion();
        con = ccn.getConnection();
        String SQL = "SELECT * FROM ClientesHostal WHERE Documento = ?";
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setString(1, Documento);
        
        ResultSet rst = pst.executeQuery();

        while (rst.next()) {
            // Agrega los resultados a la tabla
            modelo.addRow(new Object[]{
                rst.getString("Documento"),
                rst.getString("ApellidoP"),
                rst.getString("ApellidoM"),
                rst.getString("Nombre"),
                rst.getString("Nacionalidad"),
                rst.getString("Sexo"),
                rst.getString("FechaNac"),
                rst.getString("Tel")
            });
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar el cliente: " + e);
    }
    }//GEN-LAST:event_btnClienteBuscarActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        int filaSeleccionada = tablaClienteEncontrado.getSelectedRow();
    
    try {
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente");
        } else {
            // Obtener el documento del cliente seleccionado
            String documento = tablaClienteEncontrado.getValueAt(filaSeleccionada, 0).toString();

            // Eliminar el registro de la base de datos
            Connection con = null;
            Conexion ccn = new Conexion();
            con = ccn.getConnection();
            String SQLElimina = "DELETE FROM ClientesHostal WHERE Documento = ?";
            try (PreparedStatement pst = con.prepareStatement(SQLElimina)) {
                pst.setString(1, documento);
                int resultado = pst.executeUpdate();

                if (resultado > 0) {
                    // Si la eliminación en la base de datos fue exitosa, elimina la fila visualmente
                    DefaultTableModel modelo = (DefaultTableModel) tablaClienteEncontrado.getModel();
                    modelo.removeRow(filaSeleccionada);

                    JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el cliente");
                }
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al eliminar el cliente");
    }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void rbtnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnNoActionPerformed

    private void txtNroHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroHabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroHabActionPerformed

    private void btnProcesarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarPagoActionPerformed
        int tipoHabitacion,cantidad;
        double total = 0;
        char adicional = 'o';
        String textcool="";
        
        try{
            cantidad = Integer.parseInt(this.txtCant.getText());
            tipoHabitacion = this.cbTipoHab.getSelectedIndex();
            
            if(this.rbtnSi.isSelected()==true){
                adicional = 'S';
                textcool = "+1 Cama Adicional";
            }else if(this.rbtnNo.isSelected()==true){
                adicional = 'N';
                textcool="Sin Cama Adicional";
            }
            
            switch(tipoHabitacion){
                case 0:{ //matricmocial 100
                    if(adicional == 'S')
                        total  = 145;
                    else if(adicional == 'N')
                        total = 100;
                }break; 
                
                case 1:{ //simple 80
                    if(adicional == 'S')
                        total  = 125;
                    else if(adicional == 'N')
                        total = 80;
                }break;
                
                case 2:{ //doble 120
                    if(adicional == 'S')
                        total  = 165;
                    else if(adicional == 'N')
                        total = 120;
                }break;
                
                case 3:{ //triple 160
                    if(adicional == 'S')
                        total  = 195;
                    else if(adicional == 'N')
                        total = 160;
                }break;
            }
            
            this.txtaResultado.append("Tipo de habitacion: "+this.cbTipoHab.getSelectedItem()+"\n");
            this.txtaResultado.setText("Presenta: "+textcool+"\n");
            this.txtaResultado.setText("Nro de Habitacion "+this.txtNroHab.getText()+"\n");
            this.txtaResultado.append("Piso: "+this.cbPiso.getSelectedItem()+"\n");
            this.txtaResultado.setText("Cantidad de hospedados: "+this.txtCant.getText()+"\n");
            this.txtaResultado.setText("Titular de la reserva: "+this.txtBuscarClienteReserva.getText()+"\n");
            this.txtaResultado.append("Importe Total: "+total+"\n");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error de tipo; "+e.toString());
        }
    }//GEN-LAST:event_btnProcesarPagoActionPerformed

    private void btnActualizarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarReservasActionPerformed
        MostrarDatosReservas();
        MostrarRegistroTablaReservas();
    }//GEN-LAST:event_btnActualizarReservasActionPerformed

    private void btnRegistrarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarReservaActionPerformed
        //validar de que no hallan campos vacios, antes de guardar los datos
        if(dcFechaReserva.getDate()== null){
           JOptionPane.showMessageDialog(null, "Falta ingresar  la fecha de reserva");
           dcFechaReserva.requestFocus();
       }else if(dcFechaIngreso.getDate()== null){
           JOptionPane.showMessageDialog(null, "Falta ingresar  la fecha de ingreso");
           dcFechaIngreso.requestFocus();
       }else if(dcFechaSalida.getDate()== null){
           JOptionPane.showMessageDialog(null, "Falta ingresar la fecha de salida");
           dcFechaSalida.requestFocus();
       }else if (!rbtnSi.isSelected() && !rbtnNo.isSelected()){
           JOptionPane.showMessageDialog(null, "Falta ingresar el adicional");
       }else if(txtNroHab.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Falta ingresar el nro de habitacion");
           txtNroHab.requestFocus();
       }else if(txtCant.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Falta ingresar la cantidad de pasajeros");
           txtCant.requestFocus();
       }else if (txtBuscarClienteReserva.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa el nombre del cliente a buscar");
            txtBuscarClienteReserva.requestFocus();
        }else if (txtBuscarTrabajador.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa el nombre del trabajador a buscar");
            txtBuscarTrabajador.requestFocus();
        }else{
            //guardar datos
           try{
               Connection con1 = null;
               Conexion ccn = new Conexion();
               con1 = ccn.getConnection();
               Statement st = con1.createStatement();
               
               String SQLGuardar = "INSERT INTO ReservasHostal(FechaReserva,FechaInicio,FechaFin,Habitacion,Adicional,Numero,Piso,Documento,IdUsuario,Estado,Cantidad)VALUES(?,?,?,?,?,?,?,?,?,?,?)";
               PreparedStatement pst = con1.prepareCall(SQLGuardar);
               
                java.util.Date fechaReserva = dcFechaReserva.getDate();
                if (fechaReserva != null) {
                        java.sql.Date fechaReservaSQL = new java.sql.Date(fechaReserva.getTime());
                        pst.setDate(1, fechaReservaSQL);
                } 
                java.util.Date fechaIngreso = dcFechaIngreso.getDate();
                if (fechaIngreso != null) {
                        java.sql.Date fechaIngresoSQL = new java.sql.Date(fechaIngreso.getTime());
                        pst.setDate(2, fechaIngresoSQL);
                } 
                java.util.Date fechaSalida = dcFechaSalida.getDate();
                if (fechaSalida != null) {
                        java.sql.Date fechaSalidaSQL = new java.sql.Date(fechaSalida.getTime());
                        pst.setDate(3, fechaSalidaSQL);
                }
                String habitacion = (String) cbTipoHab.getSelectedItem();
                pst.setString(4, habitacion);
                
                String eleccion = null;
                if (rbtnSi.isSelected()) {
                    eleccion = "Sí";
                } else if (rbtnNo.isSelected()) {
                    eleccion = "No";
                }
                pst.setString(5, eleccion);
                
                pst.setInt(6, Integer.parseInt(txtNroHab.getText()));
                String piso = (String) cbPiso.getSelectedItem();
                pst.setString(7, piso);
                
                pst.setString(8, txtBuscarClienteReserva.getText());
                pst.setString(9, txtBuscarTrabajador.getText());
                
                String estadoo = (String) cbEstadoCuenta.getSelectedItem();
                pst.setString(10, estadoo);
                pst.setInt(11, Integer.parseInt(txtCant.getText()));
                
                int n = pst.executeUpdate();
                pst.close();
                if(n>0){
                    JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
                    limpiarDatosReservas();
                }
           }catch(SQLException | NumberFormatException e){
               e.printStackTrace();
               JOptionPane.showMessageDialog(null, "Error al guardar los datos ");
           }
       }
    }//GEN-LAST:event_btnRegistrarReservaActionPerformed

    private void btnBuscarClienteReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteReservaActionPerformed
    try {
        Connection Conexion2 =null;
        Conexion ccn = new Conexion();
        Conexion2 = ccn.getConnection();

        String queryBusarCl = "SELECT * FROM ClientesHostal WHERE Documento = ?";
        PreparedStatement pst = Conexion2.prepareStatement(queryBusarCl);
        pst.setString(1, txtBuscarClienteReserva.getText());

        ResultSet resultSet = pst.executeQuery();
        
        if (resultSet.next()) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado");

            // Puedes acceder a los datos del cliente si lo necesitas
            String nombreCliente = resultSet.getString("Nombre");
            String apellidoCliente = resultSet.getString("ApellidoP");
            
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al buscar el cliente en la base de datos");
    }
    }//GEN-LAST:event_btnBuscarClienteReservaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        Connection Conexion3 =null;
        Conexion ccn = new Conexion();
        Conexion3 = ccn.getConnection();

        String queryBusarCl = "SELECT * FROM UsuariosHostal WHERE IdUsuario = ?";
        PreparedStatement pst = Conexion3.prepareStatement(queryBusarCl);
        pst.setString(1, txtBuscarTrabajador.getText());

        ResultSet resultSet = pst.executeQuery();
        
        if (resultSet.next()) {
            JOptionPane.showMessageDialog(null, "Trabajador encontrado");

        } else {
            JOptionPane.showMessageDialog(null, "Trabajador no encontrado");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al buscar al trbajador en la base de datos");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverInicioActionPerformed
        Inicio.setVisible(true);
        frmNuevaReserva.setVisible(false);
    }//GEN-LAST:event_btnVolverInicioActionPerformed

    private void btnEliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarReservaActionPerformed
        
int filaSeleccionada2 = tablaReservas.getSelectedRow();
    
    try {
        if (filaSeleccionada2 == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una reserva");
        } else {
            // Obtener el documento del cliente seleccionado
            String documento = tablaReservas.getValueAt(filaSeleccionada2, 0).toString();

            // Eliminar el registro de la base de datos
            Connection con = null;
            Conexion ccn = new Conexion();
            con = ccn.getConnection();
            String SQLElimina = "DELETE FROM ReservasHostal WHERE Documento = ?";
            try (PreparedStatement pst = con.prepareStatement(SQLElimina)) {
                pst.setString(1, documento);
                int resultado = pst.executeUpdate();

                if (resultado > 0) {
                    // Si la eliminación en la base de datos fue exitosa, elimina la fila visualmente
                    DefaultTableModel modelo = (DefaultTableModel) tablaReservas.getModel();
                    modelo.removeRow(filaSeleccionada2);

                    JOptionPane.showMessageDialog(null, "Reserva eliminada correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar la reserva");
                }
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al eliminar la reserva");
    }
    }//GEN-LAST:event_btnEliminarReservaActionPerformed

    private void btnReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaActionPerformed
        frmNuevaReserva.setVisible(true);
        Inicio.setVisible(false);
    }//GEN-LAST:event_btnReservaActionPerformed
    
    public void MostrarDatos(){
        DefaultTableModel MiTaabla = (DefaultTableModel)tablaClienteEncontrado.getModel();
        String EncabezadoTabla[] = {"Documento","Apellido Paterno","Apellido Naterno","Nombre", "Nacionalidad", "Sexo", "FechaNac", "Tel/Cel"};
        MiTaabla = new DefaultTableModel(null, EncabezadoTabla);
        tablaClienteEncontrado.setModel(MiTaabla);
    }
    
    public void MostrarRegistroTabla(){
        try{
            Connection Conex = null;
            DefaultTableModel lamismatabla = (DefaultTableModel)tablaClienteEncontrado.getModel();
            Conexion conectame = new Conexion();
            Conex = conectame.getConnection();
            String Registro[]=new String[8];
            String SQL = "SELECT * FROM ClientesHostal";
            Statement sentencia = Conex.createStatement();
            ResultSet rst = sentencia.executeQuery(SQL);
            while(rst.next()){
                Registro[0]=rst.getString("Documento");
                Registro[1]=rst.getString("ApellidoP");
                Registro[2]=rst.getString("ApellidoM");
                Registro[3]=rst.getString("Nombre");
                Registro[4]=rst.getString("Nacionalidad");
                Registro[5]=rst.getString("Sexo");
                Registro[6]=rst.getString("FechaNac");
                Registro[7]=rst.getString("Tel");
                lamismatabla.addRow(Registro);
            }
            tablaClienteEncontrado.setModel(lamismatabla);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Se ha presentado un error al cargar los datos de la tabla "+e);
        }
    } 
    
    
    public void limpiarDatosClientes(){
        this.txtClienteApellidoM.setText("");
        this.txtClienteApellidoP.setText("");
        this.txtClienteNombre.setText("");
        this.txtClienteNacionalidad.setText("");
        this.txtClienteTel.setText("");
        this.txtClienteDNI.setText("");
        this.txtClienteApellidoP.requestFocus();
    }
    
    
    public void MostrarDatosReservas(){
        DefaultTableModel MiTaabla2 = (DefaultTableModel)tablaReservas.getModel();
        String EncabezadoTabla[] = {"FechaReserva","FechaInicio","FechaFin","Habitacion", "Adicional", "Numero", "Piso", "Documento","IdUsuario","Estado","Cantidad"};
        MiTaabla2 = new DefaultTableModel(null, EncabezadoTabla);
        tablaReservas.setModel(MiTaabla2);
    }
    
    public void MostrarRegistroTablaReservas(){
        try{
            Connection Conex = null;
            DefaultTableModel lamismatabla2 = (DefaultTableModel)tablaReservas.getModel();
            Conexion conectame = new Conexion();
            Conex = conectame.getConnection();
            String Registro2[]=new String[10];
            String SQL = "SELECT * FROM ReservasHostal";
            Statement sentencia = Conex.createStatement();
            ResultSet rst = sentencia.executeQuery(SQL);
            while(rst.next()){
                Registro2[0]=rst.getString("FechaReserva");
                Registro2[1]=rst.getString("FechaInicio");
                Registro2[2]=rst.getString("FechaFin");
                Registro2[3]=rst.getString("Habitacion");
                Registro2[4]=rst.getString("Adicional");
                Registro2[5]=rst.getString("Numero");
                Registro2[6]=rst.getString("Piso");
                Registro2[7]=rst.getString("Documento");
                Registro2[8]=rst.getString("IdUsuario");
                Registro2[9]=rst.getString("Estado");
                Registro2[10]=rst.getString("Cantidad");
                lamismatabla2.addRow(Registro2);
            }
            tablaClienteEncontrado.setModel(lamismatabla2);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Se ha presentado un error al cargar los datos de la tabla "+e);
        }
    } 
    public void limpiarDatosReservas(){
        this.txtNroHab.setText("");
        this.txtBuscarClienteReserva.setText("");
        this.txtBuscarTrabajador.setText("");
        this.txtCant.setText("");
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Inicio;
    private javax.swing.JButton btnActualizarReservas;
    private javax.swing.JButton btnBuscarClienteReserva;
    private javax.swing.JButton btnCaja;
    private javax.swing.JButton btnClienteActualizar;
    private javax.swing.JButton btnClienteAgregar;
    private javax.swing.JButton btnClienteBuscar;
    private javax.swing.JButton btnClienteInicio;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarReserva;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnProcesarPago;
    private javax.swing.JButton btnRegistrarReserva;
    private javax.swing.JButton btnReserva;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirLogin;
    private javax.swing.JButton btnTrabajadores;
    private javax.swing.JButton btnVolverInicio;
    private javax.swing.JComboBox<String> cbClienteSexo;
    private javax.swing.JComboBox<String> cbEstadoCuenta;
    private javax.swing.JComboBox<String> cbPiso;
    private javax.swing.JComboBox<String> cbTipoHab;
    private com.toedter.calendar.JDateChooser dbClienteNac;
    private com.toedter.calendar.JDateChooser dcFechaIngreso;
    private com.toedter.calendar.JDateChooser dcFechaReserva;
    private com.toedter.calendar.JDateChooser dcFechaSalida;
    private javax.swing.JFrame frmNuevaReserva;
    private javax.swing.JFrame frmNuevoCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JButton logButton;
    private javax.swing.JPasswordField password;
    private javax.swing.JRadioButton rbtnNo;
    private javax.swing.JRadioButton rbtnSi;
    private javax.swing.JTable tablaClienteEncontrado;
    private javax.swing.JTable tablaReservas;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtBuscarClienteReserva;
    private javax.swing.JTextField txtBuscarTrabajador;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtClienteApellidoM;
    private javax.swing.JTextField txtClienteApellidoP;
    private javax.swing.JTextField txtClienteDNI;
    private javax.swing.JTextField txtClienteNacionalidad;
    private javax.swing.JTextField txtClienteNombre;
    private javax.swing.JTextField txtClienteTel;
    private javax.swing.JTextField txtNroHab;
    private javax.swing.JTextArea txtaResultado;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}