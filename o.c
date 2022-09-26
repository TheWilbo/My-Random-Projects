#include <stdio.h>
#include <windows.h>

int main(){
    ShellExecute(NULL,"open", "https://www.youtube.com/watch?v=dQw4w9WgXcQ","p1=MyString", "c:\\", SW_SHOW);
}