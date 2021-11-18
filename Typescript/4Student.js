"use strict";
exports.__esModule = true;
exports.Student = void 0;
var Student = /** @class */ (function () {
    function Student(stdid, stdname, stdclass) {
        this.stdID = 123;
        this.stdName = "john";
        this.StdClass = 2;
        this.stdID = stdid;
        this.stdName = stdname;
        this.StdClass = stdclass;
    }
    Student.prototype.display = function () {
        console.log(this.stdID);
        console.log(this.stdName);
    };
    return Student;
}());
exports.Student = Student;
var s1 = new Student(234, "rao", 5);
var s2 = new Student(123, "abc", 2);
var s3 = new Student(456, "mohan", 1);
var s4 = new Student(789, "sohan", 9);
s1.display();
s2.display();
s3.display();
s4.display();
