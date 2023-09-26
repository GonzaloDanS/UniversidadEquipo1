package vistas;

import accesoADatos.AlumnoData;
import entidades.Alumno;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

public class GestionAlumno extends javax.swing.JInternalFrame {

    private AlumnoData alu;

    public GestionAlumno() {
        alu = new AlumnoData();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jlAlumnos = new javax.swing.JLabel();
        jlDocumento = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jlFechaNac = new javax.swing.JLabel();
        jtfDNI = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jdcFecha = new com.toedter.calendar.JDateChooser();

        jlAlumnos.setText("Alumnos");

        jlDocumento.setText("Documento:");

        jlApellido.setText("Apellido:");

        jlNombre.setText("Nombre:");

        jlEstado.setText("Estado:");

        jlFechaNac.setText("Fecha de Nacimiento:");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jlAlumnos))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlFechaNac)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlDocumento)
                                            .addComponent(jlApellido)
                                            .addComponent(jlNombre)
                                            .addComponent(jlEstado))
                                        .addGap(71, 71, 71)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jrbEstado)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jbBuscar))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jtfApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtfNombre))
                                                .addGap(48, 48, 48))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jbNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(jbEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jbGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jbSalir)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlAlumnos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDocumento)
                    .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEstado)
                    .addComponent(jrbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jlFechaNac))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            int dni = Integer.parseInt(jtfDNI.getText());
            Alumno al = alu.buscarAlumnoPorDniTODO(dni);
            if (al != null) {
                jtfApellido.setText(al.getApellido());
                jtfNombre.setText(al.getNombre());
                jrbEstado.setSelected(al.isActivo());
                jdcFecha.setDate(Date.valueOf(al.getFechaNac()));
            }
        } catch (NumberFormatException e) {
            if (jtfDNI.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo 'documento' no puede estar vacío.");
            } else {
                JOptionPane.showMessageDialog(null, "Sólo se aceptan números. ");
            }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        try {
            int dni = Integer.parseInt(jtfDNI.getText());
            Alumno al = alu.buscarAlumnoPorDniTODO(dni);
            int id = al.getIdAlumno();
            if (al.isActivo()) {
                int res = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminarlo?");
                if (res == JOptionPane.YES_OPTION) {
                    alu.eliminarAlumno(id);
                    jtfDNI.setText("");
                    jtfApellido.setText("");
                    jtfNombre.setText("");
                    jrbEstado.setSelected(false);
                    jdcFecha.setDate(null);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El alumno ya está inactivo.");
            }
        } catch (NumberFormatException e) {
            if (jtfDNI.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo 'documento' no puede estar vacío. - "+e.getMessage());
            } else {
                JOptionPane.showMessageDialog(null, "Sólo se aceptan números. ");
            }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try {
            int dni = Integer.parseInt(jtfDNI.getText());
            Alumno al = alu.buscarAlumnoPorDniTODO(dni);
            if (al != null) {
                LocalDate ld = Instant.ofEpochMilli(jdcFecha.getDate().getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
                al.setDni(Integer.parseInt(jtfDNI.getText()));
                al.setApellido(jtfApellido.getText());
                al.setNombre(jtfNombre.getText());
                al.setActivo(jrbEstado.isSelected());
                al.setFechaNac(ld);
                alu.modificarAlumno(al);
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }
        } catch (NumberFormatException e) {
            if (jtfDNI.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo 'documento' no puede estar vacío.");
            } else {
                JOptionPane.showMessageDialog(null, "Sólo se aceptan números. ");
            }
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        try {
            LocalDate ld = Instant.ofEpochMilli(jdcFecha.getDate().getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
            if (jtfApellido.getText().isEmpty() || jtfNombre.getText().isEmpty() || ld == null) {
                JOptionPane.showMessageDialog(null, "Ningún campo puede estar vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                alu.guardarAlumno(new Alumno(Integer.parseInt(jtfDNI.getText()), jtfApellido.getText(), jtfNombre.getText(), ld, jrbEstado.isSelected()));
            }
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_jbNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel jlAlumnos;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlDocumento;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlFechaNac;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
