/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import crtl.PessoasCRTL;
import dao.Conexao;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import model.JCalendar;
import to.FuncionarioTO;

/**
 *
 * @author suporte
 */
public class RelatórioDeVendasEfetuadas1 extends javax.swing.JInternalFrame {

    PessoasCRTL crtl = new PessoasCRTL();
    FuncionarioTO funcTo = new FuncionarioTO();
    Iterator ito;

    /**
     * Creates new form RelatórioDeVendasEfetuadas1
     */
    public RelatórioDeVendasEfetuadas1() {
        initComponents();
        carregarComboFuncionario();
        cbFuncionario.setSelectedItem(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbFuncionario = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtDate1 = new model.JCalendar(false);
        txtDate2 = new model.JCalendar(false);

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Relatório de Vendas Efetuadas");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/visualizar.png"))); // NOI18N
        jButton1.setText("Gerar Relatório");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Data Inicial:");

        jLabel3.setText("Data Final:");

        cbFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFuncionarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Funcionario:");

        txtDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDate1ActionPerformed(evt);
            }
        });

        txtDate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDate2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1)
                            .addComponent(cbFuncionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbFuncionario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtDate1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtDate2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(450, 130, 316, 212);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RelatorioVendas();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFuncionarioActionPerformed

    private void txtDate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDate2ActionPerformed

    private void txtDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDate1ActionPerformed
    public void mascaraData(JFormattedTextField mask) {
        try {
            mask.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##/####")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private void RelatorioVendas() {
        try {
            Date data1, data2;
            data1 = new Date(((JCalendar) txtDate1).getText());
            data2 = new Date(((JCalendar) txtDate2).getText());
            String funcionario;
            SimpleDateFormat formatador = new SimpleDateFormat("MM/dd/yyyy");
            formatador.format(data1);
            formatador.format(data2);
            Conexao con = new Conexao();
            if(cbFuncionario.getSelectedItem() == null){
                funcionario = "";
            }else{
                funcionario = cbFuncionario.getSelectedItem().toString();
            }
            String SQL ="select v.codvenda, v.descricaoven, v.dataven, v.totalven, v.observacoes, fp.descpagamento, fp.tipopagamento, u.nomeusuario, TO_CHAR(CAST(v.totalven as DOUBLE PRECISION),'9999999D99') as totaltemp, f.nomefunc from venda v "
		+"join formapagamento fp on fp.codformapagamento=v.codformapagamento "
		+"join usuario u on v.codusuario=u.codusuario "
		+"join funcionario f on f.matricula=u.matricula "
		+ "where v.dataven between '"+ formatador.format(data1)+"' and '"+formatador.format(data2)+"'"
                +"and f.nomefunc like '%"+funcionario+"%';";
            
            
           // JOptionPane.showMessageDialog(null, SQL);
            con.conectaBD();
            ResultSet rs = con.executaConsulta(SQL);
            //ResultSet rs2 = con.executaConsulta(SQL2);
            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
            HashMap map = new HashMap();
            map.put("relatorioV_subreport1", "C:\\Users\\breni\\Desktop\\TrabalhoFinalPoo\\BRKSISTEMAS-Salão\\Nova Pasta\\relatorioV_subreport1.jasper");
            String arquivo = "C:\\Users\\breni\\Desktop\\TrabalhoFinalPoo\\BRKSISTEMAS-Salão\\Nova Pasta\\relatorioV.jasper";
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map, jrRS);
            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);
            jrviewer.setVisible(true);

            //caso queira usar o parâmetro  lido anteriormente no sql
            //String SQL = "SELECT codigo, nome, registro from cliente where codigo = "+codigo+" order by codigo";
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro ao tentar gerar o relatório.");
        }
    }

    private void carregarComboFuncionario() {
        ArrayList<String> funcA = new ArrayList();
        ArrayList<FuncionarioTO> array = new ArrayList();
        ito = crtl.ConsultarTodos("funcionario").iterator();
        while(ito.hasNext()){
            array.add((FuncionarioTO)ito.next());
        }
        
        int i = 0;
        while (i < array.size()) {
            funcA.add(array.get(i).getNome());
            i++;
        }
        cbFuncionario.setModel(new DefaultComboBoxModel(funcA.toArray()));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbFuncionario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JComboBox txtDate1;
    private javax.swing.JComboBox txtDate2;
    // End of variables declaration//GEN-END:variables
}
