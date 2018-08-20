
package refeicao;


public class VegetarianoBuilder extends RefeicaoBuilder{
    
    public VegetarianoBuilder(Refeicao refeicao){
        this.refeicao = refeicao;
    }        
    public void preparaHamburgerVegetariano(){
        System.out.println("cria hamburger vegetariano");
        this.refeicao.setHamburguer(new HamburguerVegetariano());                
    }        
}


