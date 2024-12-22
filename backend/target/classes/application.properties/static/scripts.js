document.addEventListener('DOMContentLoaded', () => {
    const loginForm = document.getElementById('loginForm');

    if (loginForm) {
        loginForm.addEventListener('submit', function (e) {
            e.preventDefault();
            const email = document.getElementById('email').value;
            const password = document.getElementById('password').value;

            // Send login request to backend
            fetch('/api/users/login', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({ email, password })
            })
            .then(response => response.text())
            .then(message => {
                alert(message); // Accessible feedback for users
                if (message === "Login successful") {
                    window.location.href = '/profile'; // Redirect to profile page
                }
            })
            .catch(error => {
                console.error('Error:', error);
                alert('Login failed'); // Accessible feedback
            });
        });
    }
});
