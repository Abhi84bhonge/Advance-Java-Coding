<!DOCTYPE html>
<html>
<head>
    <title>User Login</title>
   <link rel="stylesheet" href="login.css">
</head>
<body>

    <h2>User Login</h2>

    <div class="container">
      
      <form action="/verify-login" method="post">

            <label>Enter Username</label>
            <input type="text" name="username" required>
<br><br>
            <label>Enter Password</label>
            <input type="password" name="password" required>
<br><br>

          <input type="submit" value="login">
        </form>
    </div>
</body>
</html>
