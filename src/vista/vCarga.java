package vista;
import java.awt.Image;
import javax.swing.ImageIcon;

public class vCarga extends javax.swing.JFrame {

    ImageIcon ImageIcon = new ImageIcon("imagesiconos/carga.png");
    Image image = ImageIcon.getImage();
    
    public vCarga() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarga = new javax.swing.JTable();
        jpnPaetaCarga = new javax.swing.JPanel();
        lblCargaAula = new javax.swing.JLabel();
        lblCargaCodigo = new javax.swing.JLabel();
        cmbCargaMateria = new javax.swing.JComboBox<>();
        lbCargalDocente = new javax.swing.JLabel();
        cmbCargaDocente = new javax.swing.JComboBox<>();
        botonCargaAgregar = new javax.swing.JButton();
        txtCargaAula = new javax.swing.JTextField();
        botonCargaEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DISTRIBUCION DE GRUPOS POR AULAS");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new ImageIcon(getClass().getResource("/iconos/carga.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setName("fmrCarga"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 4, true));

        tblCarga.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(104, 0, 0), 1, true));
        tblCarga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jornada", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"
            }
        ));
        tblCarga.setGridColor(java.awt.Color.black);
        tblCarga.setSelectionBackground(java.awt.Color.white);
        tblCarga.setSelectionForeground(java.awt.Color.black);
        jScrollPane1.setViewportView(tblCarga);

        jpnPaetaCarga.setBackground(new java.awt.Color(255, 255, 255));
        jpnPaetaCarga.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jpnPaetaCarga.setForeground(new java.awt.Color(255, 255, 255));
        jpnPaetaCarga.setAutoscrolls(true);
        jpnPaetaCarga.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpnPaetaCarga.setMaximumSize(new java.awt.Dimension(277, 768));

        lblCargaAula.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblCargaAula.setText("AULA");

        lblCargaCodigo.setText("Catedratico");

        cmbCargaMateria.setToolTipText("");
        cmbCargaMateria.setAutoscrolls(true);
        cmbCargaMateria.setMaximumSize(new java.awt.Dimension(205, 25));
        cmbCargaMateria.setMinimumSize(new java.awt.Dimension(205, 25));
        cmbCargaMateria.setOpaque(false);
        cmbCargaMateria.setPreferredSize(new java.awt.Dimension(205, 25));

        lbCargalDocente.setText("Materia");

        cmbCargaDocente.setMaximumSize(new java.awt.Dimension(205, 25));
        cmbCargaDocente.setMinimumSize(new java.awt.Dimension(205, 25));
        cmbCargaDocente.setPreferredSize(new java.awt.Dimension(205, 25));

        botonCargaAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N

        txtCargaAula.setEditable(false);
        txtCargaAula.setBackground(new java.awt.Color(255, 255, 255));
        txtCargaAula.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N

        botonCargaEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N

        javax.swing.GroupLayout jpnPaetaCargaLayout = new javax.swing.GroupLayout(jpnPaetaCarga);
        jpnPaetaCarga.setLayout(jpnPaetaCargaLayout);
        jpnPaetaCargaLayout.setHorizontalGroup(
            jpnPaetaCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPaetaCargaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargaAula, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCargaAula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbCargalDocente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCargaMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCargaCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCargaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCargaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCargaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnPaetaCargaLayout.setVerticalGroup(
            jpnPaetaCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPaetaCargaLayout.createSequentialGroup()
                .addGroup(jpnPaetaCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPaetaCargaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpnPaetaCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonCargaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCargaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPaetaCargaLayout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addGroup(jpnPaetaCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCargaAula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtCargaAula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCargaMateria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCargaCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbCargaDocente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbCargalDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnPaetaCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnPaetaCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonCargaAgregar;
    public javax.swing.JButton botonCargaEliminar;
    public static javax.swing.JComboBox<String> cmbCargaDocente;
    public static javax.swing.JComboBox<String> cmbCargaMateria;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnPaetaCarga;
    public javax.swing.JLabel lbCargalDocente;
    private javax.swing.JLabel lblCargaAula;
    public javax.swing.JLabel lblCargaCodigo;
    public static javax.swing.JTable tblCarga;
    public static javax.swing.JTextField txtCargaAula;
    // End of variables declaration//GEN-END:variables
}
