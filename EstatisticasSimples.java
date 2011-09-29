public class EstatisticasSimples {
	public static double calculaValorMinimo(double[] valoresDeEntrada){
		if(valoresDeEntrada.length<3){
			if(valoresDeEntrada[0]<valoresDeEntrada[1]){
				return valoresDeEntrada[0];
			}else
				return valoresDeEntrada[1];
		}else{
			double aux =  valoresDeEntrada[0];
			for(int i = 0; i<10; i++){
				for(int j=1;j<10;j++){
					if((valoresDeEntrada[j]<valoresDeEntrada[i])&&(aux>valoresDeEntrada[j])){
						aux=valoresDeEntrada[j];
					}		
				}	
			}
			return aux;
		}
	}
	public static double calculaValorMaximo(double[] valoresDeEntrada) {
		if(valoresDeEntrada.length<3){
			if(valoresDeEntrada[0]>valoresDeEntrada[1]){
				return valoresDeEntrada[0];
			}else
				return valoresDeEntrada[1];
		}else{
			double aux =  valoresDeEntrada[0];
			for(int i = 0; i<valoresDeEntrada.length; i++){
				for(int j=1;j<valoresDeEntrada.length;j++){
					if((valoresDeEntrada[j]<valoresDeEntrada[i])&&(aux<valoresDeEntrada[j])){
						aux=valoresDeEntrada[j];
					}		
				}	
			}
			return aux;
		}	
	}
	public static int calculaQuantidade(double[] valoresDeEntrada) {
		return valoresDeEntrada.length;
	}
	public static double calculaMedia(double[] valoresDeEntrada) {
		double aux=0;
		for(int i=0;i<valoresDeEntrada.length;i++){
			aux=aux+valoresDeEntrada[i];
		}
		return aux=aux/valoresDeEntrada.length;
	}
	public static double[] calcula(double[] valoresDeEntrada) {
		double vetor[]={0,0,0,0};
		vetor[0]=calculaValorMinimo(valoresDeEntrada);
		vetor[1]=calculaValorMaximo(valoresDeEntrada);
		vetor[2]=calculaQuantidade(valoresDeEntrada);
		vetor[3]=calculaMedia(valoresDeEntrada);
		return vetor;
	}
}
