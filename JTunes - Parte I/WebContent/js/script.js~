	function validar()
	{
		d = document.form1;


		var nome  = form1.nome.value;
		var email = form1.email.value;
		var endereco = form1.endereco.value;
		var empresa = form1.empresa.value;
		var mensagem = form1.mensagem.value;		


		//validar email(verificao de endereco eletrônico)
		parte1 = d.email.value.indexOf("@");
		parte2 = d.email.value.indexOf(".");
		parte3 = d.email.value.length;
		

		if (d.nome.value == "")
		{	
			alert('Campo "nome" em branco');
			d.nome.focus();	
			return false;
		
			if (d.nome.value < 3) 
			 {
				alert('Seu nome só tem essas letras?');
				d.nome.focus();
				return false;
			}
	
		}
		
		
		if (d.email.value == "") 
		{
			alert('Preencha corretamente o email');
			d.email.focus();
			return false;
		
		

		if (!(d.email.value.indexOf("@") >= 3 && d.email.value.indexOf(".") >= 0 && d.email.value.length >= 9)) 
		{

     				alert ("O Campo " + d.email.name + " Deve Conter um endereço válido!");
           			d.email.focus();
              			return false;
		}

	}



		


		
		
		

		
 

	}




















