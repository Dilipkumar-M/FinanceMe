<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DilipKumar's FinanceMe</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
        /* Global Styles */
		body {
  	    font-family: Calibri, sans-serif;
        background-color: #f5f5f5; /* Light gray background */
       }

			/* Header Styles */
			header {
   			background-color:#87CEEB; /* Light blue header */
   		    color: white;
            text-align: center;
            padding: 20px 0;
           }

				/* Button Styles */
			 .button-container button {
   			 background-color: #0073e6; /* Blue buttons */
   			 color: white; /* White text */
    		 padding: 12px 20px;
    		 border: none;
    		 border-radius: 4px;
    		 cursor: pointer;
  			 font-size: 16px;
   			 margin-right: 10px;
			}

			.button-container button:hover {
   			background-color: #ffc107; /* Yellow on hover */
			}
		}
    </style>
</head>
<body>
    <header>
        <h1> DilipKumar's Banking Project  </h1>
    </header>
    <div class="container">
        <form action="addpolicy" id="polcyForm" method="POST">
            <div class="form-group">
                <label for="id">Enter your ID:</label>
                <input type="text" id="id" name="id" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="name">Enter your name:</label>
                <input type="text" id="name" name="name" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="address">Enter your address:</label>
                <input type="text" id="address" name="address" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="contact">Enter your contact:</label>
                <input type="text" id="contact" name="contact" class="form-control" required>
            </div>
            <div class="button-container">
                <button type="button" class="btn btn-primary" onclick="createAccount()">Create Account</button>
                <button type="button" class="btn btn-primary" onclick="updateAccount()">Update Account</button>
                <button type="button" class="btn btn-danger" onclick="deleteAccount()">Delete Account</button>
            </div>
        </form>

        <!-- Sample Table -->
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Account ID</th>
                    <th>Customer Name</th>
                    <th>Customer Address</th>
                    <th>Contact Number</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${accountList}" var="account">
                    <tr>
                        <td>${account.accountId}</td>
                        <td>${account.customerName}</td>
                        <td>${account.customerAddress}</td>
                        <td>${account.contactNumber}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <script>
        function createAccount() {
            alert("Account created");
            var form = document.getElementById("polcyForm");
            form.action = "createaccount";
            form.method = "POST";
            form.submit();
        }

        function updateAccount() {
            alert("Account updated");
            var form = document.getElementById("polcyForm");
            form.action = "updateaccount";
            form.method = "POST"; // You can use POST for updates
            form.submit();
        }

        function deleteAccount() {
            alert("Account deleted");
            var form = document.getElementById("polcyForm");
            form.action = "deleteaccount";
            form.method = "POST"; // You can use POST for deletes
            form.submit();
        }
    </script>
</body>
</html>
