class App {
    constructor() {
        this.el = document.getElementById('products');
        this.products = ['Sony Xperia', 'Samsung Galaxy', 'Nokia 6', 'Xiaomi Redmi Note 4', 'Apple iPhone 6S',
            'Xiaomi Mi 5s Plus', 'Apple iPhone 8 Plus', 'Fujitsu F-04E', 'Oppo A71'];
    }

    count = function (data) {
        let el = document.getElementById('counter');
        let name = 'product';
        if (data) {
            if (data > 1) {
                name = 'products';
            }
            el.innerHTML = data + ' ' + name;
        } else {
            el.innerHTML = 'No ' + name;
        }
    };

    fetchAll = function () {
        let data = "";
        if (this.products.length > 0) {
            for (let i = 0; i < this.products.length; i++) {
                data += '<tr>';
                data += '<td>' + this.products[i] + '</td>';
                data += '<td><button onclick="app.edit(' + i + ')">Edit</button></td>';
                data += '<td><button onclick="app.delete(' + i + ')">Delete</button></td>';
                data += '</tr>';
            }
        }
        this.count(this.products.length);
        return this.el.innerHTML = data;
    };

    add = function () {
        let el = document.getElementById('addName');
        let product = el.value;
        if (product) {
            this.products.push(product.trim());
            el.value = '';
            this.fetchAll();
        }
    };

    edit = function (item) {
        let el = document.getElementById('editName');
        el.value = this.products[item];
        document.getElementById('spoiler').style.display = 'block';
        self = this;
        document.getElementById('saveEdit').onsubmit = function () {
            let product = el.value;
            if (product) {
                self.products.splice(item, 1, product.trim());
                self.fetchAll();
                closeInput();
            }
        }
    };

    delete = function (item) {
        this.products.splice(item, 1);
        this.fetchAll();
    };
}

let app = new App();
app.fetchAll();

function closeInput() {
    document.getElementById('spoiler').style.display = 'none';
}