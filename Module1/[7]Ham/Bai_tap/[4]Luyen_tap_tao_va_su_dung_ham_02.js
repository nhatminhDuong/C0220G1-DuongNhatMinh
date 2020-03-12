function bai1() {
    let a = parseFloat(prompt("Nhập số cần tính bình phương:"));
    square(a);
    alert(a + "\u00B2 = " + square(a));
}

function square(x) {
    return x * x;
}

function bai2() {
    let r = parseFloat(prompt("Nhập bán kính"));
    alert("Bán kính hình tròn là: " + circumference(r) + "\nChu vi hình tròn là: " + circleArea(r));
}

function circumference(x) {
    return x * 2 * 3.14;
}

function circleArea(x) {
    return x * x * 3.14;
}

function bai3() {
    let a = parseInt(prompt("Nhập số nguyên:"));
    alert(a + "! = " + factorial(a));
}

function factorial(x) {
    if (x === 0) return 1;
    else return x * factorial(x - 1);
}

function bai4() {
    let inputChar = prompt("Nhập kí tự:");
    checkNumChar(inputChar);
}

function checkNumChar(x) {
    if (x - x === 0) alert("TRUE");
    else alert("FALSE");
}

function bai5() {
    let a = prompt("Nhập số thứ nhất:");
    let b = prompt("Nhập số thứ hai:");
    let c = prompt("Nhập số thứ ba:");
    alert("Số nhỏ nhất trong ba số là: " + findMin(a, b, c));
}

function findMin(x, y, z) {
    if (x < y) {
        if (x < z) {
            return x;
        } else return z;
    } else if (y < z) {
        return y;
    } else return z;
}

function bai6() {
    let a = prompt("Nhập số:");
    alert(checkGreaterThan0(a));
}

function checkGreaterThan0(x) {
    return (x > 0 && Number.isInteger(x * 1));
}

function bai7() {
    let arrayOfNums = [];
    arrayOfNums[0] = prompt("Nhập số thứ nhất: a[0] = ");
    arrayOfNums[1] = prompt("Nhập số thứ hai: a[1] = ");
    swap(arrayOfNums);
    alert(arrayOfNums);
}

function swap(arr) {
    // arr[0] = arr[0] ^ arr[1];
    // arr[1] = arr[0] ^ arr[1];
    // arr[0] = arr[0] ^ arr[1];
    [arr[0], arr[1]] = [arr[1], arr[0]]; //destructuring assignment ES6
}

function bai8() {
    let inputArray = [];
    let i = 0;
    do {
        let temp = prompt('Nhập phần tử thứ ' + i + '. Nhập "q" để kết thúc nhập.');
        if (temp === "q") break;
        inputArray[i] = temp;
        i++;
    } while (1);
    document.getElementById("result8").innerText = "Mảng đã nhập: " + inputArray;
    reverseArray(inputArray);
    document.getElementById("result8").innerText += "\nMảng sau khi đảo ngược: " + inputArray;
}

function reverseArray(arr) {
    let first = 0;
    let last = arr.length - 1;
    for (; first < last; first++, last--) {
        let temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}

function bai9() {
    let arrayOfChars = [];
    let lookUpChar = "";
    let i = 0;
    do {
        let temp = prompt('Nhập phần tử thứ ' + i + ' của mảng. Nhập "quit" để kết thúc nhập.');
        if (temp === "quit") break;
        arrayOfChars[i] = temp;
        i++;
    } while (1);
    lookUpChar = prompt("Nhập kí tự cần tìm:");
    document.getElementById("result9").innerText = "Mảng đã nhập: " + arrayOfChars;
    document.getElementById("result9").innerText += '\nKết quả trả về khi tìm kí tự "'
        + lookUpChar + '" trong mảng: ' + findChar(arrayOfChars, lookUpChar);
}

function findChar(arr, char) {
    let str = arr.join();
    let count = 0;
    for (let i = 0; i < str.length; i++) {
        if (str.charAt(i) === char) {
            count++;
        }
    }
    if (count === 0) return -1;
    else return count;
}