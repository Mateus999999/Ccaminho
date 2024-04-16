import java.util.Scanner;

public class caminho {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);


        System.out.println("Você acorda em outro plano e um Deus e diz que você morreu \ne vai rencanar como o Luva de Pedreiro antes da fama \nDigite 1 para agradeçer\nDigite 2 para recusar");
        int escolha = scan.nextInt();
        if(escolha == 1){
        System.out.println("Deus fala um tmj e te manda para o corpo do luva ");
       }
        else  {
        System.out.println("Deus fala que não liga e manda um Segura o Grosso e te manda corpo do luva");    
        }
    System.out.println("Você Acorda em uma cama como o Luva de pedreiro qual sua primeria palavra depois de tudo isso\nDigite 1 para falar RECEBA!!!\nDigite 2 para Reclamar com Deus  ");
    int escolha2 = scan.nextInt();
    if (escolha2 == 1) {
        System.out.println("Você Grita do fundo do Peito bem alto RECEBA!!!!!!, você se sente incrivel");
         System.out.println("Depois desse grande grito um amigo do luva chamando para gravar uns videos para um lugar chamado tiktok\nDigite 1 para Aceitar\nDigite 2 para Recusar ");
         int escolha3 = scan.nextInt();
         if (escolha3 == 1) {
             System.out.println("Você aceita fazer uns videos com seu amigo, que acaba viralizando e você agora é conhecido pelo mundo inteiro como o Receba,\nno futuro um agente que você contratou para cuidar da suas economias  tenta rouba seu dinheiro,\nmas você é esperto agora e acaba descobrindo antes que seja tarde\ne demite ele e da uma voadora no Peitos dele enquanto grita RECEBAAA!!!!! AQUI É MELHOR DO MUNDO\nFim!! ");

         }else {
             System.out.println("Você recusa porque não quer ser reconhecido pq voce sabe como vai ser sua vida se começar a ser famoso\ne que é melhor focar em si mesmo e ir atras do seu grande sonho de ser um astronauta,\nno Futuro vc esta trabalhando uma construção furando poço e lembra como foi idiota de não ter aceitado gravar  os videos\nFim!! ");
         }

    }else {
        System.out.println("Você percebeu que essa escolha não foi boa e que o Luva não tem dinheiro antes da fama\ne reclama falando que não prestrou atenção no que Deus disse");
         System.out.println("Depois de ficar muito puto com Deus, você pensa o que pode se fazer para mudar essa situação e ai você tem em uma ideia\nDigite 1 para  começar a gravar videos para tiktok\nDigite 2 para Suplicar a Deus");
         int escolha4 = scan.nextInt();
         if (escolha4 == 1) {
             System.out.println("Você então começa a gravar videos para o tiktok e surpreendente nenhum viraliza e você se questiona\n sera que é obra de Deus ou não sou tão organico como o orignal Luva de pedreiro,\nentão você fica anos tentando ficar famoso para ter uma boa grana,\nmas não consegue de forma alguma fazer e acaba tendo de trabalhar como enxugador de gelo pelo resto da Vida\nFim!!");
         }else {
           System.out.println("Você suplica a Deus por varios dias consecutivos para reencarnar em outra pessoa,\nDeus com o saco cheio de tanta pertubação e te traz de volta para outro plano e diz que vai aceitar o seu pedido\ne te manda para o corpo de Bora Bill e te amaldiçoa te fazendo apenas falar duas palavra apenas Bora e Bill,\n e pelo resto de sua vida  você podera falar apenas BORA BILL!!!!!\nFim !!");
         }
    }
    }
}

