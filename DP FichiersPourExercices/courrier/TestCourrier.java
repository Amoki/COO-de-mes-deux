interface Contenu
{
   void encode(String texte);
   String toString();



}
class ContenuTexte implements Contenu
{
   protected String texte;
   public void encode(String texte)
   {
      this.texte = texte;
   }
   public String toString()
   {
      return (texte);
   }
}


class ContenuHtml implements Contenu
{
   protected String codeHtml;
   public void encode(String texte)
   {
      codeHtml = "<HTML>" + texte + "</HTML>";
   }
   public String toString()
   {
      return (codeHtml);
   }
}


class Courrier<T extends Contenu>
{
   protected Class<T> typeContenu;
   protected Contenu contenu;
   protected String destinataire;


   public Courrier(Class<T> contenu){
      this.typeContenu = contenu;
   }


   public Contenu nouveauContenu() {
      try {
         return this.typeContenu.newInstance();
      } catch (InstantiationException e) {
         e.printStackTrace();
      } catch (IllegalAccessException e) {
         e.printStackTrace();
      }
      return null;
   }  // Factory Method


   public void prepare(String destinataire, String texte)
   {
      this.destinataire = destinataire;
      contenu = nouveauContenu();
      contenu.encode(texte);
   }


   public String toString()
   {
      String st = "destinataire : " + destinataire + "\n";
      st += "contenu : " + contenu.toString();
      return st;
   }
}


/*class CourrierTexte extends Courrier
{
   protected Contenu nouveauContenu()
   {
      return new ContenuTexte();
   }
}
class CourrierHtml extends Courrier
{
   protected Contenu nouveauContenu()
   {
      return new ContenuHtml();
   }
}*/


public class TestCourrier
{


   public static void main(String[] args)
   {
      Courrier<ContenuHtml> courrierHtml = new Courrier(ContenuHtml.class);
      courrierHtml.prepare("adresse1@domaine", "texte1");
      System.out.println(courrierHtml);
      Courrier<ContenuTexte> courrierTexte = new Courrier(ContenuTexte.class);
      courrierTexte.prepare("adresse2@domaine", "texte2");
      System.out.println(courrierTexte);
   }


}

