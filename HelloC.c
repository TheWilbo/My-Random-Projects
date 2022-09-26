#include <stdio.h>
#include <windows.h>
//comment
/*
comment
*/
int askin();
int main(){
    int worldCount = askin();
    int* ptrWorldCount = &worldCount;
    char greeting[]= "Hello World";
    printf("%s %d! (%lu bytes) at %p",greeting, worldCount, sizeof(worldCount), ptrWorldCount);
    //ShellExecute(0, 0, L"http://www.google.com", 0, 0 , SW_SHOW );
    //ShellExecute(NULL,"open", "https://www.youtube.com/watch?v=dQw4w9WgXcQ","p1=MyString", "c:\\", SW_SHOW);
    return 0;
}
int askin(){
    int worldCount;
    printf("What world are you?\n");
    scanf("%d", &worldCount);
    return worldCount;
}