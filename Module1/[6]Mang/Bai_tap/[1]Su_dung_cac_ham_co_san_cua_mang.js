function bai1() {
    let myColor = ["Red", "Green", "White", "Black"];
    document.getElementById("result1").innerText = "Mảng ban đầu: " + myColor + "\n";
    document.getElementById("result1").innerText += "Mảng sau khi nối: " + myColor.join("---");
    // document.getElementById("result1").innerText += "Mảng sau khi nối: " + myColor.toString();
}

function bai2() {
    let num = prompt("Nhập số:");
    let result = [num[0]];
    for (let index = 1; index < num.length; index++) {
        if (num[index - 1] % 2 === 0 && num[index] % 2 === 0) {
            result.push("-", num[index])
        } else result.push(num[index]);
    }
    document.getElementById("result2").innerText = result.join("");
}

function bai3() {
    let inputString = prompt("Nhập chuỗi cần chuyển đổi:");
    let upper = "ABCDEFGHIJKLMNOPQRSTUVWXZ";
    let lower = "abcdefghijklmnopqrstuvwxyz";
    let changedString = [];
    for (let i = 0; i < inputString.length; i++){
        if (upper.indexOf(inputString[i]) !== -1){
            changedString.push(inputString[i].toLowerCase());
        }
        else if (lower.indexOf(inputString[i]) !== -1) {
            changedString.push(inputString[i].toUpperCase());
        }
        else changedString.push(inputString[i]);
    }
    document.getElementById("result3").innerText = "Chuỗi sau khi chuyển đổi là: " + changedString.join("");

}