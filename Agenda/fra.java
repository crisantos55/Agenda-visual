package Agenda;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.InputVerifier;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class fra implements ActionListener{
	public Nodo inicio;
	 JFrame frame = new JFrame("Agenda de angel");
	 JFrame agrega= new JFrame("Agregar contacto");
	 JFrame imprime= new JFrame("Muestra contactos");
	 JFrame modi= new JFrame("Modifica contacto");
	 JFrame elimi= new JFrame("elimi contacto");
	 JFrame busq= new JFrame("busq contacto");
	 Label a= new Label();
	 Button boton= new Button ("Entrar");
	 Button regresar=new Button("Regresar");
	 Button agregar=new Button("Agregar");
	 Button Nuevo=new Button("Nuevo");
	 JTextArea area= new  JTextArea();
	 JTextField nomcont = new JTextField();
	 JTextField Agregar = new JTextField();
	 JTextField nc = new JTextField();
	 JTextField dc = new JTextField();
	 JTextField fc = new JTextField();
	 JTextField tc = new JTextField();
	 JTextField cc = new JTextField();
	 
	 
	 public fra(){
	
		  agrega.setSize(600,400);
		  agrega.setLocation(0, 0);
		  imprime.setSize(600,400);
		  imprime.setLocation(0, 0);
		  busq.setSize(600,400);
		  busq.setLocation(0, 0);
		   
	 }

	public void menuPrincipal(){
		 frame.setSize(600,400);
	     frame.setLocation(0, 0);
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    a.setText("Bienvenido a la agenda de angel\n\n\n\n"
	    		+ "Acontinuacion ingrese el numero correspondiente para acceder al menu:\n\n"
	    		+ "1.-Agregar contacto\n"
	    		+ "2.-Modificar contacto\n"
	    		+ "3.-Eliminar contacto\n"
	    		+ "4.-Buscar contacto\n"
	    		+ "5.-Mostrar agenda\n");
	   
	 
	  boton.setBounds(50,250, 60, 30);
	   Agregar.setBounds(10, 250, 40, 30);
	   frame.add(boton);
	    frame.add(a);
	    frame.add(Agregar);
	    frame.setBackground(Color.DARK_GRAY);
	    Agregar.setForeground(Color.red);
	    a.setForeground(Color.white);
	    boton.addActionListener(this);
		
	}

	public void menuAgrega(){
		//System.out.println("prueva");
		agrega.setVisible(true);
		  agrega.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 // agrega.setVisible(false);
		  regresar.setBounds(300,180, 80, 40);
		  regresar.addActionListener(this);
		  agregar.setBounds(300,100, 80, 40);
		  agregar.addActionListener(this);
		  Nuevo.setBounds(300,20, 80, 40);
		  Nuevo.addActionListener(this);
		  agrega.setBackground(Color.DARK_GRAY);
		  
		  Label nom= new Label();
		  Label dir=new Label();
		  Label fcha= new Label();
		  Label numer= new Label();
		  Label email= new Label();
		  nom.setBounds(0, 0, 20, 20);
		  nc.setBounds(0, 20, 140, 20);	  
		  dir.setBounds(0, 50, 20, 20);
		  dc.setBounds(0, 70, 140, 20);	
		  fcha.setBounds(0, 100, 20, 20);
		  fc.setBounds(0, 130, 140, 20);
		  numer.setBounds(0, 150, 20, 20);
		  tc.setBounds(0, 180, 140, 20);
		  email.setBounds(0, 210, 20, 20);
		  cc.setBounds(0, 230, 140, 20);
		  nom.setText("Introduzca su nombre ");
		  dir.setText("Introduzca su direccion");
		  fcha.setText("Introduzca la fecha de nacimiento");
		  numer.setText("Introduzca el numero");
		  email.setText("Introduzca el correo electronico");
		  nc.setForeground(Color.red);
		  dc.setForeground(Color.red);
		  fc.setForeground(Color.red);
		  tc.setForeground(Color.red);
		  cc.setForeground(Color.red);
		  nom.setForeground(Color.white);
		  dir.setForeground(Color.white);
		  fcha.setForeground(Color.white);
		  numer.setForeground(Color.white);
		  email.setForeground(Color.white);
		  
		  
		 
		  agrega.add(nom);
		  agrega.add(dir);
		  agrega.add(fcha);
		  agrega.add(numer);
		  agrega.add(email);
		  agrega.add(nc);
		  agrega.add(dc);
		  agrega.add(fc);
		  agrega.add(tc);
		  agrega.add(cc);	
		  agrega.add(regresar);	
		  agrega.add(agregar);
		  agrega.add(Nuevo);
		 
	}
	

	
	public void menuModifica(){
		  modi.setSize(600,400);
		  modi.setLocation(0, 0);
		  modi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  modi.setVisible(false);
	}

	public void menuElimina(){
		  elimi.setSize(600,400);
		  elimi.setLocation(0, 0);
		  elimi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  elimi.setVisible(false);
		
	}
	
   public void menuBusca(){
		  
		  busq.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  busq.setVisible(false);
	   
   }
   
   public void imprime(){
	      imprime.setVisible(true);
	      imprime.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      Label titulo=new Label("Contactos");
	  
	      area.setBounds(100, 100, 100, 100);
	      Nodo aux = inicio;
	      area.setText("prusfkfdlskjf");
			while (aux != null) {
			//	   area.setText("Nombre:"+aux.persona.nombre);
			//	System.out.printf();
				//System.out.printf();
			//	System.out.printf("Fecha de nacimiento: %s %n",aux.persona.fechaNacimiento);
			//	aux.persona.getTelefonos().imprime();
			//	aux.persona.getCorreos().imprime();
				aux = aux.getSiguiente();

			}
			
	      imprime.add(area);
	      imprime.add(titulo);	  
	      
   }
   
   public Integer validaMenu(String cad) {
		boolean bandera = false;
		Integer aux = 0;
		while (bandera == false) {
			if (this.valida(cad)) {
				aux = Integer.parseInt(cad);
				bandera = true;
			} 
		}

		return aux;

	}

	public boolean valida(String cadena) {
		boolean bandera = true;
		if(cadena.length()==1);{
			if (cadena.charAt(0) < 49 || cadena.charAt(0) > 54) {
				bandera = false;
			}
		}
	

		return bandera;
	}
	
	public void rellenaClase(Persona p) {
		
			p.nombre = nc.getText();
			p.direccion = nc.getText();
			p.fechaNacimiento = fc.getText();
			double num = Double.parseDouble(tc.getText());
			p.getTelefonos().insertar(num);
			String cadena = cc.getText();
			p.getCorreos().insertar(cadena);

	}

	
	public void agregarContacto() {
		Persona nueva = new Persona();
		Nodo nuevo = new Nodo(nueva);
		this.rellenaClase(nueva);
		if (inicio == null) {
			inicio = nuevo;
		} else {
			Nodo aux = inicio;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
			aux = nuevo;
		}

	}
	
	

	public void recorrer() {
		
	      //imprime.add(area);
	      
		

	}

	public void actionPerformed(ActionEvent e) {
		
		 if(e.getActionCommand().equals("Entrar")){//podemos comparar por el contenido del boton
	     String cadena=Agregar.getText();
	
	     switch(this.validaMenu(cadena)){
	     case 0:
	    	 this.menuPrincipal();
	    	 break;
	     case 1:
	    	
	    	 frame.setVisible(false);
	    	this.menuAgrega();
	    	
	    	 break;
	     case 2:
	    	 frame.setVisible(false);
	    	 this.menuModifica();
	    	 break;
	     case 3:
	    	 frame.setVisible(false);
	    	 this.menuElimina();
	    	 break;
	     case 4:
	    	 frame.setVisible(false);
	    	 this.menuBusca();
	    	 break;
	     case 5:
	    	 frame.setVisible(false);
	    	 this.imprime();
	    	 break;
	     
	     }
		 }
	     
	     if(e.getActionCommand().equals("Regresar")){
	    	 agrega.setVisible(false);
	    	 this.menuPrincipal();
	    	 }
	     
          if(e.getActionCommand().equals("Agregar")){	 
        	  this.agregarContacto();
	    	
        	  JOptionPane.showMessageDialog(null, "Agregado exitosamente");
        	  
	    	 }
          
          if(e.getActionCommand().equals("Nuevo")){	    	 
 	    	nc.setText("");
 	    	dc.setText("");
 	    	fc.setText("");
 	    	tc.setText("");
 	    	cc.setText("");  
 	    	 }
		 
	}
}
