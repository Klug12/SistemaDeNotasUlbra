import java.util.Scanner;

public class NotasUlbra{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        float ap1=0,ap2=0,ap2MaisAps=0,ap2p1=0,ap2p2=0,ap2p3=0,ap2p4=0,as=0,somaNotas=0,af=0;
        String nome="";
        float MEDIA=6;
        
        System.out.println("Digite o seu nome");
        nome=scan.nextLine();

        System.out.printf("Bem vindo %s \nDigite sua nota da AP1:\n",nome);
        ap1=scan.nextFloat();

        System.out.println("Digite a nota do primeiro trabalho da AP2");
        ap2p1=scan.nextFloat();
        ap2MaisAps=ap2p1;
        System.out.println("Digite a nota do segundo trabalho AP2");
        ap2p2=scan.nextFloat();
        ap2MaisAps=ap2p2 + ap2p1;
        System.out.println("Digite a nota do terceiro trabalho da AP2");
        ap2p3=scan.nextFloat();
        ap2MaisAps=ap2p3 + ap2p2 + ap2p1;
        System.out.println("Digite a nota do quarto trabalho da AP2");
        ap2p4=scan.nextFloat();
        ap2MaisAps=ap2p4 + ap2p3 + ap2p2 + ap2p1;
        System.out.println("Digite sua nota da AP2");
        ap2=scan.nextFloat();
        ap2MaisAps=ap2 + ap2p4 + ap2p3 + ap2p2 + ap2p1;

        System.out.println("Digite sua nota da Avaliação Semestral");
        as=scan.nextFloat();
        somaNotas=ap2MaisAps+ap1+as;

        System.out.printf("Suas notas parciais foram: \n%.2f na AP1, \n%.2f na AP2, \n%.2f na Avaliação Semestral (AS)",ap1,ap2MaisAps,as);

if (somaNotas >= MEDIA){
    System.out.printf("\nPARABÉNS %s, você passou com nota %.2f, \nBOAS FÉRIAS!!!",nome,somaNotas);
}else if(somaNotas < MEDIA){
    System.out.printf("\n%s, você ficou com nota %.2f, \ninfelizmente você terá que fazer a prova AF que vale 10 pontos e você precisa acertar 60 por cento da prova para ser aprovado",nome,somaNotas);
    System.out.printf("\n%s digite sua nota da Avaliação Final (AF)\n",nome);
    af=scan.nextFloat();
}  if (af>=MEDIA) {
    System.out.printf("\nPARABÉNS %s, você passou na recuperação com nota %.2f, \nBOAS FÉRIAS!!!",nome,af);
}else{
    System.out.printf("\n%s, você ficou com nota %.2f, \ninfelizmente você terá que refazer essa cadeira",nome,af);
}

}

}

    
    
   