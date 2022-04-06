var f = 0;
var s = 1;
var t= 0;
var o = 0;
while (s<1.3069892237633987e+308){
    o = t;
    t = f+s;
    f=s;
    s=t;
    console.log(t);
}