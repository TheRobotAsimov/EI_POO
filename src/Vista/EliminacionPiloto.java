
package Vista;

import Controlador.BuscarPiloto;
import Controlador.EliminarRegistroPiloto;
import Controlador.MostrarDatosPiloto;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevin
 */
public class EliminacionPiloto extends javax.swing.JFrame {

    /**
     * Creates new form BusquedaPiloto
     */
    public EliminacionPiloto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mostrar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        mp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        piloto = new javax.swing.JTable();
        metodoBusqueda = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        parametro = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        regresar.setBackground(new java.awt.Color(153, 153, 153));
        regresar.setForeground(new java.awt.Color(255, 255, 255));
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        mp.setBackground(new java.awt.Color(252, 247, 209));
        mp.setText("Menu principal");
        mp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpActionPerformed(evt);
            }
        });

        piloto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Peso", "Nacionalidad", "Fecha Nac", "Altura", "Puntos", "Fecha ingre", "Fecha contra", "salario", "ID equipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(piloto);

        metodoBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar todos", "ID", "Nombre", "Apellido", "Nacionalidad" }));

        jLabel1.setText("Método de búsqueda:");

        eliminar.setBackground(new java.awt.Color(252, 247, 209));
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("ELIMINACIÓN PILOTO");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo-F1_Negro (1) (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(regresar)
                .addGap(91, 91, 91)
                .addComponent(eliminar)
                .addGap(96, 96, 96)
                .addComponent(mp)
                .addGap(248, 248, 248))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(38, 38, 38)
                                .addComponent(metodoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(180, 180, 180)
                                .addComponent(parametro, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mostrar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(94, 94, 94)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(metodoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(parametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrar))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresar)
                    .addComponent(mp)
                    .addComponent(eliminar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mpActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        MenuEliminacion  menue = new MenuEliminacion();
        menue.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        
        MostrarDatosPiloto mdp = new MostrarDatosPiloto();
        
        mdp.mostrar(piloto, metodoBusqueda.getSelectedIndex(), parametro.getText());
       
    }//GEN-LAST:event_mostrarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int opc = piloto.getSelectedRow();
    
        if(opc!=-1 && piloto.getValueAt(opc, 0)!=null){
            EliminarRegistroPiloto erv = new EliminarRegistroPiloto();
            String id = piloto.getValueAt(opc, 0).toString();
            String [] btn  ={"Cancelar","Confirmar"};
            int sele = JOptionPane.showOptionDialog(this, "¿Deseas eliminar a este piloto?", "Confirmacion", 0, 0, null, btn, this);
            if(sele==JOptionPane.NO_OPTION){
                try {
                    erv.eliminar(id);
                    DefaultTableModel modelo =(DefaultTableModel) piloto.getModel();
                    modelo.setRowCount(0); 
                    JOptionPane.showMessageDialog(null,"Se ha eliminado correctamente");
                }catch (Exception ex) {
                    Logger.getLogger(EliminacionVehiculo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }else{
            JOptionPane.showMessageDialog(null,"Seleccione un dato");
        }
    }//GEN-LAST:event_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> metodoBusqueda;
    private javax.swing.JButton mostrar;
    private javax.swing.JButton mp;
    private javax.swing.JTextField parametro;
    private javax.swing.JTable piloto;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
