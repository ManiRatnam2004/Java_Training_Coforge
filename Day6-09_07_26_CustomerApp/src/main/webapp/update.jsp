<form action="UpdateProcessServlet" method="post">

    <input type="hidden" name="cid" value="<%=request.getAttribute("id")%>" />

    <label>Name:</label>
    <input type="text" name="cname" value="<%=request.getAttribute("name")%>" class="form-control" required/>

    <label>City:</label>
    <input type="text" name="city" value="<%=request.getAttribute("city")%>" class="form-control" required/>

    <br>
    <button type="submit" class="btn btn-success">Update</button>

</form>