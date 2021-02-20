package codingame.puzzle;

import java.util.*;
import java.io.*;
import java.math.*;

public class equivalent_resistance_circuit_building {

      /*    
7
Alfa 1
Bravo 1
Charlie 12
Delta 4
Echo 2
Foxtrot 10
Golf 8
( Alfa [ Charlie Delta ( Bravo [ Echo ( Foxtrot Golf ) ] ) ] )
      
( Alfa [ Charlie ( Bravo Golf ) ] )
      
( ( Foxtrot Golf ) Delta )
      
( Alfa [ Charlie Delta ( Bravo [ Echo ( Foxtrot Golf ) ] ) ] )
       */
      public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < N; i++) {
                  String name = in.next();
                  int R = in.nextInt();
                  map.put(name, R);
            }
            in.nextLine();
            String circuit = in.nextLine();
            in = new Scanner(circuit);
            ArrayList<String> tokens = new ArrayList<>();
            while (in.hasNext()) {
                  tokens.add(in.next());
            }

            System.out.println(tokens);

            Element root = new Element(map, tokens);
            long k = Math.round(root.getValue() * 10);
            double a = k / 10;
            System.out.println(a);
      }

}

class Element {

      String op;
      ArrayList<Element> els = new ArrayList<>();
      int v;
      String tag;

      public Element(HashMap<String, Integer> map, ArrayList<String> tks) {
            String s = tks.remove(0);
            System.err.println(s);
            switch (s) {
                  case "(":
                        op = "+";
                        while (!tks.get(0).equals(")")) {
                              els.add(new Element(map, tks));
                        }
                        tks.remove(0); // remove
                        break;
                  case "[":
                        op = "/";
                        while (!tks.get(0).equals("]")) {
                              els.add(new Element(map, tks));
                        }
                        tks.remove(0); // remove
                        break;
                  default:
                        int n = map.get(s);
                        this.v = n;
                        this.tag = s;
                        break;
            }
      }

      public Element(int v) {
            this.v = v;
      }

      public double getValue() {
            if (els.isEmpty()) {
                  return v;
            }
            if (op.equals("+")) {
                  double total = els.get(0).getValue();
                  tag = " | " + els.get(0).tag;
                  for (int i = 1; i < els.size(); i++) {
                        Element el = els.get(i);
                        total += el.getValue();

                        tag += (" " + op + " " + el.tag);
                  }
                  tag += " | ";

                  System.err.println(tag + " = " + total);

                  return total;
            }
            if (op.equals("/")) {
                  double total = 1 / els.get(0).getValue();
                  tag = " | " + els.get(0).tag;
                  for (int i = 1; i < els.size(); i++) {
                        Element el = els.get(i);
                        total += 1 / el.getValue();

                        tag += (" " + op + " " + el.tag);
                  }
                  tag += " | ";

                  System.err.println(tag + " = " + total);

                  return 1 / total;
            }
            return 0;
      }

}
