#include <bits/stdc++.h>

using namespace std;

const int U = 0 ;
const int L = 1 ;
const int D = 2 ;
const int R = 3 ;
const int DIR = 4 ;


struct Mirror{

    int x , y ;
    int index = -1;

    void show(){
        cout<< x << "," << y<< "," << index << endl ;
    }

};

bool cmpH(const Mirror& m1 , const Mirror& m2){
    if( m1.y == m2.y ){
        return m1.x > m2.x ;
    }
    return m1.y > m2.y ;
}

bool cmpV(const Mirror& m1 , const Mirror& m2){
    if( m1.x == m2.x ){
        return m1.y > m2.y ;
    }
    return m1.x > m2.x ;
}

int getNext( int from , int dir){
    // Up:0 , Left:1 , Down:2 , Right:3
    int r=0;
    if( from%2==1){ // LR
        r = from+dir+4 ;
    }else{
        r = from +dir*-1+4 ;
    }
    //cout<< "    >>> f:"<< from << "  d:"<<dir <<"   ==>"<<r%4 << endl ;
    return r%4 ;
}


int main()
{
    int n ;
    cin >> n ;
    vector<Mirror> ms ;
    vector<vector<int>> udlr( n , vector<int>(5) ) ;


    int firstMirror = -1 ;

    for( int i=0;i<n;i++){
        Mirror m ;
        cin >> m.x >> m.y >> udlr[i][DIR] ;
        if( udlr[i][DIR]==0){
            udlr[i][DIR]=-1;
        }
        m.index = i ;

        if( m.y==0 ){
            if( firstMirror==-1 ||  m.x < ms[firstMirror].x){
                firstMirror = i ;
            }
        }
        //cout << "i:" << i<< endl ;
        ms.push_back(m) ;

        // reset udlr
        udlr[i][U]=-1; // up
        udlr[i][D]=-1; // down
        udlr[i][L]=-1; // left
        udlr[i][R]=-1; // right
    }

    // 1. sort ==> find up/down neighbors
    sort( ms.begin() , ms.end() , cmpV) ;
    for( int i=0 ; i<ms.size()-1 ; i++){
            if( ms[i].x == ms[i+1].x){
                int id1 = ms[i].index ;
                int id2 = ms[i+1].index ;
                udlr[id1][D] = id2 ;
                udlr[id2][U] = id1 ;
            }
        //cout<< m.x << " " << m.y << endl ;
    }

    // 2. sort ==> find left/right neighbors
    sort( ms.begin() , ms.end() , cmpH) ;
    for( int i=0 ; i<ms.size()-1 ; i++){
            if( ms[i].y == ms[i+1].y){
                int id1 = ms[i].index ;
                int id2 = ms[i+1].index ;
                udlr[id1][L] = id2 ;
                udlr[id2][R] = id1 ;
            }
        //cout<< m.x << " " << m.y << endl ;
    }

    int startMirror = firstMirror;
    // Up:0 , Left:1 , Down:2 , Right:3
    int lightFrom = L;
    int count =-1;
    while( true ){
            //cout<< startMirror <<"--->" << endl ;
        count++;
        if( startMirror==-1){
            break ;
        }
        int nDir = getNext( lightFrom , udlr[startMirror][DIR]) ;
        lightFrom = (nDir+2)%4 ; // +2 可以取到反方向: L:1<-->R:3 , U:0<-->D:2
        startMirror = udlr[startMirror][nDir] ;
    }

    /*
    //cout<< "=====" << endl ;
    for( auto m:ms){
        m.show() ;
    }

    //cout<< "====" << endl ;
    for( int i=0 ; i<udlr.size() ; i++){
        for( int j=0;j<udlr[i].size() ; j++){
            cout<< udlr[i][j] << " ," ;
        }
        //cout << endl ;
    }
    */
    //cout<< "====" << endl;

    cout<< count << endl;


}
