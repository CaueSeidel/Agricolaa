/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Cadastro_porcaConttroler;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import model.Cadastro_porca;
import tools.CaixaDeDialogo;

/**
 *
 * @author caue.seidel
 */
public class Entrada_Porcas extends javax.swing.JFrame {

    /**
     * Creates new form Entrada_Porcas
     */
    Cadastro_porca objPorca;
    Cadastro_porcaConttroler porcaController; 
    public Entrada_Porcas() {
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

        lbl_bemvindo_tela_login2 = new javax.swing.JLabel();
        lbl_bemvindo_tela_login3 = new javax.swing.JLabel();
        lbl_bemvindo_tela_login4 = new javax.swing.JLabel();
        lbl_bemvindo_tela_login5 = new javax.swing.JLabel();
        TXT_Mossa_CadastroPorca = new javax.swing.JTextField();
        TXT_Brinco_CadastroPorca = new javax.swing.JTextField();
        BTN_Cadastrar_CadastroPorca = new javax.swing.JButton();
        TxtDT_Entrada_CadastroPorca = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_bemvindo_tela_login2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lbl_bemvindo_tela_login2.setText("Mossa");

        lbl_bemvindo_tela_login3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lbl_bemvindo_tela_login3.setText("Data da entrada");

        lbl_bemvindo_tela_login4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lbl_bemvindo_tela_login4.setText("Brinco");

        lbl_bemvindo_tela_login5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lbl_bemvindo_tela_login5.setText("Cadastro Porca");

        TXT_Mossa_CadastroPorca.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        TXT_Mossa_CadastroPorca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_Mossa_CadastroPorcaActionPerformed(evt);
            }
        });

        TXT_Brinco_CadastroPorca.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        TXT_Brinco_CadastroPorca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_Brinco_CadastroPorcaActionPerformed(evt);
            }
        });

        BTN_Cadastrar_CadastroPorca.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        BTN_Cadastrar_CadastroPorca.setText("CADASTRAR");
        BTN_Cadastrar_CadastroPorca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Cadastrar_CadastroPorcaActionPerformed(evt);
            }
        });

        try {
            TxtDT_Entrada_CadastroPorca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtDT_Entrada_CadastroPorca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDT_Entrada_CadastroPorcaActionPerformed(evt);
            }
        });

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_Brinco_CadastroPorca, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_bemvindo_tela_login4)
                            .addComponent(lbl_bemvindo_tela_login2)
                            .addComponent(TXT_Mossa_CadastroPorca, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lbl_bemvindo_tela_login3)
                                    .addGap(411, 411, 411))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lbl_bemvindo_tela_login5)
                                    .addGap(278, 278, 278))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(BTN_Cadastrar_CadastroPorca, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(78, 78, 78)))
                            .addComponent(TxtDT_Entrada_CadastroPorca, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(13, 13, 13)
                .addComponent(lbl_bemvindo_tela_login5)
                .addGap(57, 57, 57)
                .addComponent(lbl_bemvindo_tela_login2)
                .addGap(28, 28, 28)
                .addComponent(TXT_Mossa_CadastroPorca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lbl_bemvindo_tela_login4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXT_Brinco_CadastroPorca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(lbl_bemvindo_tela_login3)
                .addGap(29, 29, 29)
                .addComponent(TxtDT_Entrada_CadastroPorca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BTN_Cadastrar_CadastroPorca, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_Mossa_CadastroPorcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_Mossa_CadastroPorcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_Mossa_CadastroPorcaActionPerformed

    private void TXT_Brinco_CadastroPorcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_Brinco_CadastroPorcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_Brinco_CadastroPorcaActionPerformed
    
    //botao cadastrar porca
    private void BTN_Cadastrar_CadastroPorcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Cadastrar_CadastroPorcaActionPerformed
        
        boolean validar = validarDados();
        if(validar){
            objPorca = new Cadastro_porca();
            objPorca = guardarDados();
            
            porcaController = new Cadastro_porcaConttroler();
            
            if(porcaController.incluir(objPorca)){
                CaixaDeDialogo.obterinstancia().exibirMensagem("Porca adicionada com sucesso: ");
                limparTela();

            }else{
                CaixaDeDialogo.obterinstancia().exibirMensagem("Erro ao adicionar porca ");

            }
            
            
        }
        
    }//GEN-LAST:event_BTN_Cadastrar_CadastroPorcaActionPerformed

    private void TxtDT_Entrada_CadastroPorcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDT_Entrada_CadastroPorcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDT_Entrada_CadastroPorcaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limparTela(){
        TXT_Mossa_CadastroPorca.setText("");
        TXT_Brinco_CadastroPorca.setText("");
        TxtDT_Entrada_CadastroPorca.setText("");
    }
    private Cadastro_porca guardarDados() {
        try{
        Cadastro_porca obj = new Cadastro_porca();
        
        obj.setCd_mossa(Integer.parseInt(TXT_Mossa_CadastroPorca.getText()));
        obj.setBrinco(TXT_Brinco_CadastroPorca.getText());
        
        
        
        //Date data = new SimpleDateFormat().parse(TxtDT_Entrada_CadastroPorca.getText());
          //  System.out.println(" data date " + data);
          
          
        //String data = TxtDT_Entrada_CadastroPorca.getText().replace("/", "-");
        
        
        Date dataFormatada = new SimpleDateFormat("dd/MM/yyyy").parse(TxtDT_Entrada_CadastroPorca.getText());
            
       
        String dataCerta = new SimpleDateFormat("yyyy-MM-dd").format(dataFormatada);
            
        obj.setData_entrada(dataCerta);
            
       
           
          /*
          DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
          Date = dtf.format(LocalDate());
        */
        
        return obj;
        }catch(Exception e){
            System.out.println("erro " +e);
            return null;
        }
    }
    public boolean validarDados(){
        try{
            
        
        
        if(TXT_Mossa_CadastroPorca.equals("")){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro validar dados mossa nulla Class EntradaPorcas: ");
            return false;
            
        }else{
            try{
               
                /*
                tem que testar talvez de certo os ## identificando como numeros isso vale para de baixo tbm
                String mossa = mossa.replace(".##", "");
                mossa = mossa.replace(",##", "");
                */
                int mossa = Integer.parseInt(TXT_Mossa_CadastroPorca.getText());
            
            }catch(NumberFormatException e){
                
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro validar dados mossa Class EntradaPorcas: " +e);
            return false;
        }
        }
        if(TXT_Brinco_CadastroPorca.equals("")){
           
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro validar dados mossa nulla Class EntradaPorcas: ");
            return false;
            
        }else{
            try{
                
                
                int brinco = Integer.parseInt(TXT_Brinco_CadastroPorca.getText());
            
            }catch(NumberFormatException e){
           
                CaixaDeDialogo.obterinstancia().exibirMensagem("Erro validar dados brinco Class EntradaPorcas: " +e);
                return false;
        }
        }
        
        if(TxtDT_Entrada_CadastroPorca.equals("")){
            
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro validar dados data nulla Class EntradaPorcas: ");
            return false;

        }
        }catch(Exception e){
            System.out.println(" erro validar dados: "+e );
            return false;
        }
        return true;
        
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Entrada_Porcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrada_Porcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrada_Porcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrada_Porcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrada_Porcas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Cadastrar_CadastroPorca;
    private javax.swing.JTextField TXT_Brinco_CadastroPorca;
    private javax.swing.JTextField TXT_Mossa_CadastroPorca;
    private javax.swing.JFormattedTextField TxtDT_Entrada_CadastroPorca;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbl_bemvindo_tela_login2;
    private javax.swing.JLabel lbl_bemvindo_tela_login3;
    private javax.swing.JLabel lbl_bemvindo_tela_login4;
    private javax.swing.JLabel lbl_bemvindo_tela_login5;
    // End of variables declaration//GEN-END:variables
}
