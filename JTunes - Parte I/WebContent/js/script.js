	function validar()
	{
		


		var name  = form1.nome.value;
		var mail = form1.email.value;
		var addr = form1.endereco.value;
		var emp = form1.empresa.value;
		var msg = form1.mensagem.value;		

		if (name == "")
		{	
			alert('Campo "nome" em branco');
			name.focus();
			return false;
			
		}
		
		
		if (name < "2") 
		 {
			alert('Seu nome só tem essas letras?');
			name.focus();
			return false;
			
		 }
		
		if (mail == "") 
		 {
			alert('Email Não Pode Ficar em Branco');
			mail.focus();
			return false;
			
		 }
		
		
		if (addr == '')
		{
			alert('Endereço Não Pode Ficar em Branco');
			addr.focus();
			return false;

		}	
		

		 return true;
	}




















