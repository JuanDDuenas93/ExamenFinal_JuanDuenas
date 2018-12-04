var TempConverterController = (function () {
    var url = '';

   function convertFromCelsiusToFahrenheit() {
        tempInCelsius= document.getElementById("tempInCelsius").value
        return axios.get(url+"/TempConverter/ToFahrenheit/"+tempInCelsius+"").then(function (response) {
            alert("The requested conversion is ready: "+tempInCelsius+"C ="+response.data+"F")
            return response.data;
        })
    }
    function convertFromFahrenheitToCelsius() {
        tempInFahrenheit = document.getElementById("tempInFahrenheit").value
        return axios.get(url+"/TempConverter/ToCelsius/"+tempInFahrenheit+"").then(function (response) {       
            alert("The requested conversion is ready: "+tempInFahrenheit+"F ="+response.data+"C")
            return response.data;
        })
    }
    

    return {
        convertFromCelsiusToFahrenheit: convertFromCelsiusToFahrenheit,
        convertFromFahrenheitToCelsius: convertFromFahrenheitToCelsius
    };
})();