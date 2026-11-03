<HTML>
<BODY>
	<%! int num; %>
	<%
		//fetch the value of num from index.html
		num=Integer.parseInt(request.getParameter("num"));
		out.println("Multiplication Table of:" + num +"<BR>");
		for(int i=1;i<=10;i++)
		{
			out.println(num+"*"+i+"="+(num*i)+"<BR>");
		}
	 %>
</BODY>
</HTML>