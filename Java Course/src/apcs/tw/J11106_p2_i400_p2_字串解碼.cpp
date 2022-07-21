#include <bits/stdc++.h>

using namespace std;


string rev( string code , string text){

    // step 1.
    string s = "" ;
    int count = 0 ;
    for( int i=text.length()-1 ; i>=0 ; i-- ){
        char c01 = code[i] ;
        if( c01=='1'){
            count++ ;
            s = s+text[i] ;
        }else{
            s = text[i]+s;
        }
    }

    //cout << s << "<---" << endl ;

    if( count%2==1){
         // switch
        if( text.length()%2==0)
        {
            int m = text.length()/2 ;
            return s.substr(m,m)+s.substr(0,m) ;
        }
        else
        {
            int m = text.length()/2 ;
            return s.substr(m+1,m) + s.substr(m,1) + s.substr(0,m) ;
        }
    }
    else
    {
        return s ;
    }
}


int main()
{
    int n , len ;
    cin >> n >> len ;
    vector<string> code;
    for(int i=0 ; i<n ; i++){
        string s ;
        cin >> s ;
        code.push_back(s) ;
    }
    string result ;
    cin >> result ;

    for( int i=code.size()-1 ; i>=0 ; i--){

        result = rev( code[i] , result) ;
    }

    cout<< result << endl ;


    return 0;
}
