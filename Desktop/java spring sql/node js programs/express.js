var express = require('express');

var app = express();

var port =5000;

app.get('/a:b',function(req, res) {
        var c =req.params.a;
        var d = req.params.b;
        var data = c*d ;
        res.json(data);

        res.send(200, { 'data':'success' });
        res.end();
});

app.listen(port,'127.0.0.1',function(){
    console.log('server listening at port' + port);

}); 

