<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h2>Registration Form</h2>
    <form action="register" method="post">
        <label>Name:</label>
        <input type="text" name="name" required /><br />
        <label>Email:</label>
        <input type="email" name="email" required /><br />
        <label>Password:</label>
        <input type="password" name="password" required /><br />
        <button type="submit">Register</button>
    </form>
    <p style="color:red;">${error}</p>
</body>
</html>
