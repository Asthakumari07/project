document.getElementById('bookForm').addEventListener('submit', function(e) {
    e.preventDefault();
    
    const title = document.getElementById('bookTitle').value;
    const author = document.getElementById('author').value;
    const quantity = document.getElementById('quantity').value;
    
    addBookToTable(title, author, quantity);
    
    // Clear input fields
    document.getElementById('bookForm').reset();
});

function addBookToTable(title, author, quantity) {
    const tableBody = document.querySelector('#bookTable tbody');
    const newRow = document.createElement('tr');
    
    newRow.innerHTML = `
        <td>${title}</td>
        <td>${author}</td>
        <td>${quantity}</td>
        <td><button onclick="deleteBook(this)">Delete</button></td>
    `;
    
    tableBody.appendChild(newRow);
}

function deleteBook(button) {
    const row = button.parentNode.parentNode;
    row.parentNode.removeChild(row);
}
