/**
 * 
*/




function startWork() {
	validateCreditCard();
	performCipherSum();
}



function validateCreditCard() {
	console.log("Button pressed");
	var creditCardString = 'value=' + document.getElementById("inputCC").value
	doAjax("CreditCard_Servlet", creditCardString, 'validateCreditCard_back', 'post', 0)
}

function validateCreditCard_back(result) {
	console.log(result)
	const myElement = document.getElementById("result");

	myElement.textContent = result;
}


function performCipherSum() {
	var creditCardNumber = document.getElementById("inputCC").value
	console.log(creditCardNumber)

	var message = 'x=' + creditCardNumber

    doAjax("CalculatorServlet", message, 'setSumResult', 'post', 0);


}



function setSumResult(result) {
	
	console.log("Result was:" + result);
	const myElement = document.getElementById("cipherSum");
	myElement.textContent = result;
}


