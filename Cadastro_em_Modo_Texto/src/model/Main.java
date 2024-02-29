/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zamor
 */
public class Main {
    public static void main(String[] args) {
        // Instanciar um repositório de pessoas físicas (repo1)
        PessoaFisicaRepo repo1 = new PessoaFisicaRepo();
        
        // Adicionar duas pessoas físicas, utilizando o construtor completo
        PessoaFisica pessoa1 = new PessoaFisica(1, "João", "123.456.789-00", 30);
        PessoaFisica pessoa2 = new PessoaFisica(2, "Maria", "987.654.321-00", 25);
        
        // Adicionar as pessoas físicas ao repositório
        repo1.inserir(pessoa1);
        repo1.inserir(pessoa2);
        
        try {
            // Invocar o método de persistência em repo1, fornecendo um nome de arquivo fixo
            repo1.persistir("pessoasFisicas.dat");
            
            // Instanciar outro repositório de pessoas físicas (repo2)
            PessoaFisicaRepo repo2 = PessoaFisicaRepo.recuperar("pessoasFisicas.dat");
            
            // Exibir os dados de todas as pessoas físicas recuperadas
            System.out.println("Pessoas físicas recuperadas:");
            for (PessoaFisica pessoa : repo2.obterTodos()) {
                pessoa.exibir();
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Instanciar um repositório de pessoas jurídicas (repo3)
        PessoaJuridicaRepo repo3 = new PessoaJuridicaRepo();
        
        // Adicionar duas pessoas jurídicas, utilizando o construtor completo
        PessoaJuridica empresa1 = new PessoaJuridica(1, "Empresa A", "12345678901234");
        PessoaJuridica empresa2 = new PessoaJuridica(2, "Empresa B", "98765432109876");
        
        // Adicionar as pessoas jurídicas ao repositório
        repo3.inserir(empresa1);
        repo3.inserir(empresa2);
        
        try {
            // Invocar o método de persistência em repo3, fornecendo um nome de arquivo fixo
            repo3.persistir("pessoasJuridicas.dat");
            
            // Instanciar outro repositório de pessoas jurídicas (repo4)
            PessoaJuridicaRepo repo4 = PessoaJuridicaRepo.recuperar("pessoasJuridicas.dat");
            
            // Exibir os dados de todas as pessoas jurídicas recuperadas
            System.out.println("\nPessoas jurídicas recuperadas:");
            for (PessoaJuridica empresa : repo4.obterTodos()) {
                empresa.exibir();
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
