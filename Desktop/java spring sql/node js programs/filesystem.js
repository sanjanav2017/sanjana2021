const fs= require("fs");
const http=require("http");
const server=http.createServer(function(req,res){

fs.readFile(__dirname+"/hello.txt","utf8",(err,data)=>{

        res.writeHead(200,{"content-type":"text/plain"});
        res.write(data);
        res.end();

});    

}).listen(3001)

    



