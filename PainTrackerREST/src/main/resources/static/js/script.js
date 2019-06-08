window.addEventListener('load', function(e) {
  console.log('document loaded');
  init();
  getPain();
});

function init() {
  window.addEventListener('load', function(event) {
    event.preventDefault();
    // var painId = document.painForm.painId.value;
    // if (!isNaN(painId) && painId > 0) {
    // getPain(painId);

    // }
  })
  document.painForm.addPain.addEventListener('click', function(event) {
    event.preventDefault();
    addPain();
  })
}



function getPain() {
  // TODO:
  // * Use XMLHttpRequest to perform a GET request to "api/films/"
  //   with the filmId appended.
  // * On success, if a response was received parse the film data
  //   and pass the film object to displayFilm().
  // * On failure, or if no response text was received, put "Film not found"
  //   in the filmData div.

  var xhr = new XMLHttpRequest();

  xhr.open('GET', 'api/pain/');

  xhr.onreadystatechange = function() {
    if (xhr.status < 400 && xhr.readyState === 4) {
      // convert responseText to JSON
      var data = JSON.parse(xhr.responseText);

      // print out JSON data
      console.log(data[0].id);
      displayPain(data);
      /*
      	[
      		Object,
      		Object,
      		Object,
      		Object,
      		Object
      	]
      */
      // print out the id of the first object
      // console.log(data[0].id); // 1

    } else if (xhr.readyState === 4 && xhr.status >= 400) {
      console.error('Pain not found');
    }
  };

  xhr.send(null);

}

function displayPain(pain) {

  pain.forEach(function(value, index, array) {
    console.log(value);

    let p1 = document.createElement('tr');
    let p2 = document.createElement('tr');
    let p3 = document.createElement('tr');
    let p4 = document.createElement('tr');
    let p5 = document.createElement('tr');
    let p6 = document.createElement('tr');
    let p7 = document.createElement('br');

    var d1 = document.getElementById('painData');

    d1.append(p1);
    d1.appendChild(p2);
    d1.appendChild(p3);
    d1.appendChild(p4);
    d1.appendChild(p5);
    d1.appendChild(p6);
    d1.append(p7);

    p1.textContent = value.painLocation;
    p2.textContent = value.intensity;
    p3.textContent = value.painStartDate;
    p4.textContent = value.painEndDate;
    p5.textContent = value.painTrigger;
    p6.textContent = value.typeOfPain;

  });

}

function addPain() {
  // e.preventDefault();
  var xhr = new XMLHttpRequest();
  xhr.open('POST', 'api/pain', true);

  xhr.setRequestHeader("Content-type", "application/json"); // Specify JSON request body

  xhr.onreadystatechange = function() {
    if (xhr.readyState === 4) {
      if (xhr.status == 200 || xhr.status == 201) { // Ok or Created
        let painObject = JSON.parse(xhr.responseText);
        getPain(painObject.id);
      } else {
        // console.log("POST request failed.");
        // console.error(xhr.status + ': ' + xhr.responseText);
        document.getElementById('painData').textContent = 'Film Not Found';
        console.log(xhr.responseText);
      }
    }
  };

  var painObject = {
    painLocation: document.painForm.painLocation.value,
    intensity: document.painForm.intensity.value,
    painStartDate: document.painForm.painStartDate.value,
    painEndDate: document.painForm.painEndDate.value,
    painTrigger: document.painForm.painTrigger.value,
    typeOfPain: document.painForm.typeOfPain.value
  };
  console.log(painObject);

  var painObjectJson = JSON.stringify(painObject); // Convert JS object to JSON string

  xhr.send(painObjectJson);

  document.painForm.reset();

}
