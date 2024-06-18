package SistemadeMenuFarmacia;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FarmaciaMenuPrincipal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Principal - Farmácia");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JMenuBar menuBar = new JMenuBar();

        // Cadastros
        JMenu cadastrosMenu = new JMenu("Cadastros");
        JMenuItem clientesItem = new JMenuItem("Clientes");
        JMenuItem produtosItem = new JMenuItem("Produtos");
        JMenuItem fornecedoresItem = new JMenuItem("Fornecedores");
        JMenuItem funcionariosItem = new JMenuItem("Funcionários");
        cadastrosMenu.add(clientesItem);
        cadastrosMenu.add(produtosItem);
        cadastrosMenu.add(fornecedoresItem);
        cadastrosMenu.add(funcionariosItem);

        // Estoque
        JMenu estoqueMenu = new JMenu("Estoque");
        JMenuItem consultarEstoqueItem = new JMenuItem("Consultar Estoque");
        JMenuItem adicionarEstoqueItem = new JMenuItem("Adicionar Produto ao Estoque");
        JMenuItem removerEstoqueItem = new JMenuItem("Remover Produto do Estoque");
        estoqueMenu.add(consultarEstoqueItem);
        estoqueMenu.add(adicionarEstoqueItem);
        estoqueMenu.add(removerEstoqueItem);

        // Vendas
        JMenu vendasMenu = new JMenu("Vendas");
        JMenuItem realizarVendaItem = new JMenuItem("Realizar Venda");
        JMenuItem consultarVendasItem = new JMenuItem("Consultar Vendas");
        JMenuItem relatoriosVendasItem = new JMenuItem("Relatórios de Vendas");
        vendasMenu.add(realizarVendaItem);
        vendasMenu.add(consultarVendasItem);
        vendasMenu.add(relatoriosVendasItem);

        // Compras
        JMenu comprasMenu = new JMenu("Compras");
        JMenuItem registrarCompraItem = new JMenuItem("Registrar Compra");
        JMenuItem consultarComprasItem = new JMenuItem("Consultar Compras");
        JMenuItem relatoriosComprasItem = new JMenuItem("Relatórios de Compras");
        comprasMenu.add(registrarCompraItem);
        comprasMenu.add(consultarComprasItem);
        comprasMenu.add(relatoriosComprasItem);

        // Finanças
        JMenu financasMenu = new JMenu("Finanças");
        JMenuItem fluxoCaixaItem = new JMenuItem("Fluxo de Caixa");
        JMenuItem contasPagarItem = new JMenuItem("Contas a Pagar");
        JMenuItem contasReceberItem = new JMenuItem("Contas a Receber");
        financasMenu.add(fluxoCaixaItem);
        financasMenu.add(contasPagarItem);
        financasMenu.add(contasReceberItem);

        // Relatórios
        JMenu relatoriosMenu = new JMenu("Relatórios");
        JMenuItem relatorioEstoqueItem = new JMenuItem("Relatório de Estoque");
        JMenuItem relatorioClientesItem = new JMenuItem("Relatório de Clientes");
        JMenuItem relatorioVendasItem = new JMenuItem("Relatório de Vendas");
        JMenuItem relatorioComprasItem = new JMenuItem("Relatório de Compras");
        relatoriosMenu.add(relatorioEstoqueItem);
        relatoriosMenu.add(relatorioClientesItem);
        relatoriosMenu.add(relatorioVendasItem);
        relatoriosMenu.add(relatorioComprasItem);

        // Configurações
        JMenu configuracoesMenu = new JMenu("Configurações");
        JMenuItem configuracoesUsuarioItem = new JMenuItem("Configurações de Usuário");
        JMenuItem configuracoesSistemaItem = new JMenuItem("Configurações de Sistema");
        JMenuItem backupRestauracaoItem = new JMenuItem("Backup e Restauração");
        configuracoesMenu.add(configuracoesUsuarioItem);
        configuracoesMenu.add(configuracoesSistemaItem);
        configuracoesMenu.add(backupRestauracaoItem);

        // Sair
        JMenuItem sairItem = new JMenuItem("Sair");

        menuBar.add(cadastrosMenu);
        menuBar.add(estoqueMenu);
        menuBar.add(vendasMenu);
        menuBar.add(comprasMenu);
        menuBar.add(financasMenu);
        menuBar.add(relatoriosMenu);
        menuBar.add(configuracoesMenu);
        menuBar.add(sairItem);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}

