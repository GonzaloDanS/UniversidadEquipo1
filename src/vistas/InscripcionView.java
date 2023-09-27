package vistas;

import entidades.*;
import accesoADatos.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InscripcionView extends javax.swing.JInternalFrame {

    private InscripcionData ins;
    private AlumnoData alu;
    private MateriaData md;
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public InscripcionView() {
        initComponents();
        ins = new InscripcionData();
        alu = new AlumnoData();
        md = new MateriaData();
        cargarComboBox();
        armarCabecera();
        jbInscribir.setEnabled(false);
        jbAnular.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jlFormularioInscripcion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlSelecioneAlumno = new javax.swing.JLabel();
        jcbAlumno = new javax.swing.JComboBox<>();
        jlListaMaterias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jrbInscripto = new javax.swing.JRadioButton();
        jrbNoInscripto = new javax.swing.JRadioButton();
        jbInscribir = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jlFormularioInscripcion.setText("Formulario de Inscripción");

        jlSelecioneAlumno.setText("Seleccione un alumno: ");

        jcbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoActionPerformed(evt);
            }
        });

        jlListaMaterias.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlListaMaterias.setText("Listado de Materias");

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtMaterias);

        buttonGroup.add(jrbInscripto);
        jrbInscripto.setText("Materias Inscripto");
        jrbInscripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInscriptoActionPerformed(evt);
            }
        });

        buttonGroup.add(jrbNoInscripto);
        jrbNoInscripto.setText("Materias No Inscripto");
        jrbNoInscripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoInscriptoActionPerformed(evt);
            }
        });

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnular.setText("Anular Inscripción");
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
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
                        .addGap(125, 125, 125)
                        .addComponent(jlFormularioInscripcion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jrbInscripto)
                        .addGap(18, 18, 18)
                        .addComponent(jrbNoInscripto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jlListaMaterias))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlSelecioneAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcbAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(24, 24, 24))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jbInscribir)
                                .addGap(18, 18, 18)
                                .addComponent(jbAnular)
                                .addGap(18, 18, 18)
                                .addComponent(jbSalir)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlFormularioInscripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSelecioneAlumno)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlListaMaterias)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbInscripto)
                    .addComponent(jrbNoInscripto))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnular)
                    .addComponent(jbSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
        borrarFilas();
        Alumno al = (Alumno) jcbAlumno.getSelectedItem();
        ArrayList<Materia> mats = new ArrayList<>();
        if (jrbInscripto.isSelected()) {
            mats = (ArrayList<Materia>) ins.obtenerMateriasCursadas(al.getIdAlumno());
        } else if (jrbNoInscripto.isSelected()) {
            mats = (ArrayList<Materia>) ins.obtenerMateriasNOCursadas(al.getIdAlumno());
        }
        for (Materia mat : mats) {
            modelo.addRow(new Object[]{mat.getIdMateria(), mat.getNombre(), mat.getAnioMateria()});
        }
    }//GEN-LAST:event_jcbAlumnoActionPerformed

    private void jrbInscriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInscriptoActionPerformed
        borrarFilas();
        Alumno al = (Alumno) jcbAlumno.getSelectedItem();
        ArrayList<Materia> mats = new ArrayList<>();
        jbInscribir.setEnabled(false);
        jbAnular.setEnabled(true);
        if (al != null) {
            mats = (ArrayList<Materia>) ins.obtenerMateriasCursadas(al.getIdAlumno());
            for (Materia mat : mats) {
                modelo.addRow(new Object[]{mat.getIdMateria(), mat.getNombre(), mat.getAnioMateria()});
            }
        }
    }//GEN-LAST:event_jrbInscriptoActionPerformed

    private void jrbNoInscriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoInscriptoActionPerformed
        borrarFilas();
        Alumno al = (Alumno) jcbAlumno.getSelectedItem();
        ArrayList<Materia> mats = new ArrayList<>();
        jbAnular.setEnabled(false);
        jbInscribir.setEnabled(true);
        if (al != null) {
            mats = (ArrayList<Materia>) ins.obtenerMateriasNOCursadas(al.getIdAlumno());
            for (Materia mat : mats) {
                modelo.addRow(new Object[]{mat.getIdMateria(), mat.getNombre(), mat.getAnioMateria()});
            }
        }
    }//GEN-LAST:event_jrbNoInscriptoActionPerformed

    private void jbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularActionPerformed
        Alumno al = (Alumno) jcbAlumno.getSelectedItem();
        int idMat;
        int f = jtMaterias.getSelectedRow(), c = jtMaterias.getSelectedColumn();
        if (al != null) {
            if (f != -1) {
                idMat = Integer.parseInt(modelo.getValueAt(f, 0).toString());
                ins.borrarInscripcionMateriaAlumno(al.getIdAlumno(), idMat);
                actualizar();
            }
        }
    }//GEN-LAST:event_jbAnularActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        Alumno al = (Alumno) jcbAlumno.getSelectedItem();
        int idMat;
        int f = jtMaterias.getSelectedRow(), c = jtMaterias.getSelectedColumn();
        if (al != null) {
            if (f != -1) {
                idMat = Integer.parseInt(modelo.getValueAt(f, 0).toString());
                Materia m = md.buscarMateria(idMat);
                Inscripcion insc = new Inscripcion(al,m,0);
                ins.guardarInscripcion(insc);
                actualizar();
            }
        }
    }//GEN-LAST:event_jbInscribirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    private javax.swing.JLabel jlFormularioInscripcion;
    private javax.swing.JLabel jlListaMaterias;
    private javax.swing.JLabel jlSelecioneAlumno;
    private javax.swing.JRadioButton jrbInscripto;
    private javax.swing.JRadioButton jrbNoInscripto;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables

    private void cargarComboBox() {
        ArrayList<Alumno> alumnos;
        alumnos = (ArrayList<Alumno>) alu.listarAlumno();
        Alumno x = null;
        jcbAlumno.addItem(x);
        for (Alumno alumno : alumnos) {
            jcbAlumno.addItem(alumno);
        }
    }

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jtMaterias.setModel(modelo);
    }

    private void borrarFilas() {
        int filas = jtMaterias.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    
    private void actualizar(){
        borrarFilas();
        Alumno al = (Alumno) jcbAlumno.getSelectedItem();
        ArrayList<Materia> mats = new ArrayList<>();
        if (jrbInscripto.isSelected()) {
            jbInscribir.setEnabled(false);
            jbAnular.setEnabled(true);
            mats = (ArrayList<Materia>) ins.obtenerMateriasCursadas(al.getIdAlumno());
        } else if (jrbNoInscripto.isSelected()) {
            jbAnular.setEnabled(false);
            jbInscribir.setEnabled(true);
            mats = (ArrayList<Materia>) ins.obtenerMateriasNOCursadas(al.getIdAlumno());
        }
        for (Materia mat : mats) {
            modelo.addRow(new Object[]{mat.getIdMateria(), mat.getNombre(), mat.getAnioMateria()});
        }
    }
}
