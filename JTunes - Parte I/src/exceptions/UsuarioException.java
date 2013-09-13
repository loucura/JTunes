package exceptions;

import controller.ServletAdicionaUsuario;


/**
 * JTunes - SISTEMA PARA VENDA DE MÚSICAS ONLINE SEMELHANTE AO ITUNES.
 * SERVLET CONTROLA COMPRA.
 *
 * @author VANDERSON DINIZ
 * @author ERICK SILVA
 * @version JTUNES 1.0 
 */


/**CLASSE DE EXCEÇÃO QUE GERA MENSAGENS QUANDO ALGUM ERRO É APRESENTADO.
 * RETORNA A MENSAGEM POR MEIO DE UMA EXCEÇÃO.
 * */


@SuppressWarnings("serial")
public class UsuarioException extends Exception 

{
	
	public UsuarioException(String mensagem)
	{
		super(mensagem);
	}

}