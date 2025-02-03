function showInfo(member) {
    const infoModal = document.getElementById('info-modal');
    const memberInfo = document.getElementById('member-info');

    if (member === 'Alice') {
        memberInfo.textContent = 'Alice is the founder and has a passion for educational innovation.';
    } else if (member === 'Bob') {
        memberInfo.textContent = 'Bob is the creative director and leads our design team.';
    }

    infoModal.style.display = 'block';
}

function closeModal() {
    document.getElementById('info-modal').style.display = 'none';
}

// Close modal when clicking outside of it
window.onclick = function(event) {
    const modal = document.getElementById('info-modal');
    if (event.target === modal) {
        modal.style.display = 'none';
    }
}
