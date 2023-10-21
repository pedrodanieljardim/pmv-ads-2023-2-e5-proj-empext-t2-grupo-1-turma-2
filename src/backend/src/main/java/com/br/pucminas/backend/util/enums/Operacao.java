package com.br.pucminas.backend.util.enums;

public enum Operacao {
    CRIAR_PEDIDO("Entregue"),
    ATUALIZAR_PEDIDO("Finalizado");
    

		private final String valor;
		Operacao(String valorOpcao){
		valor = valorOpcao;
		}
		public String getValor(){
		return valor;
		}
}
