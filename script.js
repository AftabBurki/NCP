let decrease = document.getElementById("DecTime");
let reset    = document.getElementById("ResTime");
let increase = document.getElementById("IncTime");
let counter    = document.getElementById("Count");

let count;
increase.onclick = function(){
    count++;
    counter.textContent = count;
}

reset.onclick = function(){
    count = 0;
    counter.textContent = count;
}

decrease.onclick = function(){
    count--;
    counter.textContent = count;
}