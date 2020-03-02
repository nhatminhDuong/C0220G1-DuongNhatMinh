function bai1() {
    for (let i = 0; i <= 100; i++){
        setTimeout(function() { document.getElementById("result1").innerText = i;}, 200);
        if (i === 99) alert("Done!");
    }
}
function bai2() {

}