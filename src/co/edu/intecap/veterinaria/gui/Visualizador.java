/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.veterinaria.gui;

import co.edu.intecap.veterinaria.negocio.Mascota;
import co.edu.intecap.veterinaria.negocio.mascotas.Gato;
import co.edu.intecap.veterinaria.negocio.mascotas.Perro;

/**
 *
 * @author capacitaciones
 */
public class Visualizador extends javax.swing.JDialog {

    private Perro perro;
    private Gato gato;
    /**
     * Creates new form Visualizador
     */
    public Visualizador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public Visualizador(java.awt.Frame parent, boolean modal, Perro perro){
        super(parent, modal);
        initComponents();
        this.perro = perro;
        this.mostrarInformacion();
    }
    
    public Visualizador(java.awt.Frame parent, boolean modal, Gato gato){
        super(parent, modal);
        initComponents();
        this.gato = gato;
        this.mostrarInformacion();
    }
    
    private void mostrarInformacion(){
        Mascota mascota = null;
        if(this.perro != null){
            mascota = this.perro;
            pnDetallePerro.setVisible(true);
            pnDetalleGato.setVisible(false);
            txtDetalleColor.setBackground(this.perro.getColor());
            lblDetalleTamano.setText(this.perro.getTamano()+" cm");
            lblDetalleCola.setText(this.perro.isCola()?"Cola larga":"Cola corta");
        }
        if(this.gato != null){
            mascota = this.gato;
            pnDetallePerro.setVisible(false);
            pnDetalleGato.setVisible(true);
            lblDetallePelo.setText(this.gato.isPelo()?"Pelo largo":"Pelo corto o no tiene pelo");
            lblDetalleGarras.setText(this.gato.isGarras()?"Garras largas":"Garras cortadas");
        }
        lblDetalleNombre.setText(mascota.getNombre());
        lblDetalleEdad.setText(mascota.getEdad()+" Años");
        lblDetallePeso.setText(mascota.getPeso()+" Kg");
        lblDetalleRaza.setText(mascota.getRaza());
        lblDetalleDueno.setText(mascota.getDueno());
        lblDetalleEnergia.setText(mascota.getEnergia()+" %");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnDetallePerro = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDetalleColor = new javax.swing.JTextField();
        lblDetalleTamano = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblDetalleCola = new javax.swing.JLabel();
        pnDetalleGato = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblDetallePelo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblDetalleGarras = new javax.swing.JLabel();
        lblDetalleNombre = new javax.swing.JLabel();
        lblDetalleEdad = new javax.swing.JLabel();
        lblDetallePeso = new javax.swing.JLabel();
        lblDetalleRaza = new javax.swing.JLabel();
        lblDetalleDueno = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblDetalleEnergia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Edad:");

        jLabel3.setText("Peso:");

        jLabel4.setText("Raza:");

        jLabel5.setText("Dueño:");

        jLabel6.setText("Tamaño");

        jLabel7.setText("Color:");

        txtDetalleColor.setEditable(false);

        lblDetalleTamano.setText("tamaño");

        jLabel9.setText("Cola:");

        lblDetalleCola.setText("cola");

        javax.swing.GroupLayout pnDetallePerroLayout = new javax.swing.GroupLayout(pnDetallePerro);
        pnDetallePerro.setLayout(pnDetallePerroLayout);
        pnDetallePerroLayout.setHorizontalGroup(
            pnDetallePerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetallePerroLayout.createSequentialGroup()
                .addGroup(pnDetallePerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDetallePerroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDetalleTamano, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDetallePerroLayout.createSequentialGroup()
                        .addGroup(pnDetallePerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGroup(pnDetallePerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnDetallePerroLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(lblDetalleCola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnDetallePerroLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(txtDetalleColor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnDetallePerroLayout.setVerticalGroup(
            pnDetallePerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetallePerroLayout.createSequentialGroup()
                .addGroup(pnDetallePerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblDetalleTamano))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnDetallePerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDetalleColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnDetallePerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblDetalleCola)))
        );

        jLabel8.setText("Pelo:");

        lblDetallePelo.setText("pelo");

        jLabel10.setText("Garras:");

        lblDetalleGarras.setText("garras");

        javax.swing.GroupLayout pnDetalleGatoLayout = new javax.swing.GroupLayout(pnDetalleGato);
        pnDetalleGato.setLayout(pnDetalleGatoLayout);
        pnDetalleGatoLayout.setHorizontalGroup(
            pnDetalleGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetalleGatoLayout.createSequentialGroup()
                .addGroup(pnDetalleGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(16, 16, 16)
                .addGroup(pnDetalleGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDetalleGarras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDetallePelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnDetalleGatoLayout.setVerticalGroup(
            pnDetalleGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDetalleGatoLayout.createSequentialGroup()
                .addGroup(pnDetalleGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblDetallePelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnDetalleGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblDetalleGarras))
                .addContainerGap())
        );

        lblDetalleNombre.setText("nombre");

        lblDetalleEdad.setText("edad");

        lblDetallePeso.setText("peso");

        lblDetalleRaza.setText("raza");

        lblDetalleDueno.setText("dueño");

        btnAceptar.setText("Aceptar");

        jLabel11.setText("Energia:");

        lblDetalleEnergia.setText("energia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnDetallePerro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnDetalleGato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDetalleNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(lblDetalleEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(lblDetallePeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addComponent(lblDetalleRaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(21, 21, 21)
                        .addComponent(lblDetalleDueno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDetalleEnergia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblDetalleNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblDetalleEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblDetallePeso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblDetalleRaza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblDetalleDueno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnDetallePerro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnDetalleGato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(jLabel11)
                    .addComponent(lblDetalleEnergia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDetalleCola;
    private javax.swing.JLabel lblDetalleDueno;
    private javax.swing.JLabel lblDetalleEdad;
    private javax.swing.JLabel lblDetalleEnergia;
    private javax.swing.JLabel lblDetalleGarras;
    private javax.swing.JLabel lblDetalleNombre;
    private javax.swing.JLabel lblDetallePelo;
    private javax.swing.JLabel lblDetallePeso;
    private javax.swing.JLabel lblDetalleRaza;
    private javax.swing.JLabel lblDetalleTamano;
    private javax.swing.JPanel pnDetalleGato;
    private javax.swing.JPanel pnDetallePerro;
    private javax.swing.JTextField txtDetalleColor;
    // End of variables declaration//GEN-END:variables
}
