<%-- 
    Document   : ab
    Created on : 30 Nov, 2018, 9:43:55 AM
    Author     : hi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Form</title>
        <style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text], select, textarea {
    width: 100%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    margin-top: 6px;
    margin-bottom: 16px;
    resize: vertical;
}

input[type=submit] {
    background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

.container {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}
</style>

    </head>
    <body>
       <h3>Contact Form</h3>

<div class="container">
  <form method="POST>"
    <label for="fname">First Name</label>
    <input type="text" id="fname" name="firstname2" placeholder="Your name..">

    <label for="lname">Last Name</label>
    <input type="text" id="lname" name="lastname2" placeholder="Your last name..">

    <label for="country">Country</label>
    <select id="country" name="country2">
      <option value="australia">Australia</option>
      <option value="canada">Canada</option>
      <option value="usa">USA</option>
    </select>

    <label for="subject">how would you suggest I improve it?</label>
    <textarea id="subject" name="subject2" placeholder="Write something.." style="height:200px"></textarea>

    <input type="submit" value="Submit" formaction="contactForm">
  </form>
</div>


    </body>
</html>
