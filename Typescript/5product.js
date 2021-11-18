var Product = /** @class */ (function () {
    function Product(pid, pname, pprice) {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
        this.GST = 1.5;
        this.proId = pid;
        this.proName = pname;
        this.proPrice = pprice;
    }
    Product.prototype.totalPrice = function () {
        this.totPrice = this.proPrice + ((this.proPrice * 2.5) / 100);
        return this.totPrice;
    };
    Product.prototype.display = function () {
        console.log(this.proId + " " + this.proName + " " + this.totalPrice());
    };
    return Product;
}());
var p1 = new Product(1, 'laptop', 50000);
var p2 = new Product(2, 'phone', 15000);
var p3 = new Product(3, 'PC', 45000);
var p4 = new Product(4, 'keybard', 500);
var p5 = new Product(5, 'mouse', 200);
p1.display();
p2.display();
p3.display();
p4.display();
p5.display();
