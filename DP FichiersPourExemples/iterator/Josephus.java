package iteratorCorrection;


//  The Josephus problem

import java.util.*;
import java.io.*;
//import ListeCirculaires.ListeCirculaire;

public class Josephus
{
    @SuppressWarnings("unchecked")
	public static void main(String[] args)
        {
            ListeCirculaire<Character> ring = new ListeCirculaire<Character>();
            ListIterator<Character> it = ring.listIterator();
			// remplissage de la liste
			int N = get("Entrer le nombre de soldats");
			for (int k = 0; k < N; k++)
				it.add(new Character((char)('A' + k)));
		//	ring.add(new Character((char)('A' + k)));
			// parcours de la liste
			System.out.println(N + " soldat: ");
			for (int i = 0; i < ring.size(); i++){
	                System.out.println(it.next());
	            }
//			for (int i = 0; i < ring.size(); i++) {
//				System.out.print(ring.get(i) + " ");
//			}
			

			// élimination des soldats en utilisant un itérateur
            it = ring.listIterator();
            while (ring.size() > 1)
            {
                Object killer = it.next();
                System.out.println(killer + " tue " + it.next());
                it.remove();
            }
            System.out.println("Le dernier survivant est " + it.next());

		}

    public static int get(String prompt)
        {
            int n=0;
            try
            {
                InputStreamReader reader = new InputStreamReader(System.in);
                BufferedReader in = new BufferedReader(reader);
                System.out.print(prompt + ": ");
                String input = in.readLine();
                n = Integer.parseInt(input);
            }
            catch(Exception e)
            { System.out.println(e); }
            return n;
        }
}
