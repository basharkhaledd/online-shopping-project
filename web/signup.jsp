<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/signup-style.css">
<title>Signup</title>
</head>
<body>
<div id='container'>
  <div class='signup'>
    
      <form action="signupAction.jsp" method="POST">
          <input type="text" name="name" placeholder="inter name" required>
          <input type="email" name="email" placeholder="inter email" required>
          <input type="number" name="mobilenumber" placeholder="inter mobile number" required>
          <select name="securityquestion">
              <option value="what was your first car?">what was your first car?</option>
              <option value="what was your first car?">what is the name of your first pet?</option>
              <option value="what was your first car?">what elementary school did you attend?</option>
              <option value="what was your first car?">what is the name of the town where you were born?</option>
          </select>
          <input type="text" name="answer" placeholder="inter answer" required>
          <input type="password" name="password" placeholder="inter password" required>
          <input type="submit" vlaue="Signup">
      </form>
      
      <h2><a href="login.jsp">Login</a></h2>
  </div>
  <div class='whysign'>
      <% 
      String msg =request.getParameter("msg");
      if("valid".equals(msg))
      {
       %>
         <h1>Successfully Registered</h1>
     <%} %>
     
     <% 
      if("invalid".equals(msg))
      {
       %>
      <h1>Some thing Went Wrong! Try Again !</h1>
     <%} %>


    <h2>Online Shopping</h2>
    <p>The Online Shopping System is the application that allows the users to shop online without going to the shops to buy them.</p>
  </div>
</div>

</body>
</html>