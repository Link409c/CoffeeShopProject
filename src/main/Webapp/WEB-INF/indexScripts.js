src="https://cdn.jsdelivr.net/npm/password4j@1.0.0/dist/password4j.min.js"

function login(){
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    // Hashing the password using Password4j
    var hashedPassword = Password4j.hash(password).toString();

    if (username === "admin" && hashedPassword === "hashed_admin_password_here") {
        // Admin login
        redirectToWebsite("admin");
    } else if (username === "user" && hashedPassword === "hashed_user_password_here") {
        // Regular user login
        redirectToWebsite("user");
    } else {
        alert("Invalid username or password. Please try again.");
    }
}

function redirectToWebsite(userType){
    if (userType === "admin"){
        window.location.href = "coffeeshop.html";
    }
    else{
        window.location.href = "coffeeshop.html";
    }
}