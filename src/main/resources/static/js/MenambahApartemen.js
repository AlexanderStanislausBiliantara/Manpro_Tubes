function openPopUp(){
    document.getElementById('popup').style.display = 'flex';
}

function closePopUp() {
    document.getElementById('popup').style.display = 'none';
}

function addUnit(){
    const newDiv = document.createElement('div');
    newDiv.classList.add('new-unit');
    newDiv.textContent = "New Unit Added"

    document.getElementById('result_container').appendChild(newDiv);
}

