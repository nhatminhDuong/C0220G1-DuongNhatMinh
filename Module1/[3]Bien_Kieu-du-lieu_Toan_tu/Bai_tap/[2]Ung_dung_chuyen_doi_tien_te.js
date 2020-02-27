// let x,y;
// let flag = false;
function setToCur() {
    document.getElementById("toCur").value = "1";
}
function convert() {
    flag = true;
    let inputAmount;
    inputAmount = document.getElementById("amount").value;
    let amount = parseInt(inputAmount);
    let fromCur;
    let toCur;
    fromCur = parseInt(document.getElementById("fromCur").value);
    toCur = parseInt(document.getElementById("toCur").value);
    let rate = [[1, 0.000043, 0.00004, 0.000033, 0.0003],[23255.814, 1, 0.92, 0.77, 7.04],[25199.75, 1.09, 1, 0.84, 7.66],[30128.47, 1.3, 1.19, 1, 9.09],[3300.5, 0.14, 0.13, 0.11, 1]];
    if (fromCur === toCur) alert("Bạn đã chọn hai loại tiền tệ giống nhau. Vui lòng chọn lại!");
    else
    {
        document.getElementById("result").innerText = amount * rate[fromCur][toCur];
    }
}
// function hideToCur() {
//     flag = false;
// let inputFrom = document.getElementById("fromCur");
// x = parseInt(inputFrom.value);
// document.getElementById("toCur").options[x].disabled = true;
// document.getElementById("toCur").options[y].disabled = false;
// }
// function hideFromCur() {
//     flag = false;
//     let inputTo = document.getElementById("toCur");
//     y = parseInt(inputTo.value);
//     document.getElementById("fromCur").options[y].disabled = true;
//     document.getElementById("fromCur").options[x].disabled = false;
// }