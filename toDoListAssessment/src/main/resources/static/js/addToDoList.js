
const addItemTableAPI = `http://localhost:8080/itemTable/add`;


itemTableForm.addEventListener('submit', (event)=>{

    event.preventDefault();

    const title = document.querySelector("#title").value;
    const description = document.querySelector("#description").value;
    const targetDate = document.querySelector("#targetDate").value;

    let targetDateBackEnd = new Date(targetDate);
    addItemTable(title,description,targetDateBackEnd);


});


const addItemTable = (title,description,targetDate)=>{

   const formData = new FormData();
   formData.append('title', title);
   formData.append('description', description);
   formData.append('targetDate', targetDate);

    fetch(addItemTableAPI, {
        method :'POST',
        body : formData
    })
    .then((response)=>{
            console.log(response.status); // Will show you the status - 200 ok, 500, 404
            if (response.ok) {
                alert("Successfully Added New Task!")

            }
            else {
               alert("Something went wrong. Please try again")
            }
    })
    .catch((error)=>{

        console.log("error : " + error);
        alert("Error adding Task to the database");

    })

};


targetDate.addEventListener('change', ()=>{
    console.log("Date changed");

    const newDate = new Date(document.querySelector("#targetDate").value);
    console.log("newDate : " + newDate);

    let curDate = new Date();

    console.log("curDate : " + curDate);

    if (newDate < curDate){

        alert("Target Date should be restricted to greater than today’s date !!!")
        document.querySelector("#targetDate").value = "";



    }

});