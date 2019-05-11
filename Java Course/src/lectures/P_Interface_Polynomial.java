package lectures;

import java.util.ArrayList;


public class P_Interface_Polynomial {

        public static void main(String[] args) {
                int b = 4 ;
                b = -b ;
                System.out.println(-b);
        }
        
}

class Monomial {

        private double coefficient;
        private int degree;

        public Monomial(double coefficient, int degree) {
                this.coefficient = coefficient;
                this.degree = degree;
        }

        public double getCoefficient() {
                return coefficient;
        }

        public int getDegree() {
                return degree;
        }

}

interface Polynomial {

        /**
         * Returns the degree of the Polynomial
         *
         * @return the degree of the Polynomial
         */
        int getDegree();

        /**
         * Returns the number of Monomials that combine to form the Polynomial
         *
         * @return
         */
        int getNumTerms();

        /**
         * Returns the name of the Polynomial including terminology for degree
         * and number of terms.
         *
         *
         * == Degree <-> Name ==>>>  
         * 0 : Constant 1 : Linear 2 : Quadratic 3 : Cubic ==
         * Number of Terms <-> Name ==>>>  1 : Monomial 2 : Binomial 3 : Trinomial >=4
         * : Polynomial
         *
         * @return the name of the Polynomial
         */
        String getName();
}

class Quadratic implements Polynomial {

        ArrayList<Monomial> termList;

        public Quadratic(ArrayList<Monomial> termList) {
                this.termList = termList;
        }

        @Override
        public int getDegree() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getNumTerms() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getName() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        /**
         * Returns true if the determinant is >=0 
         *              false f the determinant is negative
         * @param a
         * @param b
         * @param c
         * @return 
         */
        private boolean hasRoots( double a , double b , double c ){
                return false ;
        }
        
        /**
         * 
         * Returns the roots of the Quadratic as determined by the quadratic formula.
         * If the quadratic has no real roots , then null is returned.
         * @return the roots of the Quadratic or null
         */
        public double[] getRoots(){
                return null ;
        }
}
