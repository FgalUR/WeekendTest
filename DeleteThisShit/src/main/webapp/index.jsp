<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Beautiful Simple Website</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background: linear-gradient(to bottom right, #6a11cb, #2575fc);
            color: white;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
            text-align: center;
        }

        header {
            font-size: 2.5em;
            font-weight: bold;
            margin-bottom: 20px;
        }

        p {
            font-size: 1.2em;
            margin-bottom: 30px;
        }

        .links {
            display: flex;
            gap: 20px;
        }

        a {
            text-decoration: none;
            padding: 10px 20px;
            font-size: 1em;
            font-weight: bold;
            background: white;
            color: #2575fc;
            border-radius: 5px;
            transition: background-color 0.3s, color 0.3s;
        }

        a:hover {
            background: #2575fc;
            color: white;
        }
    </style>
</head>

<body>
<header>Welcome to My Beautiful Website</header>
<p>This is a simple HTML and CSS design. Feel free to customize it!</p>
<div class="links">
    <!-- Link 1 -->
    <a href="hiNiga">Hello Servlet</a>
    <!-- Link 2 -->
    <a href="GITL">What?</a>
    <a href="main">MAIN KNOPKA</a>

</div>
</body>
</html>