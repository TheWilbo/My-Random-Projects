var f = 1;
var s = 0;
var t= 0;
var o = 0;
for (var count = 1; s<1.3069892237633987e+308; ++count){
    o = t;
    t = f+s;
    f=s;
    s=t;
    console.log(count+":"+t);
}