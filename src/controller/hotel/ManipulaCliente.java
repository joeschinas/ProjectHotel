/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.hotel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.jfr.events.FileWriteEvent;
import model.hotel.Cliente;

public class ManipulaCliente {
   
    public File selecionaArquivo() {
        File arquivo = new File("D:\\FichaCadastral.txt");
        try {
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }
        } catch (IOException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        return arquivo;
    }
    
    public void cadastrarCliente(Cliente novoCliente) {
        try {
            String dadosCliente = novoCliente.getIdCliente() + ";"
                    + novoCliente.getNome() + ";"
                    + novoCliente.getRG() + ";"
                    + novoCliente.getSexo() + ";"
                    + novoCliente.getTelefone();
            FileWriter fw = new FileWriter(selecionaArquivo(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(dadosCliente);
            bw.newLine();
            bw.close();
            fw.close();
        } catch (IOException ex) {
           System.out.println("Error: "+ex.getMessage());
        }
    }

    public ArrayList<Cliente> lerCliente(){
        ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
        String linha = null;
        try {
            FileReader fr = new FileReader(selecionaArquivo());
            BufferedReader br = new BufferedReader(fr);
            while((linha = br.readLine())!=null){
                Cliente cliente = new Cliente();
                String[] vetorDados = linha.split(";");
                cliente.setIdCliente(Integer.parseInt(vetorDados[0]));
                cliente.setNome(vetorDados[1]);
                cliente.setRG(vetorDados[2]);
                cliente.setSexo(vetorDados[3].charAt(0));
                cliente.setTelefone(vetorDados[4]);
                listaDeClientes.add(cliente);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManipulaCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManipulaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaDeClientes;
    }
    
    public void reecreverArquivo(ArrayList<Cliente> listaCadastro){
        File arquivo = selecionaArquivo();
        arquivo.delete();
        String arq;
        
        try {
            FileWriter fw = new FileWriter(arquivo);
            BufferedWriter bw = new BufferedWriter(fw);
            int cont=0;
            while(cont<listaCadastro.size()){
                arq = listaCadastro.get(cont).getIdCliente()+";"+
                      listaCadastro.get(cont).getNome()+";"+
                      listaCadastro.get(cont).getRG()+";"+
                      listaCadastro.get(cont).getSexo()+";"+
                      listaCadastro.get(cont).getTelefone();
                      bw.write(arq);
                      bw.newLine();
                      cont++;
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ManipulaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int verificaId(){
        ArrayList<Cliente> listaDeClientes = lerCliente();
        int tamanhoArray = listaDeClientes.size();
        if(tamanhoArray==0){
            return 1;
        }else{
            return listaDeClientes.get(tamanhoArray-1).getIdCliente()+1;
        }
    }
        
    
}
