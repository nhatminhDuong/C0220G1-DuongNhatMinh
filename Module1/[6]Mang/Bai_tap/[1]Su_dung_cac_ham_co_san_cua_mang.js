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

}