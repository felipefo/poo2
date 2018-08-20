

package refeicao;


public class NonVegetarianoBuilder extends RefeicaoBuilder{
 
    public NonVegetarianoBuilder(Refeicao novaRefeicao){
        this.refeicao = novaRefeicao;
    }    
    public void prepadaHamburgerCarne(){
        System.out.println("cria hamburger carne");
        this.refeicao.setHamburguer(new HamburguerCarne());                
    }        
}
