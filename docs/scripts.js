/*eslint-env browser */
function startTime() {
    var today = new Date();
    var h = today.getHours();
    var m = today.getMinutes();
    var s = today.getSeconds();
    var o = today.getMonth();
    var d = today.getDate();
    var y = today.getYear() + 1900;
    m = checkTime(m);
    s = checkTime(s);
    o = checkTime(o);
    d = checkTime(d);
    y = checkTime(y);
    o++;
    document.getElementById('txt').innerHTML = h + ":" + m + ":" + s + " " + o + "/" + d + "/" + y;
    var t = setTimeout(startTime, 500);
}

function checkTime(i) {
    if (i < 10) {i = "0" + i};  // add zero in front of numbers < 10
    return i;
}

function advert(message) {
    document.getElementById('advert').innerHTML = message;
}