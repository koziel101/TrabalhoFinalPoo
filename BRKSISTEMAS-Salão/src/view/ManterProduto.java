/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import crtl.MarcaCRTL;
import crtl.ProdutoCRTL;
import java.awt.Image;
import java.io.File;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.omg.CORBA.INTF_REPOS;
import to.CategoriaTO;
import to.MarcaTO;
import to.ProdutoTO;

/**
 *
 * @author Brenicio
 */
public class ManterProduto extends javax.swing.JInternalFrame {

    ProdutoCRTL crtl = new ProdutoCRTL();
    MarcaTO marcaTo = new MarcaTO();
    CategoriaTO catTo = new CategoriaTO();
    BigDecimal venda;
    BigDecimal custo;
    BigDecimal lucro;
    int codCategoria = 0;
    int codMarca = 0;
    int codProd = 0;

    String cmfoto = "";

    /**
     * Creates new form ManterProduto1
     */
    public ManterProduto() {
        initComponents();
        carregarComboMarcas();
        carregarComboCategorias();
        // desabilitarField();        
        Maiuscula(txtDescricao);
        somenteNumero(txtQtde);
        somenteNumero(txtCodigo);
        somenteNumero2(txtPrecoCusto);
        somenteNumero2(txtPrecoVenda);
        somenteNumero2(txtLucro);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtLucro.setEditable(false);

        final JTextField codigo = txtCodigo;
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                codigo.requestFocusInWindow();
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        txtQtde = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox();
        btnSelecionar = new javax.swing.JButton();
        cbMarca = new javax.swing.JComboBox();
        txtDescricao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnConsultar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        txtPrecoVenda = new javax.swing.JFormattedTextField();
        txtPrecoCusto = new javax.swing.JFormattedTextField();
        txtLucro = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Produto");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel5.setText("Quantidade:");

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/cancelar.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtQtde.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txtQtde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdeActionPerformed(evt);
            }
        });

        jLabel8.setText("Categoria:");

        jLabel9.setText("Marca:");

        btnSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/1433388250_instagram.png"))); // NOI18N
        btnSelecionar.setText("Selecionar Foto");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        cbMarca.setToolTipText("");
        cbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMarcaActionPerformed(evt);
            }
        });

        txtDescricao.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jLabel10.setText("Descrição do produto:");

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/addBOTAO.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        txtCodigo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 0, 0));
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoFocusGained(evt);
            }
        });
        txtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodigoMouseClicked(evt);
            }
        });
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        jLabel1.setText("Codigo:");

        jLabel2.setText("Preço  Venda");

        jLabel3.setText("Preço Custo");

        BtnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/visualizar.png"))); // NOI18N
        BtnConsultar.setText("Consultar");
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });

        jLabel4.setText("Lucro:");

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/alterarBOTAO.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        lblFoto.setText(".");

        txtPrecoVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtPrecoVenda.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txtPrecoVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPrecoVendaMouseExited(evt);
            }
        });
        txtPrecoVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoVendaFocusLost(evt);
            }
        });

        txtPrecoCusto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtPrecoCusto.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txtPrecoCusto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPrecoCustoMouseExited(evt);
            }
        });
        txtPrecoCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoCustoActionPerformed(evt);
            }
        });
        txtPrecoCusto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoCustoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoCustoFocusLost(evt);
            }
        });

        txtLucro.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnSelecionar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(btnIncluir))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(BtnConsultar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9)
                                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(72, 72, 72))
                            .addComponent(txtLucro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(txtDescricao))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setBounds(200, 10, 833, 308);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o produto: " + txtDescricao.getText() + "?", title, JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            crtl.excluir(codProd);
            LimparCampos();
            btnIncluir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);

        } else if (resposta == JOptionPane.NO_OPTION) {
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.imagens", "jpg", "png");
        file.addChoosableFileFilter(filter);
        int resultado = file.showOpenDialog(null);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            String pasta = selectedFile.getAbsolutePath();
            cmfoto = pasta;
            lblFoto.setIcon(ResizeImage(pasta));
        } else if (resultado == JFileChooser.CANCEL_OPTION) {
            System.out.println("Nenhuma imagem selecionada!");
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void cbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMarcaActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        marcaTo = crtl.consultarNOME(cbMarca.getSelectedItem().toString());
        catTo = crtl.consultarNOME2(cbCategoria.getSelectedItem().toString());
        crtl.getProdutoTo().setDescrProd(txtDescricao.getText());
        crtl.getProdutoTo().setCodCategoria(catTo.getCodCategoria());
        crtl.getProdutoTo().setCodMarca(marcaTo.getCodMarca());
        crtl.getProdutoTo().setValorVenda(venda.doubleValue());
        crtl.getProdutoTo().setValorCusto(custo.doubleValue());
        crtl.getProdutoTo().setQtdeProd((Integer.parseInt(txtQtde.getText())));
        crtl.getProdutoTo().setLucroProd(lucro.doubleValue());
        crtl.getProdutoTo().setCodBarra(Integer.parseInt(txtCodigo.getText()));
        crtl.getProdutoTo().setCmFoto(cmfoto);

        crtl.incluirProduto();
        LimparCampos();
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void txtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusGained

    }//GEN-LAST:event_txtCodigoFocusGained

    private void txtCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoMouseClicked

    }//GEN-LAST:event_txtCodigoMouseClicked

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed

    }//GEN-LAST:event_txtCodigoKeyPressed

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        ConsultarProduto consulProd = new ConsultarProduto();
        MenuPrincipal.getPainel().add(consulProd);
        this.dispose();
        consulProd.setVisible(true);

    }//GEN-LAST:event_BtnConsultarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        String sv = txtPrecoVenda.getText();
        String vsf = sv.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        venda = new BigDecimal(vsf);

        sv = txtPrecoCusto.getText();
        vsf = sv.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        custo = new BigDecimal(vsf);

        sv = txtLucro.getText();
        vsf = sv.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        lucro = new BigDecimal(vsf);

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja alterar o produto: " + txtDescricao.getText() + "?", title, JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            marcaTo = crtl.consultarNOME(cbMarca.getSelectedItem().toString());
            catTo = crtl.consultarNOME2(cbCategoria.getSelectedItem().toString());

            crtl.getProdutoTo().setCmFoto(cmfoto);
            crtl.getProdutoTo().setCodBarra(Integer.parseInt(txtCodigo.getText()));
            crtl.getProdutoTo().setCodCategoria(catTo.getCodCategoria());
            crtl.getProdutoTo().setCodMarca(marcaTo.getCodMarca());
            crtl.getProdutoTo().setDescrProd(txtDescricao.getText());
            crtl.getProdutoTo().setLucroProd(lucro.doubleValue());
            crtl.getProdutoTo().setQtdeProd(Integer.parseInt(txtQtde.getText()));
            crtl.getProdutoTo().setValorVenda(Double.valueOf(venda.toString()));
            crtl.getProdutoTo().setValorCusto(Double.valueOf(custo.toString()));
            crtl.getProdutoTo().setCodProd(codProd);
            crtl.alterarProduto();
            LimparCampos();
            btnIncluir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);

        } else if (resposta == JOptionPane.NO_OPTION) {

        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtQtdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdeActionPerformed

    private void txtPrecoVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoVendaFocusLost
        if (!"".equals(txtPrecoVenda.getText())) {
            String sv = txtPrecoVenda.getText();
            String vsf = sv.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
            BigDecimal precoVenda = new BigDecimal(vsf);
            venda = precoVenda;
            NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
            String valorFormatado = nf.format(precoVenda);
            txtPrecoVenda.setText(valorFormatado);
        }
    }//GEN-LAST:event_txtPrecoVendaFocusLost

    private void txtPrecoCustoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoCustoFocusLost
        if (!"".equals(txtPrecoCusto.getText())) {
            String sv = txtPrecoCusto.getText();
            String vsf = sv.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
            BigDecimal precoCusto = new BigDecimal(vsf);
            custo = precoCusto;
            NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
            String valorFormatado = nf.format(precoCusto);
            txtPrecoCusto.setText(valorFormatado);

            lucro = venda.subtract(custo);
            nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
            valorFormatado = nf.format(lucro);
            txtLucro.setText(valorFormatado);
        }
    }//GEN-LAST:event_txtPrecoCustoFocusLost

    private void txtPrecoCustoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoCustoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoCustoFocusGained

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void txtPrecoVendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecoVendaMouseExited
        if (!"".equals(txtPrecoVenda.getText())) {
            String sv = txtPrecoVenda.getText();
            String vsf = sv.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
            BigDecimal precoVenda = new BigDecimal(vsf);
            venda = precoVenda;
            NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
            String valorFormatado = nf.format(precoVenda);
            txtPrecoVenda.setText(valorFormatado);
        }
    }//GEN-LAST:event_txtPrecoVendaMouseExited

    private void txtPrecoCustoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecoCustoMouseExited
        if (!"".equals(txtPrecoCusto.getText())) {
            String sv = txtPrecoCusto.getText();
            String vsf = sv.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
            BigDecimal precoCusto = new BigDecimal(vsf);
            custo = precoCusto;
            NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
            String valorFormatado = nf.format(precoCusto);
            txtPrecoCusto.setText(valorFormatado);

            lucro = venda.subtract(custo);
            nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
            valorFormatado = nf.format(lucro);
            txtLucro.setText(valorFormatado);
        }
    }//GEN-LAST:event_txtPrecoCustoMouseExited

    private void txtPrecoCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoCustoActionPerformed
    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon minhaImagem = new ImageIcon(ImagePath);
        Image img = minhaImagem.getImage();
        Image novaImagem = img.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(novaImagem);
        return image;
    }

    private void carregarComboMarcas() {
        ArrayList<String> marcTo;
        marcTo = crtl.consultarMarcas();
        cbMarca.setModel(new DefaultComboBoxModel(marcTo.toArray()));

    }

    private void carregarComboCategorias() {
        ArrayList<String> marcTo;
        marcTo = crtl.consultarCategorias();
        cbCategoria.setModel(new DefaultComboBoxModel(marcTo.toArray()));

    }

    public void recebendoProduto(ProdutoTO prodTo) {
        codCategoria = prodTo.getCodCategoria();
        codMarca = prodTo.getCodMarca();
        txtCodigo.setText(Integer.toString(prodTo.getCodBarra()));
        txtDescricao.setText(prodTo.getDescrProd());
        txtLucro.setText(String.valueOf(prodTo.getLucroProd()));
        //txtEstoque.setText(Integer.toString(prodTo.getQtdeEstoque()));

        lucro = BigDecimal.valueOf(prodTo.getLucroProd());
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado = nf.format(lucro);
        txtLucro.setText(valorFormatado);

        custo = BigDecimal.valueOf(prodTo.getValorCusto());
        nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        valorFormatado = nf.format(custo);
        txtPrecoCusto.setText(valorFormatado);

        venda = BigDecimal.valueOf(prodTo.getValorVenda());
        nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        valorFormatado = nf.format(venda);
        txtPrecoVenda.setText(valorFormatado);

        txtQtde.setText(String.valueOf(prodTo.getQtdeProd()));
        cbCategoria.setSelectedItem(prodTo.getCategoria());
        cbMarca.setSelectedItem(prodTo.getNomeMarca());
        lblFoto.setIcon(ResizeImage(prodTo.getCmFoto()));
        codProd = prodTo.getCodProd();
        cmfoto = prodTo.getCmFoto();

        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);

    }

    public void desabilitarField() {
        txtQtde.setEnabled(false);
    }

    public void somenteNumero(JTextField txt) {
        crtl.somenteNumero(txt, 50);
    }

    public void somenteNumero2(JTextField txt) {
        crtl.somenteNumero2(txt, 50);
    }

    public void Maiuscula(JTextField txt) {
        crtl.Maiuscula(txt);
    }

    public void LimparCampos() {
        txtCodigo.setText("");
        txtDescricao.setText("");
        txtLucro.setText("");
        txtPrecoCusto.setText("");
        txtPrecoVenda.setText("");
        txtQtde.setText("");
        lblFoto.setIcon(null);
    }

//    public void MascaraValor(JFormattedTextField txt) {
//        crtl.mascaraValor(txt);
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JComboBox cbMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JFormattedTextField txtLucro;
    private javax.swing.JFormattedTextField txtPrecoCusto;
    private javax.swing.JFormattedTextField txtPrecoVenda;
    private javax.swing.JTextField txtQtde;
    // End of variables declaration//GEN-END:variables
}
