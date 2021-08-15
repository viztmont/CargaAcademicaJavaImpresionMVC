package vista;

import java.awt.Image;
import javax.swing.ImageIcon;

public class vHome extends javax.swing.JFrame {

    ImageIcon ImageIcon = new ImageIcon("imagesiconos/carga.png");
    Image image = ImageIcon.getImage();

    public vHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        jpnPaleta = new javax.swing.JPanel();
        btnPrincipalAula = new javax.swing.JButton();
        btnPrincipalCatedratico = new javax.swing.JButton();
        btnPrincipalMateria = new javax.swing.JButton();
        btnPrincipalDiponible = new javax.swing.JButton();
        btnPrincipalCarrera = new javax.swing.JButton();
        btnPrincipalHome = new javax.swing.JButton();
        btnPrincipalDistribucion = new javax.swing.JButton();
        btnPrincipalParametros = new javax.swing.JButton();
        tpnHome = new javax.swing.JTabbedPane();
        panelHome = new javax.swing.JPanel();
        panelHomeDistribucion = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblDistribucionAula = new javax.swing.JLabel();
        cmbDistribucionAula = new javax.swing.JComboBox<>();
        lblDistribucionCarrera = new javax.swing.JLabel();
        cmbDistribucionCarrera = new javax.swing.JComboBox<>();
        lblDistribucionAnio = new javax.swing.JLabel();
        cmbDistribucionAnio = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbDistribucionCantidad = new javax.swing.JComboBox<>();
        btnDistribucionCantidadAceptar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnDistribucionCarrera = new javax.swing.JButton();
        btnDistribucionTodo = new javax.swing.JButton();
        btnDistribucionAnio = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnDistribucionCarreraAnio = new javax.swing.JButton();
        panelHomeAula = new javax.swing.JPanel();
        jtlAula = new javax.swing.JScrollPane();
        tblAula = new javax.swing.JTable();
        btnAulaEliminar = new javax.swing.JButton();
        btnAulaModificar = new javax.swing.JButton();
        btnAulaAgregar = new javax.swing.JButton();
        panelAulaDatos = new javax.swing.JPanel();
        lblAulaRegistrar = new javax.swing.JLabel();
        lblAulaModificar = new javax.swing.JLabel();
        txtAulaCodigo = new javax.swing.JTextField();
        lblAulaCodigo = new javax.swing.JLabel();
        lblAulaNombre = new javax.swing.JLabel();
        txtAulaNombre = new javax.swing.JTextField();
        lblAulaDescripcion = new javax.swing.JLabel();
        cmbAulaDescripcion = new javax.swing.JComboBox<>();
        btnAulaCancelar = new javax.swing.JButton();
        btnAulaGuardar = new javax.swing.JButton();
        panelHomeCarrera = new javax.swing.JPanel();
        jtlAula4 = new javax.swing.JScrollPane();
        tblCarrera = new javax.swing.JTable();
        btnCarreraEliminar = new javax.swing.JButton();
        btnCarreraModificar = new javax.swing.JButton();
        btnCarreraAgregar = new javax.swing.JButton();
        panelCarreraDatos = new javax.swing.JPanel();
        lblCarreraRegistrar = new javax.swing.JLabel();
        lblCarreraModificar = new javax.swing.JLabel();
        txtCarreraCodigo = new javax.swing.JTextField();
        txtCarreraNombre = new javax.swing.JTextField();
        txtCarreraDescripcion = new javax.swing.JTextField();
        lblCarreraDescripcion = new javax.swing.JLabel();
        lblCarreraNombre = new javax.swing.JLabel();
        lblCarreraCodigo = new javax.swing.JLabel();
        btnCarreraCancelar = new javax.swing.JButton();
        btnCarreraGuardar = new javax.swing.JButton();
        panelHomeMateria = new javax.swing.JPanel();
        jtlAula1 = new javax.swing.JScrollPane();
        tblMateria = new javax.swing.JTable();
        btnMateriaAgregar = new javax.swing.JButton();
        btnMateriaModificar = new javax.swing.JButton();
        btnMateriaEliminar = new javax.swing.JButton();
        panelMateriaPaleta = new javax.swing.JPanel();
        lblMateriaRegistrar = new javax.swing.JLabel();
        lblMateriaModificar = new javax.swing.JLabel();
        txtMateriaCodigo = new javax.swing.JTextField();
        txtMateriaNombre = new javax.swing.JTextField();
        cmbMateriaCarrera = new javax.swing.JComboBox<>();
        cmbMateriaAnio = new javax.swing.JComboBox<>();
        lblMateriaCodigo = new javax.swing.JLabel();
        lblMateriaAnio = new javax.swing.JLabel();
        lbMateriaCarrera = new javax.swing.JLabel();
        lbMaterialNombre = new javax.swing.JLabel();
        btnMateriaCancelar = new javax.swing.JButton();
        btnMateriaGuardar = new javax.swing.JButton();
        cmbMateriaGrupos = new javax.swing.JComboBox<>();
        lblMateriaGrupos = new javax.swing.JLabel();
        lblMaterianombrefiltrar = new javax.swing.JLabel();
        txtMaterianombrefiltrar = new javax.swing.JTextField();
        lblMateriacarreafiltrar = new javax.swing.JLabel();
        txtMateriacarrerafiltrar = new javax.swing.JTextField();
        lbMateriaaniofiltrar = new javax.swing.JLabel();
        txtMateriaaniofiltrar = new javax.swing.JTextField();
        panelHomeDisponibilidad = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDisponibilidad = new javax.swing.JTable();
        jpnDisponibilidadPaleta = new javax.swing.JPanel();
        lbldisponibilidad = new javax.swing.JLabel();
        lbldisponibilidadCodigo = new javax.swing.JLabel();
        cmbdisponibilidadAula = new javax.swing.JComboBox<>();
        btndisponibilidadAceptar = new javax.swing.JButton();
        btndisponibilidadModificar = new javax.swing.JButton();
        btndisponibilidadCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtdisponibilidadAula = new javax.swing.JTextField();
        panelHomeCatedratico = new javax.swing.JPanel();
        jtlAula2 = new javax.swing.JScrollPane();
        tblCatedratico = new javax.swing.JTable();
        btnCatedraticoAgregar = new javax.swing.JButton();
        btnCatedraticoModificar = new javax.swing.JButton();
        btnCatedraticoEliminar = new javax.swing.JButton();
        panelCatedraticoDatos = new javax.swing.JPanel();
        lblCatedraticoRegistrar = new javax.swing.JLabel();
        lblCatedraticoModificar = new javax.swing.JLabel();
        txtCatedraticoCodigo = new javax.swing.JTextField();
        txtCatedraticoNombres = new javax.swing.JTextField();
        txtCatedraticoApellidos = new javax.swing.JTextField();
        lblCatedraticoApellidos = new javax.swing.JLabel();
        lblCatedraticoNombres = new javax.swing.JLabel();
        lblCatedraticoCodigo = new javax.swing.JLabel();
        btnCatedraticoGuardar = new javax.swing.JButton();
        btnCatedraticoCancelar = new javax.swing.JButton();
        lblCatedraticoMaterias = new javax.swing.JLabel();
        txtCatedraticoMateriasxCiclo = new javax.swing.JTextField();
        panelHomeParametro = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btbParametroAgregar = new javax.swing.JButton();
        btnParametroModificar = new javax.swing.JButton();
        btnParametroEliminar = new javax.swing.JButton();
        txtparametroUsuario = new javax.swing.JTextField();
        ptxtparametroContra = new javax.swing.JPasswordField();
        cmbParametroUsuarios = new javax.swing.JComboBox<>();
        btnParametroGuardar = new javax.swing.JButton();
        btnParametroCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btnparametroCiclo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cmbparametroCiclo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtparametroCiclodb = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmbparametroAula = new javax.swing.JComboBox<>();
        btnParametroReporte = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        btnParametroLimpiarCiclo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 924, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carga Académica");
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("/iconos/carga.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1136, 606));
        setName("fmrHome"); // NOI18N

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 4, true));

        jpnPaleta.setBackground(new java.awt.Color(255, 255, 255));
        jpnPaleta.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue, 2));
        jpnPaleta.setMaximumSize(new java.awt.Dimension(152, 760));
        jpnPaleta.setMinimumSize(new java.awt.Dimension(152, 406));

        btnPrincipalAula.setBackground(new java.awt.Color(104, 0, 0));
        btnPrincipalAula.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipalAula.setText("AULA");
        btnPrincipalAula.setFocusPainted(false);
        btnPrincipalAula.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnPrincipalCatedratico.setBackground(new java.awt.Color(104, 0, 0));
        btnPrincipalCatedratico.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipalCatedratico.setText("CATEDRÁTICO");
        btnPrincipalCatedratico.setFocusPainted(false);

        btnPrincipalMateria.setBackground(new java.awt.Color(104, 0, 0));
        btnPrincipalMateria.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipalMateria.setText("MATERIA");
        btnPrincipalMateria.setFocusPainted(false);

        btnPrincipalDiponible.setBackground(new java.awt.Color(104, 0, 0));
        btnPrincipalDiponible.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipalDiponible.setText("DISPONIBILIDAD");
        btnPrincipalDiponible.setFocusPainted(false);
        btnPrincipalDiponible.setMaximumSize(new java.awt.Dimension(59, 23));
        btnPrincipalDiponible.setMinimumSize(new java.awt.Dimension(59, 23));

        btnPrincipalCarrera.setBackground(new java.awt.Color(104, 0, 0));
        btnPrincipalCarrera.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipalCarrera.setFocusPainted(false);
        btnPrincipalCarrera.setLabel("CARRERA");

        btnPrincipalHome.setBackground(new java.awt.Color(255, 255, 255));
        btnPrincipalHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/settings - copia.png"))); // NOI18N
        btnPrincipalHome.setDisabledIcon(null);
        btnPrincipalHome.setDisabledSelectedIcon(null);
        btnPrincipalHome.setFocusPainted(false);

        btnPrincipalDistribucion.setBackground(new java.awt.Color(104, 0, 0));
        btnPrincipalDistribucion.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipalDistribucion.setText("DISTRIBUCIÓN");
        btnPrincipalDistribucion.setFocusPainted(false);
        btnPrincipalDistribucion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrincipalDistribucion.setRequestFocusEnabled(false);

        btnPrincipalParametros.setBackground(new java.awt.Color(104, 0, 0));
        btnPrincipalParametros.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipalParametros.setText("PARÁMETROS");
        btnPrincipalParametros.setFocusPainted(false);

        javax.swing.GroupLayout jpnPaletaLayout = new javax.swing.GroupLayout(jpnPaleta);
        jpnPaleta.setLayout(jpnPaletaLayout);
        jpnPaletaLayout.setHorizontalGroup(
            jpnPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPaletaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPrincipalDistribucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrincipalCatedratico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrincipalDiponible, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btnPrincipalMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrincipalCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrincipalAula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
            .addGroup(jpnPaletaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnPrincipalHome, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnPaletaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrincipalParametros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnPaletaLayout.setVerticalGroup(
            jpnPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPaletaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrincipalHome, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnPrincipalDistribucion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrincipalAula, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrincipalCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrincipalMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrincipalDiponible, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrincipalCatedratico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrincipalParametros, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnHome.setBackground(new java.awt.Color(255, 255, 255));
        tpnHome.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        tpnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tpnHome.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tpnHome.setDoubleBuffered(true);
        tpnHome.setEnabled(false);
        tpnHome.setOpaque(true);

        panelHome.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 933, Short.MAX_VALUE)
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        tpnHome.addTab("UESOCC", panelHome);

        panelHomeDistribucion.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 0, 0), 1, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lblDistribucionAula.setBackground(new java.awt.Color(104, 0, 0));
        lblDistribucionAula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDistribucionAula.setText("Seleccione Aula");

        cmbDistribucionAula.setBackground(new java.awt.Color(104, 0, 0));
        cmbDistribucionAula.setForeground(new java.awt.Color(255, 255, 255));

        lblDistribucionCarrera.setBackground(new java.awt.Color(104, 0, 0));
        lblDistribucionCarrera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDistribucionCarrera.setText("Seleccione Carrera");

        cmbDistribucionCarrera.setBackground(new java.awt.Color(104, 0, 0));
        cmbDistribucionCarrera.setForeground(new java.awt.Color(255, 255, 255));

        lblDistribucionAnio.setBackground(new java.awt.Color(104, 0, 0));
        lblDistribucionAnio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDistribucionAnio.setText("Seleccione Año");

        cmbDistribucionAnio.setBackground(new java.awt.Color(104, 0, 0));
        cmbDistribucionAnio.setForeground(new java.awt.Color(255, 255, 255));
        cmbDistribucionAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRIMERO", "SEGUNDO", "TERCERO", "CUARTO", "QUINTO" }));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SELECCIONE POR CANTIDAD/CAPACIDAD");

        cmbDistribucionCantidad.setBackground(new java.awt.Color(104, 0, 0));
        cmbDistribucionCantidad.setForeground(new java.awt.Color(255, 255, 255));
        cmbDistribucionCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PEQUEÑA", "NORMAL", "GRANDE", "ENORME" }));

        btnDistribucionCantidadAceptar.setBackground(new java.awt.Color(104, 0, 0));
        btnDistribucionCantidadAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnDistribucionCantidadAceptar.setText("ACEPTAR");
        btnDistribucionCantidadAceptar.setFocusPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbDistribucionAnio, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbDistribucionCarrera, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDistribucionAnio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDistribucionCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbDistribucionAula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDistribucionAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbDistribucionCantidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDistribucionCantidadAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(cmbDistribucionCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDistribucionCantidadAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDistribucionAula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbDistribucionAula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDistribucionCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbDistribucionCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDistribucionAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbDistribucionAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 0, 0), 1, true));

        btnDistribucionCarrera.setBackground(new java.awt.Color(104, 0, 0));
        btnDistribucionCarrera.setForeground(new java.awt.Color(255, 255, 255));
        btnDistribucionCarrera.setText("CARRERA");
        btnDistribucionCarrera.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDistribucionCarrera.setFocusPainted(false);

        btnDistribucionTodo.setBackground(new java.awt.Color(104, 0, 0));
        btnDistribucionTodo.setForeground(new java.awt.Color(255, 255, 255));
        btnDistribucionTodo.setText("TODO");
        btnDistribucionTodo.setFocusPainted(false);

        btnDistribucionAnio.setBackground(new java.awt.Color(104, 0, 0));
        btnDistribucionAnio.setForeground(new java.awt.Color(255, 255, 255));
        btnDistribucionAnio.setText("AÑO");
        btnDistribucionAnio.setFocusPainted(false);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Individual");

        btnDistribucionCarreraAnio.setBackground(new java.awt.Color(104, 0, 0));
        btnDistribucionCarreraAnio.setForeground(new java.awt.Color(255, 255, 255));
        btnDistribucionCarreraAnio.setText("CARRERA-AÑO");
        btnDistribucionCarreraAnio.setFocusPainted(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDistribucionCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 84, Short.MAX_VALUE))
                    .addComponent(btnDistribucionAnio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDistribucionCarreraAnio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDistribucionTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnDistribucionCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDistribucionAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDistribucionCarreraAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDistribucionTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelHomeDistribucionLayout = new javax.swing.GroupLayout(panelHomeDistribucion);
        panelHomeDistribucion.setLayout(panelHomeDistribucionLayout);
        panelHomeDistribucionLayout.setHorizontalGroup(
            panelHomeDistribucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeDistribucionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        panelHomeDistribucionLayout.setVerticalGroup(
            panelHomeDistribucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeDistribucionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHomeDistribucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tpnHome.addTab("DISTRIBUCIÓN", panelHomeDistribucion);

        panelHomeAula.setBackground(new java.awt.Color(255, 255, 255));

        tblAula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 0, 0), 1, true));
        tblAula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblAula.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblAula.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tblAula.setGridColor(java.awt.Color.black);
        tblAula.setMaximumSize(new java.awt.Dimension(1024, 600));
        tblAula.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tblAula.setSelectionForeground(java.awt.Color.black);
        jtlAula.setViewportView(tblAula);

        btnAulaEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N

        btnAulaModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N

        btnAulaAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N

        panelAulaDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelAulaDatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 0, 0), 1, true));
        panelAulaDatos.setForeground(java.awt.Color.blue);

        lblAulaRegistrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAulaRegistrar.setText("Registrar Aula");

        lblAulaModificar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAulaModificar.setText("Modifcar Aula");

        txtAulaCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAulaCodigo.setSelectionColor(new java.awt.Color(0, 0, 0));

        lblAulaCodigo.setText("Código:");

        lblAulaNombre.setText("Nombre:");

        txtAulaNombre.setSelectionColor(new java.awt.Color(51, 51, 51));

        lblAulaDescripcion.setText("Descripción");

        cmbAulaDescripcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PEQUEÑA", "NORMAL", "GRANDE", "ENORME" }));

        btnAulaCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N

        btnAulaGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardarprov.png"))); // NOI18N

        javax.swing.GroupLayout panelAulaDatosLayout = new javax.swing.GroupLayout(panelAulaDatos);
        panelAulaDatos.setLayout(panelAulaDatosLayout);
        panelAulaDatosLayout.setHorizontalGroup(
            panelAulaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAulaDatosLayout.createSequentialGroup()
                .addGroup(panelAulaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAulaRegistrar)
                    .addComponent(lblAulaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelAulaDatosLayout.createSequentialGroup()
                .addGroup(panelAulaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAulaDatosLayout.createSequentialGroup()
                        .addComponent(btnAulaGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAulaCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAulaDatosLayout.createSequentialGroup()
                        .addGroup(panelAulaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAulaNombre)
                            .addComponent(lblAulaDescripcion)
                            .addComponent(lblAulaCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelAulaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAulaCodigo)
                            .addComponent(cmbAulaDescripcion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAulaNombre))))
                .addContainerGap())
        );
        panelAulaDatosLayout.setVerticalGroup(
            panelAulaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAulaDatosLayout.createSequentialGroup()
                .addComponent(lblAulaRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAulaModificar)
                .addGap(34, 34, 34)
                .addGroup(panelAulaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAulaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAulaCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelAulaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAulaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAulaNombre))
                .addGap(18, 18, 18)
                .addGroup(panelAulaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAulaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAulaDescripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addGroup(panelAulaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAulaCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAulaGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout panelHomeAulaLayout = new javax.swing.GroupLayout(panelHomeAula);
        panelHomeAula.setLayout(panelHomeAulaLayout);
        panelHomeAulaLayout.setHorizontalGroup(
            panelHomeAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHomeAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHomeAulaLayout.createSequentialGroup()
                        .addComponent(btnAulaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAulaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAulaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtlAula, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelAulaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHomeAulaLayout.setVerticalGroup(
            panelHomeAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeAulaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelHomeAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAulaDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtlAula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelHomeAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAulaAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAulaModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAulaEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        tpnHome.addTab("AULA", panelHomeAula);

        panelHomeCarrera.setBackground(new java.awt.Color(255, 255, 255));

        tblCarrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCarrera.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblCarrera.setAutoscrolls(false);
        tblCarrera.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblCarrera.setGridColor(java.awt.Color.black);
        tblCarrera.setName(""); // NOI18N
        tblCarrera.setOpaque(false);
        tblCarrera.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tblCarrera.setSelectionForeground(java.awt.Color.black);
        jtlAula4.setViewportView(tblCarrera);

        btnCarreraEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N

        btnCarreraModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N

        btnCarreraAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N

        panelCarreraDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelCarreraDatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 0, 0), 1, true));

        lblCarreraRegistrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCarreraRegistrar.setText("Registrar Carrera");

        lblCarreraModificar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCarreraModificar.setText("Modifcar Carrera");

        txtCarreraCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCarreraCodigo.setSelectionColor(new java.awt.Color(0, 0, 0));

        txtCarreraNombre.setSelectionColor(new java.awt.Color(51, 51, 51));

        lblCarreraDescripcion.setText("Descripción");

        lblCarreraNombre.setText("Nombre:");

        lblCarreraCodigo.setText("Código:");

        btnCarreraCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N

        btnCarreraGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardarprov.png"))); // NOI18N

        javax.swing.GroupLayout panelCarreraDatosLayout = new javax.swing.GroupLayout(panelCarreraDatos);
        panelCarreraDatos.setLayout(panelCarreraDatosLayout);
        panelCarreraDatosLayout.setHorizontalGroup(
            panelCarreraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarreraDatosLayout.createSequentialGroup()
                .addGroup(panelCarreraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCarreraRegistrar)
                    .addComponent(lblCarreraModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelCarreraDatosLayout.createSequentialGroup()
                .addGroup(panelCarreraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCarreraDatosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCarreraGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCarreraCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCarreraDatosLayout.createSequentialGroup()
                        .addGroup(panelCarreraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCarreraDescripcion)
                            .addComponent(lblCarreraNombre)
                            .addComponent(lblCarreraCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCarreraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCarreraCodigo)
                            .addComponent(txtCarreraNombre)
                            .addComponent(txtCarreraDescripcion))))
                .addContainerGap())
        );
        panelCarreraDatosLayout.setVerticalGroup(
            panelCarreraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarreraDatosLayout.createSequentialGroup()
                .addComponent(lblCarreraRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCarreraModificar)
                .addGap(33, 33, 33)
                .addGroup(panelCarreraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCarreraDatosLayout.createSequentialGroup()
                        .addGroup(panelCarreraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCarreraCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCarreraCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(panelCarreraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCarreraNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCarreraNombre))
                        .addGap(18, 18, 18)
                        .addComponent(txtCarreraDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCarreraDescripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCarreraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCarreraCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarreraGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout panelHomeCarreraLayout = new javax.swing.GroupLayout(panelHomeCarrera);
        panelHomeCarrera.setLayout(panelHomeCarreraLayout);
        panelHomeCarreraLayout.setHorizontalGroup(
            panelHomeCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeCarreraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHomeCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHomeCarreraLayout.createSequentialGroup()
                        .addComponent(btnCarreraAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarreraModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarreraEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtlAula4, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCarreraDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHomeCarreraLayout.setVerticalGroup(
            panelHomeCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeCarreraLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelHomeCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtlAula4, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                    .addComponent(panelCarreraDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(panelHomeCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCarreraModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarreraAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarreraEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tpnHome.addTab("CARRERA", panelHomeCarrera);

        panelHomeMateria.setBackground(new java.awt.Color(255, 255, 255));

        tblMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMateria.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblMateria.setAutoscrolls(false);
        tblMateria.setGridColor(java.awt.Color.black);
        tblMateria.setNextFocusableComponent(tblMateria);
        tblMateria.setOpaque(false);
        tblMateria.setSelectionBackground(java.awt.Color.white);
        tblMateria.setSelectionForeground(java.awt.Color.black);
        tblMateria.getTableHeader().setReorderingAllowed(false);
        jtlAula1.setViewportView(tblMateria);
        tblMateria.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        btnMateriaAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N

        btnMateriaModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N

        btnMateriaEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N

        panelMateriaPaleta.setBackground(new java.awt.Color(255, 255, 255));
        panelMateriaPaleta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 0, 0), 1, true));

        lblMateriaRegistrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMateriaRegistrar.setText("Registrar Materia");

        lblMateriaModificar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMateriaModificar.setText("Modifcar Materia");

        txtMateriaCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMateriaCodigo.setSelectionColor(new java.awt.Color(0, 0, 0));

        txtMateriaNombre.setSelectionColor(new java.awt.Color(51, 51, 51));

        cmbMateriaAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRIMERO", "SEGUNDO", "TERCERO", "CUARTO", "QUINTO" }));

        lblMateriaCodigo.setText("Código:");

        lblMateriaAnio.setText("Año:");

        lbMateriaCarrera.setText("Carrera:");

        lbMaterialNombre.setText("Nombre:");

        btnMateriaCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N

        btnMateriaGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardarprov.png"))); // NOI18N

        cmbMateriaGrupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        lblMateriaGrupos.setText("Grupos:");

        javax.swing.GroupLayout panelMateriaPaletaLayout = new javax.swing.GroupLayout(panelMateriaPaleta);
        panelMateriaPaleta.setLayout(panelMateriaPaletaLayout);
        panelMateriaPaletaLayout.setHorizontalGroup(
            panelMateriaPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMateriaPaletaLayout.createSequentialGroup()
                .addGroup(panelMateriaPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMateriaRegistrar)
                    .addComponent(lblMateriaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelMateriaPaletaLayout.createSequentialGroup()
                .addGroup(panelMateriaPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMateriaPaletaLayout.createSequentialGroup()
                        .addGroup(panelMateriaPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMateriaPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbMateriaCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbMaterialNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMateriaAnio)
                                .addComponent(lblMateriaCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblMateriaGrupos))
                        .addGroup(panelMateriaPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMateriaPaletaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelMateriaPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMateriaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(cmbMateriaCarrera, 0, 177, Short.MAX_VALUE)
                                    .addComponent(txtMateriaCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMateriaPaletaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMateriaPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbMateriaAnio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbMateriaGrupos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMateriaPaletaLayout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(btnMateriaGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMateriaCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelMateriaPaletaLayout.setVerticalGroup(
            panelMateriaPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMateriaPaletaLayout.createSequentialGroup()
                .addComponent(lblMateriaRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMateriaModificar)
                .addGap(32, 32, 32)
                .addGroup(panelMateriaPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMateriaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMateriaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMateriaPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMateriaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMaterialNombre))
                .addGap(18, 18, 18)
                .addGroup(panelMateriaPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMateriaAnio)
                    .addComponent(cmbMateriaAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelMateriaPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMateriaCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMateriaCarrera))
                .addGap(18, 18, 18)
                .addGroup(panelMateriaPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMateriaGrupos)
                    .addComponent(cmbMateriaGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMateriaPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMateriaGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMateriaCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lblMaterianombrefiltrar.setText("Nombre:");

        lblMateriacarreafiltrar.setText("Carrera:");

        lbMateriaaniofiltrar.setText("Año");

        javax.swing.GroupLayout panelHomeMateriaLayout = new javax.swing.GroupLayout(panelHomeMateria);
        panelHomeMateria.setLayout(panelHomeMateriaLayout);
        panelHomeMateriaLayout.setHorizontalGroup(
            panelHomeMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeMateriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHomeMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHomeMateriaLayout.createSequentialGroup()
                        .addComponent(jtlAula1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelMateriaPaleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHomeMateriaLayout.createSequentialGroup()
                        .addGroup(panelHomeMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelHomeMateriaLayout.createSequentialGroup()
                                .addComponent(btnMateriaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(btnMateriaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMateriaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelHomeMateriaLayout.createSequentialGroup()
                                .addComponent(lblMaterianombrefiltrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMaterianombrefiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblMateriacarreafiltrar)
                                .addGap(18, 18, 18)
                                .addComponent(txtMateriacarrerafiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbMateriaaniofiltrar)
                                .addGap(18, 18, 18)
                                .addComponent(txtMateriaaniofiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelHomeMateriaLayout.setVerticalGroup(
            panelHomeMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeMateriaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelHomeMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMaterianombrefiltrar)
                    .addComponent(txtMaterianombrefiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelHomeMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMateriacarreafiltrar)
                        .addComponent(txtMateriacarrerafiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbMateriaaniofiltrar)
                        .addComponent(txtMateriaaniofiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelHomeMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMateriaPaleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtlAula1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelHomeMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMateriaModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMateriaAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMateriaEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        tpnHome.addTab("MATERIA", panelHomeMateria);

        panelHomeDisponibilidad.setBackground(new java.awt.Color(255, 255, 255));

        tblDisponibilidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 0, 0), 1, true));
        tblDisponibilidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDisponibilidad.setGridColor(java.awt.Color.black);
        tblDisponibilidad.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tblDisponibilidad.setSelectionForeground(java.awt.Color.black);
        jScrollPane2.setViewportView(tblDisponibilidad);

        jpnDisponibilidadPaleta.setBackground(new java.awt.Color(255, 255, 255));
        jpnDisponibilidadPaleta.setMaximumSize(new java.awt.Dimension(262, 678));

        lbldisponibilidad.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbldisponibilidad.setText("Seleccione el aula");

        lbldisponibilidadCodigo.setText("Aula:");

        btndisponibilidadAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/aceptar.png"))); // NOI18N

        btndisponibilidadModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N
        btndisponibilidadModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndisponibilidadModificarActionPerformed(evt);
            }
        });

        btndisponibilidadCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N

        javax.swing.GroupLayout jpnDisponibilidadPaletaLayout = new javax.swing.GroupLayout(jpnDisponibilidadPaleta);
        jpnDisponibilidadPaleta.setLayout(jpnDisponibilidadPaletaLayout);
        jpnDisponibilidadPaletaLayout.setHorizontalGroup(
            jpnDisponibilidadPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDisponibilidadPaletaLayout.createSequentialGroup()
                .addGroup(jpnDisponibilidadPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnDisponibilidadPaletaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpnDisponibilidadPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btndisponibilidadAceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDisponibilidadPaletaLayout.createSequentialGroup()
                                .addComponent(btndisponibilidadModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btndisponibilidadCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpnDisponibilidadPaletaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpnDisponibilidadPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpnDisponibilidadPaletaLayout.createSequentialGroup()
                                .addComponent(lbldisponibilidadCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbdisponibilidadAula, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbldisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jpnDisponibilidadPaletaLayout.setVerticalGroup(
            jpnDisponibilidadPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDisponibilidadPaletaLayout.createSequentialGroup()
                .addComponent(lbldisponibilidad)
                .addGap(26, 26, 26)
                .addGroup(jpnDisponibilidadPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldisponibilidadCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbdisponibilidadAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btndisponibilidadAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addGroup(jpnDisponibilidadPaletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndisponibilidadModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndisponibilidadCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel10.setText("Aula: ");

        txtdisponibilidadAula.setEditable(false);
        txtdisponibilidadAula.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelHomeDisponibilidadLayout = new javax.swing.GroupLayout(panelHomeDisponibilidad);
        panelHomeDisponibilidad.setLayout(panelHomeDisponibilidadLayout);
        panelHomeDisponibilidadLayout.setHorizontalGroup(
            panelHomeDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeDisponibilidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHomeDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHomeDisponibilidadLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(jpnDisponibilidadPaleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHomeDisponibilidadLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdisponibilidadAula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelHomeDisponibilidadLayout.setVerticalGroup(
            panelHomeDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeDisponibilidadLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelHomeDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtdisponibilidadAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHomeDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnDisponibilidadPaleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );

        tpnHome.addTab("DISPONIBILIDAD", panelHomeDisponibilidad);

        panelHomeCatedratico.setBackground(new java.awt.Color(255, 255, 255));
        panelHomeCatedratico.setAutoscrolls(true);

        tblCatedratico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCatedratico.setGridColor(java.awt.Color.black);
        tblCatedratico.setSelectionBackground(java.awt.Color.white);
        tblCatedratico.setSelectionForeground(java.awt.Color.black);
        jtlAula2.setViewportView(tblCatedratico);

        btnCatedraticoAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N

        btnCatedraticoModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N

        btnCatedraticoEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N

        panelCatedraticoDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelCatedraticoDatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 0, 0), 1, true));

        lblCatedraticoRegistrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCatedraticoRegistrar.setText("Registrar Catedrático");

        lblCatedraticoModificar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCatedraticoModificar.setText("Modifcar Catedrático");

        lblCatedraticoApellidos.setText("Apellidos:");

        lblCatedraticoNombres.setText("Nombres:");

        lblCatedraticoCodigo.setText("Código:");

        btnCatedraticoGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardarprov.png"))); // NOI18N

        btnCatedraticoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N

        lblCatedraticoMaterias.setText("Materias ");

        javax.swing.GroupLayout panelCatedraticoDatosLayout = new javax.swing.GroupLayout(panelCatedraticoDatos);
        panelCatedraticoDatos.setLayout(panelCatedraticoDatosLayout);
        panelCatedraticoDatosLayout.setHorizontalGroup(
            panelCatedraticoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCatedraticoDatosLayout.createSequentialGroup()
                .addGroup(panelCatedraticoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCatedraticoRegistrar)
                    .addComponent(lblCatedraticoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelCatedraticoDatosLayout.createSequentialGroup()
                .addGroup(panelCatedraticoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCatedraticoDatosLayout.createSequentialGroup()
                        .addComponent(lblCatedraticoCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCatedraticoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCatedraticoDatosLayout.createSequentialGroup()
                        .addComponent(lblCatedraticoNombres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCatedraticoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCatedraticoDatosLayout.createSequentialGroup()
                        .addComponent(btnCatedraticoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(btnCatedraticoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCatedraticoDatosLayout.createSequentialGroup()
                        .addGroup(panelCatedraticoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCatedraticoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCatedraticoMaterias))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelCatedraticoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCatedraticoApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtCatedraticoMateriasxCiclo))))
                .addContainerGap())
        );
        panelCatedraticoDatosLayout.setVerticalGroup(
            panelCatedraticoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCatedraticoDatosLayout.createSequentialGroup()
                .addComponent(lblCatedraticoRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCatedraticoModificar)
                .addGap(26, 26, 26)
                .addGroup(panelCatedraticoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCatedraticoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCatedraticoCodigo))
                .addGap(18, 18, 18)
                .addGroup(panelCatedraticoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCatedraticoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCatedraticoNombres))
                .addGap(18, 18, 18)
                .addGroup(panelCatedraticoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCatedraticoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCatedraticoApellidos))
                .addGap(18, 18, 18)
                .addGroup(panelCatedraticoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCatedraticoMaterias)
                    .addComponent(txtCatedraticoMateriasxCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCatedraticoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCatedraticoGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCatedraticoCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout panelHomeCatedraticoLayout = new javax.swing.GroupLayout(panelHomeCatedratico);
        panelHomeCatedratico.setLayout(panelHomeCatedraticoLayout);
        panelHomeCatedraticoLayout.setHorizontalGroup(
            panelHomeCatedraticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeCatedraticoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHomeCatedraticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHomeCatedraticoLayout.createSequentialGroup()
                        .addComponent(btnCatedraticoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnCatedraticoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCatedraticoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHomeCatedraticoLayout.createSequentialGroup()
                        .addComponent(jtlAula2, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelCatedraticoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelHomeCatedraticoLayout.setVerticalGroup(
            panelHomeCatedraticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeCatedraticoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelHomeCatedraticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCatedraticoDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtlAula2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(panelHomeCatedraticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCatedraticoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCatedraticoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnCatedraticoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        tpnHome.addTab("CATEDRÁTICO", panelHomeCatedratico);

        panelHomeParametro.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 0, 0), 1, true));

        btbParametroAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N

        btnParametroModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N

        btnParametroEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N

        btnParametroGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/aceptar.png"))); // NOI18N

        btnParametroCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnParametroEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnParametroModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btbParametroAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(cmbParametroUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                            .addComponent(btnParametroGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnParametroCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ptxtparametroContra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                .addComponent(txtparametroUsuario, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbParametroUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbParametroAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnParametroModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnParametroEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtparametroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ptxtparametroContra)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnParametroCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnParametroGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jLabel2.setText("Usuario");

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 0, 0), 1, true));

        btnparametroCiclo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/aceptar.png"))); // NOI18N

        jLabel8.setText("Ciclo actual:");

        cmbparametroCiclo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II" }));

        jLabel11.setText("Cambio de ciclo");

        jLabel12.setText("Seleccione el ciclo");

        jSeparator1.setForeground(new java.awt.Color(104, 10, 0));

        txtparametroCiclodb.setEditable(false);
        txtparametroCiclodb.setBackground(new java.awt.Color(255, 255, 255));
        txtparametroCiclodb.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jSeparator2.setBackground(new java.awt.Color(104, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel13.setText("GENERAR REPORTE DEL AULA");

        jLabel14.setText("Aula:");

        btnParametroReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/generar.png"))); // NOI18N

        jSeparator3.setBackground(new java.awt.Color(104, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel15.setText("LIMPIAR CICLO");

        btnParametroLimpiarCiclo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtparametroCiclodb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnparametroCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(cmbparametroCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnParametroLimpiarCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnParametroReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbparametroAula, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(31, 31, 31)
                                .addComponent(btnParametroLimpiarCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                    .addComponent(txtparametroCiclodb))
                                .addGap(17, 17, 17)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbparametroCiclo, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnparametroCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbparametroAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnParametroReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 243, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel3.setText("Configuraciones ");

        javax.swing.GroupLayout panelHomeParametroLayout = new javax.swing.GroupLayout(panelHomeParametro);
        panelHomeParametro.setLayout(panelHomeParametroLayout);
        panelHomeParametroLayout.setHorizontalGroup(
            panelHomeParametroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeParametroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHomeParametroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelHomeParametroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHomeParametroLayout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(0, 486, Short.MAX_VALUE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelHomeParametroLayout.setVerticalGroup(
            panelHomeParametroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeParametroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelHomeParametroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHomeParametroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        tpnHome.addTab("PARÁMETROS ", panelHomeParametro);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnPaleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tpnHome)
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnPaleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tpnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btndisponibilidadModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndisponibilidadModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndisponibilidadModificarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btbParametroAgregar;
    public javax.swing.JButton btnAulaAgregar;
    public javax.swing.JButton btnAulaCancelar;
    public javax.swing.JButton btnAulaEliminar;
    public javax.swing.JButton btnAulaGuardar;
    public javax.swing.JButton btnAulaModificar;
    public javax.swing.JButton btnCarreraAgregar;
    public javax.swing.JButton btnCarreraCancelar;
    public javax.swing.JButton btnCarreraEliminar;
    public javax.swing.JButton btnCarreraGuardar;
    public javax.swing.JButton btnCarreraModificar;
    public javax.swing.JButton btnCatedraticoAgregar;
    public javax.swing.JButton btnCatedraticoCancelar;
    public javax.swing.JButton btnCatedraticoEliminar;
    public javax.swing.JButton btnCatedraticoGuardar;
    public javax.swing.JButton btnCatedraticoModificar;
    public javax.swing.JButton btnDistribucionAnio;
    public javax.swing.JButton btnDistribucionCantidadAceptar;
    public javax.swing.JButton btnDistribucionCarrera;
    public javax.swing.JButton btnDistribucionCarreraAnio;
    public javax.swing.JButton btnDistribucionTodo;
    public javax.swing.JButton btnMateriaAgregar;
    public javax.swing.JButton btnMateriaCancelar;
    public javax.swing.JButton btnMateriaEliminar;
    public javax.swing.JButton btnMateriaGuardar;
    public javax.swing.JButton btnMateriaModificar;
    public javax.swing.JButton btnParametroCancelar;
    public javax.swing.JButton btnParametroEliminar;
    public javax.swing.JButton btnParametroGuardar;
    public javax.swing.JButton btnParametroLimpiarCiclo;
    public javax.swing.JButton btnParametroModificar;
    public javax.swing.JButton btnParametroReporte;
    public javax.swing.JButton btnPrincipalAula;
    public javax.swing.JButton btnPrincipalCarrera;
    public javax.swing.JButton btnPrincipalCatedratico;
    public javax.swing.JButton btnPrincipalDiponible;
    public javax.swing.JButton btnPrincipalDistribucion;
    public javax.swing.JButton btnPrincipalHome;
    public javax.swing.JButton btnPrincipalMateria;
    public javax.swing.JButton btnPrincipalParametros;
    public javax.swing.JButton btndisponibilidadAceptar;
    public javax.swing.JButton btndisponibilidadCancelar;
    public javax.swing.JButton btndisponibilidadModificar;
    public javax.swing.JButton btnparametroCiclo;
    public javax.swing.JComboBox<String> cmbAulaDescripcion;
    public javax.swing.JComboBox<String> cmbDistribucionAnio;
    public javax.swing.JComboBox<String> cmbDistribucionAula;
    public javax.swing.JComboBox<String> cmbDistribucionCantidad;
    public javax.swing.JComboBox<String> cmbDistribucionCarrera;
    public javax.swing.JComboBox<String> cmbMateriaAnio;
    public javax.swing.JComboBox<String> cmbMateriaCarrera;
    public javax.swing.JComboBox<String> cmbMateriaGrupos;
    public javax.swing.JComboBox<String> cmbParametroUsuarios;
    public javax.swing.JComboBox<String> cmbdisponibilidadAula;
    public javax.swing.JComboBox<String> cmbparametroAula;
    public javax.swing.JComboBox<String> cmbparametroCiclo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JPanel jpnDisponibilidadPaleta;
    public javax.swing.JPanel jpnPaleta;
    public static javax.swing.JScrollPane jtlAula;
    public static javax.swing.JScrollPane jtlAula1;
    private javax.swing.JScrollPane jtlAula2;
    public static javax.swing.JScrollPane jtlAula4;
    public javax.swing.JLabel lbMateriaCarrera;
    private javax.swing.JLabel lbMateriaaniofiltrar;
    public javax.swing.JLabel lbMaterialNombre;
    public javax.swing.JLabel lblAulaCodigo;
    public javax.swing.JLabel lblAulaDescripcion;
    public javax.swing.JLabel lblAulaModificar;
    public javax.swing.JLabel lblAulaNombre;
    public javax.swing.JLabel lblAulaRegistrar;
    public javax.swing.JLabel lblCarreraCodigo;
    public javax.swing.JLabel lblCarreraDescripcion;
    public javax.swing.JLabel lblCarreraModificar;
    public javax.swing.JLabel lblCarreraNombre;
    public javax.swing.JLabel lblCarreraRegistrar;
    public javax.swing.JLabel lblCatedraticoApellidos;
    public javax.swing.JLabel lblCatedraticoCodigo;
    public javax.swing.JLabel lblCatedraticoMaterias;
    public javax.swing.JLabel lblCatedraticoModificar;
    public javax.swing.JLabel lblCatedraticoNombres;
    public javax.swing.JLabel lblCatedraticoRegistrar;
    public javax.swing.JLabel lblDistribucionAnio;
    public javax.swing.JLabel lblDistribucionAula;
    public javax.swing.JLabel lblDistribucionCarrera;
    public javax.swing.JLabel lblMateriaAnio;
    public javax.swing.JLabel lblMateriaCodigo;
    public javax.swing.JLabel lblMateriaGrupos;
    public javax.swing.JLabel lblMateriaModificar;
    public javax.swing.JLabel lblMateriaRegistrar;
    private javax.swing.JLabel lblMateriacarreafiltrar;
    private javax.swing.JLabel lblMaterianombrefiltrar;
    public javax.swing.JLabel lbldisponibilidad;
    public javax.swing.JLabel lbldisponibilidadCodigo;
    public javax.swing.JPanel panelAulaDatos;
    public javax.swing.JPanel panelCarreraDatos;
    public javax.swing.JPanel panelCatedraticoDatos;
    public javax.swing.JPanel panelHome;
    public javax.swing.JPanel panelHomeAula;
    public javax.swing.JPanel panelHomeCarrera;
    public javax.swing.JPanel panelHomeCatedratico;
    public javax.swing.JPanel panelHomeDisponibilidad;
    public javax.swing.JPanel panelHomeDistribucion;
    public javax.swing.JPanel panelHomeMateria;
    public javax.swing.JPanel panelHomeParametro;
    public javax.swing.JPanel panelMateriaPaleta;
    public javax.swing.JPanel panelPrincipal;
    public javax.swing.JPasswordField ptxtparametroContra;
    public static javax.swing.JTable tblAula;
    public static javax.swing.JTable tblCarrera;
    public static javax.swing.JTable tblCatedratico;
    public static javax.swing.JTable tblDisponibilidad;
    public static javax.swing.JTable tblMateria;
    public static javax.swing.JTabbedPane tpnHome;
    public javax.swing.JTextField txtAulaCodigo;
    public javax.swing.JTextField txtAulaNombre;
    public javax.swing.JTextField txtCarreraCodigo;
    public javax.swing.JTextField txtCarreraDescripcion;
    public javax.swing.JTextField txtCarreraNombre;
    public javax.swing.JTextField txtCatedraticoApellidos;
    public javax.swing.JTextField txtCatedraticoCodigo;
    public javax.swing.JTextField txtCatedraticoMateriasxCiclo;
    public javax.swing.JTextField txtCatedraticoNombres;
    public javax.swing.JTextField txtMateriaCodigo;
    public javax.swing.JTextField txtMateriaNombre;
    public javax.swing.JTextField txtMateriaaniofiltrar;
    public javax.swing.JTextField txtMateriacarrerafiltrar;
    public javax.swing.JTextField txtMaterianombrefiltrar;
    public javax.swing.JTextField txtdisponibilidadAula;
    public javax.swing.JTextField txtparametroCiclodb;
    public javax.swing.JTextField txtparametroUsuario;
    // End of variables declaration//GEN-END:variables
}