const button = document.getElementById('get-location-button');


async function getData(lat,long){
    const promise = await fetch('http://api.weathereapi.com/v1/current.json?key=930971becfa941f882053344220412&q=${lat},${long}&aqi=yes');

    return await promise.json();
}

async  function geolocation(position){

   const result =  await getData(position.coords.latitude,position.coords.longitude);
    console.log(result);

}

function failedToGet(){
    console.log('There was some issue');
}

button.addEventListener('click',async() => {
    navigator.geolocation.getCurrentPosition(geolocation, failedToGet);
});
