 package controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import model.Cliente;


@WebServlet("/CreateAndFind")
public class ClienteCreateAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ClienteCreateAndFind() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String pesquisa = request.getParameter("pesquisa");
		 
		 if(pesquisa == null) {
			 pesquisa="";
		 }
		 
		 List<Cliente> clientes = ClienteDao.find(pesquisa);
		 
	}
		 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String pesquisa = request.getParameter("pesquisa");
		 
		 try {
			 Statement statement = connection.createStatement();
			 ResultSet resultset.executeQuery(sql);
			 
			 while (resultSet.next()) {
				 
				 Cliente cliente = new Cliente();
				 
				 cliente.setId(resultSet.getint("id"));
				 cliente.setNome(resultSet.getString("nome"));
				 cliente.setCpf(resultSet.getString("cpf"));
				 cliente.setNascimento(resultSet.getString("nascimento"));
				 cliente.setSituação(resultSet.getString("situação"));
				 
				 clientes.add(cliente); 
				 
			 }
			 
			 System.out.println("--correct find clientes");
			 return clientes;
			 
			 
		 } catch(SQLException e) {
			 System.out.println("--incorrect find clientes. " + e.getMessage");
			 return null; 
			 
		 }
		 
		 
		 return null;
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cliente cliente = new Cliente();
		
		cliente.setNome(request.getParameter("nome"));
		cliente.setCpf(request.getParameter("cpf"));
		cliente.setNascimento(request.getParameter("nascimento"));
		cliente.setSituação(request.getParameter("situação"));
		
		ClienteDao.create(cliente);
		
		//doGet(request, response);
	}

}
