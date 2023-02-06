window.onload = function() {
    const idElement = document.getElementById("id");
    const signUpBtn = document.getElementById("signUpBtn");






    signUpBtn.addEventListener("click", e => {
        const textInId = idElement.value;
        if (textInId !== "") {
            console.log("jex")
            window.location.href = "/signUp2?id=" + textInId;
        } else {
            console.log("sex")
            window.location.href = "/signUp";
        }
    })
};


