/* horoscopo(Signo,DiaIni,MesIni,DiaFin,MesFin,Compatibilidad,Incompatible)
 <- son del signo Signo los nacidos entre el DiaIni/MesIni y el DiaFin/MesFin */

horoscopo(aries,22,3,31,3,1,4,21,4).
horoscopo(tauro,22,4,31,4,1,5,21,5).
horoscopo(geminis,22,5,31,5,1,6,21,6).
horoscopo(cancer,22,6,31,6,1,7,21,7).
horoscopo(leo,22,7,31,7,1,8,21,8).
horoscopo(virgo,22,8,31,8,1,9,21,9).
horoscopo(libra,22,9,31,9,1,10,21,10).
horoscopo(escorpio,22,10,1,10,1,11,21,11).
horoscopo(sagitario,22,11,31,11,1,12,21,12).
horoscopo(capricornio,22,12,31,10,1,1,21,1).
horoscopo(acuario,22,1,31,1,1,2,21,2).
horoscopo(piscis,22,2,29,2,1,3,21,3).

signo(Dia,Mes,Signo) :- horoscopo(Signo,D1,M1,D11,M11,D2,M2,D22,M22),
    ((Mes=M1,Mes=M11,Dia>=D1,Dia=<D11) ;(Mes=M2,Mes=M22,Dia>=D2,Dia=<D22)).

horoscopo2(compatible,aries,"geminis y tauro e incompatible
con cáncer y libra").
horoscopo2(incompatible,aries,"cancer y libra").
horoscopo2(compatible,tauro,"aries y libra e incompatible
con virgo y cancer").
horoscopo2(incompatible,tauro,"virgo y cancer").
horoscopo2(compatible,geminis,"virgo y piscis e incompatible
con aries y capricornio").
horoscopo2(incompatible,geminis,"aries y capricornio").
horoscopo2(compatible,cancer,"escorpio y tauro e incompatible
con geminis y aries").
horoscopo2(incompatible,cancer,"geminis y aries").
horoscopo2(compatible,leo,"sagitario y cancer e incompatible
con capricornio y geminis").
horoscopo2(incompatible,leo,"capricornio y geminis").
horoscopo2(compatible,virgo,"acuario y sagitario e incompatible
con leo y tauro").
horoscopo2(incompatible,virgo,"leo y tauro").
horoscopo2(compatible,libra,"cancer y virgo e incompatible
con piscis y escorpio").
horoscopo2(incompatible,libra,"piscis y escorpio").
horoscopo2(compatible,escorpio,"piscis y leo e incompatible
con acuario y libra").
horoscopo2(incompatible,escorpio,"acuario y libra").
horoscopo2(compatible,sagitario,"capricornio y piscis e incompatible
con libra y escorpio").
horoscopo2(incompatible,sagitario,"libra y escorpio").
horoscopo2(compatible,capricornio,"tauro y acuario e icompatible
con geminis y leo").
horoscopo2(incompatible,capricornio,"geminis y leo").
horoscopo2(compatible,acuario,"capricornio y sagitario e icompatible
con escorpio y virgo").
horoscopo2(incompatible,acuario,"escorpio y virgo").
horoscopo2(compatible,piscis,"geminis y escorpio e incompatible con
leo y aries").
horoscopo2(incompatible,piscis,"leo y aries").

prueba(X,Y,Z):-horoscopo2(X,Y,(Z)).

horoscopo3(piscis,"No permitas que habladurías
y chismes te arruinen el día, recuerda que si hablan
de ti es porque les molesta lo que proyectas y eres.").
horoscopo3(acuario,"En el trabajo vienen
cosas positivas sin embargo si estas en
espera de mejores ingresos recuerda que quien
no habla con Dios no lo oye, es momento
de buscar mejores oportunidades").
horoscopo3(capricornio,"Tienes ciertos problemas con tu pasado
que te detienen y te hacen dudar hasta de tu nombre,
    no seas tan desconfiado y vive tu vida").
horoscopo3(sagitario,"Se alejara de ti una persona
muy importante que te movía, no detengas
a ese ser o solo te expondrás a que si
se queda haga de ti lo que le de su gana").
horoscopo3(escorpio,"Un ex pareja
te ha recordado mucho son embargo teme
acercarse a ti, el karma le ha dado buenas lecciones").
horoscopo3(libra,"No temas a cambios
en tu vida pues te llevarán a mejorar eb muchos aspectos,
recuerda que nuevos cambios
 traerán consigo nuevas oportunidades").
horoscopo3(virgo,"Vienen cambios importantes en tu
vida entre ellos la oportunidad de dejar ir todo y deshacerte
de todo eso que te ha impedido seguir avanzando").
horoscopo3(leo,"Es momento que dejes de ser tan débil
y pienses más en lo que puedes obtener, échale muchas
ganas a proyectos pues sueles dejar muchas cosas inconclusas").
horoscopo3(cancer,"No caigas en provocaciones tontas
pues este fin de semana andarás algo bipolar y cambiante
en tu carácter, pero esi se debe a ciertas
situaciones que te tienen algo nervios@").
horoscopo3(geminis,"No eres mal@, pero cuando
te buscan te encuentran, el amor quizás no se
ha hecho para ti en estos momentos, pero una cosa
es cierta, cuando dejes de buscarlo y obsesionarte
con él llegará a tu vida").
horoscopo3(tauro,"Deja de pensar en tu pasado y
ve por tu presente que lo has descuidado mucho
por quien no merece ni un segundo de tu atención").
horoscopo3(aries,"No te atontes di lo que sientes
y ve por lo que necesitas, que te valgan comentarios
tontos de gente imbecil que solo busca lastimarte
o hacerte daño, sabes lo perr@ que
puedes ser cuando te lo propones").

prueba2(X,Y):-horoscopo3(X,Y).

main(Dia,Mes,Signo,Y,Z,A):-signo(Dia,Mes,Signo),prueba(Y,Signo,Z),prueba2(Signo,A).
main2:-findall(X,Y,Z,horoscopo2(X,Y,Z)).
