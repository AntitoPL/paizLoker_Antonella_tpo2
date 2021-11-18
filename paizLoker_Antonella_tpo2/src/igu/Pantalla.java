package igu;

import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;
import logica.Controladora;

/**
 *
 * @author Anto_PaizLoker
 */
public class Pantalla extends javax.swing.JFrame {

    Controladora control;

    public Pantalla(Controladora control) {
        this.control = control;
        initComponents();
        // TODO mostrar los datos de la mascota si ya está cargada en la BD, permitir la modificación de la misma
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jPanelDatosMascota = new javax.swing.JPanel();
        lblRaza = new javax.swing.JLabel();
        lblNroCliente = new javax.swing.JLabel();
        lblNombreMascota = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblAlergico = new javax.swing.JLabel();
        lblAtencionEspecial = new javax.swing.JLabel();
        txtNroCliente = new javax.swing.JTextField();
        txtNombreMascota = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        cmbAlergico = new javax.swing.JComboBox<>();
        cmbAtencionEspecial = new javax.swing.JComboBox<>();
        lblNombreDuenio = new javax.swing.JLabel();
        lblCelDuenio = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        txtNombreDuenio = new javax.swing.JTextField();
        txtCelDuenio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jPanelBotones = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelDatosMascota.setOpaque(false);

        lblRaza.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblRaza.setForeground(new java.awt.Color(51, 0, 102));
        lblRaza.setText("Raza:");

        lblNroCliente.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblNroCliente.setForeground(new java.awt.Color(51, 0, 102));
        lblNroCliente.setText("Cliente N°:");

        lblNombreMascota.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblNombreMascota.setForeground(new java.awt.Color(51, 0, 102));
        lblNombreMascota.setText("Nombre:");

        lblColor.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblColor.setForeground(new java.awt.Color(51, 0, 102));
        lblColor.setText("Color:");

        lblAlergico.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblAlergico.setForeground(new java.awt.Color(51, 0, 102));
        lblAlergico.setText("Alérgico:");

        lblAtencionEspecial.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblAtencionEspecial.setForeground(new java.awt.Color(51, 0, 102));
        lblAtencionEspecial.setText("Atención Especial:");

        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        cmbAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        lblNombreDuenio.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblNombreDuenio.setForeground(new java.awt.Color(51, 0, 102));
        lblNombreDuenio.setText("Nombre Dueño:");

        lblCelDuenio.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCelDuenio.setForeground(new java.awt.Color(51, 0, 102));
        lblCelDuenio.setText("Cel Dueño:");

        lblObservaciones.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblObservaciones.setForeground(new java.awt.Color(51, 0, 102));
        lblObservaciones.setText("Observaciones");

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        javax.swing.GroupLayout jPanelDatosMascotaLayout = new javax.swing.GroupLayout(jPanelDatosMascota);
        jPanelDatosMascota.setLayout(jPanelDatosMascotaLayout);
        jPanelDatosMascotaLayout.setHorizontalGroup(
            jPanelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosMascotaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblAtencionEspecial)
                        .addComponent(lblNroCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblNombreMascota, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblNombreDuenio, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblCelDuenio, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblObservaciones, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblRaza)
                    .addComponent(lblColor)
                    .addComponent(lblAlergico))
                .addGap(22, 22, 22)
                .addGroup(jPanelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNroCliente)
                    .addComponent(txtNombreMascota)
                    .addComponent(txtRaza)
                    .addComponent(txtColor)
                    .addComponent(txtNombreDuenio)
                    .addComponent(txtCelDuenio)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbAtencionEspecial, javax.swing.GroupLayout.Alignment.LEADING, 0, 124, Short.MAX_VALUE)
                        .addComponent(cmbAlergico, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanelDatosMascotaLayout.setVerticalGroup(
            jPanelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosMascotaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNroCliente)
                    .addComponent(txtNroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreMascota)
                    .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaza)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlergico)
                    .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAtencionEspecial)
                    .addComponent(cmbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreDuenio)
                    .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelDuenio)
                    .addComponent(txtCelDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObservaciones)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanelFondo.add(jPanelDatosMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 610, 530));

        jPanelBotones.setOpaque(false);

        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(51, 0, 102));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(51, 0, 102));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(114, 114, 114)
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(206, 206, 206))
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar))
                .addContainerGap())
        );

        jPanelFondo.add(jPanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 430, 60));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        jPanelFondo.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNroCliente.setText("");
        txtNombreMascota.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        cmbAlergico.setSelectedIndex(0);
        cmbAtencionEspecial.setSelectedIndex(0);
        txtNombreDuenio.setText("");
        txtCelDuenio.setText("");
        txtObservaciones.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean puedeCargarMascota = true;

        String nombreMascota = txtNombreMascota.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        String nombreDuenio = txtNombreDuenio.getText();
        String celDuenio = txtCelDuenio.getText();
        String observaciones = txtObservaciones.getText();
        int nroCliente = 0;

        if (txtNroCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo: NRO CLIENTE es obligatorio", "Error de guardado - Datos Faltantes", HEIGHT);
            puedeCargarMascota = false;
        } else {
            nroCliente = Integer.parseInt(txtNroCliente.getText());
            // TODO relacionar el nro de Cliente con el id, ya que deberían realizarse validaciones para que no haya nros de Cliente repetidos
        }

        // alergico
        boolean alergico;
        String selectedAlergico = cmbAlergico.getSelectedItem().toString();
        switch (selectedAlergico) {
            case "Si":
                alergico = true;
                break;
            case "No":
                alergico = false;
                break;
            default:
                //Si no seleccionó ningún item genera un error
                // y lo mantengo en false:
                JOptionPane.showMessageDialog(null, "Necesita seleccionar al menos una opción para el campo ALERGICO", "Error de guardado - Datos Faltantes", HEIGHT);
                puedeCargarMascota = false;
                alergico = false;
                break;
        }

        // atencion especial
        boolean atEspecial;
        String selectedAtEspecial = cmbAtencionEspecial.getSelectedItem().toString();
        switch (selectedAtEspecial) {
            case "Si":
                atEspecial = true;
                break;
            case "No":
                atEspecial = false;
                break;
            default:
                //Si no seleccionó ningún item genera un error
                // y lo mantengo en false:
                JOptionPane.showMessageDialog(null, "Necesita seleccionar al menos una opción para el campo AT. ESPECIAL", "Error de guardado - Datos Faltantes", HEIGHT);
                puedeCargarMascota = false;
                atEspecial = false;
                break;
        }

        // controles de campos vacios
        if (nombreMascota.isEmpty() || nombreDuenio.isEmpty() || celDuenio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los campos: NOMBRE DE MASCOTA, NOMBRE DE DUEÑO Y CELULAR DE DUEÑO son obligatorios", "Error de guardado - Datos Faltantes", HEIGHT);
        }

        // Pasar a la lógica para guardar en la BD si posee todos los datos necesarios
        if (puedeCargarMascota) {
            control.altaMascota(nroCliente, nombreMascota, raza, color, alergico, atEspecial, observaciones, nombreDuenio, celDuenio);
            JOptionPane.showMessageDialog(null, "Datos de mascota agregados correctamente", "Cliente agregado", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencionEspecial;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelDatosMascota;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlergico;
    private javax.swing.JLabel lblAtencionEspecial;
    private javax.swing.JLabel lblCelDuenio;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombreDuenio;
    private javax.swing.JLabel lblNombreMascota;
    private javax.swing.JLabel lblNroCliente;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JTextField txtCelDuenio;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextField txtNroCliente;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
