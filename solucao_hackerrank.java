//em java 8
long String_completa = n / s.length();
long restante = n % s.length();
char[] c = s.toCharArray();
long count = 0;
for (int i = 0; i < s.length(); i++){
    if (c[i] == 'a') count ++;
 }
count *= String_completa;
for(int i = 0; i < restante; i ++){
    if (c[i] == 'a') count ++;
}
return count;

}
}
