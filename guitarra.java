package guitarra;
/**
 *
 * @author Fernanda Thomaz
 */
public class Guitarra {

   private String numeroSerie;
   private String fabricante;
   private String modelo;
   private String tipo; 
   private String madeira;
   private double preco;

         public Guitarra(
	   String numeroSerie, String fabricante,
	   String modelo, String tipo,
	   String madeira, double preco){

		this.numeroSerie = numeroSerie;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.tipo = tipo;
		this.madeira = madeira;
		this.preco = preco;
                }
         
		public String getNumeroSerie() {
		return numeroSerie;
                }
                
                public void setNumeroSerie(String numeroSerie){
		this.numeroSerie = numeroSerie;
	        }
             
		public String getFabricante() {
		return fabricante;
		}
                
		public void setFabricante(String fabricante) { 
		this.fabricante = fabricante;
                }
                
		public String getModelo() {
		return modelo;
		}
                
		public void setModelo(String modelo) {
		this.modelo = modelo;
                }                
                
		public String getTipo() {
		return tipo;
                }
                
		public void setTipo(String tipo) {
		this.tipo = tipo;
                }
      
		public String getMadeira() {
		return madeira;
                }
                
		public void setMadeira(String madeira) {
		this.madeira = madeira;
                }
               
		public double getPreco() {
		return preco;
		}
                
		public void setPreco(double preco) {
		this.preco = preco;

    /**
     *
     * @param args
     */
    public static void main(String[] args){
                 
                 Guitarra minhaGuitarra = new Guitarra("00665581", "Gibson Flying", "Flying V B-2", "Rock", "Mogno", 17.343);
                
                 System.out.println("Número de série: " + (minhaGuitarra.getNumeroSerie()));
                 System.out.println("Fabricante: " + (minhaGuitarra.getFabricante()));
                 System.out.println("Modelo: " + (minhaGuitarra.getModelo()));
                 System.out.println("Tipo: " + (minhaGuitarra.getTipo()));
                 System.out.println("Madeira: " + (minhaGuitarra.getMadeira()));
                 System.out.println("Preço: " + (minhaGuitarra.getPreco()));
             
    }
}



