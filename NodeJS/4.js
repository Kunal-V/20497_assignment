const fs = require('fs')

fs.readFile('./hello.java', 'utf8' , (err, data) => {
  if (err) {
    console.error(err)
    return
  }
  console.log(data)
})