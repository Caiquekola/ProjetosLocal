let numero = 5;

for (let i = 1; i <= 10; i++) {
   let aleatorio = Math.floor(Math.random()*10);
   console.log("N°= "+aleatorio);
   if(aleatorio%2==0){
    console.log("Ele é par!");
   }else{
    console.log("Ele é ímpar!");
   }
    
}