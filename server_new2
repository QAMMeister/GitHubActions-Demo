const express = require('express');
const app = express();

app.get('/', function(req, res){
    res.sendfile(__dirname + "/index.html");
});

app.get('/locations', (req, res) => {
    const locations = [
      { id: 1, title: 'Berlin' },
      { id: 2, title: 'Bremen' },
      { id: 3, title: 'Dresden' },
      { id: 4, title: 'Düsseldorf' },
      { id: 5, title: 'Erfurt' },
      { id: 6, title: 'Eschborn' },
      { id: 7, title: 'Hamburg' },
      { id: 8, title: 'München' },
    ];
    res.json(locations);
  });

const port = process.env.PORT || 3000;
app.listen(port, () => {
  console.log(`API server listening on port ${port}`);
});
