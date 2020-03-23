function bai1() {
    let inputString = prompt("Nhập ngày:");
    let pattern = /^(0?[1-9]|[12][1-9]|3[01])\/(0?[1-9]|1[0-2])\/(19\d{2}|200\d|201\d|2020)$/;
    alert(pattern.test(inputString));
}

function bai2() {

}