document.addEventListener('DOMContentLoaded', () => {
    const loginForm = document.getElementById('loginForm');
    const registerForm = document.getElementById('registerForm');

    if (loginForm) {
        loginForm.addEventListener('submit', function (e) {
            e.preventDefault();
            const email = document.getElementById('email').value;
            const password = document.getElementById('password').value;
            
            // Send login request to backend
            fetch('http://localhost:8080/api/users/login', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({ email, password })
            })
            .then(response => response.text())
            .then(message => {
                if (message === "Login successful") {
                    alert('Login successful!');
                    window.location.href = 'profile.html';
                } else {
                    alert('Invalid credentials.');
                }
            })
            .catch(error => {
                console.error('Error:', error);
                alert('Login failed');
            });
        });
    }

    if (registerForm) {
        registerForm.addEventListener('submit', function (e) {
            e.preventDefault();
            const user = {
                username: document.getElementById('username').value,
                email: document.getElementById('email').value,
                password: document.getElementById('password').value
            };

            // Send registration request to backend
            fetch('http://localhost:8080/api/users/register', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(user)
            })
            .then(response => response.json())
            .then(data => {
                alert('Registration successful');
                window.location.href = 'index.html'; // Redirect to login page
            })
            .catch(error => {
                console.error('Error:', error);
                alert('Registration failed');
            });
        });
    }
});
