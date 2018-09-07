function validate() {
	//var name = document.getElementById('name');
	var name=document.forms["loginform"]["name"].value;
	if (name == '') {
		alert("please enter a valid name");
		return false;
	} else {
		return true;
	}

}